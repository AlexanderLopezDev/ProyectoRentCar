
package com.proyectoRentCar.mantenimiento;

import com.proyectoRentCar.archivos.ManejoDeArchivo;
import java.io.File;
import javax.swing.JOptionPane;

public class MantOferta extends javax.swing.JFrame {
    
      boolean lbEstadoB = false;
      String lineaOriginal = "";
      double precioGama = 0;
   
    public MantOferta() {
        initComponents();
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
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioOferta = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lbEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Oferta");

        txtIdOferta.addActionListener(this::txtIdOfertaActionPerformed);

        jLabel2.setText("Matricula");

        txtMatricula.addActionListener(this::txtMatriculaActionPerformed);

        jLabel3.setText("DescripcionOferta");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        jButton2.setText("Buscar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel4.setText("PrecioOferta");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdOferta, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(txtPrecioOferta)
                    .addComponent(txtDescripcionOferta)
                    .addComponent(txtMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnGuardar)
                        .addGap(59, 59, 59)
                        .addComponent(btnLimpiar)
                        .addGap(71, 71, 71)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnVolver))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     File archivo = new File("ofertas.txt");

    String id = txtIdOferta.getText();
    String mat = txtMatricula.getText();
    String desc = txtDescripcionOferta.getText();
    String precioTxt = txtPrecioOferta.getText();

    // VALIDAR CAMPOS
    if (id.isEmpty() || mat.isEmpty() || desc.isEmpty() || precioTxt.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
        return;
    }

    double precioOferta = Double.parseDouble(precioTxt);

    double minimo = precioGama * 0.15;

    // VALIDAR 15%
    if (precioOferta < minimo) {
        JOptionPane.showMessageDialog(this, "El precio oferta no puede ser menor al 15% del precio gama");
        return;
    }

    String datos = id + ";" + mat + ";" + desc + ";" + precioOferta;

    ManejoDeArchivo ma = new ManejoDeArchivo();

    if (lbEstadoB) {
        ma.ModificarDatos(lineaOriginal, datos, archivo);
        JOptionPane.showMessageDialog(this, "Oferta modificada");
    } else {
        ma.GuardarDatos(datos, archivo);
        JOptionPane.showMessageDialog(this, "Oferta guardada");
    }

    limpiarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdOfertaActionPerformed
    String id = txtIdOferta.getText();

    if (id.isEmpty()) return;

    ManejoDeArchivo ma = new ManejoDeArchivo();
    String datos[] = ma.BuscarDatos(id, new File("ofertas.txt"));

    if (datos != null) {
        txtMatricula.setText(datos[1]);
        txtDescripcionOferta.setText(datos[2]);
        txtPrecioOferta.setText(datos[3]);

        lbEstado.setText("MODIFICANDO");
        lbEstadoB = true;
        lineaOriginal = String.join(";", datos);

    } else {
        lbEstado.setText("CREANDO");
        lbEstadoB = false;
    }
    }//GEN-LAST:event_txtIdOfertaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
                                             
    String mat = txtMatricula.getText().trim();

    if (mat.isEmpty()) return;

    ManejoDeArchivo ma = new ManejoDeArchivo();
    String[] datosVeh = ma.BuscarDatos(mat, new File("vehiculos.txt"));

    if (datosVeh != null) {
        String marca = datosVeh[1];
        String modelo = datosVeh[2];
        String idGama = datosVeh[12]; // Nueva posición del ID de la gama

        // Generar descripción automática
        txtDescripcionOferta.setText("Oferta para " + marca + " " + modelo);

        // Buscar datos de la gama
        String[] datosGama = ma.BuscarDatos(idGama, new File("gamas.txt"));

        if (datosGama != null) {
            precioGama = Double.parseDouble(datosGama[2]);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la gama del vehículo.");
        }

    } else {
        JOptionPane.showMessageDialog(this, "La matrícula no existe.");
        txtMatricula.setText("");
    }
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String id = txtIdOferta.getText();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese el ID de la oferta");
        return;
    }

    ManejoDeArchivo ma = new ManejoDeArchivo();
    File archivoOfertas = new File("ofertas.txt");

    // Buscar la oferta
    String datos[] = ma.BuscarDatos(id, archivoOfertas);

    if (datos != null) {
        // Cargar datos de la oferta
        txtMatricula.setText(datos[1]);
        txtDescripcionOferta.setText(datos[2]);
        txtPrecioOferta.setText(datos[3]);

        // Buscar el vehículo
        String matricula = datos[1];
        String datosVeh[] = ma.BuscarDatos(matricula, new File("vehiculos.txt"));

        if (datosVeh != null) {
            // Obtener el ID de la gama (posición según tu archivo)
            String idGama = datosVeh[5]; // Ajustar si cambia la posición

            String datosGama[] = ma.BuscarDatos(idGama, new File("gamas.txt"));

            if (datosGama != null) {
                precioGama = Double.parseDouble(datosGama[2]);
            }
        }

        // Preparar para modificar
        lbEstado.setText("MODIFICANDO");
        lbEstadoB = true;
        lineaOriginal = String.join(";", datos);

    } else {
        // Preparar para crear una nueva oferta
        JOptionPane.showMessageDialog(this, "La oferta no existe. Puede crearla.");

        txtMatricula.setText("");
        txtDescripcionOferta.setText("");
        txtPrecioOferta.setText("");

        lbEstado.setText("CREANDO");
        lbEstadoB = false;
        lineaOriginal = "";
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
    }//GEN-LAST:event_btnVolverActionPerformed
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
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
