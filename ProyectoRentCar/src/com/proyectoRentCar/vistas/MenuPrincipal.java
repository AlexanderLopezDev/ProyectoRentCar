package com.proyectoRentCar.vistas;
import com.proyectoRentCar.mantenimiento.MantUsuario;
import javax.swing.*;


/**
 *
 * @author Alexander López
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private int nivelUsuario;
 
    public MenuPrincipal(int nivel) {
        this.nivelUsuario = nivel;
        initComponents();
        configurarPermisos();
    }
    
    private void configurarPermisos() {
        if(nivelUsuario == 1) {
            mantGamas.setVisible(false);
            mantVehiculos.setVisible(false);
            mantOfertas.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMant = new javax.swing.JMenu();
        mantUsuario = new javax.swing.JMenuItem();
        mantGamas = new javax.swing.JMenuItem();
        mantVehiculos = new javax.swing.JMenuItem();
        mantClientes = new javax.swing.JMenuItem();
        mantOfertas = new javax.swing.JMenuItem();
        menuMov = new javax.swing.JMenu();
        movRC = new javax.swing.JMenuItem();
        movRV = new javax.swing.JMenuItem();
        menuConsult = new javax.swing.JMenu();
        consuC = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        consuV = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        consuR = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpMenuLayout = new javax.swing.GroupLayout(dpMenu);
        dpMenu.setLayout(dpMenuLayout);
        dpMenuLayout.setHorizontalGroup(
            dpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        dpMenuLayout.setVerticalGroup(
            dpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        menuMant.setText("Mantenimiento");

        mantUsuario.setText("Usuarios");
        mantUsuario.addActionListener(this::mantUsuarioActionPerformed);
        menuMant.add(mantUsuario);

        mantGamas.setText("Gamas");
        menuMant.add(mantGamas);

        mantVehiculos.setText("Vehículos");
        menuMant.add(mantVehiculos);

        mantClientes.setText("Clientes");
        menuMant.add(mantClientes);

        mantOfertas.setText("Ofertas");
        menuMant.add(mantOfertas);

        jMenuBar1.add(menuMant);

        menuMov.setText("Movimiento");

        movRC.setText("Reservas Clientes");
        menuMov.add(movRC);

        movRV.setText("Recepción Vehículos");
        menuMov.add(movRV);

        jMenuBar1.add(menuMov);

        menuConsult.setText("Consultar");

        consuC.setText("Clientes");

        jMenuItem1.setText("Todos");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        consuC.add(jMenuItem1);

        jMenuItem2.setText("ID");
        consuC.add(jMenuItem2);

        jMenuItem3.setText("Rango de ID");
        consuC.add(jMenuItem3);

        menuConsult.add(consuC);

        consuV.setText("Vehículos");

        jMenuItem4.setText("Todos");
        consuV.add(jMenuItem4);

        jMenuItem5.setText("Matrícula");
        consuV.add(jMenuItem5);

        jMenuItem6.setText("Disponible");
        consuV.add(jMenuItem6);

        jMenuItem7.setText("Rentado");
        consuV.add(jMenuItem7);

        jMenuItem8.setText("Marca");
        consuV.add(jMenuItem8);

        jMenuItem9.setText("Gama");
        consuV.add(jMenuItem9);

        jMenuItem10.setText("Precio");
        consuV.add(jMenuItem10);

        menuConsult.add(consuV);

        consuR.setText("Reservas");

        jMenuItem11.setText("Fechas");
        consuR.add(jMenuItem11);

        jMenuItem12.setText("Días");
        consuR.add(jMenuItem12);

        menuConsult.add(consuR);

        jMenuBar1.add(menuConsult);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mantUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantUsuarioActionPerformed
        new MantUsuario().setVisible(true);
    }//GEN-LAST:event_mantUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu consuC;
    private javax.swing.JMenu consuR;
    private javax.swing.JMenu consuV;
    private javax.swing.JDesktopPane dpMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mantClientes;
    private javax.swing.JMenuItem mantGamas;
    private javax.swing.JMenuItem mantOfertas;
    private javax.swing.JMenuItem mantUsuario;
    private javax.swing.JMenuItem mantVehiculos;
    private javax.swing.JMenu menuConsult;
    private javax.swing.JMenu menuMant;
    private javax.swing.JMenu menuMov;
    private javax.swing.JMenuItem movRC;
    private javax.swing.JMenuItem movRV;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getPanelPrincipal(){
        return dpMenu;
    }
}
