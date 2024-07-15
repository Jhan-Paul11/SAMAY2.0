package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.model.RegistroDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Validated
public class AuthController {
  @PostMapping("/registro")
  public ResponseEntity<String> registrarUsuario(@Valid @RequestBody RegistroDTO registroDTO) {
    // Lógica para registrar al usuario
    return ResponseEntity.ok("Usuario registrado exitosamente");
  }

  @PostMapping("/login")
  public ResponseEntity<String> iniciarSesion(@RequestParam String email, @RequestParam String password) {
    // Lógica para iniciar sesión
    return ResponseEntity.ok("Inicio de sesión exitoso");
  }
}
