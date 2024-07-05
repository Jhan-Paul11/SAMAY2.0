package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.Service.OrderUserService;
import com.example.SAMAY_G6.model.OrdenUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderuser")
public class OrderUserController {

  @Autowired
  private OrderUserService orderUserService;

  @GetMapping("/obtener")
  public List<OrdenUsuario> getAllOrderUsers() {
    return orderUserService.getAllOrderUsers();
  }

  @PostMapping ("/agregar")
  public OrdenUsuario addOrderUser(@RequestBody OrdenUsuario ordenUsuario) {
    return orderUserService.addOrderUsuario(ordenUsuario);
  }

  @DeleteMapping("/{id}")
  public void deleteOrderUserById(@PathVariable Long id) {
    orderUserService.deleteOrderUsuarioById(id);
  }

}
