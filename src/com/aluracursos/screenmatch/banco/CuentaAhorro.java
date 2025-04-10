package com.aluracursos.screenmatch.banco;

public class CuentaAhorro extends Cuenta {
    private double tasaDeIntereses;

    public void calcularIntereses() {
        double intereses = this.saldo * tasaDeIntereses;
        System.out.println("Intereses actuales : " + intereses);
    }

    //getters y setters

    public double getTasaDeIntereses() {
        return tasaDeIntereses;
    }

    public void setTasaDeIntereses(double tasaDeIntereses) {
        this.tasaDeIntereses = tasaDeIntereses;
    }

    void muestraDatosCuenta(){
        System.out.println("Datos Cuenta "+super.toString());
    }

    @Override
    public String toString() {
        return "CuentaAhorro=>{" +
                "tasaDeIntereses=" + tasaDeIntereses +
                ", saldo=" + saldo +
                '}';
    }
}
