import java.util.Scanner;

/* Escriba un algoritmo que visualice una clasificación de 50 personas según edad y sexo.
Deberá mostrar los siguientes resultados:
a. Cantidad de personas mayores de edad (18 años o más).
b. Cantidad de personas menores de edad.
c. Cantidad de personas masculinas mayores de edad.
d. Cantidad de personas femeninas menores de edad.
e. Porcentaje que representan las personas mayores de edad respecto al total de
personas.
f. Porcentaje que representan las mujeres respecto al total de personas.

Utilice la instrucción LEER PERSONAS al inicio del programa para cargar los datos de las
50 personas en un variable, PERSONAS, que actúa como un vector de 50 posiciones.
Cada elemento de PERSONAS es de un tipo estructurado que dispone dos campos:
SEXO y EDAD. */

public class Ejercicio2 {

    // Estructura Persona
    static class Persona {
        char sexo; // 'M' es sexo masculino y 'F' es sexo femenino
        int edad;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Se crea una lista para las 50 personas.
        Persona[] personas = new Persona[50];

        // Se inicializan los contadores.
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int hombresMayores = 0;
        int mujeresMenores = 0;
        int totalMujeres = 0;

        // Se intruduce cada persona LEERPERSONAS.
        for (int i = 0; i < 50 ; i++){
            personas[i] = new Persona();
            System.out.println("Introduzca el sexo(M/F) de la persona " + (i + 1) + " : ");
            personas[i].sexo = input.next().toUpperCase().charAt(0);

            // Validación del input sexo
            while (personas[i].sexo != 'M' && personas[i].sexo != 'F') {
                System.out.print("Error. Por favor, introduzca 'M' o 'F': ");
                personas[i].sexo = input.next().toUpperCase().charAt(0);
            }

            System.out.println("Introduzca la edad de la persona " + (i + 1) + ": ");
            personas[i].edad = input.nextInt();

            // Validación del input edad
            while (personas[i].edad < 0 ) {
                System.out.print("Error. Por favor, introduzca un valor válido: ");
                personas[i].edad = input.nextInt();
            }   

            // Conteo para los resultados
            if (personas[i].edad >= 18) {
                mayoresDeEdad++;
                if (personas[i].sexo == 'M') {
                    hombresMayores++;
                }
            } else {
                menoresDeEdad++;
                if (personas[i].sexo == 'F') {
                    mujeresMenores++;
                }
            }

            if (personas[i].sexo == 'F') {
                totalMujeres++;
            }

        }

        // Calcular porcentajes(e y f)
        double porcentajeMayores = (mayoresDeEdad * 100.0) / personas.length;
        double porcentajeMujeres = (totalMujeres * 100.0) / personas.length;

        // Mostrar resultados
        System.out.println("a. Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("b. Cantidad de personas menores de edad: " + menoresDeEdad);
        System.out.println("c. Cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("d. Cantidad de personas femeninas menores de edad: " + mujeresMenores);
        System.out.println("e. Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("f. Porcentaje de mujeres respecto al total: " + porcentajeMujeres + "%");

        input.close();
    }
}
