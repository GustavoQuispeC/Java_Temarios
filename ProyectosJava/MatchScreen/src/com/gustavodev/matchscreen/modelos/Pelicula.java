package com.gustavodev.matchscreen.modelos;

import com.gustavodev.matchscreen.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }

    @Override
    public String toString() {
        return "Pelicula: " +this.getNombre() + " (" +this.getFechaDeLanzamiento() + ")";
    }
}
