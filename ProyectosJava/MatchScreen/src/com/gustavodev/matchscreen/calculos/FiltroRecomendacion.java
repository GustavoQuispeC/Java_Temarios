package com.gustavodev.matchscreen.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy recomendado");
        } else if(clasificacion.getClasificacion() >= 2) {
            System.out.println("Recomendado");
        }
         else {
            System.out.println("No recomendado");

        }
    }
}
