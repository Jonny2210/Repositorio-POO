package Vista;

import Modelo.ModeloTabla;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel etiquetaID;
    private JLabel etiquetaNombrePersonaje;
    private JLabel etiquetaGenero;
    private JLabel etiquetaAltura;
    private JLabel etiquetaNombreAtaque;
    private JLabel etiquetaURL;
    private JLabel etiquetaLogo;
    private JTextField txtID;
    private JTextField txtNombrePersonaje;
    private JTextField txtGenero;
    private JTextField txtAltura;
    private JTextField txtNombreAtaque;
    private JTextField txtURL;
    private JButton btnAgregar;
    private JButton btnCargar;
    private ModeloTabla modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;
    private JTable tabla;
    private JPanel panel1;
    private JComboBox<String> comboBoxPanel1;

    private JPanel panel2;
    private JPanel panel3;
    private JLabel etiquetaImagen;

    private JPanel panel4;
    private JLabel etiquetaID2;
    private JLabel etiquetaNombrePer2;
    private JLabel etiquetaGenero2;
    private JLabel etiquetaAltura2;
    private JLabel etiquetaNombreAtaq2;
    private JLabel etiquetaURL2;
    private JLabel etiquetaSeparar;
    private JLabel etiquetaSeparar2;
    private JLabel etiquetaEliminarID;
    private JTextField txtNombrePer2;
    private JTextField txtGenero2;
    private JTextField txtAltura2;
    private JTextField txtNombreAtaq2;
    private JTextField txtURL2;
    private JTextField txtID2;
    private JTextField txtEliminarID;
    private JButton btnActualizar;
    private JButton btnEliminarID;

    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1500, 1000);
        layout = new GridLayout(2, 2);
        this.setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(229, 57, 53));

        etiquetaID = new JLabel("ID:");
        txtID = new JTextField(4);
        txtID.setText("0");
        txtID.setEnabled(false);
        panel1.add(etiquetaID);
        panel1.add(txtID);

        etiquetaNombrePersonaje = new JLabel("Nombre del Personaje:");
        txtNombrePersonaje = new JTextField(30);
        panel1.add(etiquetaNombrePersonaje);
        panel1.add(txtNombrePersonaje);

        etiquetaGenero = new JLabel("Genero:");
        txtGenero = new JTextField(20);

        String[] opciones = {"HOMBRE", "MUJER", "MONSTRUO"};
        comboBoxPanel1 = new JComboBox<>(opciones);
        comboBoxPanel1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel1.getSelectedIndex());

            }
        });
        panel1.add(etiquetaGenero);
        panel1.add(comboBoxPanel1);

        etiquetaAltura = new JLabel("Altura:");
        txtAltura = new JTextField(7);
        panel1.add(etiquetaAltura);
        panel1.add(txtAltura);

        etiquetaNombreAtaque = new JLabel("Nombre de Ataque:");
        txtNombreAtaque = new JTextField(20);
        panel1.add(etiquetaNombreAtaque);
        panel1.add(txtNombreAtaque);


        etiquetaURL = new JLabel("URL de una imagen del personaje:");
        txtURL = new JTextField(45);
        panel1.add(etiquetaURL);
        panel1.add(txtURL);

        btnAgregar = new JButton("Agregar personaje");
        panel1.add(btnAgregar);

        String urlImagen = "https://assets.stickpng.com/images/580b57fcd9996e24bc43c341.png";
        try {
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imagenIcon = new ImageIcon(imagen);
            etiquetaLogo = new JLabel(imagenIcon);
            panel1.add(etiquetaLogo);
            this.getContentPane().add(panel1);
        }catch (MalformedURLException me){
            System.out.println("url no valida");
        }catch (Exception e){
            System.out.println("error al cargar la imagen");
        }


        this.getContentPane().add(panel1, 0);


        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(216, 67, 21));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);

        //Agrega un ArrayList
        info = new ArrayList<>();

        modelo = new ModeloTabla(info);
        tabla = new JTable(modelo);
        scroll = new JScrollPane(tabla);
        panel2.add(scroll);


        this.getContentPane().add(panel2, 1);


        //panel3

        panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel3.setBackground(new Color(191, 54, 12));
        etiquetaImagen = new JLabel("!! DA CLICK EN TU PERSONAJE PARA VER SU IMAGEN :) !! ");
        panel3.add(etiquetaImagen);

        this.getContentPane().add(panel3,2);



        //panel4
        panel4 = new JPanel();
        panel4.setBackground(new Color(255, 87, 34));

        etiquetaID2 = new JLabel("ID por modificar");
        txtID2 = new JTextField(4);
        panel4.add(etiquetaID2);
        panel4.add(txtID2);

        etiquetaNombrePer2 = new JLabel("Nuevo nombre del personaje:");
        txtNombrePer2 = new JTextField(15);
        panel4.add(etiquetaNombrePer2);
        panel4.add(txtNombrePer2);

        etiquetaGenero2 = new JLabel("Nuevo genero:");
        txtGenero2 = new JTextField(15);
        panel4.add(etiquetaGenero2);
        panel4.add(txtGenero2);

        etiquetaAltura2 = new JLabel("Nueva altura:");
        txtAltura2 = new JTextField(15);
        panel4.add(etiquetaAltura2);
        panel4.add(txtAltura2);

        etiquetaNombreAtaq2 = new JLabel("Nuevo nombre del ataque:");
        txtNombreAtaq2 = new JTextField(15);
        panel4.add(etiquetaNombreAtaq2);
        panel4.add(txtNombreAtaq2);

        etiquetaURL2 = new JLabel("Nuevo URL:");
        txtURL2 = new JTextField(45);
        panel4.add(etiquetaURL2);
        panel4.add(txtURL2);

        btnActualizar = new JButton("Actualizar datos");
        panel4.add(btnActualizar);

        etiquetaSeparar = new JLabel("-------------------------------------------------------------------------------");
        etiquetaSeparar2 = new JLabel("-------------------------------------------------------------------------------");
        panel4.add(etiquetaSeparar);
        panel4.add(etiquetaSeparar2);

        etiquetaEliminarID = new JLabel("ID por eliminar");
        txtEliminarID = new JTextField(4);
        btnEliminarID = new JButton("Eliminar");
        panel4.add(etiquetaEliminarID);
        panel4.add(txtEliminarID);
        panel4.add(btnEliminarID);

        this.getContentPane().add(panel4, 3);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtNombrePersonaje() {
        return txtNombrePersonaje;
    }

    public void setTxtNombrePersonaje(JTextField txtNombrePersonaje) {
        this.txtNombrePersonaje = txtNombrePersonaje;
    }

    public JTextField getTxtGenero() {
        return txtGenero;
    }

    public void setTxtGenero(JTextField txtGenero) {
        this.txtGenero = txtGenero;
    }

    public JTextField getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(JTextField txtAltura) {
        this.txtAltura = txtAltura;
    }

    public JTextField getTxtNombreAtaque() {
        return txtNombreAtaque;
    }

    public void setTxtNombreAtaque(JTextField txtNombreAtaque) {
        this.txtNombreAtaque = txtNombreAtaque;
    }

    public JTextField getTxtURL() {
        return txtURL;
    }

    public void setTxtURL(JTextField txtURL) {
        this.txtURL = txtURL;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JLabel getEtiquetaID() {
        return etiquetaID;
    }

    public void setEtiquetaID(JLabel etiquetaID) {
        this.etiquetaID = etiquetaID;
    }

    public JComboBox<String> getComboBoxPanel1() {
        return comboBoxPanel1;
    }

    public void setComboBoxPanel1(JComboBox<String> comboBoxPanel1) {
        this.comboBoxPanel1 = comboBoxPanel1;
    }

    public JTextField getTxtNombrePer2() {
        return txtNombrePer2;
    }

    public void setTxtNombrePer2(JTextField txtNombrePer2) {
        this.txtNombrePer2 = txtNombrePer2;
    }

    public JTextField getTxtGenero2() {
        return txtGenero2;
    }

    public void setTxtGenero2(JTextField txtGenero2) {
        this.txtGenero2 = txtGenero2;
    }

    public JTextField getTxtAltura2() {
        return txtAltura2;
    }

    public void setTxtAltura2(JTextField txtAltura2) {
        this.txtAltura2 = txtAltura2;
    }

    public JTextField getTxtNombreAtaq2() {
        return txtNombreAtaq2;
    }

    public void setTxtNombreAtaq2(JTextField txtNombreAtaq2) {
        this.txtNombreAtaq2 = txtNombreAtaq2;
    }

    public JTextField getTxtURL2() {
        return txtURL2;
    }

    public void setTxtURL2(JTextField txtURL2) {
        this.txtURL2 = txtURL2;
    }

    public JTextField getTxtID2() {
        return txtID2;
    }

    public void setTxtID2(JTextField txtID2) {
        this.txtID2 = txtID2;
    }

    public JButton getBtnEliminarID() {
        return btnEliminarID;
    }

    public void setBtnEliminarID(JButton btnEliminarID) {
        this.btnEliminarID = btnEliminarID;
    }

    public JLabel getEtiquetaImagen() {
        return etiquetaImagen;
    }

    public void setEtiquetaImagen(JLabel etiquetaImagen) {
        this.etiquetaImagen = etiquetaImagen;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void limpiartxt(){
        txtID.setText("0");
        txtNombrePersonaje.setText("");
        txtAltura.setText("");
        txtNombreAtaque.setText("");
        txtURL.setText("");
    }
    public  void limpiardenuevo(){
        txtID2.setText("");
        txtNombrePer2.setText("");
        txtGenero2.setText("");
        txtAltura2.setText("");
        txtNombreAtaq2.setText("");
        txtURL2.setText("");

    }
}
