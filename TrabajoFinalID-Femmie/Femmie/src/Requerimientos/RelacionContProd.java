
package Requerimientos;

import Clases.RegistrarProd1;
import Cllases.BO.PedidoBO;
import javax.swing.JOptionPane;


public class RelacionContProd extends javax.swing.JFrame {

    /**
     * Creates new form RelacionContProd
     */
    public PedidoBO pedBO = new PedidoBO();
    
    public RelacionContProd() {
        initComponents();
        listarRegistrarProd();
        this.setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNumP = new javax.swing.JLabel();
        jLabelSKU = new javax.swing.JLabel();
        jLabelCant = new javax.swing.JLabel();
        jTextFieldNumP = new javax.swing.JTextField();
        jTextFieldCant = new javax.swing.JTextField();
        jTextFieldSKU = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistrarProd = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Añadir Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelNumP.setFont(new java.awt.Font("Lucida Bright", 3, 12)); // NOI18N
        jLabelNumP.setText("N° Pedido");
        getContentPane().add(jLabelNumP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabelSKU.setFont(new java.awt.Font("Lucida Bright", 3, 12)); // NOI18N
        jLabelSKU.setText("SKU");
        getContentPane().add(jLabelSKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabelCant.setFont(new java.awt.Font("Lucida Bright", 3, 12)); // NOI18N
        jLabelCant.setText("Cantidad");
        getContentPane().add(jLabelCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        getContentPane().add(jTextFieldNumP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 148, -1));
        getContentPane().add(jTextFieldCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 148, -1));
        getContentPane().add(jTextFieldSKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 148, -1));

        jTableRegistrarProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableRegistrarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistrarProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistrarProd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 41, -1, 360));

        jLabel4.setText("Inicio   >  Pedido  >  Añadir Productos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButtonAgregar.setBackground(new java.awt.Color(255, 204, 204));
        jButtonAgregar.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        jButtonAgregar.setText("Añadir productos al pedido");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Pristina", 3, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 0, 105, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SEDA.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 400, 410));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SEDA.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldNumP.getText().isEmpty() || jTextFieldSKU.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos.");
        }
        else
        {
           RegistrarProd1 prod = new RegistrarProd1();
           
           prod.setNumPedido(jTextFieldNumP.getText());
           prod.setSKU(jTextFieldSKU.getText());
           prod.setCantidad(Integer.parseInt(jTextFieldCant.getText()));
           String mensaje = pedBO.registrarProductoCont(prod);
            
            JOptionPane.showMessageDialog(null, mensaje);
            limpiar();
            listarRegistrarProd();
        }
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTableRegistrarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistrarProdMouseClicked
        // TODO add your handling code here:
        int seleccion = jTableRegistrarProd.rowAtPoint(evt.getPoint());
        jTextFieldNumP.setText(jTableRegistrarProd.getValueAt(seleccion, 0)+"");
        jTextFieldSKU.setText(jTableRegistrarProd.getValueAt(seleccion, 1)+"");
        jTextFieldCant.setText(jTableRegistrarProd.getValueAt(seleccion, 2)+"");
    }//GEN-LAST:event_jTableRegistrarProdMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormularioPedidos salir = new FormularioPedidos();
        salir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiar() {
        jTextFieldNumP.setText("");
        jTextFieldSKU.setText("");
        jTextFieldCant.setText("");
      


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
            java.util.logging.Logger.getLogger(RelacionContProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelacionContProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelacionContProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelacionContProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelacionContProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCant;
    private javax.swing.JLabel jLabelNumP;
    private javax.swing.JLabel jLabelSKU;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistrarProd;
    private javax.swing.JTextField jTextFieldCant;
    private javax.swing.JTextField jTextFieldNumP;
    private javax.swing.JTextField jTextFieldSKU;
    // End of variables declaration//GEN-END:variables

    private void listarRegistrarProd() {
        pedBO.listarRegistrarProd(jTableRegistrarProd);
    }
}
