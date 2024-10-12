import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluciones = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Escribe la nota de la pelicula matrix:");
            nota = keyboard.nextDouble();
            mediaEvaluciones = mediaEvaluciones + nota;
        }
        System.out.println("la media de evaluaciones: " + mediaEvaluciones/3);
    }
}
