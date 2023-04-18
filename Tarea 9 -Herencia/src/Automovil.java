public class Automovil extends Vehiculo {

    protected int numpuertas;
    protected int modelo;
    protected int numllantas;

    public Automovil() {
    }

    public Automovil(String color, int HP, String tipodemotor, int numpuertas, int modelo, int numllantas) {
        super(color, HP, tipodemotor);
        this.numpuertas = numpuertas;
        this.modelo = modelo;
        this.numllantas = numllantas;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNumllantas() {
        return numllantas;
    }

    public void setNumllantas(int numllantas) {
        this.numllantas = numllantas;
    }

    public void acelerar(){
        System.out.println("El automovil esta acelerando.....");

    }
    public void avanzar(){
        System.out.println("El automovil esta avanzando......");

    }
    @Override
    public String toString() {
        return "Automovil{" +
                "numpuertas=" + numpuertas +
                ", modelo=" + modelo +
                ", numllantas=" + numllantas +
                ", color='" + color + '\'' +
                ", HP='" + HP + '\'' +
                ", tipodemotor='" + tipodemotor + '\'' +
                '}';
    }
}
