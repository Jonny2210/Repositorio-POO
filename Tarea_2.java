
import java.util.Scanner;
public class Tarea_2 {
    
    public static void main(String args[]){

        String nombre;
        String profesion;
        String pais;

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        nombre= entrada.nextLine();

        System.out.println("¿Cual es tu profesión?");
        profesion= entrada.nextLine();
        
        System.out.println("¿Cual es tu país?");
        pais=entrada.nextLine();

        System.out.println("-NOMBRE: "+nombre);
        System.out.println("-PROFESIÓN: "+profesion);
        System.out.println("-PAÍS: "+pais);
    }
}
