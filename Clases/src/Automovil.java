public class Automovil {

    private String marca;
    private int modelo;
    private String color;
    private int km;

    public Automovil(){

    }

    public Automovil(String marca, int modelo, String color, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.km = km;
    }

    public Automovil(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(int km) {
        this.km = km;
    }

    //getter para el atributo marca
    public String getMarca() {
        return marca;
    }
    //setters para el atributo marca
    public void setMarca(String m){
        this.marca = m;
    }

    //getter y setters para los otros atributos

    public int getModelo(){
        return modelo;
    }
    public void setModelo(int mo){
        this.modelo = mo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c){
        this.color=c;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void encender(){
        System.out.println("Esta encendiendo....");
    }
    public void acelerar(){
        System.out.println("Esta acelarando....");
    }
    public void apagar(){
        System.out.println("Se esta apagando....");
    }
    public void recorrer(){
        System.out.println("Este automovil ha recorrido "+km+"km");
    }

    @Override
    public String toString() {
        return "Automovil: " + marca + ", color: " + color + ", modelo: " + modelo;
    }

    public void ImprimirInfo(){
        encender();
        acelerar();
        apagar();





    }


}
