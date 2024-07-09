package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.Service.ProductService;
import com.example.SAMAY_G6.model.Cliente;
import com.example.SAMAY_G6.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/obtener")
  public List<Producto> getAllProducts() {
    return productService.getAllProducts();
  }

  @PostMapping("/agregar")
  public Producto addProduct(@RequestBody Producto producto) {
    return productService.addProduct(producto);
  }

  @PutMapping("/actualizar/producto")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Producto updateCliente(@RequestBody Producto producto){
    return productService.updateProduct(producto);
  }

  @PutMapping("/actualizar/precioproducto")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Producto updateprecioProducto(@PathVariable Long id,@RequestParam double nuevoprecio){
    return productService.updatePrecio(id,nuevoprecio);
  }

  @PutMapping("/actualizar/stockproducto")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Producto updateStockProducto(@PathVariable Long id,@RequestParam int nuevostock){
    return productService.updateStock(id,nuevostock);
  }

  @DeleteMapping("/{id}")
  public void deleteProductById(@PathVariable Long id) {
    productService.deleteProductById(id);
  }



}
