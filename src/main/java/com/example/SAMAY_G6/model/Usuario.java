package com.example.SAMAY_G6.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "User")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column (name = "fullName", nullable = false)
  private String fullName;

  @Column (name = "email", nullable = false)
  private String email;

  @Column (name = "password", nullable = false)
  private String password;

  @Column (name = "cellphone", nullable = false)
  private Long cellphone;

  @Column (name = "role",nullable = true)
  private  String role;

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "created_at", nullable = false)
  private Date created_at;

  @Temporal(TemporalType.TIMESTAMP) //define esta columna como timestap
  @Column (name = "updated_at", nullable = false)
  private Date updated_at;

  public Usuario() {
  }

  public Usuario(Long userId, String fullName, String email, String password, Long cellphone, String role, Date created_at, Date updated_at) {
    this.userId = userId;
    this.fullName = fullName;
    this.email = email;
    this.password = password;
    this.cellphone = cellphone;
    this.role = role;
    this.created_at = created_at;
    this.updated_at = updated_at;
  }

  //getter y setter


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getCellphone() {
    return cellphone;
  }

  public void setCellphone(Long cellphone) {
    this.cellphone = cellphone;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
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
