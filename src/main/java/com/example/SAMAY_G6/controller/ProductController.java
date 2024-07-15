package com.example.SAMAY_G6.controller;

import com.example.SAMAY_G6.Service.ProductoService;
import com.example.SAMAY_G6.model.DetalleOrden;
import com.example.SAMAY_G6.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@RestController
@RequestMapping("/producto")
public class ProductController {

  @Autowired
  private ProductoService productoService;


  @GetMapping("/obtener")
  public List<Producto> getAllProducts() {
    return productoService.getAllProducts();
  }

//  @PostMapping("/agregar")
//  public Producto addProduct(@RequestParam("file") MultipartFile file,
//                             @RequestParam("nombre") String nombre,
//                             @RequestParam("descripcion") String descripcion,
//                             @RequestParam("precio") double precio,
//                             @RequestParam("cantidad") int cantidad) throws Exception {
//    String imagenlocalRuta = System.getProperty("java.io.tmpdir") + "/" + file.getOriginalFilename();
//    Path ruta = Paths.get(imagenlocalRuta);
//    Files.write(ruta, file.getBytes());
//
//    Producto producto = new Producto();
//    producto.setNombre(nombre);
//    producto.setDescripcion(descripcion);
//    producto.setImagen(file.getOriginalFilename());
//    producto.setPrecio(precio);
//    producto.setCantidad(cantidad);
//
//return productoService.addProduct(producto, imagenlocalRuta);
//  }

  @PostMapping("/agregar")
  public Producto addProducto(@RequestBody Producto producto) {
    return productoService.addProducto(producto);
  }

  @PutMapping("/actualizar/producto")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Producto updateCliente(@RequestBody Producto producto){
    return productoService.updateProduct(producto);
  }

  @PutMapping("/actualizar/precioproducto")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Producto updateprecioProducto(@PathVariable Long id,@RequestParam double nuevoprecio){
    return productoService.updatePrecio(id,nuevoprecio);
  }

  @PutMapping("/actualizar/stockproducto")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Producto updateStockProducto(@PathVariable Long id,@RequestParam int nuevostock){
    return productoService.updateStock(id,nuevostock);
  }

  @DeleteMapping("/{id}")
  public void deleteProductById(@PathVariable Long id) {
    productoService.deleteProductById(id);
  }



}
