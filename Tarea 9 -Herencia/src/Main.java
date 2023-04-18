import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("Rojo",300,"Gasolina");
        vehiculo1.arrancar();
        vehiculo1.apagar();
        System.out.println(vehiculo1);
        Automovil auto1 = new Automovil("Azul",100,"Electrico",4,2020,5);
        auto1.acelerar();
        auto1.avanzar();
        System.out.println(auto1);
        Taxi taxi1 = new Taxi("Rosa",300,"Diesel",5,2015,5,5,10,1500);
        taxi1.iniciarviaje();
        taxi1.finalizarviaje();
        System.out.println(taxi1);

    }
}