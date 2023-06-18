/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejer8_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel radio, altura, volumen, superficie;
    private JTextField campoRadio, campoAltura;
    private JButton calcular;

    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro");
        setSize(280,210);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        radio = new JLabel();
        radio.setText("Radio (cms):");
        radio.setBounds(20, 20, 135, 23);
        
        campoRadio = new JTextField();
        campoRadio.setBounds(100, 20, 135, 23);
        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);

        campoAltura = new JTextField();
        campoAltura.setBounds(100, 50, 135, 23);
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 80, 135, 23);
        calcular.addActionListener(this);
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 110, 135, 23);
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 140, 135, 23);
        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double radio = 0;
        double altura = 0;
        try {
            radio = Double.parseDouble(campoRadio.getText());
            altura = Double.parseDouble(campoAltura.getText());
            Cilindro cilindro = new Cilindro(radio, altura);
            volumen.setText("Volumen (cm3): " + String.format("%.2f",
            cilindro.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f",
                    cilindro.calcularSuperficie()));
        } catch (Exception e){
            error = true;
        } finally {
            if(error) {
                JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
