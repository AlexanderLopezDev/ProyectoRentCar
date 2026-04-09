package com.proyectoRentCar.mantenimiento;

import com.proyectoRentCar.archivos.ManejoDeArchivo;
import com.proyectoRentCar.vistas.MenuPrincipal;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.*;

public class MantVehiculos extends javax.swing.JFrame {
    
    static ButtonGroup gT = new ButtonGroup();
    static ButtonGroup gA = new ButtonGroup();
    static ButtonGroup gI = new ButtonGroup();
    static ButtonGroup gC = new ButtonGroup();
    static ButtonGroup gS = new ButtonGroup();

    int nivelUsuario;
    boolean lbEstadoB = false;
    String lineaOriginal = "";
    
    public MantVehiculos(int nivel) {
        initComponents();
        this.nivelUsuario = nivel;
        
        gT.add(rbT1);
        gT.add(rbT2);
        
        gA.add(rbA1);
        gA.add(rbA2);
        
        gI.add(rbI1);
        gI.add(rbI2);
        
        gC.add(rbC1);
        gC.add(rbC2);
        
        gS.add(rbS1);
        gS.add(rbS2);
    }
    
    public void limpiarDatos() {
        txtMatricula.setText("");
        cbMarca.setSelectedIndex(0);
        txtModelo.setText("");
        cbTV.setSelectedIndex(0);
        cbTM.setSelectedIndex(0);
        txtIDGama.setText("");
        txtDescVeh.setText("");
        txtCV.setText("");
        gT.clearSelection();
        gA.clearSelection();
        gI.clearSelection();
        gC.clearSelection();
        gS.clearSelection();
        lbEstado.setText("");
        
        txtDesGama.setText("");
        txtPreGama.setText("");
        
        resetearEstado();
    }
    
    public void habilitarCampos() {
        txtMatricula.setEditable(false);
        cbMarca.setEnabled(true);
        txtModelo.setEditable(true);
        cbTV.setEnabled(true);
        cbTM.setEnabled(true);
        txtDescVeh.setEditable(true);
        txtCV.setEditable(true);
        btnGuardar.setEnabled(true);
        lbEstado.setEnabled(true);
        
        rbT1.setEnabled(true);
        rbT2.setEnabled(true);
        
        rbA1.setEnabled(true);
        rbA2.setEnabled(true);
        
        rbI1.setEnabled(true);
        rbI2.setEnabled(true);
        
        rbC1.setEnabled(true);
        rbC2.setEnabled(true);
        
        rbS1.setEnabled(true);
        rbS2.setEnabled(true);
    }
    
    public void bloquearCampos() {
        txtMatricula.setEditable(true);
        cbMarca.setEnabled(false);
        txtModelo.setEditable(false);
        cbTV.setEnabled(false);
        cbTM.setEnabled(false);
        txtDescVeh.setEditable(false);
        txtCV.setEditable(false);
        btnGuardar.setEnabled(false);
        lbEstado.setEnabled(false);
        
        rbT1.setEnabled(false);
        rbT2.setEnabled(false);
        
        rbA1.setEnabled(false);
        rbA2.setEnabled(false);
        
        rbI1.setEnabled(false);
        rbI2.setEnabled(false);
        
        rbC1.setEnabled(false);
        rbC2.setEnabled(false);
        
        rbS1.setEnabled(false);
        rbS2.setEnabled(false);
    }
    
    public void resetearEstado() {
        lbEstadoB = false;
        lineaOriginal = "";
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mantVehiculoPanel = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        lbEstado = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtIDGama = new javax.swing.JTextField();
        txtDescVeh = new javax.swing.JTextField();
        txtCV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rbT1 = new javax.swing.JRadioButton();
        rbT2 = new javax.swing.JRadioButton();
        rbA1 = new javax.swing.JRadioButton();
        rbA2 = new javax.swing.JRadioButton();
        rbI1 = new javax.swing.JRadioButton();
        rbI2 = new javax.swing.JRadioButton();
        rbC1 = new javax.swing.JRadioButton();
        rbC2 = new javax.swing.JRadioButton();
        rbS1 = new javax.swing.JRadioButton();
        rbS2 = new javax.swing.JRadioButton();
        cbMarca = new javax.swing.JComboBox<>();
        txtModelo = new javax.swing.JTextField();
        cbTV = new javax.swing.JComboBox<>();
        cbTM = new javax.swing.JComboBox<>();
        txtPreGama = new javax.swing.JTextField();
        txtDesGama = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mantVehiculoPanel.setBackground(new java.awt.Color(0, 153, 153));
        mantVehiculoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento Vehículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Baskerville Old Face", 0, 18))); // NOI18N
        mantVehiculoPanel.setPreferredSize(new java.awt.Dimension(900, 515));

        btnBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        lbEstado.setEditable(false);
        lbEstado.setBackground(new java.awt.Color(255, 255, 255));
        lbEstado.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        lbEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        lbEstado.setEnabled(false);

        txtMatricula.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Status Vehículo");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Matricula");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Marca");

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnVolver.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        txtIDGama.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtDescVeh.setEditable(false);
        txtDescVeh.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtCV.setEditable(false);
        txtCV.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Modelo");

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tipo Vehículo");

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tipo Motor");

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ID Gama");

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Descripción Vehiculo");

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Techo Eléctrico");

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Aire Acondicionado");

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Interior Cuero");

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Color Vehículo");

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Cambio Auto");

