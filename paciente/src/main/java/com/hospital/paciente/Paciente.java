package com.hospital.paciente;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paciente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String dni_paciente;
  private String nombre;
  private String apellido;
  private String direccion;
  private String telefono;
  private Date fechaNacimiento;
  private Boolean sexo;
  
  
}
