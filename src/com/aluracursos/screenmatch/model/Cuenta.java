package com.aluracursos.screenmatch.model;

public class Cuenta {
    private int numero;
    private int agencia;
    private double saldo;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void retira(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    //El metodo setSaldo rompe el encapsulamiento de la clase, ya que permite que
    // el atributo saldo sea modificado directamente, burlando los métodos
    // retira y deposita.
    //    public void setSaldo(double saldo) {
    //        this.saldo = saldo;
    //    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
