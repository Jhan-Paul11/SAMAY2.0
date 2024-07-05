package com.example.SAMAY_G6.controller;


import com.example.SAMAY_G6.Service.UserService;
import com.example.SAMAY_G6.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping("/user")
  public String saludar(){
  return "Hola Usuario";
  }

  @Autowired
  private UserService userService;// inyecta los metodos de el servicio


  @GetMapping("/obtener")
  public List<Usuario> getListaUser() {
    return userService.getAllUsers();
  }

  @PostMapping("/agregar")
  public Usuario agregarUser(@RequestBody Usuario newUser) {
    return userService.addUser(newUser);
  }


  @DeleteMapping("/{id}")
  public void eliminarUser(@PathVariable Long id) {
    userService.deleteUserById(id);
  }

}
