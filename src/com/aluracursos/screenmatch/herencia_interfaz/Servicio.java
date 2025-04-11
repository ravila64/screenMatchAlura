package com.aluracursos.screenmatch.herencia_interfaz;

public class Servicio extends Item implements Tributable{
    private int cantidadHoras;

    @Override
    public double calculaImpuesto() {
        // servicio tiene 12% de impuesto
        return getPrecio()*0.12;
    }

    // otros métodos de la clase Servicio
    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
}
