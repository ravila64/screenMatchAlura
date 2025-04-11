package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable){
        System.out.println("Valor de getClasificable "+clasificable.getClasificable());
        if(clasificable.getClasificable()>=4){
            System.out.println("Muy bien evaluado en el momento");
        }else if(clasificable.getClasificable()>=2){
            System.out.println("Popular en el momento");
        }else{
            System.out.println("Colocarlo en tu lista, para verlo despues !!!");
        }
    }
}
