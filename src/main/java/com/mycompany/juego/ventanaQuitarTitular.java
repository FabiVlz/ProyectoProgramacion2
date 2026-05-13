package com.mycompany.juego;

import java.util.HashMap;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yisus
 */
public class ventanaQuitarTitular extends javax.swing.JFrame {

    String posicion;
    JLabel jugadorTitular;
    HashMap<String, Jugador> titulares;
    JLabel textoMedia;
    Equipo equipo;

    public ventanaQuitarTitular(String posicion, JLabel jugadorTitular, HashMap<String, Jugador> titulares, ventanaPlantilla vP, JLabel textoMedia, Equipo equipo) {
        initComponents();

        botonNoQuitar.addActionListener(e -> this.dispose());
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        this.posicion = posicion;
        this.jugadorTitular = jugadorTitular;
        this.titulares = titulares;
        this.textoMedia = textoMedia;
        this.equipo = equipo;

        setLocationRelativeTo(vP);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonQuitar = new javax.swing.JButton();
        botonNoQuitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setText("Quitar jugador?");

        botonQuitar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botonQuitar.setText("SI");
        botonQuitar.addActionListener(this::botonQuitarActionPerformed);

        botonNoQuitar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botonNoQuitar.setText("NO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(botonQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(botonNoQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNoQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        
        if (titulares.get(posicion) != null) {
            titulares.get(posicion).setLugar(null);
            titulares.get(posicion).setTitular(false);
            titulares.replace(posicion, null);
            jugadorTitular.setIcon(null);
            textoMedia.setText(String.valueOf(equipo.calcularMedia()));
        }
        this.dispose();
    }//GEN-LAST:event_botonQuitarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNoQuitar;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    }
