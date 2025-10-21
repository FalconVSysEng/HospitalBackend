package com.example.roles_empleado.Entity;

import jakarta.persistence.*;

@Entity
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Empleado;
    private String nombre_Empleado;
    private String apellido_Empleado;
    private String dni_Empleado;
    private String telefono_Empleado;
    @Enumerated(EnumType.STRING)
    private RolesEntity rol_Empleado;

    public EmpleadoEntity() {}

    public EmpleadoEntity(Long id_Empleado, String nombre_Empleado, String apellido_Empleado, String dni_Empleado, String telefono_Empleado, RolesEntity rol_Empleado) {
        this.id_Empleado = id_Empleado;
        this.nombre_Empleado = nombre_Empleado;
        this.apellido_Empleado = apellido_Empleado;
        this.dni_Empleado = dni_Empleado;
        this.telefono_Empleado = telefono_Empleado;
        this.rol_Empleado = rol_Empleado;
    }

    public Long getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(Long id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public String getApellido_Empleado() {
        return apellido_Empleado;
    }

    public void setApellido_Empleado(String apellido_Empleado) {
        this.apellido_Empleado = apellido_Empleado;
    }

    public String getDni_Empleado() {
        return dni_Empleado;
    }

    public void setDni_Empleado(String dni_Empleado) {
        this.dni_Empleado = dni_Empleado;
    }

    public String getTelefono_Empleado() {
        return telefono_Empleado;
    }

    public void setTelefono_Empleado(String telefono_Empleado) {
        this.telefono_Empleado = telefono_Empleado;
    }

    public RolesEntity getRol_Empleado() {
        return rol_Empleado;
    }

    public void setRol_Empleado(RolesEntity rol_Empleado) {
        this.rol_Empleado = rol_Empleado;
    }
}