        rbT1.setBackground(new java.awt.Color(0, 153, 153));
        rbT1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbT1.setText("Si");
        rbT1.setEnabled(false);

        rbT2.setBackground(new java.awt.Color(0, 153, 153));
        rbT2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbT2.setText("No");
        rbT2.setEnabled(false);

        rbA1.setBackground(new java.awt.Color(0, 153, 153));
        rbA1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbA1.setText("Si");
        rbA1.setEnabled(false);

        rbA2.setBackground(new java.awt.Color(0, 153, 153));
        rbA2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbA2.setText("No");
        rbA2.setEnabled(false);

        rbI1.setBackground(new java.awt.Color(0, 153, 153));
        rbI1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbI1.setText("Si");
        rbI1.setEnabled(false);

        rbI2.setBackground(new java.awt.Color(0, 153, 153));
        rbI2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbI2.setText("No");
        rbI2.setEnabled(false);

        rbC1.setBackground(new java.awt.Color(0, 153, 153));
        rbC1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbC1.setText("Automático");
        rbC1.setEnabled(false);

        rbC2.setBackground(new java.awt.Color(0, 153, 153));
        rbC2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbC2.setText("Manual");
        rbC2.setEnabled(false);

        rbS1.setBackground(new java.awt.Color(0, 153, 153));
        rbS1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbS1.setText("Disponible");
        rbS1.setEnabled(false);

        rbS2.setBackground(new java.awt.Color(0, 153, 153));
        rbS2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rbS2.setText("Rentado");
        rbS2.setEnabled(false);

        cbMarca.setEditable(true);
        cbMarca.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Marca", "Toyota", "Honda", "Nissan", "Hyundai", "Kia", "Chevrolet", "Jeep", "Ford" }));
        cbMarca.setToolTipText("");
        cbMarca.setEnabled(false);
        cbMarca.setPreferredSize(new java.awt.Dimension(208, 21));

        txtModelo.setEditable(false);
        txtModelo.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        cbTV.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        cbTV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Tipo de Vehículo", "Turístico", "Normal" }));
        cbTV.setEnabled(false);
        cbTV.setPreferredSize(new java.awt.Dimension(208, 21));

        cbTM.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        cbTM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Tipo de Motor", "Diésel", "Gasolina" }));
        cbTM.setEnabled(false);
        cbTM.setPreferredSize(new java.awt.Dimension(208, 21));

        txtPreGama.setEditable(false);
        txtPreGama.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtDesGama.setEditable(false);
        txtDesGama.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Descripción Gama");

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Precio Gama");

