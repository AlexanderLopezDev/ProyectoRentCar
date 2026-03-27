package com.proyectoRentCar.vistas;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();

        txtUsuario.setOpaque(false);
        txtUsuario.setBackground(new java.awt.Color(0,0,0,0));
        txtUsuario.setBorder(null);
        txtUsuario.setForeground(java.awt.Color.WHITE);
        txtUsuario.setCaretColor(java.awt.Color.WHITE);

        txtPassword.setOpaque(false);
        txtPassword.setBackground(new java.awt.Color(0,0,0,0));
        txtPassword.setBorder(null);
        txtPassword.setForeground(java.awt.Color.WHITE);
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

        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.addActionListener(this::txtUsuarioActionPerformed);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 190, 20));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 190, -1));

        btnLogin.addActionListener(this::btnLoginActionPerformed);
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 40));

        btnSalir.addActionListener(this::btnSalirActionPerformed);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyectoRentCar/imagenes/imagenloginn.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 10, 670, 450));

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
                    String datos[] = linea.split(",");  
                    String login = datos[0];
                    String pass = datos[1];
                    nivel = Integer.parseInt(datos[2]);
                   
                    if (usuario.equals(login) && password.equals(pass)) {
                        encontrado = true;
                        break;
                    }
                }  
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Bienvenido");
                if (nivel == 0) {
                    new MenuPrincipal(0).setVisible(true);
                } else {
                    new MenuPrincipal(1).setVisible(true);
                }

                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
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
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
