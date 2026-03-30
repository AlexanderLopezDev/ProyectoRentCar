package com.proyectoRentCar.vistas.OpcionesMenu;

public class OpcionesMovimiento extends javax.swing.JPanel {

    public OpcionesMovimiento() {
        initComponents();
        
        btnRC.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        btnRV.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionesMovimiento = new javax.swing.JPanel();
        btnRV = new javax.swing.JButton();
        btnRC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        OpcionesMovimiento.setBackground(new java.awt.Color(0, 204, 204));
        OpcionesMovimiento.setPreferredSize(new java.awt.Dimension(660, 296));

        btnRV.setBackground(new java.awt.Color(0, 153, 153));
        btnRV.setText("Recepción Vehículos");
        btnRV.setBorder(new javax.swing.border.MatteBorder(null));
        btnRV.setBorderPainted(false);

        btnRC.setBackground(new java.awt.Color(0, 153, 153));
        btnRC.setText("Reservas Clientes");
        btnRC.setBorder(new javax.swing.border.MatteBorder(null));
        btnRC.setBorderPainted(false);
        btnRC.addActionListener(this::btnRCActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOVIMIENTOS");

        javax.swing.GroupLayout OpcionesMovimientoLayout = new javax.swing.GroupLayout(OpcionesMovimiento);
        OpcionesMovimiento.setLayout(OpcionesMovimientoLayout);
        OpcionesMovimientoLayout.setHorizontalGroup(
            OpcionesMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesMovimientoLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(254, 254, 254))
            .addGroup(OpcionesMovimientoLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(OpcionesMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(250, 250, 250))
        );
        OpcionesMovimientoLayout.setVerticalGroup(
            OpcionesMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesMovimientoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(btnRC, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnRV, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(OpcionesMovimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(OpcionesMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCActionPerformed
       
    }//GEN-LAST:event_btnRCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OpcionesMovimiento;
    private javax.swing.JButton btnRC;
    private javax.swing.JButton btnRV;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
