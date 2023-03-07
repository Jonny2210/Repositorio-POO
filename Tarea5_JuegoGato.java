
import java.util.Scanner;

public class Tarea4_1_JuegoGato {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que ingresen los caracteres
        System.out.print("Ingrese los 9 caracteres para el juego de gato (por ejemplo: X_OXO_X_X): ");
        String garabatos = scanner.next();

        // Convertir la cadena en un array de caracteres
        char[] tablero = garabatos.toCharArray();

        int g = 5;

        // Línea de arriba
        if (g >= 0 && g < 50) {
            for (int i = 0; i < g; i++) {
                System.out.print("- ");
            }
            System.out.println();
            System.out.println();

            // Lineas del costado de el marco
            for (int i = 0; i < g - 2; i++) {
                System.out.print("| ");

                for (int j = 0; j < g - 2; j++) {

                    // Este if es por si se ingresa un guión bajo 
                    // lo imprima tal cual y no lo deje como un espacio
                    if (tablero[i * (g - 2) + j] == '_') {
                        System.out.print("_ ");
                    } else {
                        System.out.print(tablero[i * (g - 2) + j] + " ");
                    }
                }
                System.out.println("|    ");
                System.out.println();
            }

            // Linea de abajo
            for (int i = 0; i < g; i++) {
                System.out.print("- ");
            }
        }

        scanner.close();
    }
}
