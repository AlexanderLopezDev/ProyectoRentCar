package com.proyectoRentCar.vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();      
        txtUsuario.setForeground(Color.BLACK);
        txtPassword.setForeground(Color.BLACK);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(900, 515));

        add(panel);

        pack();
        setLocationRelativeTo(null);


        txtUsuario.setOpaque(false);
        txtUsuario.setBackground(new java.awt.Color(0,0,0,0));
        txtUsuario.setBorder(null);
        txtUsuario.setForeground(java.awt.Color.BLACK);
        txtUsuario.setCaretColor(java.awt.Color.WHITE);

        txtPassword.setOpaque(false);
        txtPassword.setBackground(new java.awt.Color(0,0,0,0));
        txtPassword.setBorder(null);
        txtPassword.setForeground(java.awt.Color.BLACK);
        txtPassword.setCaretColor(java.awt.Color.WHITE);
        btnLogin.setContentAreaFilled(false);  // Quita fondo
        btnLogin.setBorderPainted(false);      // Quita borde
        btnLogin.setFocusPainted(false);       // Quita efecto al hacer click
        btnLogin.setForeground(java.awt.Color.WHITE); // Texto blanco

        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setForeground(java.awt.Color.WHITE);
        
      } 

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 515));

        loginPanel.setPreferredSize(new java.awt.Dimension(900, 515));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.addActionListener(this::btnSalirActionPerformed);
        loginPanel.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 240, 70));

        btnLogin.addActionListener(this::btnLoginActionPerformed);
        loginPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 230, 70));

        txtUsuario.addActionListener(this::txtUsuarioActionPerformed);
        loginPanel.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 320, 30));
        loginPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 280, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyectoRentCar/imagenes/imagen6.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 830));

        jTextField1.setText("jTextField1");
        loginPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String usuario = txtUsuario.getText();
        String password = String.valueOf(txtPassword.getPassword());

        boolean encontrado = false;
        int nivel = -1;
        if (usuario.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
            return; // Detiene el proceso aquí
        }

        try {
            try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
                String linea;
               
                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    String datos[] = linea.split(";");  
                    
                    if (datos.length < 6) continue;
                    
                    String login = datos[0];
                    String pass = datos[1];
                    nivel = Integer.parseInt(datos[2]);
                   
                    if (usuario.equals(login) && password.equals(pass)) {
                        encontrado = true;
                        if (nivel == 0) {
                            new MenuPrincipal(0).setVisible(true);
                        } else {
                            new MenuPrincipal(1).setVisible(true);
                        }

                        this.dispose();                       
                        break;
                    }                                       
                }
                
                if (!encontrado){
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
                }
            }

            

        } catch (HeadlessException | IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
   
    }//GEN-LAST:event_txtUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
