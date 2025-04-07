package com.aluracursos.screenmatch.model;

public class Pelicula {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int numeroEvaluaciones;

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    // getters

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEvaluaciones() {
        return numeroEvaluaciones;
    }

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", duracion En Minutos=" + duracionEnMinutos +
                ", fecha de Lanzamiento=" + fechaLanzamiento +
                ", incluido En Plan=" + incluidoEnPlan +
               // ", suma Evaluaciones=" + sumaEvaluaciones +
               // ", numero Evaluaciones=" + numeroEvaluaciones +
                '}');
    }

    public void sumarEvaluaciones(double nota) {
        sumaEvaluaciones = sumaEvaluaciones + nota;
        numeroEvaluaciones++;
    }

    public double mediaEvaluaciones() {
        return (sumaEvaluaciones / numeroEvaluaciones);
    }

}
