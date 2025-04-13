package com.aluracursos.screenmatch.annotation;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String identidad;
    @EdadMinima(valor=18)
    private LocalDate fechaNacimiento;

    // constructor
    public Usuario(LocalDate fechaNacimiento, String identidad, String nombre) {
        this.fechaNacimiento = fechaNacimiento;
        this.identidad = identidad;
        this.nombre = nombre;
    }

    //getters e setters
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

