package com.gusstavodev.bookstore.mainapp;

import com.gusstavodev.bookstore.model.Datos;
import com.gusstavodev.bookstore.model.DatosLibro;
import com.gusstavodev.bookstore.service.ConsumoAPI;
import com.gusstavodev.bookstore.service.ConvierteDatos;

import java.util.*;
import java.util.stream.Collectors;


public class MainApp {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private final String URL_BASE = "https://gutendex.com/books/";


    public void muestraLibro() {


        var json = consumoApi.obtenerDatos(URL_BASE);


        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

        //Top 10 libros mas descargados
        System.out.println("10 Libros mas descargados");
        System.out.println("--------------------------------");
        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosLibro::numeroDeDescargas).reversed())
                .limit(10)
                .map(l -> l.titulo().toUpperCase())
                .forEach(System.out::println);


//Buscar libro
        System.out.println("Por favor escribe el nombre del  libro que deseas buscar:");
        var nombreLibro = teclado.nextLine();
        json = consumoApi.obtenerDatos(URL_BASE + "?search=" + nombreLibro.replace(" ", "+"));
        Datos datosBusquedaLibro = conversor.obtenerDatos(json, Datos.class);
        Optional<DatosLibro> libroBuscado = datosBusquedaLibro.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(nombreLibro.toUpperCase()))
                .findFirst();
        if (libroBuscado.isPresent()) {
            System.out.println("Libro encontrado: " + libroBuscado.get());
        } else {
            System.out.println("Libro no encontrado");
        }


        //Generando estadisticas

        DoubleSummaryStatistics est = datos.resultados().stream()
                .filter(d -> d.numeroDeDescargas() > 0)
                .collect(Collectors.summarizingDouble(DatosLibro::numeroDeDescargas));
        System.out.println("cantidad media de descargas: " + est.getAverage());
        System.out.println("Maximo de descargas: " + est.getMax());
        System.out.println("Minimo de descargas: " + est.getMin());
        System.out.println("Cantidad de libros con descargas: " + est.getCount());


    }


}
