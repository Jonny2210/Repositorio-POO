public class Persona {

    private String nombre;
    private int edad;
    private double estatura;
    private String nacion;

    public Persona() {
    }

    public Persona(String nombre, int edad, double estatura, String nacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.nacion = nacion;
    }

    public Persona(String nacion) {
        this.nacion = nacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public void despertar(){
        System.out.println("Esta despertando...");
    }
    public void comer(){
        System.out.println("Esta comiendo...");
    }
    public void bañar(){
        System.out.println("Se esta bañando...");
    }
    public void dormir(){
        System.out.println("Ya se durmio...");
    }
    public void nativo(){
        if (nacion=="Mexicana"){
            System.out.println("Es nativo");
        } else {
            System.out.println("Es extranjero");
        }
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre:" + nombre+ ", edad:" + edad + " años, estatura:" + estatura + " m, nacion:" + nacion;
    }
    public void Imprimiractividad(){
        despertar();
        comer();
        bañar();
        dormir();
    }
}
