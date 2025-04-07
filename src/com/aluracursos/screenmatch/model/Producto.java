package com.aluracursos.screenmatch.model;
public class Producto {
    String nombre;
    double precio;
    double descuentoParaDebito;

    public double calculaPrecioFinal(boolean pagoMedianteDebito) {
        double precioFinal=0;
        if (pagoMedianteDebito) {
            precioFinal = precio - descuentoParaDebito;
        } else {
            precioFinal = precio;
        }
        return precioFinal;
    }
}

