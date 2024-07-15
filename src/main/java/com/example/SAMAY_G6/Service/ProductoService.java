package com.example.SAMAY_G6.Service;


import com.example.SAMAY_G6.Repository.ProductoRepository;
import com.example.SAMAY_G6.ResourceNotFoundException;
import com.example.SAMAY_G6.model.DetalleOrden;
import com.example.SAMAY_G6.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
  @Autowired
  private ProductoRepository productoRepository;

//  @Autowired
//  private GoogleCloudService googleCloudService;

  public List<Producto> getAllProducts() {
    return productoRepository.findAll();
  }

  public Producto addProducto(Producto producto) {
    return productoRepository.save(producto);
  }

//  public Producto addProduct(Producto producto, String imagenlocalRuta) throws Exception {
//    String imageUrl = googleCloudService.uploadImage(imagenlocalRuta, producto.getImagen());
//    producto.setImagen(imageUrl);
//    return productoRepository.save(producto);
//  }

  public Producto updateProduct(Producto producto){
    return productoRepository.save(producto);
  }


  public Producto updatePrecio(Long id, Double newPrice) {
    Optional<Producto> optionalProducto= productoRepository.findById(id);
    if (optionalProducto.isPresent()) {
      Producto existingProduct = optionalProducto.get();
      existingProduct.setPrecio(newPrice);
      return productoRepository.save(existingProduct);
    } else {
      throw new ResourceNotFoundException("Producto no encontrado con id " + id);
    }
  }

  public Producto updateStock(Long id,int newStock) {
    Optional<Producto> optionalProducto= productoRepository.findById(id);
    if (optionalProducto.isPresent()) {
      Producto existingProduct = optionalProducto.get();
      existingProduct.setCantidad(newStock);
      return productoRepository.save(existingProduct);
    } else {
      throw new ResourceNotFoundException("Producto no encontrado con id " + id);
    }
  }


  public void deleteProductById(Long id) {
    productoRepository.deleteById(id);
  }

}
