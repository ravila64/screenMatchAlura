package com.aluracursos.screenmatch.banco;

public class Main {
    public static void main(String[] args) {
        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        cuentaAhorro.setTasaDeIntereses(0.10);
        cuentaAhorro.setSaldo(1000);
        cuentaAhorro.setTitular("Beatriz");
        cuentaAhorro.calcularIntereses();
        System.out.println(cuentaAhorro.toString());
        cuentaAhorro.muestraDatosCuenta();
        cuentaAhorro.retirar(150);
        cuentaAhorro.muestraDatosCuenta();
        cuentaAhorro.retirar(1000);
        cuentaAhorro.depositar(500);
        cuentaAhorro.muestraDatosCuenta();
    }
}
