package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.Service.DetalleOrdenService;
import com.example.SAMAY_G6.model.DetalleOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class DetalleOrdenController {

  @Autowired
  private DetalleOrdenService detalleOrdenService;

  @GetMapping ("/obtener")
  public List<DetalleOrden> getAllClients() {
    return detalleOrdenService.getAllClients();
  }

  @PostMapping("/agregar")
  public DetalleOrden addTodo(@RequestBody DetalleOrden detalleOrden) {
    return detalleOrdenService.addCliente(detalleOrden);
  }

  @PutMapping("/actualizar")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public DetalleOrden updateCliente(@RequestBody DetalleOrden detalleOrden){
    return detalleOrdenService.updateCliente(detalleOrden);
  }

  @DeleteMapping("/{id}")
  public void deleteClientById(@PathVariable Long id) {
    detalleOrdenService.deleteClientById(id);
  }

}
