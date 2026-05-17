package com.mycompany.juego;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaias
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonLiga.setBackground(new java.awt.Color(102, 102, 102));
        BotonLiga.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonLiga.setForeground(new java.awt.Color(255, 255, 51));
        BotonLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego/imagenes/Bayernliga.jpg"))); // NOI18N
        BotonLiga.setToolTipText("");
        BotonLiga.setFocusPainted(false);
        BotonLiga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonLiga.setMinimumSize(new java.awt.Dimension(79, 39));
        BotonLiga.addActionListener(this::BotonLigaActionPerformed);
        jPanel1.add(BotonLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 390, 250));

        BotonMercado.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonMercado.setForeground(new java.awt.Color(204, 0, 51));
        BotonMercado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego/imagenes/Mercadodefichajee.jpg"))); // NOI18N
        BotonMercado.setFocusPainted(false);
        BotonMercado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonMercado.setOpaque(true);
        BotonMercado.addActionListener(this::BotonMercadoActionPerformed);
        jPanel1.add(BotonMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 390, 280));

        BotonPlantilla.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonPlantilla.setForeground(new java.awt.Color(255, 255, 255));
        BotonPlantilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego/imagenes/Plantilla.jpg"))); // NOI18N
        BotonPlantilla.setText("PLANTILLA");
        BotonPlantilla.setToolTipText("");
        BotonPlantilla.setAutoscrolls(true);
        BotonPlantilla.setFocusPainted(false);
        BotonPlantilla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonPlantilla.setOpaque(true);
        BotonPlantilla.addActionListener(this::BotonPlantillaActionPerformed);
        jPanel1.add(BotonPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 230, 550));

        BotonSalir.setBackground(new java.awt.Color(204, 0, 0));
        BotonSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BotonSalir.setText("Salir del juego");
        BotonSalir.setFocusPainted(false);
        BotonSalir.addActionListener(this::BotonSalirActionPerformed);
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juego/imagenes/FondoCampo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLigaActionPerformed
        equipo.setListo();
        
        if (equipo.isListo()){
            
            if (equipo.isJugandoLiga()){
                ventanaLiga vL = new ventanaLiga(this,equipo.getLiga());
                this.setVisible(false);
                vL.setVisible(true);
            }
            else{
                Liga liga = new Liga(equipo);
                equipo.setLiga(liga);
                ventanaLiga vL = new ventanaLiga(this,equipo.getLiga());
                this.setVisible(false);
                vL.setVisible(true);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Primero completa tu equipo");
        }
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
        Musica.detenerMusica();
        Progreso.guardar(merca, equipo);
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLiga;
    private javax.swing.JButton BotonMercado;
    private javax.swing.JButton BotonPlantilla;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
