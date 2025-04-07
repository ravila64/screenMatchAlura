package com.aluracursos.screenmatch.model;
public class Persona {
    private String nombre;
    private int edad;

    public void cumplirAnios(){
        edad++;
    }

    //getters and setters

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

