package com.example.SAMAY_G6.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "OrderUser")
public class OrdenUsuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderId;

  //falta agregar la clave foranea clienid.

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "created_at", nullable = false)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "updated_at", nullable = false)
  private Date updated_at;


  public OrdenUsuario() {
  }

  public OrdenUsuario(Long orderId, Date created_at, Date updated_at) {
    this.orderId = orderId;
    this.created_at = created_at;
    this.updated_at = updated_at;
  }

  //getter y setter
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
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
