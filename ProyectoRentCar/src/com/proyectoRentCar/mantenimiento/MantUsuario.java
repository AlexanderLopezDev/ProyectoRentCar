package com.proyectoRentCar.mantenimiento;

import com.proyectoRentCar.vistas.MenuPrincipal;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class MantUsuario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MantUsuario.class.getName());

    static ButtonGroup btnG = new ButtonGroup();
    public MantUsuario() {
        initComponents();
        
        btnG.add(rbAdmin);
        btnG.add(rbUser);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbEstado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbAdmin = new javax.swing.JRadioButton();
        rbUser = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(480, 330));

        jPanel1.setBackground(new java.awt.Color(230, 235, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Usuario"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEstado.setEditable(false);
        lbEstado.setBackground(new java.awt.Color(230, 235, 240));
        lbEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        lbEstado.addActionListener(this::lbEstadoActionPerformed);
        jPanel1.add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 110, -1));

        txtNombre.setEditable(false);
        txtNombre.addActionListener(this::txtNombreActionPerformed);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 143, 164, -1));

        txtApellidos.setEditable(false);
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 177, 164, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 62, 164, -1));

        txtCorreo.setEditable(false);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 256, 164, -1));

        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 65, -1, -1));

        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 106, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 146, -1, -1));

        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 180, -1, -1));

        jLabel5.setText("Nivel");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 219, -1, -1));

        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 259, -1, -1));

        rbAdmin.setBackground(new java.awt.Color(230, 235, 240));
        rbAdmin.setText("Admin");
        rbAdmin.setEnabled(false);
        jPanel1.add(rbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 217, -1, -1));

        rbUser.setBackground(new java.awt.Color(230, 235, 240));
        rbUser.setText("User Normal");
        rbUser.setEnabled(false);
        jPanel1.add(rbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 217, -1, -1));

        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 290, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 290, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 290, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 62, -1, -1));

        txtPass.setEditable(false);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 103, 164, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbEstadoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtUsuario.setText("");
        txtPass.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        btnG.clearSelection();
        
        bloquearCampos();
        lbEstado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String usuario = txtUsuario.getText();

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
            return; // Detiene el proceso aquí
        }
        
        boolean encontrado = false;
        
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
                String linea;
               
                while ((linea = br.readLine()) != null) {
                    String datos[] = linea.split(",");  
                    String usua = datos[0];
                    String pass = datos[1];
                    int nivel = Integer.parseInt(datos[2]);
                    
                    if (usua.equals(usuario)) {
                        if (nivel == 0){
                            rbAdmin.setSelected(true);
                        } else if(nivel == 1) {
                            rbUser.setSelected(true);
                        }
                        txtPass.setText(datos[2]);
                        txtNombre.setText(datos[3]);
                        txtApellidos.setText(datos[4]);
                        txtCorreo.setText(datos[5]);
                        
                        lbEstado.setText("MODIFICANDO...");
                        
                        habilitarCampos();
                        encontrado = true;
                    } else if(!encontrado) {
                      
                        rbAdmin.setSelected(false);                        
                        rbUser.setSelected(false);
                        txtPass.setText("");
                        txtNombre.setText("");
                        txtApellidos.setText("");
                        txtCorreo.setText("");
                        
                        lbEstado.setText("CREANDO...");
                        
                        habilitarCampos();
                    }
                }  
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        
    }//GEN-LAST:event_txtPassKeyPressed
    public void bloquearCampos() {
        rbAdmin.setEnabled(false);
        rbUser.setEnabled(false);
        txtPass.setEditable(false);
        txtNombre.setEditable(false);
        txtApellidos.setEditable(false);
        txtCorreo.setEditable(false);
    }
    
    public void habilitarCampos() {
        rbAdmin.setEnabled(true);
        rbUser.setEnabled(true);
        txtPass.setEditable(true);
        txtNombre.setEditable(true);
        txtApellidos.setEditable(true);
        txtCorreo.setEditable(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lbEstado;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbUser;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
