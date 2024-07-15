package com.example.SAMAY_G6.controller;


import com.example.SAMAY_G6.Service.UsuarioService;
import com.example.SAMAY_G6.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UsuarioService usuarioService;// inyecta los metodos de el servicio


  @GetMapping("/obtener")
  public List<Usuario> getListaUser() {
    return usuarioService.getAllUsers();
  }

  @PostMapping("/agregar")
  public Usuario agregarUser(@RequestBody Usuario newUser) {
    return usuarioService.addUser(newUser);
  }

  @PutMapping("/actualizar/usuariocompleto")
  public Usuario updateUser (@RequestBody Usuario updateinfoUser){
    return usuarioService.updateTotalUser(updateinfoUser);
  }

  @PutMapping("/actualizar/nombre/{id}")
  public Usuario updatePassword(@PathVariable Long id,@RequestParam String nombreNuevo){
    return usuarioService.updateNombre(id, nombreNuevo);
  }

  @PutMapping("/actualizar/contrasena/{id}")
  public Usuario updateContrasena (@PathVariable Long id,@RequestParam String newPas){
    return usuarioService.updateContrasena(id, newPas);
  }


  @DeleteMapping("/{id}")
  public void eliminarUser(@PathVariable Long id) {
    usuarioService.deleteUserById(id);
  }

}
