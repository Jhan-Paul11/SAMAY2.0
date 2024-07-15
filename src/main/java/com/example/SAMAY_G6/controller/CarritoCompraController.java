package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.Service.CarritoComprasService;
import com.example.SAMAY_G6.model.CarritoCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrito")
public class CarritoCompraController {
  @Autowired
  private CarritoComprasService carritoCompraService;

  @PostMapping("/{carritoId}/productos/{productoId}")
  public CarritoCompra agregarProducto(@PathVariable Long carritoId, @PathVariable Long productoId) {
    return carritoCompraService.agregarProducto(carritoId, productoId);
  }

  @DeleteMapping("/{carritoId}/productos/{productoId}")
  public CarritoCompra eliminarProducto(@PathVariable Long carritoId, @PathVariable Long productoId) {
    return carritoCompraService.eliminarProducto(carritoId, productoId);
  }

  @PutMapping("/{carritoId}")
  public CarritoCompra actualizarCarrito(@PathVariable Long carritoId, @RequestBody List<Long> productosIds) {
    return carritoCompraService.actualizarCarrito(carritoId, productosIds);
  }

  @GetMapping("/{carritoId}")
  public CarritoCompra obtenerCarrito(@PathVariable Long carritoId) {
    return carritoCompraService.obtenerCarritoPorId(carritoId);
  }
}
