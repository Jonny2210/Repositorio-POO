
public class Ejercicios_JavaAFondo{
    public static void main (String args[]){
        
        //.length
        String s="Hola";
        int x=s.length(); //retorna 4

        System.out.println(x);

        //.isEmpty

        String s1="Hola;";
        boolean b1 = s1.isEmpty(); //Retorna: false

        System.out.println(b1);

        String s2 = "";
        boolean b2 = s2.isEmpty(); //Retorna: true

        System.out.println(b2);

        //.chartAt

        String t = "Hola";
        for (int i=0; i<t.length(); i++){
            char c= t.charAt(i);
            System.out.println(c);  /* SALIDA:  H 
                                                o 
                                                l 
                                                a  */
        }
        //.equals

        String a= "Hola";
        String b= "Hola";

        if(a.equals(b)){ //compara sus contenidos, retorna true
            System.out.println("SI pasa por aqui!");
        } 

        /*.indexOf
          .lastIndex*/
    

        String a1= "Hola, como estas?";
        int p1 = a1.indexOf('a'); //retorna: 3
        int p2 = a1.lastIndexOf('a'); //retorna: 14

        System.out.println(p1);
        System.out.println(p2);
        
        String a2= "Hola, como estas? Estas como querias";
        int p3 = a2.indexOf("como");        //retorna: 6
        int p4 = a2.lastIndexOf("estas");   //retorna: 11
        int p5 = a2.lastIndexOf("como");    //retorna: 24

        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        //.toUpperCase
        //.toLoweCase

        String f = "Hola, como estas?";
        String may= f.toUpperCase(); //retorna: HOLA, COMO ESTAS?
        String min= f.toLowerCase();  // retorna: hola, como estas?

        System.out.println(may);
        System.out.println(min);

        //substring

        String u = "Hola, como estas?";
        String u1= u.substring(0,4); //retorna: Hola
        String u2= u.substring(6,10);  // retorna: como
        String u3= u.substring(11);     //retorna: estas?

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        // Integer
            //enteros
            String m1= "1234" ;
            int i = Integer.parseInt(m1);   //retorna: 1234
            String n1 = Integer.toString(i); //retorna: "1234"

            System.out.println(i);
            System.out.println(n1);

            //flotantes 
            String m2= "1234.56" ;
            double v = Double.parseDouble(m2);   //retorna: 1234.56
            String n2 = Double.toString(v); //retorna: "1234.56"

            System.out.println(v);
            System.out.println(n2);

        //concatenar +

        String r = "Hola, ";
        String o= "que tal?";
        String g= r+o;  // "Hola, que tal?"

        System.out.println(g);

        //String

        String h= "Hola";
        h= "chau";
        System.out.println(h);      //SALIDA: chau

        String h1="Hola";
        h1+=",chau"; //concatenamos?
        System.out.println(h1);  //SALIDA: Hola, chau

        //StringBuilder

        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println(sb);     //SALIDA: Hola, chau

        //setCharAt
        StringBuilder sb1 = new StringBuilder("Hola");
        sb1.setCharAt(2,'X');
        System.out.println(sb1);     //SALIDA: HOXA


        //Ejemplo propio StringBuilder

        StringBuilder k= new StringBuilder();
        k.append("Buenoos dias, ");
        k.append("que guap@ te vez hoy :)");
        System.out.println(k);      //Salida: Buenos dias, que guap@ te vez hoy :)

        StringBuilder k1= new StringBuilder("Hola guap@");
        k1.setCharAt(3, 'I');
        System.out.println(k1);     //Salida HolI guap@






       

    }
}