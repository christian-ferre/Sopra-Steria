import java.util.Scanner;

/*Desarrolle un algoritmo para el cálculo del salario de un trabajador. El importe
liquidado (sueldo) depende de una tarifa o precio por hora establecida y de un
condicionante sobre las horas trabajadas: si la cantidad de horas trabajadas es mayor a
40 horas, la tarifa se incrementa en un 50% para las horas extras. Calcular el sueldo
recibido por el trabajador en base las horas trabajadas y la tarifa. Utilice las
instrucciones LEER HORASTRABAJADAS y LEER TARIFA al inicio del programa para
cargar los valores en las variables HORASTRABAJADAS y TARIFA. */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Inicializaciónn variables
        double tarifa, horasTrabajadas, sueldo;

        Scanner input = new Scanner(System.in);

        // Carga de los valores
        tarifa = leerTarifa(input);
        horasTrabajadas = leerHorasTrabajadas(input);

        // Cálculo del sueldo
        if (horasTrabajadas > 40) {
            double horasExtras = horasTrabajadas - 40;
            sueldo = (40 * tarifa) + (horasExtras * tarifa * 1.5);
        } else {
            sueldo = horasTrabajadas * tarifa;
        }

        System.out.printf("El sueldo del trabajador es: %.2f\n", sueldo);

        input.close();
    }

    public static double leerTarifa(Scanner input) {
        System.out.println("Introduzca tarifa: ");
        double tarifa = input.nextDouble();
        while (tarifa < 0 ) {
            System.out.print("Error. Por favor, introduzca un valor válido: ");
            tarifa = input.nextDouble();
        }
        return tarifa;
    }

    public static double leerHorasTrabajadas(Scanner input) {
        System.out.println("Introduzca la cantidad de horas trabajadas: ");
        double horasTrabajadas = input.nextDouble();
        while (horasTrabajadas < 0 ) {
            System.out.print("Error. Por favor, introduzca un valor válido: ");
            horasTrabajadas = input.nextDouble();
        }
        return horasTrabajadas;
    }
}
