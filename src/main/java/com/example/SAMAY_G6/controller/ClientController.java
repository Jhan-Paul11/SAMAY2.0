package com.example.SAMAY_G6.controller;

import ch.qos.logback.core.net.server.Client;
import com.example.SAMAY_G6.Service.ClientService;
import com.example.SAMAY_G6.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClientController {

  @Autowired
  private ClientService clientService;

  @GetMapping ("/obtener")
  public List<Cliente> getAllClients() {
    return clientService.getAllClients();
  }

  @PostMapping("/agregar")
  public Cliente addTodo(@RequestBody Cliente cliente) {
    return clientService.addCliente(cliente);
  }

  @PutMapping("/actualizar")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Cliente updateCliente(@RequestBody Cliente cliente){
    return clientService.updateCliente(cliente);
  }

  @DeleteMapping("/{id}")
  public void deleteClientById(@PathVariable Long id) {
    clientService.deleteClientById(id);
  }

}
