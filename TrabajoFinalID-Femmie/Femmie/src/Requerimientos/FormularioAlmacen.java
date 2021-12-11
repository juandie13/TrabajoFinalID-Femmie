
package Requerimientos;

import Almacen.BO.AlmacenBO;
import Clases.Almacen;
import javax.swing.JOptionPane;

public class FormularioAlmacen extends javax.swing.JFrame {

    /**
     * Creates new form CrearAlmacen
     */
    
    public AlmacenBO almBO = new AlmacenBO();
    
    
    public FormularioAlmacen() {
        initComponents();
    }
    
    public void listarAlmacen()
    {
        almBO.listarAlmacen(jTableAlmacen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jCodAlm = new javax.swing.JLabel();
        jTextCodAlm = new javax.swing.JTextField();
        jStockReal = new javax.swing.JLabel();
        jTextStockReal = new javax.swing.JTextField();
        jCodUsuario = new javax.swing.JLabel();
        jTextCodUsuario = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlmacen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jTitulo.setText("Formulario Almacen");
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 40));

        jCodAlm.setFont(new java.awt.Font("Lucida Bright", 3, 12)); // NOI18N
        jCodAlm.setText("Codigo de Almacen");
        getContentPane().add(jCodAlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, 40));
        getContentPane().add(jTextCodAlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 160, 30));

        jStockReal.setFont(new java.awt.Font("Lucida Bright", 3, 12)); // NOI18N
        jStockReal.setText("Stock Real");
        getContentPane().add(jStockReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 40));
        getContentPane().add(jTextStockReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, 30));

        jCodUsuario.setFont(new java.awt.Font("Lucida Bright", 3, 12)); // NOI18N
        jCodUsuario.setText("Codigo Usuario");
        getContentPane().add(jCodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 40));
        getContentPane().add(jTextCodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 160, 30));

        jButtonRegistrar.setBackground(new java.awt.Color(255, 204, 204));
        jButtonRegistrar.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jButtonEliminar.setBackground(new java.awt.Color(255, 204, 204));
        jButtonEliminar.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 120, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 204, 204));
        jButtonSalir.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        jButtonSalir.setText("Volver");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 120, -1));

        jButtonBorrar.setBackground(new java.awt.Color(255, 204, 204));
        jButtonBorrar.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 120, -1));

        jTableAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlmacenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlmacen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 440, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SEDA.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 430, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SEDA.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        if (jTextCodAlm.getText().isEmpty() || jTextStockReal.getText().isEmpty() || jTextCodUsuario.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos.");
        }
        else
        {
            Almacen alm = new Almacen();
            
            alm.setCodAlm(jTextCodAlm.getText());
            alm.setStockReal(Integer.parseInt(jTextStockReal.getText()));
            alm.setCodUsuario(Integer.parseInt(jTextCodUsuario.getText()));
            
            String mensaje = almBO.registrarAlmacen(alm);
            
            JOptionPane.showMessageDialog(null, mensaje);
            borrar();
            listarAlmacen();
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (jTextCodAlm.getText().isEmpty() || jTextStockReal.getText().isEmpty() || jTextCodUsuario.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos.");
        }
        else
        {            
            String mensaje = almBO.eliminarAlmacen(jTextCodAlm.getText());
            JOptionPane.showMessageDialog(null, mensaje);
            borrar();
            listarAlmacen();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        borrar();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jTableAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlmacenMouseClicked
        // TODO add your handling code here:
        int seleccion = jTableAlmacen.rowAtPoint(evt.getPoint());
        jTextCodAlm.setText(jTableAlmacen.getValueAt(seleccion, 0)+"");
        jTextStockReal.setText(jTableAlmacen.getValueAt(seleccion, 1)+"");
        jTextCodUsuario.setText(jTableAlmacen.getValueAt(seleccion, 2)+"");
    }//GEN-LAST:event_jTableAlmacenMouseClicked

    public void borrar()
    {
        jTextCodAlm.setText("");
        jTextStockReal.setText("");
        jTextCodUsuario.setText("");
    }
    
    
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
            java.util.logging.Logger.getLogger(FormularioAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jCodAlm;
    private javax.swing.JLabel jCodUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jStockReal;
    private javax.swing.JTable jTableAlmacen;
    private javax.swing.JTextField jTextCodAlm;
    private javax.swing.JTextField jTextCodUsuario;
    private javax.swing.JTextField jTextStockReal;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
