/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario.nuevo;

import Clases.Conexion;
import Inventario.original.Inventario_salonteatro;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acampoes
 */
public class Inventarios extends javax.swing.JFrame {
    JTabbedPane tabs = new JTabbedPane();
    DefaultTableModel modeloTeatro;
    DefaultTableModel modeloQuimica;
    DefaultTableModel modeloInformatica;
    DefaultTableModel modeloDeporte;
    public String userID;
    
    
    String[] titulos = {"ID", "Nombre","Referencia","Descripción","Tipo","Cantidad"};
    /**
     * Creates new form Inventarios
     * @param userID
     */
    public Inventarios(String userID) {
        initComponents();
        this.userID = userID;
        setLocationRelativeTo(null);
        this.tabs = pnlTabs;
        this.modeloDeporte = new DefaultTableModel(null, titulos){
            @Override
            public boolean isCellEditable(int i, int i1){
                return false;
            }
        };
        this.modeloInformatica = new DefaultTableModel(null, titulos){
            @Override
            public boolean isCellEditable(int i, int i1){
                return false;
            }
        };
        this.modeloQuimica = new DefaultTableModel(null, titulos){
            @Override
            public boolean isCellEditable(int i, int i1){
                return false;
            }
        };
        this.modeloTeatro = new DefaultTableModel(null, titulos){
            @Override
            public boolean isCellEditable(int i, int i1){
                return false;
            }
        };
        tblDeporte.setModel(modeloDeporte);
        tblInformatica.setModel(modeloInformatica);
        tblQuimica.setModel(modeloQuimica);
        tblTeatro.setModel(modeloTeatro);
        
                ConsultaSalonQuimica();
                consultaSalonTeatro();
                ConsultaSalonDeporte();
                ConsultaSalonInformatica();
        
    }
   
    
    private void consultaSalonTeatro(){
        try {
            int j = modeloTeatro.getRowCount();
            if (j > 0) {
                modeloTeatro.setRowCount(0);
            }
            
            int i = 0; Object Ob[]=null;
            Conexion con = new Conexion();
            con.ConectarBD();
            String SQL = "SELECT * FROM producto_salonteatro;";
            con.resultado = con.sentencia.executeQuery(SQL);
            while (con.resultado.next()){
                modeloTeatro.addRow(Ob);
                modeloTeatro.setValueAt(con.resultado.getString("id_producto"),i,0);
                modeloTeatro.setValueAt(con.resultado.getString("nombre"), i, 1);
                modeloTeatro.setValueAt(con.resultado.getString("referencia"), i, 2);
                modeloTeatro.setValueAt(con.resultado.getString("descripcion"), i, 3);
                modeloTeatro.setValueAt(con.resultado.getString("tipo"), i, 4);
                modeloTeatro.setValueAt(con.resultado.getString("cantidad"), i, 5);
                
                i++;
            }
            con.DesconectarBD();
            
        } catch (SQLException ex){
            Logger.getLogger(Inventario_salonteatro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       private void ConsultaSalonQuimica(){
        try {
            int j = modeloQuimica.getRowCount();
            if (j > 0) {
                modeloQuimica.setRowCount(0);
            }
            
            int i = 0; Object Ob[]=null;
            Conexion con = new Conexion();
            con.ConectarBD();
            String SQL = "SELECT * FROM producto_salonquimica;";
            con.resultado = con.sentencia.executeQuery(SQL);
            while (con.resultado.next()){
                modeloQuimica.addRow(Ob);
                modeloQuimica.setValueAt(con.resultado.getString("id_producto"),i,0);
                modeloQuimica.setValueAt(con.resultado.getString("nombre"), i, 1);
                modeloQuimica.setValueAt(con.resultado.getString("referencia"), i, 2);
                modeloQuimica.setValueAt(con.resultado.getString("descripcion"), i, 3);
                modeloQuimica.setValueAt(con.resultado.getString("tipo"), i, 4);
                modeloQuimica.setValueAt(con.resultado.getString("cantidad"), i, 5);
                i++;
            }
            con.DesconectarBD();
        } catch (SQLException ex){
            Logger.getLogger(Inventario_salonteatro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       private void ConsultaSalonDeporte(){
        try {
            int j = modeloDeporte.getRowCount();
            if (j > 0) {
                modeloDeporte.setRowCount(0);
            }
            
            int i = 0; Object Ob[]=null;
            Conexion con = new Conexion();
            con.ConectarBD();
            String SQL = "SELECT * FROM producto_salondeporte;";
            con.resultado = con.sentencia.executeQuery(SQL);
            while (con.resultado.next()){
                modeloDeporte.addRow(Ob);
                modeloDeporte.setValueAt(con.resultado.getString("id_producto"),i,0);
                modeloDeporte.setValueAt(con.resultado.getString("nombre"), i, 1);
                modeloDeporte.setValueAt(con.resultado.getString("referencia"), i, 2);
                modeloDeporte.setValueAt(con.resultado.getString("descripcion"), i, 3);
                modeloDeporte.setValueAt(con.resultado.getString("tipo"), i, 4);
                modeloDeporte.setValueAt(con.resultado.getString("cantidad"), i, 5);
                i++;
            }
            con.DesconectarBD();
        } catch (SQLException ex){
            Logger.getLogger(Inventario_salonteatro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       private void ConsultaSalonInformatica(){
        try {
            int j = modeloInformatica.getRowCount();
            if (j > 0) {
                modeloInformatica.setRowCount(0);
            }
            
            int i = 0; Object Ob[]=null;
            Conexion con = new Conexion();
            con.ConectarBD();
            String SQL = "SELECT * FROM producto_saloninformatica;";
            con.resultado = con.sentencia.executeQuery(SQL);
            while (con.resultado.next()){
                modeloInformatica.addRow(Ob);
                modeloInformatica.setValueAt(con.resultado.getString("id_producto"),i,0);
                modeloInformatica.setValueAt(con.resultado.getString("nombre"), i, 1);
                modeloInformatica.setValueAt(con.resultado.getString("referencia"), i, 2);
                modeloInformatica.setValueAt(con.resultado.getString("descripcion"), i, 3);
                modeloInformatica.setValueAt(con.resultado.getString("tipo"), i, 4);
                modeloInformatica.setValueAt(con.resultado.getString("cantidad"), i, 5);
                i++;
            }
            con.DesconectarBD();
        } catch (SQLException ex){
            Logger.getLogger(Inventario_salonteatro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlTabs = new javax.swing.JTabbedPane();
        panelTeatro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeatro = new javax.swing.JTable();
        cmdIngresarTeatro = new javax.swing.JButton();
        cmdUpdateTeatro = new javax.swing.JButton();
        cmdEntradaTeatro = new javax.swing.JButton();
        cmdSalirTeatro = new javax.swing.JButton();
        panelQuimica = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQuimica = new javax.swing.JTable();
        cmdCerrarQuimica = new javax.swing.JButton();
        cmdIngresarQuimica = new javax.swing.JButton();
        cmdSalidaQuimica = new javax.swing.JButton();
        cmdEntradaQuimica = new javax.swing.JButton();
        panelInformatica = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblInformatica = new javax.swing.JTable();
        cmdCerrarInformatica = new javax.swing.JButton();
        cmdIngresarInformatica = new javax.swing.JButton();
        cmdSalidaInformatica = new javax.swing.JButton();
        cmdEntradaInformatica = new javax.swing.JButton();
        panelDeporte = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDeporte = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cmdIngresarDeporte = new javax.swing.JButton();
        cmdSalidaDeporte = new javax.swing.JButton();
        cmdEntradaDeporte = new javax.swing.JButton();

        jButton11.setText("jButton11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inventarios IDETP");

        tblTeatro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTeatro);

        cmdIngresarTeatro.setText("Registrar");
        cmdIngresarTeatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarTeatroActionPerformed(evt);
            }
        });

        cmdUpdateTeatro.setText("Salida");
        cmdUpdateTeatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateTeatroActionPerformed(evt);
            }
        });

        cmdEntradaTeatro.setText("Entrada");
        cmdEntradaTeatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntradaTeatroActionPerformed(evt);
            }
        });

        cmdSalirTeatro.setText("Cerrar");
        cmdSalirTeatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirTeatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTeatroLayout = new javax.swing.GroupLayout(panelTeatro);
        panelTeatro.setLayout(panelTeatroLayout);
        panelTeatroLayout.setHorizontalGroup(
            panelTeatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeatroLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelTeatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelTeatroLayout.createSequentialGroup()
                        .addComponent(cmdIngresarTeatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdEntradaTeatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdUpdateTeatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSalirTeatro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        panelTeatroLayout.setVerticalGroup(
            panelTeatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeatroLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTeatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdIngresarTeatro)
                    .addComponent(cmdUpdateTeatro)
                    .addComponent(cmdEntradaTeatro)
                    .addComponent(cmdSalirTeatro))
                .addContainerGap())
        );

        pnlTabs.addTab("Salón de Teatro", panelTeatro);

        tblQuimica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblQuimica);

