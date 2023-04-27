package ejemplo2;

public class Motocicleta implements Vehiculo{

    private int centrimetosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centrimetosCubicos, String marca) {
        this.centrimetosCubicos = centrimetosCubicos;
        this.marca = marca;
    }

    public int getCentrimetosCubicos() {
        return centrimetosCubicos;
    }

    public void setCentrimetosCubicos(int centrimetosCubicos) {
        this.centrimetosCubicos = centrimetosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centrimetosCubicos=" + centrimetosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito para romperme un hueso");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca "+ this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca "+ this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando la motocicleta de "+ this.centrimetosCubicos+" CC");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando la motocicleta de "+ this.centrimetosCubicos+" CC");

    }
}
