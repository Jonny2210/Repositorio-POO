package Vista;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Videojuego {
    private int id;
    private String nombrePersonaje;
    private String genero;
    private double altura;
    private String nombreAtaque;
    private String urlImagen;

    public Videojuego() {
    }

    public Videojuego(int id, String nombrePersonaje, String genero, double altura, String nombreAtaque, String urlImagen) {
        this.id = id;
        this.nombrePersonaje = nombrePersonaje;
        this.genero = genero;
        this.altura = altura;
        this.nombreAtaque = nombreAtaque;
        this.urlImagen = urlImagen;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombreAtaque() {
        return nombreAtaque;
    }

    public void setNombreAtaque(String nombreAtaque) {
        this.nombreAtaque = nombreAtaque;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "Vista.Videojuego{" +
                "id=" + id +
                ", nombrePersonaje='" + nombrePersonaje + '\'' +
                ", genero='" + genero + '\'' +
                ", altura=" + altura +
                ", nombreAtaque='" + nombreAtaque + '\'' +
                ", urlimagen=" + urlImagen +
                '}';
    }

    public ImageIcon createIcon() {
        ImageIcon resultado = null;
            try {
               URL url = new URL(this.urlImagen);
               resultado= new ImageIcon(url);
            } catch (MalformedURLException mue) {
                System.out.println(mue.toString());
            }
            return resultado;
        }
    }





