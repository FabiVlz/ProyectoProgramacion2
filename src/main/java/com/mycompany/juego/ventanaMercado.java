package com.mycompany.juego;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yisus
 */
public class ventanaMercado extends javax.swing.JFrame {
    Mercado merca;
    ventanaMenu menu;
    Equipo equipo;
    ventanaCompra vC = null;
    /**
     * Creates new form ventanaMercado
     * @param merca
     * @param menu
     * @param equipo
     */
    public ventanaMercado(Mercado merca, ventanaMenu menu, Equipo equipo) {
        initComponents();
        this.merca = merca;
        this.menu = menu;
        this.equipo = equipo;
        textoDinero.setText(String.valueOf(this.equipo.getDinero()));
        panelJugadores.removeAll();
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(20);
        this.merca.JugadoresMercado.sort((a,b)-> Boolean.compare(a.isComprado(),b.isComprado()));
 
        for (Jugador j : this.merca.JugadoresMercado) {
            JButton boton = new JButton();
            if (j.isComprado()){
                boton.setIcon(null);
                boton.setText("COMPRADO");
            }
            else{
                boton.setIcon(new ImageIcon(getClass().getResource(j.getImagen())));
            }
            panelJugadores.add(boton);
            boton.setContentAreaFilled(false);
            boton.setFocusPainted(false);
            boton.addActionListener(e -> {
                
                if (vC == null || !vC.isDisplayable()) {

                    vC = new ventanaCompra(this, equipo, j, textoDinero, boton, panelJugadores);
                    vC.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosed(java.awt.event.WindowEvent e) {
                            vC = null;
                        }
                    });
                    vC.setVisible(true);
                } 
                else {
                    vC.toFront();
                }
            });
        }
        
        int filas = (int) Math.ceil((double)(this.merca.JugadoresMercado.size())/5);
        panelJugadores.setPreferredSize(new Dimension(800, filas * 200));
        panelJugadores.revalidate();
        panelJugadores.repaint();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelJugadores = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        textoDinero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelJugadores.setRequestFocusEnabled(false);
        panelJugadores.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane2.setViewportView(panelJugadores);

        botonRegresar.setBackground(new java.awt.Color(102, 102, 102));
        botonRegresar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.setFocusPainted(false);
        botonRegresar.addActionListener(this::botonRegresarActionPerformed);

        textoDinero.setEditable(false);
        textoDinero.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textoDinero.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(132, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textoDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelJugadores;
    private javax.swing.JTextField textoDinero;
    // End of variables declaration//GEN-END:variables
}
