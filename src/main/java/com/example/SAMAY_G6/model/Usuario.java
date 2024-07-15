package com.example.SAMAY_G6.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@Table (name = "usuarios") //plural bd
public class Usuario { //singular java

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotBlank(message = "El campo nombre no puede estar en blanco")
  @Size(min = 5, max = 45,message = "El campo nombre no esta bien")
  @NotEmpty(message = "El campo nombre no puede estar vacio")
  @Column(name = "nombre")
  private String nombre;

  @NotBlank(message = "El campo nombre de usuario no puede estar en blanco")
  @NotEmpty(message = "El campo nombre de usuario no puede estar vacio")
  @Column(name = "username")
  private String username;

  @NotBlank(message = "El campo correo electronicoe no puede estar en blanco")
  @NotEmpty(message = "El campo correo electronico no puede estar vacio")
  @Column(name = "correoElectronico")
  @Email
  private String email;

  private String direccion;

  @NotBlank
  @Pattern(regexp = "\\d{10}")
  private String telefono;


  private String tipo;


  @NotBlank(message = "El campo contraseña no puede estar en blanco")
  @NotEmpty(message = "El campo contraseña no puede estar vacio")
  @Column(name = "password")
  private String password;


//  @OneToOne(mappedBy = "usuario")
//  private Cliente cliente;


  //-------------------------------------

  @OneToMany(mappedBy = "usuario")
  private List<Producto> productos;

  @OneToMany(mappedBy = "usuario")
  private List<Orden> ordenes;




  public Usuario() {
  }

  public Usuario(Integer id, String nombre, String username, String email, String direccion, String telefono, String tipo, String password) {
    super();
    this.id = id;
    this.nombre = nombre;
    this.username = username;
    this.email = email;
    this.direccion = direccion;
    this.telefono = telefono;
    this.tipo = tipo;
    this.password = password;
  }

  //getter y setter


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }

  @Override
  public String toString() {
    return "Usuario{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", username='" + username + '\'' +
            ", email='" + email + '\'' +
            ", direccion='" + direccion + '\'' +
            ", telefono='" + telefono + '\'' +
            ", tipo='" + tipo + '\'' +
            ", password='" + password +
            '}';
  }
}
