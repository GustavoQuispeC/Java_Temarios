//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombre = "Juan";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre, aulas);

        System.out.println(mensaje);

        int x = 10;
        double y = x; // casting implícito
        System.out.println(y);

        double a = 10.5;
        int b = (int) a; // casting explícito
        System.out.println(b);

        String saludo = "Hola, mi nombre es ";
        String nombre1= "Alicia ";
        String continuacion = "y mi edad es ";
        int edad = 17;
        System.out.println(saludo + nombre1 + continuacion + edad);
    }
}