package com.aluracursos.screenmatch.heredando;

public class Main {
    public static void main(String[] args) {
        Gato gato= new Gato();
        gato.setNombre("Coffe");
        gato.setPeso(2.45);
        System.out.println("Nombre gato "+gato.getNombre());
        System.out.println("Peso gato "+gato.getPeso());
        gato.jugarConLaser();
    }
}
