public class MaquinaDeCafe {
    private int cantidadAgua;
    private int cantidadCafe;
    private int cantidadCrema;
    private int cantidadVasos;

    private int vasos;

    public MaquinaDeCafe() {
    }


    public MaquinaDeCafe(int cantidadAgua, int cantidadCafe, int cantidadCrema, int cantidadVasos) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafe = cantidadCafe;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVasos = cantidadVasos;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema) {
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVasosTermicos() {
        return cantidadVasos;
    }

    public void setCantidadVasosTermicos(int cantidadVasosTermicos) {
        this.cantidadVasos = cantidadVasosTermicos;
    }

    public boolean servirAmericano( ){
        if (cantidadAgua>= 180 && cantidadCafe>=15) {
            this.cantidadAgua = this.cantidadAgua-180;
            this.cantidadCafe = this.cantidadCafe-15;
            this.cantidadVasos= this.cantidadVasos-1;
            System.out.println("Se te ha servido un Café americano");
            return true;
        } else {
            System.out.println("No se te ha podido servir un Cafe Expreso. Revisa que haya suficientes niveles de cafe y agua en la máquina");
            return false;
        }

    }
    public boolean servirExpreso( ){
        if (cantidadAgua>=120 && cantidadCafe>=20){
            this.cantidadAgua = cantidadAgua-120;
            this.cantidadCafe = cantidadCafe-20;
            this.cantidadVasos = cantidadVasos-1;
            System.out.println(" Se te ha servido un Café Expreso ");
            return true;

        }else if (this.cantidadVasos==0) {
            System.out.println("Ya no hay vasos suficientes");
            return false;
            
        }else {
            System.out.println("No se te ha podido servir un Cafe Expreso. Revisa que haya suficientes niveles de cafe y agua en la máquina");
            return false;
        }
        }
    public boolean servirCapuchino( ){
        if (cantidadAgua>=100 && cantidadCrema>=70 && cantidadCafe>=14){
            this.cantidadAgua = cantidadAgua-100;
            this.cantidadCafe = cantidadCafe-14;
            this.cantidadVasos = cantidadVasos-1;
            System.out.println(" Se te ha servido un Café Capuchino ");
            return true;
        } else if (this.cantidadVasos==0) {
            System.out.println("No se te ha podido servir un Cafe Expreso. Revisa que haya suficientes niveles de cafe.crema y agua en la máquina");
            return false;
        } else {
            System.out.println("Ya no se pueden servir más cafés");
            return false;
        }
    }
    public void reporteNiveles(){
        System.out.println("Niveles actuales en la máquina: ");
        System.out.println("Cantidad de agua:" + this.cantidadAgua + " ml");
        System.out.println("Cantidad de café:" + this.cantidadCafe + " gr");
        System.out.println("Cantidad de crema:"+ this.cantidadCrema + " ml");
        System.out.println("Cantidad de vasos:" + this.cantidadVasos + "piezas");
        }




    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "cantidadAgua=" + cantidadAgua +
                ", cantidadCafe=" + cantidadCafe +
                ", cantidadCrema=" + cantidadCrema +
                ", cantidadVasosTermicos=" + cantidadVasos +
                '}';
    }
}
