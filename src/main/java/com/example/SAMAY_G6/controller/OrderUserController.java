package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.Service.OrdenService;
import com.example.SAMAY_G6.model.Orden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderuser")
public class OrderUserController {

  @Autowired
  private OrdenService orderUserService;

  @GetMapping("/obtener")
  public List<Orden> getAllOrderUsers() {
    return orderUserService.getAllOrderUsers();
  }

  @PostMapping ("/agregar")
  public Orden addOrderUser(@RequestBody Orden ordenUsuario) {
    return orderUserService.addOrderUsuario(ordenUsuario);
  }

  @PutMapping("/actualizar")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Orden updatesOrderUser(@RequestBody Orden ordenUsuario){
    return orderUserService.updateOrderUser(ordenUsuario);
  }

  @DeleteMapping("/{id}")
  public void deleteOrderUserById(@PathVariable Long id) {
    orderUserService.deleteOrderUsuarioById(id);
  }

}
