package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class REGISTRO {
    private JPanel panel1;
    private JTextField txtusuario;
    private JTextField txtnombre;
    private JTextField txtapellido;
    private JTextField txtfecha;
    private JTextField txtgenero;
    private JTextField txtcorreo;
    private JTextField txtcontraseña;
    private JButton btRegistrar;
    private JButton btCancelar;
    private JTextArea tout;

    public REGISTRO() {

        btRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtusuario.getText();
                String nombre = txtnombre.getText();
                String apellido = txtapellido.getText();
                String fecha = txtfecha.getText();
                String genero = txtgenero.getText();
                String correo = txtcorreo.getText();
                String contraseña = txtcontraseña.getText();
                if (e.getSource() == btRegistrar) {
                    String data
                            = "Usuario : " + txtusuario.getText() + "\n"
                            + "Nombre : " + txtnombre.getText() + "\n";
                    String data2
                            = "Apellido: " + txtapellido.getText() + "\n"
                            + "Fecha de nacimiento: " + txtfecha.getText() + "\n"
                            + "Genero : " + txtgenero.getText() + "\n";
                    String data3
                            = "Correo : " + txtcorreo.getText()+ "\n"
                            + "Contraseña : " + txtcontraseña.getText();

                    tout.setText(data +  data2 + data3);
                    tout.setEditable(false);
                }

                JOptionPane.showMessageDialog(null,"Registro exitoso ","Registro", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Datos del registro "+"Usuario: "+usuario+", "+"Nombre: "+nombre+", "+"Apellido: "+apellido
                        +", "+"Fecha: "+fecha+", "+"Genero: "+genero+", "+"Correo: "+correo+", "+"Contraseña: "+contraseña);
            }
        });
        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtusuario.setText("");
                txtnombre.setText("");
                txtapellido.setText("");
                txtfecha.setText("");
                txtgenero.setText("");
                txtcorreo.setText("");
                txtcontraseña.setText("");}
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("REGISTRO");
        frame.setBounds(300, 90, 900, 600);
        frame.setContentPane(new REGISTRO().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }}
