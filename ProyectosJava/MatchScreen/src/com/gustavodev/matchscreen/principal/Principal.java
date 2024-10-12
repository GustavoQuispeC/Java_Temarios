package com.gustavodev.matchscreen.principal;

import com.gustavodev.matchscreen.calculos.CalculadoraDeTiempo;
import com.gustavodev.matchscreen.calculos.FiltroRecomendacion;
import com.gustavodev.matchscreen.modelos.Episodio;
import com.gustavodev.matchscreen.modelos.Pelicula;
import com.gustavodev.matchscreen.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Guerra mundial Z");
        miPelicula.setFechaDeLanzamiento(2022);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTenica();
        miPelicula.evalua(34);
        miPelicula.evalua(10);
        miPelicula.evalua(60);


        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2021);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTenica();

        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);

        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("El invierno se acerca");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaGustavo = new Pelicula();
        peliculaGustavo.setNombre("El señor de los anillos");
        peliculaGustavo.setFechaDeLanzamiento(2001);
        peliculaGustavo.setDuracionEnMinutos(180);
        peliculaGustavo.setIncluidoEnPlan(true);



        ArrayList<Pelicula> listaPelicula = new ArrayList<>();
        listaPelicula.add(peliculaGustavo);
        listaPelicula.add(miPelicula);

        System.out.println(listaPelicula.get(1).getNombre());
        System.out.println(listaPelicula.get(0).getNombre());
        System.out.println(listaPelicula.size());

        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.getNombre());
        }






    }
}