        cmdCerrarQuimica.setText("Cerrar");
        cmdCerrarQuimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCerrarQuimicaActionPerformed(evt);
            }
        });

        cmdIngresarQuimica.setText("Registrar");
        cmdIngresarQuimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarQuimicaActionPerformed(evt);
            }
        });

        cmdSalidaQuimica.setText("Salida");
        cmdSalidaQuimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalidaQuimicaActionPerformed(evt);
            }
        });

        cmdEntradaQuimica.setText("Entrada");
        cmdEntradaQuimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntradaQuimicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelQuimicaLayout = new javax.swing.GroupLayout(panelQuimica);
        panelQuimica.setLayout(panelQuimicaLayout);
        panelQuimicaLayout.setHorizontalGroup(
            panelQuimicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuimicaLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelQuimicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelQuimicaLayout.createSequentialGroup()
                        .addComponent(cmdIngresarQuimica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdEntradaQuimica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSalidaQuimica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCerrarQuimica))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        panelQuimicaLayout.setVerticalGroup(
            panelQuimicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuimicaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelQuimicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCerrarQuimica)
                    .addComponent(cmdIngresarQuimica)
                    .addComponent(cmdSalidaQuimica)
                    .addComponent(cmdEntradaQuimica))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pnlTabs.addTab("Salón de Química", panelQuimica);

        tblInformatica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblInformatica);

        cmdCerrarInformatica.setText("Cerrar");
        cmdCerrarInformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCerrarInformaticaActionPerformed(evt);
            }
        });

        cmdIngresarInformatica.setText("Registrar");
        cmdIngresarInformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarInformaticaActionPerformed(evt);
            }
        });

        cmdSalidaInformatica.setText("Salida");
        cmdSalidaInformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalidaInformaticaActionPerformed(evt);
            }
        });

        cmdEntradaInformatica.setText("Entrada");
        cmdEntradaInformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntradaInformaticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInformaticaLayout = new javax.swing.GroupLayout(panelInformatica);
        panelInformatica.setLayout(panelInformaticaLayout);
        panelInformaticaLayout.setHorizontalGroup(
            panelInformaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformaticaLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelInformaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInformaticaLayout.createSequentialGroup()
                        .addComponent(cmdIngresarInformatica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdEntradaInformatica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSalidaInformatica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCerrarInformatica))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        panelInformaticaLayout.setVerticalGroup(
            panelInformaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformaticaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformaticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCerrarInformatica)
                    .addComponent(cmdIngresarInformatica)
                    .addComponent(cmdSalidaInformatica)
                    .addComponent(cmdEntradaInformatica))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pnlTabs.addTab("Sala de Informática", panelInformatica);

        tblDeporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblDeporte);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmdIngresarDeporte.setText("Registrar");
        cmdIngresarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarDeporteActionPerformed(evt);
            }
        });

        cmdSalidaDeporte.setText("Salida");
        cmdSalidaDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalidaDeporteActionPerformed(evt);
            }
        });

        cmdEntradaDeporte.setText("Entrada");
        cmdEntradaDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEntradaDeporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeporteLayout = new javax.swing.GroupLayout(panelDeporte);
        panelDeporte.setLayout(panelDeporteLayout);
        panelDeporteLayout.setHorizontalGroup(
            panelDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeporteLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDeporteLayout.createSequentialGroup()
                        .addComponent(cmdIngresarDeporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdEntradaDeporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSalidaDeporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        panelDeporteLayout.setVerticalGroup(
            panelDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeporteLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cmdIngresarDeporte)
                    .addComponent(cmdSalidaDeporte)
                    .addComponent(cmdEntradaDeporte))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pnlTabs.addTab("Salón de Deporte", panelDeporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTabs)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdIngresarTeatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarTeatroActionPerformed
        // TODO add your handling code here:
        Ingreso in = new Ingreso(this,true,"producto_salonteatro", this.userID);
        in.setVisible(true);
        consultaSalonTeatro();
    }//GEN-LAST:event_cmdIngresarTeatroActionPerformed

    private void cmdIngresarQuimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarQuimicaActionPerformed
        Ingreso in = new Ingreso(this, true, "producto_salonQuimica", this.userID);
        in.setVisible(true);
        ConsultaSalonQuimica();
    }//GEN-LAST:event_cmdIngresarQuimicaActionPerformed

    private void cmdIngresarInformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarInformaticaActionPerformed
        // TODO add your handling code here:
        Ingreso in = new Ingreso(this, true, "producto_saloninformatica", this.userID);
        in.setVisible(true);
        ConsultaSalonInformatica();
    }//GEN-LAST:event_cmdIngresarInformaticaActionPerformed

    private void cmdIngresarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarDeporteActionPerformed
        // TODO add your handling code here:
        Ingreso in = new Ingreso(this, true, "producto_salondeporte", this.userID);
        in.setVisible(true);
        ConsultaSalonDeporte();
    }//GEN-LAST:event_cmdIngresarDeporteActionPerformed

    private void cmdUpdateTeatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateTeatroActionPerformed
        // TODO add your handling code here:
        Salida sa = new Salida(this, true, "producto_salonteatro", this.userID);
        sa.setVisible(true);
        consultaSalonTeatro();
    }//GEN-LAST:event_cmdUpdateTeatroActionPerformed

    private void cmdEntradaDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntradaDeporteActionPerformed
        // TODO add your handling code here:
        Entrada en = new Entrada(this, true, "producto_salondeporte", this.userID);
        en.setVisible(true);
        ConsultaSalonDeporte();
    }//GEN-LAST:event_cmdEntradaDeporteActionPerformed

    private void cmdSalidaDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalidaDeporteActionPerformed
        // TODO add your handling code here:
        Salida sa = new Salida(this, true, "producto_salondeporte", this.userID);
        sa.setVisible(true);
        ConsultaSalonDeporte();
    }//GEN-LAST:event_cmdSalidaDeporteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu me = new Menu(this.userID);
        this.dispose();
        me.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmdEntradaTeatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntradaTeatroActionPerformed
        // TODO add your handling code here:
        Entrada en = new Entrada(this, true, "producto_salonteatro", this.userID);
        en.setVisible(true);
        consultaSalonTeatro();
    }//GEN-LAST:event_cmdEntradaTeatroActionPerformed

    private void cmdSalirTeatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirTeatroActionPerformed
        // TODO add your handling code here:
        Menu me = new Menu(this.userID);
        this.dispose();
        me.setVisible(true);
    }//GEN-LAST:event_cmdSalirTeatroActionPerformed

    private void cmdEntradaQuimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntradaQuimicaActionPerformed
        // TODO add your handling code here:
        Entrada en = new Entrada(this, true, "producto_salonquimica", this.userID);
        en.setVisible(true);
        ConsultaSalonQuimica();
    }//GEN-LAST:event_cmdEntradaQuimicaActionPerformed

    private void cmdSalidaInformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalidaInformaticaActionPerformed
        // TODO add your handling code here:
        Salida sa = new Salida(this, true, "producto_saloninformatica",this.userID);
        sa.setVisible(true);
        ConsultaSalonInformatica();
    }//GEN-LAST:event_cmdSalidaInformaticaActionPerformed

    private void cmdEntradaInformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEntradaInformaticaActionPerformed
        // TODO add your handling code here:
        Entrada en = new Entrada(this, true, "producto_saloninformatica",this.userID);
        en.setVisible(true);
        ConsultaSalonInformatica();
    }//GEN-LAST:event_cmdEntradaInformaticaActionPerformed

    private void cmdSalidaQuimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalidaQuimicaActionPerformed
        // TODO add your handling code here:
        Salida sa = new Salida(this, true, "producto_salonquimica", this.userID);
        sa.setVisible(true);
        ConsultaSalonQuimica();
    }//GEN-LAST:event_cmdSalidaQuimicaActionPerformed

    private void cmdCerrarQuimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCerrarQuimicaActionPerformed
        // TODO add your handling code here:
        Menu me = new Menu(this.userID);
        this.dispose();
        me.setVisible(true);
    }//GEN-LAST:event_cmdCerrarQuimicaActionPerformed

    private void cmdCerrarInformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCerrarInformaticaActionPerformed
        // TODO add your handling code here:
        Menu me = new Menu(this.userID);
        this.dispose();
        me.setVisible(true);
    }//GEN-LAST:event_cmdCerrarInformaticaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarios(new String()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCerrarInformatica;
    private javax.swing.JButton cmdCerrarQuimica;
    private javax.swing.JButton cmdEntradaDeporte;
    private javax.swing.JButton cmdEntradaInformatica;
    private javax.swing.JButton cmdEntradaQuimica;
    private javax.swing.JButton cmdEntradaTeatro;
    private javax.swing.JButton cmdIngresarDeporte;
    private javax.swing.JButton cmdIngresarInformatica;
    private javax.swing.JButton cmdIngresarQuimica;
    private javax.swing.JButton cmdIngresarTeatro;
    private javax.swing.JButton cmdSalidaDeporte;
    private javax.swing.JButton cmdSalidaInformatica;
    private javax.swing.JButton cmdSalidaQuimica;
    private javax.swing.JButton cmdSalirTeatro;
    private javax.swing.JButton cmdUpdateTeatro;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelDeporte;
    private javax.swing.JPanel panelInformatica;
    private javax.swing.JPanel panelQuimica;
    private javax.swing.JPanel panelTeatro;
    private javax.swing.JTabbedPane pnlTabs;
    private javax.swing.JTable tblDeporte;
    private javax.swing.JTable tblInformatica;
    private javax.swing.JTable tblQuimica;
    private javax.swing.JTable tblTeatro;
    // End of variables declaration//GEN-END:variables
}
