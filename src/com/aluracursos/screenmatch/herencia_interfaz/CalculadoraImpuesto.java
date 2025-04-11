package com.aluracursos.screenmatch.herencia_interfaz;

public class CalculadoraImpuesto {
    private double totalImpuesto = 0;

    public void calculaImpuesto(Tributable tributable) {
        totalImpuesto += tributable.calculaImpuesto();
    }
}
