package Modelo;

import Vista.Videojuego;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.net.URL;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    public static final int COLS = 6;
    private ArrayList<Videojuego> datos;


    public ModeloTabla() {
        datos = new ArrayList<>();
    }
    public ModeloTabla(ArrayList<Videojuego> datos){
        this.datos = datos;
    }


    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columName = "";
        switch (columnIndex) {
            case 0:
                columName = "ID.";
                break;
            case 1:
                columName = "Nombre del Personaje";
                break;
            case 2:
                columName = "Genero";
                break;
            case 3:
                columName = "Altura";
                break;
            case 4:
                columName = "Nombre de Ataque";
                break;
            case 5:
                columName = "URL";
                break;

        }
        return columName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return URL.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Videojuego tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombrePersonaje();
            case 2:
                return tmp.getGenero();
            case 3:
                return tmp.getAltura();
            case 4:
                return tmp.getNombreAtaque();
            case 5:
                return tmp.getUrlImagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public boolean agregarpersonaje (Videojuego personaje){ //este metodo agrega un videojuego nuevo al modelo y lo agrega al Arraylist interno del modelo y esto permitira actualizar los datos de la tabla
        boolean resultado = true;

        if (resultado==true){
            this.datos.add(personaje);
        }
        return resultado;

    }
    public  boolean actualizarpersonaje (Videojuego Personaje){
        boolean resultado = true;
        if (resultado==true){
            this.datos.add(Personaje);
        }
        return  resultado;
    }

    public Videojuego obtenerpersonaje(int rowIndex){
        return datos.get(rowIndex);

    }





    }


