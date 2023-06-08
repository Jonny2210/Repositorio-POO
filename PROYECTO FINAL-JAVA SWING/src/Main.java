import Controlador.ControladorVentana;
import Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("🎮 Street Fighter 🎮");
        ControladorVentana controlador = new ControladorVentana(ventana);


    }
}