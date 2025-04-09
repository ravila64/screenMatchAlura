package com.aluracursos.screenmatch.model;

public class Titulo {
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

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void muestraFichaTecnica(String tipo) {
        System.out.println(tipo+" {" +
                "nombre='" + nombre + '\'' +
                ", duracion En Minutos=" + getDuracionEnMinutos() +
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
