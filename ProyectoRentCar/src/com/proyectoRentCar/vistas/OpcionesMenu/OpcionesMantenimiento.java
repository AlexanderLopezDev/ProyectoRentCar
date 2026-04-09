package com.proyectoRentCar.vistas.OpcionesMenu;

import com.proyectoRentCar.mantenimiento.MantOferta;
import com.proyectoRentCar.mantenimiento.MantGamas;
import com.proyectoRentCar.mantenimiento.MantUsuario;
import com.proyectoRentCar.mantenimiento.MantVehiculos;
import javax.swing.*;

public class OpcionesMantenimiento extends javax.swing.JPanel {

    private final int nivelUsuario;
    public OpcionesMantenimiento(int nivel) {
        this.nivelUsuario = nivel;
        initComponents();
        configurarPermisos();
    }
    
    private void configurarPermisos() {
        if(nivelUsuario == 1) {
            btnGamas.setVisible(false);
            btnVehi.setVisible(false);
            btnOfertas.setVisible(false);
            btnUsuario.setVisible(false);            
        }
    }
       
    public void configurarVentana(JFrame panel) {
        panel.setSize(900,515);
        panel.setLocationRelativeTo(null);
        panel.setVisible(true);
        
        JFrame ventana = (JFrame)SwingUtilities.getWindowAncestor(this);
    
        if (ventana != null) {
            ventana.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesMantenimiento = new javax.swing.JPanel();
        btnVehi = new javax.swing.JButton();
        btnOfertas = new javax.swing.JButton();
        btnCten = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnGamas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        OpcionesMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        OpcionesMantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVehi.setBackground(new java.awt.Color(0, 153, 153));
        btnVehi.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnVehi.setForeground(new java.awt.Color(255, 255, 255));
        btnVehi.setText("Vehículos");
        btnVehi.setBorder(new javax.swing.border.MatteBorder(null));
        btnVehi.setBorderPainted(false);
        btnVehi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehi.addActionListener(this::btnVehiActionPerformed);
        OpcionesMantenimiento.add(btnVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 134, 30));

        btnOfertas.setBackground(new java.awt.Color(0, 153, 153));
        btnOfertas.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnOfertas.setForeground(new java.awt.Color(255, 255, 255));
        btnOfertas.setText("Ofertas");
        btnOfertas.setBorder(new javax.swing.border.MatteBorder(null));
        btnOfertas.setBorderPainted(false);
        btnOfertas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOfertas.addActionListener(this::btnOfertasActionPerformed);
        OpcionesMantenimiento.add(btnOfertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 134, 30));

        btnCten.setBackground(new java.awt.Color(0, 153, 153));
        btnCten.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnCten.setForeground(new java.awt.Color(255, 255, 255));
        btnCten.setText("Clientes");
        btnCten.setBorder(new javax.swing.border.MatteBorder(null));
        btnCten.setBorderPainted(false);
        btnCten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OpcionesMantenimiento.add(btnCten, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 134, 30));

        btnUsuario.setBackground(new java.awt.Color(0, 153, 153));
        btnUsuario.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Usuario");
        btnUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        btnUsuario.setBorderPainted(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.addActionListener(this::btnUsuarioActionPerformed);
        OpcionesMantenimiento.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 134, 30));

        btnGamas.setBackground(new java.awt.Color(0, 153, 153));
        btnGamas.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnGamas.setForeground(new java.awt.Color(255, 255, 255));
        btnGamas.setText("Gamas");
        btnGamas.setBorder(new javax.swing.border.MatteBorder(null));
        btnGamas.setBorderPainted(false);
        btnGamas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGamas.addActionListener(this::btnGamasActionPerformed);
        OpcionesMantenimiento.add(btnGamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 134, 30));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTOS");
        OpcionesMantenimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 0, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpcionesMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpcionesMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        configurarVentana(new MantUsuario(nivelUsuario));
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiActionPerformed
        configurarVentana(new MantVehiculos(nivelUsuario));   
    }//GEN-LAST:event_btnVehiActionPerformed

    private void btnGamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGamasActionPerformed
        configurarVentana(new MantGamas(nivelUsuario));     
    }//GEN-LAST:event_btnGamasActionPerformed

    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        configurarVentana(new MantOferta());
    }//GEN-LAST:event_btnOfertasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OpcionesMantenimiento;
    private javax.swing.JButton btnCten;
    private javax.swing.JButton btnGamas;
    private javax.swing.JButton btnOfertas;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVehi;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
