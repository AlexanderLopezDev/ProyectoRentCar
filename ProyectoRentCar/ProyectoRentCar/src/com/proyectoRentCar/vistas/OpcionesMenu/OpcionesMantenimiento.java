package com.proyectoRentCar.vistas.OpcionesMenu;

import com.proyectoRentCar.mantenimiento.MantUsuario;
import javax.swing.*;

public class OpcionesMantenimiento extends javax.swing.JPanel {

    private int nivelUsuario;
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

        OpcionesMantenimiento.setBackground(new java.awt.Color(0, 204, 204));

        btnVehi.setBackground(new java.awt.Color(0, 153, 153));
        btnVehi.setText("Vehículos");
        btnVehi.setBorder(new javax.swing.border.MatteBorder(null));
        btnVehi.setBorderPainted(false);
        btnVehi.addActionListener(this::btnVehiActionPerformed);

        btnOfertas.setBackground(new java.awt.Color(0, 153, 153));
        btnOfertas.setText("Ofertas");
        btnOfertas.setBorder(new javax.swing.border.MatteBorder(null));
        btnOfertas.setBorderPainted(false);

        btnCten.setBackground(new java.awt.Color(0, 153, 153));
        btnCten.setText("Clientes");
        btnCten.setBorder(new javax.swing.border.MatteBorder(null));
        btnCten.setBorderPainted(false);

        btnUsuario.setBackground(new java.awt.Color(0, 153, 153));
        btnUsuario.setText("Usuario");
        btnUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        btnUsuario.setBorderPainted(false);
        btnUsuario.addActionListener(this::btnUsuarioActionPerformed);

        btnGamas.setBackground(new java.awt.Color(0, 153, 153));
        btnGamas.setText("Gamas");
        btnGamas.setBorder(new javax.swing.border.MatteBorder(null));
        btnGamas.setBorderPainted(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANTENIMIENTOS");

        javax.swing.GroupLayout OpcionesMantenimientoLayout = new javax.swing.GroupLayout(OpcionesMantenimiento);
        OpcionesMantenimiento.setLayout(OpcionesMantenimientoLayout);
        OpcionesMantenimientoLayout.setHorizontalGroup(
            OpcionesMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesMantenimientoLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(247, 247, 247))
            .addGroup(OpcionesMantenimientoLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(250, 250, 250))
            .addGroup(OpcionesMantenimientoLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnGamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(250, 250, 250))
            .addGroup(OpcionesMantenimientoLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnVehi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(250, 250, 250))
            .addGroup(OpcionesMantenimientoLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnCten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(250, 250, 250))
            .addGroup(OpcionesMantenimientoLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(250, 250, 250))
        );
        OpcionesMantenimientoLayout.setVerticalGroup(
            OpcionesMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesMantenimientoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnGamas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnVehi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnCten, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpcionesMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OpcionesMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        MantUsuario mu = new MantUsuario(nivelUsuario);
        mu.setVisible(true);
        mu.setSize(900,515);
        mu.setLocation(0,0);
        mu.setLocationRelativeTo(null);
        
        JFrame ventana = (JFrame)SwingUtilities.getWindowAncestor(this);
        ventana.dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVehiActionPerformed


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
