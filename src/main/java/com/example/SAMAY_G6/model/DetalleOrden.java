package com.example.SAMAY_G6.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "detalles")
public class DetalleOrden {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long clientId;
  private String nombre;
  private double cantidad;
  private double precio;
  private double total;

  @OneToOne
  @JoinColumn(name = "userId")
  private Usuario usuario;

//  @OneToMany(mappedBy = "clientefk")
//  private List<Orden> listaDeOrdenes;

  @ManyToOne
  private Orden orden;

  @ManyToOne
  private Producto producto;


  public DetalleOrden() {
  }

  public DetalleOrden(Long clientId, String nombre, double cantidad, double precio, double total) {
    this.clientId = clientId;
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;
    this.total = total;
  }

  // getter y setters


  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getCantidad() {
    return cantidad;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Orden getOrden() {
    return orden;
  }

  public void setOrden(Orden orden) {
    this.orden = orden;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  @Override
  public String toString() {
    return "DetalleOrden{" +
            "clientId=" + clientId +
            ", nombre='" + nombre + '\'' +
            ", cantidad=" + cantidad +
            ", precio=" + precio +
            ", total=" + total +
            '}';
  }
}
