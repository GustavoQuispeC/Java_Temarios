import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluciones = 0;
        double totalEvaluaciones =0;

        while (nota != -1)
        {
            System.out.println("Escribe la nota de la pelicula matrix:");
            nota = keyboard.nextDouble();
            if(nota != -1){
                mediaEvaluciones +=  nota;
                totalEvaluaciones ++;
            }



        }
        System.out.println("la media de evaluaciones: " + mediaEvaluciones/totalEvaluaciones);




    }
}