        javax.swing.GroupLayout mantVehiculoPanelLayout = new javax.swing.GroupLayout(mantVehiculoPanel);
        mantVehiculoPanel.setLayout(mantVehiculoPanelLayout);
        mantVehiculoPanelLayout.setHorizontalGroup(
            mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(rbT1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(rbT2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(rbA1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(rbA2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtDescVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(rbI1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(rbI2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel17)
                                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel18)))
                                        .addGap(0, 6, Short.MAX_VALUE)
                                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPreGama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIDGama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDesGama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtCV, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(rbC1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(rbC2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(rbS1)
                                        .addGap(20, 20, 20)
                                        .addComponent(rbS2)))))
                        .addGap(67, 67, 67))
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(cbTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(cbTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mantVehiculoPanelLayout.setVerticalGroup(
            mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnBuscar))))
                .addGap(6, 6, 6)
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addComponent(cbTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9))
                            .addComponent(cbTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(txtDescVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12))
                            .addComponent(rbT1)
                            .addComponent(rbT2))
                        .addGap(8, 8, 8)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(rbA1)
                            .addComponent(rbA2))
                        .addGap(9, 9, 9)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(rbI1)
                            .addComponent(rbI2)))
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtIDGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(9, 9, 9)
                        .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(10, 10, 10)
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(txtCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(rbC1)
                    .addComponent(rbC2))
                .addGap(9, 9, 9)
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantVehiculoPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addComponent(rbS1)
                    .addComponent(rbS2))
                .addGap(26, 26, 26)
                .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addGroup(mantVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVolver)
                        .addComponent(btnLimpiar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantVehiculoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mantVehiculoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        File archivoA = new File("vehiculos.txt");
        
        String matricula = txtMatricula.getText();
        String marca = String.valueOf(cbMarca.getSelectedItem().toString());
        String modelo = txtModelo.getText();
        String tipVeh = String.valueOf(cbTV.getSelectedItem().toString());
        String tipMot = String.valueOf(cbTM.getSelectedItem().toString());
        String gama = txtIDGama.getText();
        String desVeh = txtDescVeh.getText();
        String tE = "";
        String aA = "";
        String iC = "";
        String cV = txtCV.getText();
        String cA = "";
        String sV = "";
        
        if (rbT1.isSelected()) {
            tE = "true";
        } else if (rbT2.isSelected()) {
            tE = "false";
        }
            
        if (rbA1.isSelected()) {
            aA = "true";
        } else if (rbA2.isSelected()) {
            aA = "false";
        }
            
        if (rbI1.isSelected()) {
            iC = "true";
        } else if (rbI2.isSelected()) {
            iC = "false";
        }
            
        if (rbC1.isSelected()) {
            cA = "true";
        } else if (rbC2.isSelected()) {
            cA = "false";
        }
            
        if (rbS1.isSelected()) {
            sV = "true";
        } else if (rbS2.isSelected()) {
            sV = "false";
        }
        
        if (matricula.isEmpty() || marca.isEmpty() || modelo.isEmpty() || tipVeh.isEmpty() || tipMot.isEmpty() || gama.isEmpty() ||
            desVeh.isEmpty() || tE.isEmpty() || aA.isEmpty() || iC.isEmpty() || cV.isEmpty() || cA.isEmpty() || sV.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser rellenado");
            return;
        }
        
        String datos = matricula + ";" + marca + ";" + modelo + ";" + tipVeh + ";" + tipMot + ";" +
                        desVeh + ";" + tE + ";" + aA + ";" + iC + ";" + cV + ";" + cA + ";" + sV;
        
        if (lbEstadoB) {
            ManejoDeArchivo maV = new ManejoDeArchivo();
            maV.ModificarDatos(lineaOriginal, datos, archivoA);
            
            lineaOriginal = datos;
            JOptionPane.showMessageDialog(this, "Datos modificados correctamente");
        } else {
            ManejoDeArchivo maV = new ManejoDeArchivo();
            maV.GuardarDatos(datos, archivoA);
            
            JOptionPane.showMessageDialog(this, "Datos registrado correctamente");
        }
        
        limpiarDatos();
        bloquearCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String matricula = txtMatricula.getText();
        String idGama = txtIDGama.getText();
        
        if (matricula.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Matricula");
            return;
        } else if (idGama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese ID Gama");
            return;
        }
        
        ManejoDeArchivo maV = new ManejoDeArchivo();
        String datos[] = maV.BuscarDatos(matricula, new File("vehiculos.txt"));
        String datosGama[] = maV.BuscarDatos(idGama, new File("gamas.txt"));
        
        if (datosGama == null) {
            txtDesGama.setText("");
            txtPreGama.setText("");
            JOptionPane.showMessageDialog(this, "ID Gama no existe");
            return;
        }
        txtDesGama.setText(datosGama[1]);
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double precio = Double.parseDouble(datosGama[2]);
        txtPreGama.setText(df.format(precio));
        
        if (datos != null) {
            habilitarCampos();
            
            cbMarca.setSelectedItem(datos[1].trim());
            txtModelo.setText(datos[2]);
            cbTV.setSelectedItem(datos[3].trim());
            cbTM.setSelectedItem(datos[4].trim());

            txtDescVeh.setText(datos[5]);
            txtCV.setText(datos[9]);
            
            if (datos[6].equals("true")) {
                rbT1.setSelected(true);
            } else {
                rbT2.setSelected(true);
            }
            
            if (datos[7].equals("true")) {
                rbA1.setSelected(true);
            } else {
                rbA2.setSelected(true);
            }
            
            if (datos[8].equals("true")) {
                rbI1.setSelected(true);
            } else {
                rbI2.setSelected(true);
            }
            
            if (datos[10].equals("true")) {
                rbC1.setSelected(true);
            } else {
                rbC2.setSelected(true);
            }
            
             if (datos[11].equals("true")) {
                rbS1.setSelected(true);
            } else {
                rbS2.setSelected(true);
            }
            
            lineaOriginal = String.join(";", datos);
            lbEstado.setText("MODIFICANDO");
            lbEstadoB = true;
        } else {
            habilitarCampos();
            limpiarDatos();
            
            txtMatricula.setText(matricula);
            txtIDGama.setText(idGama);
            txtDesGama.setText(datosGama[1]);
            txtPreGama.setText(datosGama[2]);
            
            lbEstado.setText("CREANDO");
            resetearEstado();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbTM;
    private javax.swing.JComboBox<String> cbTV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lbEstado;
    private javax.swing.JPanel mantVehiculoPanel;
    private javax.swing.JRadioButton rbA1;
    private javax.swing.JRadioButton rbA2;
    private javax.swing.JRadioButton rbC1;
    private javax.swing.JRadioButton rbC2;
    private javax.swing.JRadioButton rbI1;
    private javax.swing.JRadioButton rbI2;
    private javax.swing.JRadioButton rbS1;
    private javax.swing.JRadioButton rbS2;
    private javax.swing.JRadioButton rbT1;
    private javax.swing.JRadioButton rbT2;
    private javax.swing.JTextField txtCV;
    private javax.swing.JTextField txtDesGama;
    private javax.swing.JTextField txtDescVeh;
    private javax.swing.JTextField txtIDGama;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPreGama;
    // End of variables declaration//GEN-END:variables
}
