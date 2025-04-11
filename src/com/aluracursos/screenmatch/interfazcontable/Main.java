package com.aluracursos.screenmatch.interfazcontable;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Arroz", 3500.0);
        System.out.println(producto.toString());
        System.out.println("valor impuesto "+producto.getValorImpuesto());
        Servicio servicio= new Servicio(5,"Cuota de Navidad", 500000);
        System.out.println(servicio.toString());
        System.out.println("Valor cuota "+servicio.getValorImpuesto());
        // utilizar calcularImpuestos, con tributable como parametro
        CalculadoraImpuestos impuestoProd = new CalculadoraImpuestos();
        impuestoProd.calcularImpuesto(producto);
        System.out.println("Impuesto del producto "+producto.getNombre()+" : "+impuestoProd.getTotalImpuesto());
        // calcular impuesto en servicios
        CalculadoraImpuestos impuestoServ = new CalculadoraImpuestos();
        impuestoServ.calcularImpuesto(servicio);
        System.out.println("valor impuesto "+servicio.getDescripcion()+" : "+ impuestoServ.getTotalImpuesto());
    }
}
