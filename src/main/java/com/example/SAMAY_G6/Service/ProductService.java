package com.example.SAMAY_G6.Service;


import com.example.SAMAY_G6.Repository.ProductRepository;
import com.example.SAMAY_G6.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public List<Producto> getAllProducts() {
    return productRepository.findAll();
  }

  public Producto addProduct(Producto producto) {
    return productRepository.save(producto);
  }

  public void deleteProductById(Long id) {
    productRepository.deleteById(id);
  }

}
