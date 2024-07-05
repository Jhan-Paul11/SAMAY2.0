package com.example.SAMAY_G6.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "client")
public class Cliente {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long clientId;

  @Column(name = "paymentMethod",nullable = false)
  private String paymentMethod;

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "created_at", nullable = false)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "updated_at", nullable = false)
  private Date updated_at;

  public Cliente() {
  }

  public Cliente(Long clientId, String paymentMethod, Date created_at, Date updated_at) {
    this.clientId = clientId;
    this.paymentMethod = paymentMethod;
    this.created_at = created_at;
    this.updated_at = updated_at;
  }

  // getter y setters

  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
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
