package com.aluracursos.screenmatch.interfaz;

class Circulo implements Figura{
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

