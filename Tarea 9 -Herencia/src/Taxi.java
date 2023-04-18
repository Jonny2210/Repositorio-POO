public class Taxi extends Automovil{

    private int numpasajeros;
    private int cantidaddeservicios;
    private int km;

    public Taxi() {
    }

    public Taxi(String color, int HP, String tipodemotor, int numpuertas, int modelo, int numllantas, int numpasajeros, int cantidaddeservicios, int km) {
        super(color, HP, tipodemotor, numpuertas, modelo, numllantas);
        this.numpasajeros = numpasajeros;
        this.cantidaddeservicios = cantidaddeservicios;
        this.km = km;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public int getCantidaddeservicios() {
        return cantidaddeservicios;
    }

    public void setCantidaddeservicios(int cantidaddeservicios) {
        this.cantidaddeservicios = cantidaddeservicios;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int dineroobtenido) {
        this.km = dineroobtenido;
    }

    public void iniciarviaje(){
        System.out.println("El taxi ha iniciado el viaje.....");
    }

    public void finalizarviaje(){
        System.out.println("El taxi a finalizado el viaje y recorrio " +km+" km......");
    }
    @Override
    public String toString() {
        return "Taxi{" +
                "numpasajeros=" + numpasajeros +
                ", cantidaddeservicios=" + cantidaddeservicios +
                ", km=" + km +
                ", numpuertas=" + numpuertas +
                ", modelo=" + modelo +
                ", numllantas=" + numllantas +
                ", color='" + color + '\'' +
                ", HP='" + HP + '\'' +
                ", tipodemotor='" + tipodemotor + '\'' +
                '}';
    }
}
