import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil("BMW",2006,"Blanco",100);//Creacion y asignacion de valores al objeto auto1

        Automovil auto2 = new Automovil("HYUNDAI",2016,"Rojo",200);

        Automovil auto3 = new Automovil("VOLSKWAGEN",2004,"Azul",150);

        Automovil auto4 = new Automovil("MERCEDEZ", 2022,"Amarillo",10);

        Automovil auto5 = new Automovil("MUSTANG",2013,"Negro",50);

        System.out.println(auto1);
        auto1.ImprimirInfo();
        auto1.recorrer();

        System.out.println();

        System.out.println(auto2);
        auto2.ImprimirInfo();
        auto2.recorrer();

        System.out.println();

        System.out.println(auto3);
        auto3.ImprimirInfo();
        auto3.recorrer();

        System.out.println();

        System.out.println(auto4);
        auto4.ImprimirInfo();
        auto4.recorrer();

        System.out.println();

        System.out.println(auto5);
        auto5.ImprimirInfo();
        auto5.recorrer();

        System.out.println("-----------------");



        Persona persona1 = new Persona("Pedro",15,1.60,"Española");

        Persona persona2 = new Persona("Jessica",18,1.65,"Mexicana");

        Persona persona3 = new Persona("Raul",20,1.80,"Argentina");

        Persona persona4= new Persona("Sofia",24,1.70,"Peruana");

        Persona persona5= new Persona("Jonathan", 19,1.70,"Mexicana");

        Persona persona6 = new Persona("Evelyn",54,1.63,"Mexicana");

        System.out.println(persona1);
        persona1.Imprimiractividad();
        persona1.nativo();

        System.out.println();

        System.out.println(persona2);
        persona2.Imprimiractividad();
        persona2.nativo();

        System.out.println();

        System.out.println(persona3);
        persona3.Imprimiractividad();
        persona3.nativo();

        System.out.println();

        System.out.println(persona4);
        persona4.Imprimiractividad();
        persona4.nativo();

        System.out.println();

        System.out.println(persona5);
        persona5.Imprimiractividad();
        persona5.nativo();

        System.out.println();

        System.out.println(persona6);
        persona6.Imprimiractividad();
        persona6.nativo();

        System.out.println("-----------------");


        Monitor mon1 = new Monitor("Samsung",40.1,"LED",5999.99);
        Monitor mon2 = new Monitor("LG",70.3,"LCD",20000.74);
        Monitor mon3 = new Monitor("TCL",32.6,"CURVO", 4000.89);

        System.out.println(mon1);
        mon1.Mostramonitor();
        mon1.desconectar();

        System.out.println();

        System.out.println(mon2);
        mon2.Mostramonitor();
        mon2.desconectar();

        System.out.println();

        System.out.println(mon3);
        mon3.Mostramonitor();
        mon3.desconectar();

        System.out.println();

        System.out.println("-----------------");

        Computadora comp1 = new Computadora("HUAWEI","Laptop",250,230);
        Computadora comp2 = new Computadora("MACBOOK PRO","Laptop",250,250);
        Computadora comp3 = new Computadora("HP","Escritorio",250,200);
        Computadora comp4 = new Computadora("MACBOOK PRO","Laptop",250,180);

        System.out.println(comp1);
        comp1.Mostrarestado();
        comp1.Almacenamiento();

        System.out.println();

        System.out.println(comp2);
        comp2.Mostrarestado();
        comp2.Almacenamiento();

        System.out.println();

        System.out.println(comp3);
        comp3.Mostrarestado();
        comp3.Almacenamiento();

        System.out.println();

        System.out.println(comp4);
        comp4.Mostrarestado();
        comp4.Almacenamiento();




    }
}