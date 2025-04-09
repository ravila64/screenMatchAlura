package com.aluracursos.screenmatch.examples;

public class Cuenta {
    private int numero;
    private int agencia;
    private double saldo;

    public void depositar(double valor)
    {
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado con exito !!! "+saldo);
        }else {
            System.out.println("El valor debe ser mayor a cero");
        }
    }

    public void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor debe ser mayor a cero");
        } else if(saldo >= valor){
            saldo -= valor;
            System.out.println("Retiro realizado con exito, nuevo saldo "+saldo);
        }else {
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
