package com.proyectoRentCar.vistas;
import com.proyectoRentCar.vistas.OpcionesMenu.OpcionesConsulta;
import com.proyectoRentCar.vistas.OpcionesMenu.OpcionesMantenimiento;
import com.proyectoRentCar.vistas.OpcionesMenu.OpcionesMovimiento;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.*;


public class MenuPrincipal extends javax.swing.JFrame {
    private int nivelUsuario;
 
    public MenuPrincipal(int nivel) {  
        this.nivelUsuario = nivel;       
        initComponents();       
        propiedadesMenu();
       
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(900, 515));

        add(panel);

        pack();
        setLocationRelativeTo(null);
           
    }

    private void propiedadesMenu() {
        lbTitulo.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        tituloMenu.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        btnMant.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        btnMov.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        btnCon.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        btnCerrar.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPrincipal = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        tituloMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnMant = new javax.swing.JButton();
        btnMov = new javax.swing.JButton();
        btnCon = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 515));

        dpPrincipal.setBackground(new java.awt.Color(0, 204, 204));

        menu.setBackground(new java.awt.Color(0, 153, 153));

        tituloMenu.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        tituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloMenu.setText("Menu");

        btnMant.setBackground(new java.awt.Color(0, 204, 204));
        btnMant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMant.setForeground(new java.awt.Color(255, 255, 255));
        btnMant.setText("Mantenimiento");
        btnMant.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnMant.setBorderPainted(false);
        btnMant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMant.setPreferredSize(new java.awt.Dimension(16, 16));
        btnMant.addActionListener(this::btnMantActionPerformed);

        btnMov.setBackground(new java.awt.Color(0, 204, 204));
        btnMov.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMov.setForeground(new java.awt.Color(255, 255, 255));
        btnMov.setText("Movimiento");
        btnMov.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnMov.setBorderPainted(false);
        btnMov.addActionListener(this::btnMovActionPerformed);

        btnCon.setBackground(new java.awt.Color(0, 204, 204));
        btnCon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCon.setForeground(new java.awt.Color(255, 255, 255));
        btnCon.setText("Consultar");
        btnCon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCon.setBorderPainted(false);
        btnCon.addActionListener(this::btnConActionPerformed);

        btnCerrar.setBackground(new java.awt.Color(0, 204, 204));
        btnCerrar.setText("Cerrar Sección");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(tituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jSeparator1)
                .addGap(36, 36, 36))
            .addComponent(btnMant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnMant, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnMov, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnCon, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(0, 204, 204));

        lbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("RENT CAR");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        panelContenido.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dpPrincipalLayout = new javax.swing.GroupLayout(dpPrincipal);
        dpPrincipal.setLayout(dpPrincipalLayout);
        dpPrincipalLayout.setHorizontalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPrincipalLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        dpPrincipalLayout.setVerticalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dpPrincipalLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantActionPerformed
        OpcionesMantenimiento om = new OpcionesMantenimiento(nivelUsuario);
        om.setSize(660,296);
        om.setLocation(0,0);
        
        panelContenido.removeAll();
        panelContenido.add(om, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnMantActionPerformed

    private void btnMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovActionPerformed
        OpcionesMovimiento om1 = new OpcionesMovimiento();
        om1.setSize(660,296);
        om1.setLocation(0,0);
        
        panelContenido.removeAll();
        panelContenido.add(om1, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnMovActionPerformed

    private void btnConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConActionPerformed
        OpcionesConsulta oc = new OpcionesConsulta();
        oc.setSize(660,296);
        oc.setLocation(0,0);
        
        panelContenido.removeAll();
        panelContenido.add(oc, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btnConActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCon;
    private javax.swing.JButton btnMant;
    private javax.swing.JButton btnMov;
    private javax.swing.JPanel dpPrincipal;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables

    public JPanel getPanelPrincipal(){
        return dpPrincipal;
    }
}
