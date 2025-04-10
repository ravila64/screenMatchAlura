package com.aluracursos.screenmatch.banco;

public class Cuenta {
    private String titular;
    protected double saldo;

    public void retirar(double valor) {
        System.out.println("Retirar "+valor);
        if (valor>0 && valor <= saldo){
            this.saldo -= valor;
            System.out.println("Valor retirado con exito, retiro = "+valor);
        }else{
            System.out.println("Vr a retirar mayor al saldo o valor negativo !!!");
        }
    }

    public void depositar(double valor) {
        System.out.println("Depositar "+valor);
        if (valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Por favor colocar valores positivos");
        }
    }
    //getters y setters


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
