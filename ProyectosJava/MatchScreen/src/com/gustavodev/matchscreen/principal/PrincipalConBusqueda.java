package com.gustavodev.matchscreen.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner busqueda = new Scanner(System.in);
        System.out.println("Introduce el título de la película que quieres buscar:");
        String titulo = busqueda.nextLine();
        var direccion = "https://www.omdbapi.com/?apikey=b5d7212b&t=" + titulo;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
