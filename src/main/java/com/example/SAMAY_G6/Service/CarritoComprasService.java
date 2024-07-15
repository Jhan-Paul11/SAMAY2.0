package com.example.SAMAY_G6.Service;

import com.example.SAMAY_G6.Repository.CarritoCompraRepository;
import com.example.SAMAY_G6.Repository.ProductoRepository;
import com.example.SAMAY_G6.Repository.UserRepository;
import com.example.SAMAY_G6.model.CarritoCompra;
import com.example.SAMAY_G6.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoComprasService {

  @Autowired
  private CarritoCompraRepository carritoCompraRepository;

  @Autowired
  private ProductoRepository productoRepository;

  @Autowired
  private UserRepository usuarioRepository;

  public CarritoCompra agregarProducto(Long carritoId, Long productoId) {
    CarritoCompra carrito = obtenerCarritoPorId(carritoId);
    Producto producto = productoRepository.findById(productoId).orElseThrow(() -> new RuntimeException("Producto no encontrado"));

    carrito.getProductos().add(producto);
    carrito.setTotal(carrito.getTotal() + producto.getPrecio());
    return carritoCompraRepository.save(carrito);
  }

  public CarritoCompra eliminarProducto(Long carritoId, Long productoId) {
    CarritoCompra carrito = obtenerCarritoPorId(carritoId);
    Producto producto = productoRepository.findById(productoId).orElseThrow(() -> new RuntimeException("Producto no encontrado"));

    carrito.getProductos().remove(producto);
    carrito.setTotal(carrito.getTotal() - producto.getPrecio());
    return carritoCompraRepository.save(carrito);
  }

  public CarritoCompra actualizarCarrito(Long carritoId, List<Long> productosIds) {
    CarritoCompra carrito = obtenerCarritoPorId(carritoId);
    List<Producto> productos = productoRepository.findAllById(productosIds);

    carrito.setProductos(productos);
    carrito.setTotal(productos.stream().mapToDouble(Producto::getPrecio).sum());
    return carritoCompraRepository.save(carrito);
  }

  public CarritoCompra guardarCarrito(CarritoCompra carritoCompra) {
    return carritoCompraRepository.save(carritoCompra);
  }

  public CarritoCompra obtenerCarritoPorId(Long id) {
    return carritoCompraRepository.findById(id).orElseThrow(() -> new RuntimeException("Carrito no encontrado"));
  }


}