package com.gusstavodev.bookstore.mainapp;
import com.gusstavodev.bookstore.model.Datos;
import com.gusstavodev.bookstore.model.DatosLibro;
import com.gusstavodev.bookstore.service.ConsumoAPI;
import com.gusstavodev.bookstore.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
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
                       .map(l->l.titulo().toUpperCase())
               .forEach(System.out::println);









   }




}
