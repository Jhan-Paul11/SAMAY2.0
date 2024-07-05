package com.example.SAMAY_G6.Service;

import com.example.SAMAY_G6.Repository.OrderUserRepository;
import com.example.SAMAY_G6.model.OrdenUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderUserService {

  @Autowired
  private OrderUserRepository orderUserRepository;

  public List<OrdenUsuario> getAllOrderUsers() {
    return orderUserRepository.findAll();
  }

  public OrdenUsuario addOrderUsuario(OrdenUsuario ordenUsuario) {
    return orderUserRepository.save(ordenUsuario);
  }

  public void deleteOrderUsuarioById(Long id) {
    orderUserRepository.deleteById(id);
  }


}
