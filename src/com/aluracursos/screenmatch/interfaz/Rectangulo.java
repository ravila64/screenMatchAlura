package com.aluracursos.screenmatch.interfaz;

class Rectangulo implements Figura{
    double longitud, ancho;

    Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }
    public double calcularArea() {
        return longitud * ancho;
    }
}
