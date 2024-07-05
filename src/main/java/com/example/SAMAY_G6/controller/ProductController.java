package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.Service.ProductService;
import com.example.SAMAY_G6.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
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

  @DeleteMapping("/{id}")
  public void deleteProductById(@PathVariable Long id) {
    productService.deleteProductById(id);
  }



}
