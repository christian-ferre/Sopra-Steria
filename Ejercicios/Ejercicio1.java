import java.util.Scanner;

/* Escriba un algoritmo que lea un número entero y determine si es par o impar. Si es par,
que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero. Si
es impar, que escriba todos los impares de manera descendiente desde si sí mismo
hasta el uno. Utilice la instrucción LEER NUMERO al inicio del programa para cargar un
número en la variable NUMERO. */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = leerNumero(input);
       
        // Validación del input
        while (number< 0 ) {
            System.out.print("Error. Por favor, introduzca un valor valido: ");
            number = input.nextInt();
        }   

        //Comprobación si es par o impar
        if (number % 2 == 0) {
            System.out.println("El número introducido es par.");
            System.out.println("Números pares descendentes:");
            for (int i = number; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número introducido es impar.");
            System.out.println("Números impares descendentes:");
            for (int i = number; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }

        input.close();
    }

    public static int leerNumero(Scanner input) {
        System.out.print("Introduzca un número entero y positvo: ");
        int number = input.nextInt();
        while (number < 0 ) {
            System.out.print("Error. Por favor, introduzca un valor válido: ");
            number = input.nextInt();
        }
        return number;
    }
}