/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario.original;

import Clases.Conexion;
import Clases.ConexionBD;
import static Clases.ConexionBD.ConectarBD;
import static Clases.Metdos_sql.conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Agregar_productossalonteatro extends javax.swing.JDialog {

    /**
     * Creates new form Agregar_productos
     */
    public Agregar_productossalonteatro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        panel1 = new java.awt.Panel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        tipot = new javax.swing.JTextField();
        nombret = new javax.swing.JTextField();
        referenciat = new javax.swing.JTextField();
        descripciont = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 204, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(0, 204, 0));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 343, 80, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 343, 90, 30));

        tipot.setBackground(new java.awt.Color(0, 204, 0));
        tipot.setBorder(null);
        tipot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipotActionPerformed(evt);
            }
        });
        panel1.add(tipot, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 390, 20));

        nombret.setBackground(new java.awt.Color(0, 204, 0));
        nombret.setBorder(null);
        nombret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretActionPerformed(evt);
            }
        });
        panel1.add(nombret, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 350, 20));

        referenciat.setBackground(new java.awt.Color(0, 204, 0));
        referenciat.setBorder(null);
        panel1.add(referenciat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 340, 20));

        descripciont.setBackground(new java.awt.Color(0, 204, 0));
        descripciont.setBorder(null);
        descripciont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripciontActionPerformed(evt);
            }
        });
        panel1.add(descripciont, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 330, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR NUEVO PRODUCTO");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel3.setText("NOMBRE:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("REFERENCIA:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setText("DESCRIPCION:");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel7.setText("TIPO:");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 420, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 420, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 420, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        panel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 420, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        setVisible(false);
        Inventario_salonteatro q =new Inventario_salonteatro();
        q.setVisible (true);
         q.pninventario.setVisible(false);
    q.pnproductos.setVisible(true);
     q.pnentradas.setVisible(false);
      q.pnsalidas.setVisible(false);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

       Conexion Con = new Conexion();
        Con.ConectarBD();
        
        
        String nombre = nombret.getText();
        String referencia = referenciat.getText();
        String descripcion = descripciont.getText();
        String tipo=tipot.getText();
        
        
            if(!nombre.isEmpty()){
                if(!referencia.isEmpty()){
                  if(!descripcion.isEmpty()){
                      if(!tipo.isEmpty()){
                      
                      try{
                      String SQL = "INSERT INTO producto_salonteatro"
                              +"(nombre_ot,referencia_ot,descripcion_t,tipo_t)"
                              +"VALUE"
                              +"('"+nombre+"','"+referencia+"','"+descripcion+"','"+tipo+"');";
                      Con.sentencia.execute(SQL);
                      JOptionPane.showMessageDialog(null,"LOS DATOS FUERON GUARDADOS CON EXITO!");        
                      
                      
                      }   catch (SQLException ex) {
                          Logger.getLogger(Agregar_productossalonteatro.class.getName()).log(Level.SEVERE, null, ex);
                      }
                   }    else{ 
                          JOptionPane.showMessageDialog(null,"");
                      }
                  }  else{ 
                      JOptionPane.showMessageDialog(null,"");
                      }
                 }else{ 
                    JOptionPane.showMessageDialog(null,"");
                }
        }else{ 
                JOptionPane.showMessageDialog(null,"");
            }
       
        Con.DesconectarBD();
        
                               
        
       setVisible(false);
        Inventario_salonteatro q =new Inventario_salonteatro();
        q.setVisible (true);
         q.pninventario.setVisible(false);
    q.pnproductos.setVisible(true);
     q.pnentradas.setVisible(false);
      q.pnsalidas.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tipotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipotActionPerformed

    private void nombretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretActionPerformed

    private void descripciontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripciontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripciontActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_productossalonteatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_productossalonteatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_productossalonteatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_productossalonteatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_productossalonteatro dialog = new Agregar_productossalonteatro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField descripciont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombret;
    private java.awt.Panel panel1;
    private javax.swing.JTextField referenciat;
    private javax.swing.JTextField tipot;
    // End of variables declaration//GEN-END:variables
}