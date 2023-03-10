import java.security.AlgorithmConstraints;

public class Computadora {

    private String marca;
    private String tipo;
    private double memoria;
    private double almacenamiento;

    public Computadora() {
    }

    public Computadora(String marca, String tipo, double memoria, double almacenamiento) {
        this.marca = marca;
        this.tipo = tipo;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
    }

    public Computadora(double memoria, double almacenamiento) {
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Computadora:" + "marca: " + marca + ", tipo: " + tipo + ", memoria: " + memoria + " GB";
    }

    public void encender(){
        System.out.println("Se esta encendiendo...");
    }
    public void utilizar(){
        System.out.println("Se esta ocupando por un usuario...");
    }
    public void reiniciar(){
        System.out.println("Se esta reiniciando debido a un error...");
    }
    public void apagar(){
        System.out.println("Se esta pagando..");
    }

    public void Mostrarestado(){
        encender();
        utilizar();
        reiniciar();
        apagar();
        System.out.println("Esta computadora tiene "+almacenamiento+" GB de almacenamiento");
    }
    public void Almacenamiento(){
        if (almacenamiento==250){
            System.out.println("AVISO!! Liberar espacio, queda "+(memoria - almacenamiento)+" GB en espacio de almacenamiento !!AVISO!!");
        } else {
            System.out.println("!! Suficiente espacio en el equipo, quedan "+(memoria - almacenamiento)+ " GB, aun asi libere almacenamiento para una buena capacidad de memoria !!");
        }

    }
}
