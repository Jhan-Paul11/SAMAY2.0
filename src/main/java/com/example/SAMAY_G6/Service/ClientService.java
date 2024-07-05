package com.example.SAMAY_G6.Service;

import com.example.SAMAY_G6.Repository.ClientRepository;
import com.example.SAMAY_G6.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

  @Autowired
  private ClientRepository clientRepository;

  public List<Cliente> getAllClients() {
    return clientRepository.findAll();
  }

  public Cliente addCliente(Cliente cliente) {
    return clientRepository.save(cliente);
  }

  public void deleteClientById(Long id) {
    clientRepository.deleteById(id);
  }

}
