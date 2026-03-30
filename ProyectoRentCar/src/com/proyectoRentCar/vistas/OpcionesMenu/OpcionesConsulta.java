package com.proyectoRentCar.vistas.OpcionesMenu;

public class OpcionesConsulta extends javax.swing.JPanel {

    public OpcionesConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesConsulta = new javax.swing.JPanel();
        btnV = new javax.swing.JButton();
        btnCC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVG = new javax.swing.JButton();
        btnCID = new javax.swing.JButton();
        btnCRID = new javax.swing.JButton();
        btnVD = new javax.swing.JButton();
        btnVM = new javax.swing.JButton();
        btnVR = new javax.swing.JButton();
        btnVMA = new javax.swing.JButton();
        btnVP = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnRF = new javax.swing.JButton();
        btnRD = new javax.swing.JButton();
        btnRPF = new javax.swing.JButton();

        opcionesConsulta.setBackground(new java.awt.Color(0, 204, 204));
        opcionesConsulta.setPreferredSize(new java.awt.Dimension(660, 296));

        btnV.setBackground(new java.awt.Color(0, 153, 153));
        btnV.setText("Vehículos");
        btnV.setBorder(new javax.swing.border.MatteBorder(null));
        btnV.setBorderPainted(false);

        btnCC.setBackground(new java.awt.Color(0, 153, 153));
        btnCC.setText("Clientes");
        btnCC.setBorder(new javax.swing.border.MatteBorder(null));
        btnCC.setBorderPainted(false);
        btnCC.addActionListener(this::btnCCActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS");

        btnVG.setBackground(new java.awt.Color(0, 153, 153));
        btnVG.setText("Vehículos por Gamas");
        btnVG.setBorder(new javax.swing.border.MatteBorder(null));
        btnVG.setBorderPainted(false);

        btnCID.setBackground(new java.awt.Color(0, 153, 153));
        btnCID.setText("Clientes por ID");
        btnCID.setBorder(new javax.swing.border.MatteBorder(null));
        btnCID.setBorderPainted(false);
        btnCID.addActionListener(this::btnCIDActionPerformed);

        btnCRID.setBackground(new java.awt.Color(0, 153, 153));
        btnCRID.setText("Clientes por rango ID");
        btnCRID.setBorder(new javax.swing.border.MatteBorder(null));
        btnCRID.setBorderPainted(false);
        btnCRID.addActionListener(this::btnCRIDActionPerformed);

        btnVD.setBackground(new java.awt.Color(0, 153, 153));
        btnVD.setText("Vehículos Disponibles");
        btnVD.setBorder(new javax.swing.border.MatteBorder(null));
        btnVD.setBorderPainted(false);

        btnVM.setBackground(new java.awt.Color(0, 153, 153));
        btnVM.setText("Vehículos por Matrícula");
        btnVM.setBorder(new javax.swing.border.MatteBorder(null));
        btnVM.setBorderPainted(false);

        btnVR.setBackground(new java.awt.Color(0, 153, 153));
        btnVR.setText("Vehículos Rentados");
        btnVR.setBorder(new javax.swing.border.MatteBorder(null));
        btnVR.setBorderPainted(false);

        btnVMA.setBackground(new java.awt.Color(0, 153, 153));
        btnVMA.setText("Vehículos por Marca");
        btnVMA.setBorder(new javax.swing.border.MatteBorder(null));
        btnVMA.setBorderPainted(false);

        btnVP.setBackground(new java.awt.Color(0, 153, 153));
        btnVP.setText("Vehículos por Precio");
        btnVP.setBorder(new javax.swing.border.MatteBorder(null));
        btnVP.setBorderPainted(false);
        btnVP.addActionListener(this::btnVPActionPerformed);

        btnO.setBackground(new java.awt.Color(0, 153, 153));
        btnO.setText("Ofertas");
        btnO.setBorder(new javax.swing.border.MatteBorder(null));
        btnO.setBorderPainted(false);

        btnRF.setBackground(new java.awt.Color(0, 153, 153));
        btnRF.setText("Reservas por Fechas");
        btnRF.setBorder(new javax.swing.border.MatteBorder(null));
        btnRF.setBorderPainted(false);

        btnRD.setBackground(new java.awt.Color(0, 153, 153));
        btnRD.setText("Reservas por Días");
        btnRD.setBorder(new javax.swing.border.MatteBorder(null));
        btnRD.setBorderPainted(false);

        btnRPF.setBackground(new java.awt.Color(0, 153, 153));
        btnRPF.setText("Recepción por Fecha");
        btnRPF.setBorder(new javax.swing.border.MatteBorder(null));
        btnRPF.setBorderPainted(false);

        javax.swing.GroupLayout opcionesConsultaLayout = new javax.swing.GroupLayout(opcionesConsulta);
        opcionesConsulta.setLayout(opcionesConsultaLayout);
        opcionesConsultaLayout.setHorizontalGroup(
            opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesConsultaLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesConsultaLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCRID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(149, 149, 149))
        );
        opcionesConsultaLayout.setVerticalGroup(
            opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesConsultaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(opcionesConsultaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnO, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btnRF, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btnRD, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btnRPF, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGroup(opcionesConsultaLayout.createSequentialGroup()
                        .addGroup(opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(opcionesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCRID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnVR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btnVMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btnVG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btnVP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );

        btnCID.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCActionPerformed

    }//GEN-LAST:event_btnCCActionPerformed

    private void btnCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCIDActionPerformed

    private void btnCRIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCRIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCRIDActionPerformed

    private void btnVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCC;
    private javax.swing.JButton btnCID;
    private javax.swing.JButton btnCRID;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnRD;
    private javax.swing.JButton btnRF;
    private javax.swing.JButton btnRPF;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnVD;
    private javax.swing.JButton btnVG;
    private javax.swing.JButton btnVM;
    private javax.swing.JButton btnVMA;
    private javax.swing.JButton btnVP;
    private javax.swing.JButton btnVR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel opcionesConsulta;
    // End of variables declaration//GEN-END:variables
}
