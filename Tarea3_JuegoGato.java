
public class Tarea3_JuegoGato {

    public static void main(String args[]) {
        int g=5;

        //Linea de arriba
        if(g >=0 && g<50){
            for (int i=0; i<g; i++){
                System.out.print("- ");
            }
            System.out.println();
            System.out.println();

            //Lineas del costado de el marco
            for (int i=0; i<g-2; i++){
                System.out.print("|    ");
        
                for(int j=0; j<g-2; j++){
                    System.out.print(" ");

                }
                System.out.println("|    ");
                System.out.println();
            }
            

            //Linea de abajo
            for (int i=0; i<g; i++){
                System.out.print("- ");
            }
        }
    }   
}
