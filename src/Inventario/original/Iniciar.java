/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario.original;

import Clases.Metdos_sql;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Iniciar extends javax.swing.JFrame {

    /**
     * Creates new form Iniciar
     */
    public Iniciar() {
        initComponents();
        setLocationRelativeTo(null);
    }
     Metdos_sql metodos= new Metdos_sql();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtcor = new javax.swing.JTextField();
        txpcon = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 204, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(0, 0, 0));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(0, 204, 0));
        panel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 340, 10));

        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("CONTRASEÑA:");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 204, 0));
        panel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 330, 10));

        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("CORREO ELECTRONICO:");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtcor.setBackground(new java.awt.Color(0, 0, 0));
        txtcor.setForeground(new java.awt.Color(255, 255, 255));
        txtcor.setBorder(null);
        panel2.add(txtcor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 300, 30));

        txpcon.setBackground(new java.awt.Color(0, 0, 0));
        txpcon.setForeground(new java.awt.Color(255, 255, 255));
        txpcon.setBorder(null);
        txpcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpconActionPerformed(evt);
            }
        });
        panel2.add(txpcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 310, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/icons8_filled_message_24px_1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        panel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/icons8_lock_24px.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 30, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Iniciar Sesión");
        panel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        ingresar.setBackground(new java.awt.Color(0, 204, 0));
        ingresar.setText("INGRESAR");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        panel2.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 100, 30));

        registrarse.setBackground(new java.awt.Color(0, 153, 0));
        registrarse.setText("REGISTRARSE");
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        panel2.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 120, 30));

        jLabel9.setBackground(new java.awt.Color(0, 153, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("ABRE UNA CUENTA");
        panel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, 20));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -10, 440, 630));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 90)); // NOI18N
        jLabel1.setText("Inventario");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inventario/Section_680x360_Software_Inventario-grafico (2).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 310, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txpconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txpconActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
         setVisible(false);
        Registrarse r= new Registrarse(null,true);
          r.setVisible(true);
          
    }//GEN-LAST:event_registrarseActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
     String busqueda_usuario= metodos.buscarUsuario(txtcor.getText(), txpcon.getText());
     if(txtcor.getText().equals("idetp") && txpcon.getText().equals("idetp") ){
         JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como idetp (ADMINISTRADOR)");
            Inventarios ventana =new Inventarios();
        
         ventana.setVisible(true);
         
         
     }else if (busqueda_usuario.equals("usuario encontrado")){
         String busqueda_nombre = metodos.buscarNombre(txtcor.getText());
         JOptionPane.showMessageDialog(this, "Bienvenido(a) \n" + busqueda_nombre);
         Inventarios ventana =new Inventarios();
         
         ventana.setVisible(true);
         
         
         
         this.dispose();
     }else{
         JOptionPane.showMessageDialog(this, "Usuario no registrado, por favor registrese");
     }
    }//GEN-LAST:event_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JButton registrarse;
    private javax.swing.JPasswordField txpcon;
    private javax.swing.JTextField txtcor;
    // End of variables declaration//GEN-END:variables
}