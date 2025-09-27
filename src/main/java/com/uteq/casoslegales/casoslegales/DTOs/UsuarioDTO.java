package com.uteq.casoslegales.casoslegales.DTOs;

public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String rolNombre;

    // Constructor optimizado
    public UsuarioDTO(Long id, String nombre, String apellido, String rolNombre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rolNombre = rolNombre;
    }

    // Getters (sin setters para inmutabilidad y rendimiento)
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRolNombre() {
        return rolNombre;
    }
}
