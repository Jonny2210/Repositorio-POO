package Controlador;

import Modelo.ModeloTabla;
import Vista.Ventana;
import Vista.Videojuego;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVentana implements MouseListener {

    private Ventana vista;
    private ModeloTabla modelo;

    public ControladorVentana(Ventana vista) {
        this.vista = vista;
        modelo = new ModeloTabla();
        this.vista.getTabla().setModel(modelo);
        this.vista.getBtnAgregar().addMouseListener(this);
        this.vista.getTabla().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == vista.getBtnAgregar()) {

            Videojuego nuevo = new Videojuego();
            nuevo.setId((1 + modelo.getRowCount()));
            nuevo.setNombrePersonaje(vista.getTxtNombrePersonaje().getText());
            nuevo.setGenero(vista.getComboBoxPanel1().getSelectedItem().toString());
            nuevo.setAltura(Double.parseDouble(vista.getTxtAltura().getText()));
            nuevo.setNombreAtaque(vista.getTxtNombreAtaque().getText());
            nuevo.setUrlImagen(vista.getTxtURL().getText());
            vista.getTabla().updateUI();

            if (modelo.agregarpersonaje(nuevo)) {
                JOptionPane.showMessageDialog(vista, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.vista.getTabla().updateUI();
            } else {
                JOptionPane.showMessageDialog(vista, "No se pudo agregar a la base de datos. Por favor revise su conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            vista.limpiartxt();

        }

        if (e.getSource() == vista.getTabla()) {
            int renglon = vista.getTabla().getSelectedRow();
            modelo.obtenerpersonaje(renglon);
            Videojuego nuevo = modelo.obtenerpersonaje(renglon);
            vista.getEtiquetaImagen().setText("");
            vista.getEtiquetaImagen().setIcon(nuevo.createIcon());
        }

        if (e.getSource() == vista.getBtnEliminarID()) {

        }
        if (e.getSource() == vista.getBtnActualizar()) {
                Videojuego videojuego = new Videojuego();
                videojuego.setId(Integer.parseInt((String) vista.getTxtID2().getText()));
                videojuego.setNombrePersonaje(vista.getTxtNombrePer2().getText());
                videojuego.setGenero(vista.getTxtGenero2().getText());
                videojuego.setAltura(Double.parseDouble(vista.getTxtAltura2().getText()));
                videojuego.setNombreAtaque(vista.getTxtNombreAtaq2().getText());
                videojuego.setUrlImagen(vista.getTxtURL2().getText());
                vista.getTabla().updateUI();

                if (modelo.actualizarpersonaje(videojuego)) {
                    JOptionPane.showMessageDialog(vista, "Se actualizo correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.vista.getTabla().updateUI();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo actualizar", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                this.vista.limpiardenuevo();
            } else {
                this.vista.limpiardenuevo();
            }

        }



    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
