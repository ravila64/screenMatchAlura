package com.aluracursos.screenmatch.interfazcontable;

public class Producto implements Tributable{
    private String nombre;
    private double valor;

    // lo adicione a la clase Producto
    public Producto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public double getValorImpuesto() {
        return this.valor * 0.1;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}
