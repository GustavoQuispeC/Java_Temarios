import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("Nombre del cliente: Gustavo Quispe");
        System.out.println("Tipo de cuenta: Corriente");
        System.out.println("Saldo disponible: 1599.99$");
        System.out.println("**************************************");

        Scanner keyboard = new Scanner(System.in);
        double saldo = 1599.99;
        String opcion = "";

        // Mostrar el menú de opciones mientras no se seleccione "4"
        while (!opcion.equals("4")) {
            // Mostrar el menú
            System.out.println("Escriba el numero de la opcion deseada");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Salir");

            opcion = keyboard.nextLine(); // Leer opción

            switch (opcion) {
                case "1":
                    System.out.println("El saldo actualizado es " + saldo + "$");
                    break;

                case "2":
                    System.out.println("Cuanto es el monto a retirar");
                    double retiro = keyboard.nextDouble();
                    keyboard.nextLine(); // Consumir el salto de línea pendiente
                    if (retiro > saldo) {
                        System.out.println("Su saldo es insuficiente");
                    } else {
                        saldo -= retiro;
                        System.out.println("Tu nuevo saldo es: " + saldo + "$");
                    }
                    break;

                case "3":
                    System.out.println("Cuanto desea depositar");
                    double deposito = keyboard.nextDouble();
                    keyboard.nextLine(); // Consumir el salto de línea pendiente
                    saldo += deposito;
                    System.out.println("Tu nuevo saldo es: " + saldo + "$");
                    break;

                case "4":
                    System.out.println("Gracias por su visita");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }
    }
}
