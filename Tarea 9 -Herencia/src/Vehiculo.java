import java.awt.*;

public class Vehiculo {

    protected String color;
    protected int HP;
    protected String tipodemotor;

    public Vehiculo() {
    }

    public Vehiculo(String color, int HP, String tipodemotor) {
        this.color = color;
        this.HP = HP;
        this.tipodemotor = tipodemotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getTipodemotor() {
        return tipodemotor;
    }

    public void setTipodemotor(String tipodemotor) {
        this.tipodemotor = tipodemotor;
    }

    public void arrancar(){
        System.out.println("El auto ha arrancado.....");
    }
    public void apagar(){
        System.out.println("El auto se esta apagando.....");
    }
    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", HP=" + HP +
                ", tipodemotor='" + tipodemotor + '\'' +
                '}';
    }
}

