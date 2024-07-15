package com.example.SAMAY_G6.Service;

import com.example.SAMAY_G6.Repository.OrdenRepository;
import com.example.SAMAY_G6.model.Orden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {

  @Autowired
  private OrdenRepository orderUserRepository;

  public List<Orden> getAllOrderUsers() {
    return orderUserRepository.findAll();
  }

  public Orden addOrderUsuario(Orden ordenUsuario) {
    return orderUserRepository.save(ordenUsuario);
  }

  public Orden updateOrderUser(Orden ordenUsuario){
    return orderUserRepository.save(ordenUsuario);
  }

  public void deleteOrderUsuarioById(Long id) {
    orderUserRepository.deleteById(id);
  }


}
