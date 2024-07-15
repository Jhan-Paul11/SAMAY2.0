package com.example.SAMAY_G6.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;




@Entity
@Table (name = "carrito_de_compra")
public class CarritoCompra {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToMany
  @JoinTable(
          name = "carrito_producto",
          joinColumns = @JoinColumn(name = "carrito_id"),
          inverseJoinColumns = @JoinColumn(name = "producto_id")
  )
  private List<Producto> productos = new ArrayList<>();

  private double total;


  public CarritoCompra(){};

  public CarritoCompra(Long id, List<Producto> productos, double total) {
    this.id = id;
    this.productos = productos;
    this.total = total;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "CarritoCompra{" +
            "id=" + id +
            ", productos=" + productos +
            ", total=" + total +
            '}';
  }
}
