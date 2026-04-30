package com.mycompany.juego;

import java.util.ArrayList;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yisus
 */
public class ventanaMenu extends javax.swing.JFrame {
    Mercado merca;
    Equipo equipo;
    ArrayList<JButton> botones;
    /**
     * Creates new form ventanaJugar
     * @param merca
     * @param equipo
     * @param botones
     */
    public ventanaMenu(Mercado merca, Equipo equipo,ArrayList<JButton> botones) {
        initComponents();
        this.merca = merca;
        this.equipo = equipo;
        this.botones = botones;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonLiga = new javax.swing.JButton();
        BotonMercado = new javax.swing.JButton();
        BotonPlantilla = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonLiga.setBackground(new java.awt.Color(102, 102, 102));
        BotonLiga.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonLiga.setText("Liga");
        BotonLiga.setFocusPainted(false);
        BotonLiga.addActionListener(this::BotonLigaActionPerformed);
        jPanel1.add(BotonLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 390, 250));

        BotonMercado.setBackground(new java.awt.Color(102, 102, 102));
        BotonMercado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonMercado.setText("Mercado");
        BotonMercado.setFocusPainted(false);
        BotonMercado.addActionListener(this::BotonMercadoActionPerformed);
        jPanel1.add(BotonMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 390, 280));

        BotonPlantilla.setBackground(new java.awt.Color(102, 102, 102));
        BotonPlantilla.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonPlantilla.setText("Plantilla");
        BotonPlantilla.setFocusPainted(false);
        BotonPlantilla.addActionListener(this::BotonPlantillaActionPerformed);
        jPanel1.add(BotonPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 230, 550));

        BotonSalir.setBackground(new java.awt.Color(204, 0, 0));
        BotonSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonSalir.setText("Salir del juego");
        BotonSalir.setFocusPainted(false);
        BotonSalir.addActionListener(this::BotonSalirActionPerformed);
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLigaActionPerformed
        ventanaLiga vL = new ventanaLiga();
        this.setVisible(false);
        vL.setVisible(true);
    }//GEN-LAST:event_BotonLigaActionPerformed

    private void BotonPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPlantillaActionPerformed
        ventanaPlantilla vP = new ventanaPlantilla(equipo,this,botones);
        this.setVisible(false);
        vP.setVisible(true);
    }//GEN-LAST:event_BotonPlantillaActionPerformed

    private void BotonMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMercadoActionPerformed
        ventanaMercado vM = new ventanaMercado(merca,this,equipo);
        this.setVisible(false);
        vM.setVisible(true);
    }//GEN-LAST:event_BotonMercadoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLiga;
    private javax.swing.JButton BotonMercado;
    private javax.swing.JButton BotonPlantilla;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
