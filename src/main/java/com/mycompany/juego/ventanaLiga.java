package com.mycompany.juego;

import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yisus
 */
public class ventanaLiga extends javax.swing.JFrame {
    ventanaMenu menu;
    Liga liga;
    /**
     * Creates new form ventanaLiga
     * @param menu
     * @param liga
     */
    public ventanaLiga(ventanaMenu menu,Liga liga) {
        this.menu = menu;
        this.liga = liga;
        initComponents();
        actualizarTabla();
        setLocationRelativeTo(null);
    }
    
    final void actualizarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) TablaPosiciones.getModel();
        modelo.setRowCount(0);
        
        liga.getEquiposJugando().sort((a,b) -> {
            if (b.getPuntos() != a.getPuntos()){
                return b.getPuntos() - a.getPuntos();
            }
            else {
                return b.getGoles() - a.getGoles();
            }});
        
        for(Equipo equipo : liga.getEquiposJugando()){
            modelo.addRow(new Object[]{
                equipo.getNombre(),
                equipo.getPuntos(),
                equipo.getGoles(),
                equipo.getPartidosJugados()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPosiciones = new javax.swing.JTable();
        botonPartido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        TablaPosiciones.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        TablaPosiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Puntos", "Goles", "PartidosJugados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPosiciones.setDropMode(javax.swing.DropMode.INSERT);
        TablaPosiciones.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(TablaPosiciones);
        if (TablaPosiciones.getColumnModel().getColumnCount() > 0) {
            TablaPosiciones.getColumnModel().getColumn(0).setResizable(false);
            TablaPosiciones.getColumnModel().getColumn(1).setResizable(false);
            TablaPosiciones.getColumnModel().getColumn(2).setResizable(false);
            TablaPosiciones.getColumnModel().getColumn(3).setResizable(false);
        }

        botonPartido.setBackground(new java.awt.Color(51, 51, 51));
        botonPartido.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        botonPartido.setForeground(new java.awt.Color(255, 255, 255));
        botonPartido.setText("JUGAR PARTIDO");
        botonPartido.addActionListener(this::botonPartidoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 611, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPartidoActionPerformed
        liga.jugarPartido(this);
        actualizarTabla();
    }//GEN-LAST:event_botonPartidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPosiciones;
    private javax.swing.JButton botonPartido;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
