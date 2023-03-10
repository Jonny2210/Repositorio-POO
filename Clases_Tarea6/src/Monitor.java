public class Monitor {

    private String marca;
    private double pulgadas;
    private String tipo;
    private double precio;

    public Monitor() {
    }

    public Monitor(String marca, double pulgadas, String tipo, double precio) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Monitor(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor: " + "marca:" + marca + ", pulgadas:" + pulgadas + "'', tipo:" + tipo +", precio: $" + precio;
    }

    public void encender(){
        System.out.println("Esta encendiendo...");

    }
    public void utilizar(){
        System.out.println("Se esta visualizando...");

    }
    public void reposar(){
        System.out.println("Entro en reposo....");

    }
    public void apagar(){
        System.out.println("Se esta apagando...");

    }
    public void desconectar(){
        System.out.println("!!AVISO!! Se recomienda desconectar de la luz para que no haya daños!!AVISO!!");
    }

    public void Mostramonitor(){
       encender();
       utilizar();
       reposar();
       apagar();
    }
}
