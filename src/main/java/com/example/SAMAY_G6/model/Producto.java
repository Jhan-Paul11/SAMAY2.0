package com.example.SAMAY_G6.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


//@Getter
//@Setter
@Entity
@Table(name = "productos")
public class Producto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Long productId;
  private String nombre;
  private String descripcion;
  private String imagen;
  private double precio;
  private int cantidad;

  @ManyToMany(mappedBy = "productos")
  private List<Orden> ordenes;

  @ManyToOne
  private Usuario usuario;

  @ManyToMany(mappedBy = "productos")
  private List<CarritoCompra> carritos;


  public Producto() {
  }

  public Producto(Long productId, String nombre, String descripcion, String imagen, double precio, int cantidad) {
    super();
    this.productId = productId;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.imagen = imagen;
    this.precio = precio;
    this.cantidad = cantidad;
  }
//getter y setter


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getImagen() {
    return imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }



  @Override
  public String toString() {
    return "Producto{" +
            "productId=" + productId +
            ", nombre='" + nombre + '\'' +
            ", descripcion='" + descripcion + '\'' +
            ", imagen='" + imagen + '\'' +
            ", precio=" + precio +
            ", cantidad=" + cantidad +
            '}';
  }
}

