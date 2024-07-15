package com.example.SAMAY_G6.model;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RegistroDTO {

  @NotBlank(message = "Nombre completo es obligatorio")
  private String nombreCompleto;

  @NotBlank(message = "Correo electrónico es obligatorio")
  @Email(message = "Debe ser una dirección de correo válida")
  private String email;

  @NotBlank(message = "Contraseña es obligatoria")
  @Size(min = 6, message = "La contraseña debe tener al menos 6 caracteres")
  private String contraseña;

}
