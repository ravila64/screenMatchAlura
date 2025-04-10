package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Serie;
import com.aluracursos.screenmatch.model.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    // incluye(Pelicula pelicula)
    // incluye(Serie serie)
    // aqui se aplica el concepto de polimorfismo

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}