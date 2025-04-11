package com.aluracursos.screenmatch.herenciainterfaz;

public class Producto extends Item implements Tributable{
    private double peso;
    // métodos getters y setters

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaImpuesto() {
        // producto tiene el 10% de impuesto
        return getPrecio()*0.10;
    }
}
