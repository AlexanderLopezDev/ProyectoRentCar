package com.proyectoRentCar.mantenimiento;

import com.proyectoRentCar.archivos.ManejoDeArchivo;
import com.proyectoRentCar.vistas.MenuPrincipal;
import java.io.File;
import javax.swing.*;

public class MantUsuario extends javax.swing.JFrame {
   
    static ButtonGroup btnG = new ButtonGroup();
    boolean lbEstadoB = false;
    String lineaOriginal = "";
    private int nivelUsuario;
    
    public MantUsuario(int nivel) {
        initComponents();
        this.nivelUsuario = nivel;
        
        btnG.add(rbAdmin);
        btnG.add(rbUser);   
        
        txtUsuario.addActionListener(e -> btnBuscar.doClick());
    }
    
    public void bloquearCampos() {
         txtUsuario.setEditable(true);
        rbAdmin.setEnabled(false);
        rbUser.setEnabled(false);
        lbEstado.setEnabled(false);
        txtPass.setEditable(false);
        txtNombre.setEditable(false);
        txtApellidos.setEditable(false);
        txtCorreo.setEditable(false);   
        btnGuardar.setEnabled(false);
    }
    
    public void habilitarCampos() {
        txtUsuario.setEditable(false);
        rbAdmin.setEnabled(true);
        rbUser.setEnabled(true);
        lbEstado.setEnabled(true);
        txtPass.setEditable(true);
        txtNombre.setEditable(true);
        txtApellidos.setEditable(true);
        txtCorreo.setEditable(true);    
        btnGuardar.setEnabled(true);
    }
    
    public void limpiarDatos() {
        txtUsuario.setText("");
        txtPass.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        btnG.clearSelection();
        lbEstado.setText("");
        
        resetearEstado();
    }
    
    public void resetearEstado() {
        lbEstadoB = false;
        lineaOriginal = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mantUsuarioPanel = new javax.swing.JPanel();
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

        mantUsuarioPanel.setBackground(new java.awt.Color(0, 153, 153));
        mantUsuarioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 18))); // NOI18N
        mantUsuarioPanel.setPreferredSize(new java.awt.Dimension(900, 296));

        lbEstado.setEditable(false);
        lbEstado.setBackground(new java.awt.Color(255, 255, 255));
        lbEstado.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        lbEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        lbEstado.setEnabled(false);

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtCorreo.setEditable(false);
        txtCorreo.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nivel");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Correo");

        rbAdmin.setBackground(new java.awt.Color(0, 153, 153));
        rbAdmin.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbAdmin.setText("Admin");
        rbAdmin.setEnabled(false);

        rbUser.setBackground(new java.awt.Color(0, 153, 153));
        rbUser.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbUser.setText("User Normal");
        rbUser.setEnabled(false);

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnVolver.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        txtPass.setEditable(false);
        txtPass.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        txtPass.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout mantUsuarioPanelLayout = new javax.swing.GroupLayout(mantUsuarioPanel);
        mantUsuarioPanel.setLayout(mantUsuarioPanelLayout);
        mantUsuarioPanelLayout.setHorizontalGroup(
            mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(rbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(rbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mantUsuarioPanelLayout.setVerticalGroup(
            mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(15, 15, 15)
                .addGroup(mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(rbAdmin)
                    .addComponent(rbUser))
                .addGap(10, 10, 10)
                .addGroup(mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantUsuarioPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(mantUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mantUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mantUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
        bloquearCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new MenuPrincipal(nivelUsuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String usuario = txtUsuario.getText();
       
        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Usuario");
            return; // Detiene el proceso aquí
        }
        
        ManejoDeArchivo maU = new ManejoDeArchivo();
        String[] datos = maU.BuscarDatos(usuario, new File("usuarios.txt"));
             
        if (datos != null) {
            habilitarCampos();
            txtUsuario.setEditable(false);

            txtPass.setText(datos[1]);
            txtNombre.setText(datos[3]);
            txtApellidos.setText(datos[4]);
            txtCorreo.setText(datos[5]);
                        
            if (datos[2].equals("0")){
                rbAdmin.setSelected(true);
            } else {
                rbUser.setSelected(true);
            } 
                        
                lineaOriginal = String.join(";", datos);
                lbEstado.setText("MODIFICANDO");
                lbEstadoB = true;
        } else {
            habilitarCampos();
                      
            limpiarDatos();
            txtUsuario.setText(usuario);
            lbEstado.setText("CREANDO");
            resetearEstado();
        }
     
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        File archivoA = new File("usuarios.txt");
        
        String usuario = txtUsuario.getText();
        String pass = String.valueOf(txtPass.getPassword());
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtCorreo.getText();
        ButtonModel seleccionado = btnG.getSelection();
        int nivel = -1;
        
        if (rbAdmin.isSelected()) {
            nivel = 0;
        } else if (rbUser.isSelected()) {
            nivel = 1;
        }       
        nivelUsuario = nivel;
        if (usuario.isEmpty() || pass.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || seleccionado == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser rellenado");
            return;
        }
        
        String datos = usuario + ";" + pass + ";" + nivel + ";" + nombre + ";" + apellidos + ";" + correo;
        
        if (lbEstadoB) {
            ManejoDeArchivo maU = new ManejoDeArchivo();
            maU.ModificarDatos(lineaOriginal, datos, archivoA);
            
            lineaOriginal = datos;
            JOptionPane.showMessageDialog(this, "Datos modificados correctamente");
        } else {
            ManejoDeArchivo maU = new ManejoDeArchivo();
            maU.GuardarDatos(datos, archivoA);
            
            JOptionPane.showMessageDialog(this, "Datos registrado correctamente");
        }
        
        limpiarDatos();
        bloquearCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed
  
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
    private javax.swing.JTextField lbEstado;
    private javax.swing.JPanel mantUsuarioPanel;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbUser;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
