package com.proyectoRentCar.mantenimiento;

import com.proyectoRentCar.archivos.ManejoDeArchivo;
import com.proyectoRentCar.vistas.MenuPrincipal;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MantOferta extends javax.swing.JFrame {
    
    int nivelUsuario;
    boolean lbEstadoB = false;
    String lineaOriginal = "";
    double precioGama = 0;
   
    public MantOferta(int nivel) {
        initComponents();
        this.nivelUsuario = nivel;
        
        txtIdOferta.addActionListener(e -> btnBuscar.doClick());
        txtMatricula.addActionListener(e -> btnBuscar.doClick());
    }
    
    public void limpiarDatos() {
    txtIdOferta.setText("");
    txtMatricula.setText("");
    txtDescripcionOferta.setText("");
    txtPrecioOferta.setText("");

    lbEstado.setText("");
    precioGama = 0;

    lbEstadoB = false;
    lineaOriginal = "";
    }
    
    public void bloquearCampos() {
        txtIdOferta.setEditable(true);
        txtMatricula.setEditable(true);
                
        lbEstado.setEnabled(false);
 
        btnGuardar.setEnabled(false);
    }
    
    public void habilitarCampos() {
        txtIdOferta.setEditable(false);
        txtMatricula.setEditable(false);
        
        lbEstado.setEnabled(true);
 
        btnGuardar.setEnabled(true);
    }
    
    public void resetearEstado() {
        lbEstadoB = false;
        lineaOriginal = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdOferta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionOferta = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioOferta = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lbEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento Oferta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setText("ID Oferta");

        txtIdOferta.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel2.setText("Matricula");

        txtMatricula.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setText("DescripcionOferta");

        txtDescripcionOferta.setEditable(false);
        txtDescripcionOferta.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel4.setText("PrecioOferta");

        txtPrecioOferta.setEditable(false);
        txtPrecioOferta.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        btnLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnVolver.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        lbEstado.setEditable(false);
        lbEstado.setBackground(new java.awt.Color(255, 255, 255));
        lbEstado.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        lbEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        lbEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(16, 16, 16)
                                .addComponent(txtDescripcionOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4)
                                .addGap(17, 17, 17)
                                .addComponent(txtPrecioOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(189, 189, 189))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        File archivo = new File("ofertas.txt");

        String id = txtIdOferta.getText();
        String mat = txtMatricula.getText();
        String desc = txtDescripcionOferta.getText();
        String precioTxt = txtPrecioOferta.getText().replace(",", "");

        // VALIDAR CAMPOS
        if (id.isEmpty() || mat.isEmpty() || desc.isEmpty() || precioTxt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
            return;
        }

        double precioOferta = Double.parseDouble(precioTxt);

        // VALIDAR QUE EXISTA PRECIO GAMA
        if (precioGama <= 0) {
            JOptionPane.showMessageDialog(this, "Debe buscar una matrícula válida primero");
            return;
        }
        
        double minimo = precioGama * 0.15;

        // VALIDAR 15%
        if (precioOferta < minimo) {
            JOptionPane.showMessageDialog(this, "El precio oferta no puede ser menor al 15% del precio gama");
            return;
        }

        String datos = id + ";" + mat + ";" + precioOferta;

         ManejoDeArchivo ma = new ManejoDeArchivo();

        if (lbEstadoB) {
            ma.ModificarDatos(lineaOriginal, datos, archivo);
            JOptionPane.showMessageDialog(this, "Oferta modificada");
        } else {
            ma.GuardarDatos(datos, archivo);
            JOptionPane.showMessageDialog(this, "Oferta guardada");
        }

        limpiarDatos();
        bloquearCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
        bloquearCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    String id = txtIdOferta.getText();
    String matricula = txtMatricula.getText();

    if (id.isEmpty() || matricula.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese ID y Matrícula");
        return;
    }

    ManejoDeArchivo maO = new ManejoDeArchivo();
    String datos[] = maO.BuscarDatos(id, new File("ofertas.txt"));
    

    if (datos != null) {
        // Cargar datos de la oferta
        txtDescripcionOferta.setText(datos[1]);
        
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double precioO = Double.parseDouble(datos[2]);
        precioO = (precioO * 0.85);
        
        txtPrecioOferta.setText(df.format(precioO));

        String datosVeh[] = maO.BuscarDatos(datos[1], new File("vehiculos.txt"));
        
        if (datosVeh == null) {
            JOptionPane.showMessageDialog(this, "Matricula no existe");
            return;
        } else {
            habilitarCampos();
            String idGama = datosVeh[12];

            String datosGama[] = maO.BuscarDatos(idGama, new File("gamas.txt"));

            if (datosGama != null) {
                precioGama = Double.parseDouble(datosGama[2]);
                double precio = (precioGama);
                
                txtDescripcionOferta.setText(datosVeh[5] + "," + datosVeh[1] + "," + datosVeh[2] + "," +  df.format(precio));
                
            }
        }

        // Preparar para modificar

        lineaOriginal = String.join(";", datos);
        lbEstado.setText("MODIFICANDO");
        lbEstadoB = true;
        
        } else {
            habilitarCampos();
            // Preparar para crear una nueva oferta

            String datosVeh[] = maO.BuscarDatos(matricula, new File("vehiculos.txt"));
            if (datosVeh == null) {
                JOptionPane.showMessageDialog(this, "Matricula no existe");
                return;
            } else {
                habilitarCampos();
                String idGama = datosVeh[12];

                String datosGama[] = maO.BuscarDatos(idGama, new File("gamas.txt"));

                if (datosGama != null) {
                    DecimalFormat df = new DecimalFormat("#,##0.00");
                    precioGama = Double.parseDouble(datosGama[2]);
                    double precio = precioGama;
                
                    txtDescripcionOferta.setText(datosVeh[5] + "," + datosVeh[1] + "," + datosVeh[2] + "," +  df.format(precio));
                }
            }
            txtPrecioOferta.setText("");

            
            lbEstado.setText("CREANDO");
            txtIdOferta.setText(id);
            txtMatricula.setText(matricula);
            resetearEstado();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new MenuPrincipal(nivelUsuario).setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_btnVolverActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lbEstado;
    private javax.swing.JTextField txtDescripcionOferta;
    private javax.swing.JTextField txtIdOferta;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtPrecioOferta;
    // End of variables declaration//GEN-END:variables
}
