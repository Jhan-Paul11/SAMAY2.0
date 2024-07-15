package com.example.SAMAY_G6.Service;

import com.example.SAMAY_G6.Repository.DetalleOrdenRepository;
import com.example.SAMAY_G6.model.DetalleOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleOrdenService {

  @Autowired
  private DetalleOrdenRepository detalleOrdenRepository;

  public List<DetalleOrden> getAllClients() {
    return detalleOrdenRepository.findAll();
  }

  public DetalleOrden addCliente(DetalleOrden cliente) {
    return detalleOrdenRepository.save(cliente);
  }

  public DetalleOrden updateCliente(DetalleOrden detalleOrden) {
    return detalleOrdenRepository.save(detalleOrden);// actualiza solo metodo de pago
  }


  public void deleteClientById(Long id) {
    detalleOrdenRepository.deleteById(id);
  }



}
