import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        MaquinaDeCafe maquina = new MaquinaDeCafe(5000,1000,1500,50);
        System.out.println("MAQUINA DE CAFES");
        maquina.reporteNiveles();
        System.out.println("---------------");
        maquina.servirExpreso();
        maquina.servirAmericano();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        System.out.println("-----------------");
        maquina.reporteNiveles();

    }
}



