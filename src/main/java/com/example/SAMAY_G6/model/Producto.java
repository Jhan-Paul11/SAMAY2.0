package com.example.SAMAY_G6.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


//@Getter
//@Setter
@Entity
@Table(name = "product")
public class Producto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Long productId;

  @Column(name = "productName",nullable = false)
  private String productName;

  @Column (name = "stock",nullable = false)
  private  int stock;

  @Column (name = "unitPrice",nullable = false)
  private double unitPrice;

  //crear la clave foranea de farmer

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "created_at", nullable = false)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "updated_at", nullable = false)
  private Date updated_at;

  public Producto() {
  }

  public Producto(Long productId, String productName, int stock, double unitPrice, Date created_at, Date updated_at) {
    this.productId = productId;
    this.productName = productName;
    this.stock = stock;
    this.unitPrice = unitPrice;
    this.created_at = created_at;
    this.updated_at = updated_at;
  }
  //getter y setter


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }
}

