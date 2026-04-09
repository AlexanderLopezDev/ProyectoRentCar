package com.proyectoRentCar.mantenimiento;

import com.proyectoRentCar.archivos.ManejoDeArchivo;
import com.proyectoRentCar.vistas.MenuPrincipal;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.*;

public class MantGamas extends javax.swing.JFrame {
    
    int nivelUsuario;
    boolean lbEstadoB = false;
    String lineaOriginal = "";
    
    public MantGamas(int nivel) {
        initComponents();
        this.nivelUsuario = nivel;
        btnGuardar.setEnabled(false);
    }
    
        public void bloquearCampos() {
        txtIDGama.setEditable(true);
        txtDesGama.setEditable(false);
        txtPreGama.setEditable(false);
        btnGuardar.setEnabled(false);
        lbEstado.setEnabled(false);
    }
    
    public void habilitarCampos() {
        txtIDGama.setEditable(false);
        txtDesGama.setEditable(true);
        txtPreGama.setEditable(true);
        btnGuardar.setEnabled(true);
        lbEstado.setEnabled(true);
    }
    
    public void limpiarDatos() {
        txtIDGama.setText("");
        txtDesGama.setText("");
        lbEstado.setText("");
        txtPreGama.setText("");
        
        resetearEstado();
    }
    
    public void resetearEstado(){
        lbEstadoB = false;
        lineaOriginal = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mantGamasPanel = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        lbEstado = new javax.swing.JTextField();
        txtDesGama = new javax.swing.JTextField();
        txtPreGama = new javax.swing.JTextField();
        txtIDGama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mantGamasPanel.setBackground(new java.awt.Color(0, 153, 153));
        mantGamasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento Gama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 18))); // NOI18N
        mantGamasPanel.setPreferredSize(new java.awt.Dimension(900, 515));

        btnBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        lbEstado.setEditable(false);
        lbEstado.setBackground(new java.awt.Color(255, 255, 255));
        lbEstado.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        lbEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        lbEstado.setEnabled(false);

        txtDesGama.setEditable(false);
        txtDesGama.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtPreGama.setEditable(false);
        txtPreGama.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtIDGama.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Precio Gama");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Gama");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripción Gama");

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnVolver.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        javax.swing.GroupLayout mantGamasPanelLayout = new javax.swing.GroupLayout(mantGamasPanel);
        mantGamasPanel.setLayout(mantGamasPanelLayout);
        mantGamasPanelLayout.setHorizontalGroup(
            mantGamasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mantGamasPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantGamasPanelLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIDGama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantGamasPanelLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtDesGama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantGamasPanelLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPreGama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantGamasPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mantGamasPanelLayout.setVerticalGroup(
            mantGamasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mantGamasPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(mantGamasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantGamasPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtIDGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(38, 38, 38)
                .addGroup(mantGamasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantGamasPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtDesGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(mantGamasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantGamasPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtPreGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(mantGamasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantGamasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantGamasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        File archivoA = new File("gamas.txt");
        
        String id = txtIDGama.getText();
        String descGama = txtDesGama.getText();
        String precioGama = txtPreGama.getText().replace(",", "");
        
        if (id.isEmpty() || descGama.isEmpty() || precioGama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser rellenado");
            return;
        }
        
        String datos = id + ";" + descGama + ";" + precioGama;
        
        if (lbEstadoB) {
            ManejoDeArchivo maG = new ManejoDeArchivo();
            maG.ModificarDatos(lineaOriginal, datos, archivoA);
            
            lineaOriginal = datos;
            JOptionPane.showMessageDialog(this, "Datos modificados correctamente");
        } else {
            ManejoDeArchivo maG = new ManejoDeArchivo();
            maG.GuardarDatos(datos, archivoA);
            
            JOptionPane.showMessageDialog(this, "Datos registrado correctamente");
        }
        
        limpiarDatos();
        bloquearCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
        bloquearCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed
   
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new MenuPrincipal(nivelUsuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String idGama = txtIDGama.getText();
        
        if (idGama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese ID Gama");
            return;
        }
          
        ManejoDeArchivo maG = new ManejoDeArchivo();
        String datos[] = maG.BuscarDatos(idGama, new File("gamas.txt"));
        
        if (datos != null) { 
            habilitarCampos();
            txtDesGama.setText(datos[1]);
            
            DecimalFormat df = new DecimalFormat("#,##0.00");
            double precio = Double.parseDouble(datos[2]);
            txtPreGama.setText(df.format(precio));
            
            lineaOriginal = String.join(";", datos);
            
            lbEstado.setText("MODIFICANDO");
            lbEstadoB = true;
        } else {
            habilitarCampos();
            
            limpiarDatos();
            txtIDGama.setText(idGama);
            lbEstado.setText("CREANDO");
            resetearEstado();
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lbEstado;
    private javax.swing.JPanel mantGamasPanel;
    private javax.swing.JTextField txtDesGama;
    private javax.swing.JTextField txtIDGama;
    private javax.swing.JTextField txtPreGama;
    // End of variables declaration//GEN-END:variables
}
