import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula ");
        String movie = keyboard.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = keyboard.nextInt();
        System.out.println("Por ultimo dinos la nota de la ultima pelicula");
        double nota = keyboard.nextDouble();

        System.out.println(movie);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
