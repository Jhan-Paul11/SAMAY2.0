package com.example.SAMAY_G6.Service;


import com.example.SAMAY_G6.Repository.ProductRepository;
import com.example.SAMAY_G6.ResourceNotFoundException;
import com.example.SAMAY_G6.model.Producto;
import com.example.SAMAY_G6.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  public Producto updateProduct(Producto producto){
    return productRepository.save(producto);
  }


  public Producto updatePrecio(Long id, Double newPrice) {
    Optional<Producto> optionalProducto= productRepository.findById(id);
    if (optionalProducto.isPresent()) {
      Producto existingProduct = optionalProducto.get();
      existingProduct.setUnitPrice(newPrice);
      return productRepository.save(existingProduct);
    } else {
      throw new ResourceNotFoundException("Producto no encontrado con id " + id);
    }
  }

  public Producto updateStock(Long id,int newStock) {
    Optional<Producto> optionalProducto= productRepository.findById(id);
    if (optionalProducto.isPresent()) {
      Producto existingProduct = optionalProducto.get();
      existingProduct.setStock(newStock);
      return productRepository.save(existingProduct);
    } else {
      throw new ResourceNotFoundException("Producto no encontrado con id " + id);
    }
  }


  public void deleteProductById(Long id) {
    productRepository.deleteById(id);
  }

}
