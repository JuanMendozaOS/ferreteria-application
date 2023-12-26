
package py.edu.uaa.FerreteriaApplication.view;

import java.awt.Color;
import py.edu.uaa.FerreteriaApplication.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import py.edu.uaa.FerreteriaApplication.model.Agrupacion;

/**
 *
 * @author franc
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        this.setUndecorated(true);
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        clientePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        productoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        proveedorPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        medidaPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        facturaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientePanel.setBackground(new java.awt.Color(255, 255, 255));
        clientePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                clientePanelMouseMoved(evt);
            }
        });
        clientePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientePanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientePanelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel6.setText("CLIENTE");

        javax.swing.GroupLayout clientePanelLayout = new javax.swing.GroupLayout(clientePanel);
        clientePanel.setLayout(clientePanelLayout);
        clientePanelLayout.setHorizontalGroup(
            clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientePanelLayout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(154, 154, 154))
        );
        clientePanelLayout.setVerticalGroup(
            clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(clientePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, 60));

        productoPanel.setBackground(new java.awt.Color(255, 255, 255));
        productoPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                productoPanelMouseMoved(evt);
            }
        });
        productoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productoPanelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel3.setText("AGRUPACIONES");

        javax.swing.GroupLayout productoPanelLayout = new javax.swing.GroupLayout(productoPanel);
        productoPanel.setLayout(productoPanelLayout);
        productoPanelLayout.setHorizontalGroup(
            productoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productoPanelLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(111, 111, 111))
        );
        productoPanelLayout.setVerticalGroup(
            productoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productoPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(productoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 400, 60));

        proveedorPanel.setBackground(new java.awt.Color(255, 255, 255));
        proveedorPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                proveedorPanelMouseMoved(evt);
            }
        });
        proveedorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proveedorPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proveedorPanelMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel4.setText("PROVEEDOR");

        javax.swing.GroupLayout proveedorPanelLayout = new javax.swing.GroupLayout(proveedorPanel);
        proveedorPanel.setLayout(proveedorPanelLayout);
        proveedorPanelLayout.setHorizontalGroup(
            proveedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proveedorPanelLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(130, 130, 130))
        );
        proveedorPanelLayout.setVerticalGroup(
            proveedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proveedorPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(proveedorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 400, 60));

        medidaPanel.setBackground(new java.awt.Color(255, 255, 255));
        medidaPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                medidaPanelMouseMoved(evt);
            }
        });
        medidaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medidaPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medidaPanelMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel5.setText("UNIDAD DE MEDIDA");

        javax.swing.GroupLayout medidaPanelLayout = new javax.swing.GroupLayout(medidaPanel);
        medidaPanel.setLayout(medidaPanelLayout);
        medidaPanelLayout.setHorizontalGroup(
            medidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medidaPanelLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(91, 91, 91))
        );
        medidaPanelLayout.setVerticalGroup(
            medidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medidaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(medidaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 400, 60));

        facturaPanel.setBackground(new java.awt.Color(255, 255, 255));
        facturaPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                facturaPanelMouseMoved(evt);
            }
        });
        facturaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturaPanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturaPanelMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel2.setText("FACTURACION");

        javax.swing.GroupLayout facturaPanelLayout = new javax.swing.GroupLayout(facturaPanel);
        facturaPanel.setLayout(facturaPanelLayout);
        facturaPanelLayout.setHorizontalGroup(
            facturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturaPanelLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(121, 121, 121))
        );
        facturaPanelLayout.setVerticalGroup(
            facturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(facturaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 400, 60));

        jPanel7.setBackground(new java.awt.Color(67, 118, 244));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(14, 14, 14))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientePanelMouseClicked
        ClienteForm cliente = new ClienteForm();
        cliente.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_clientePanelMouseClicked

    private void clientePanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientePanelMouseMoved
        clientePanel.setBackground(new Color(0,102,145));
    }//GEN-LAST:event_clientePanelMouseMoved

    private void clientePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientePanelMouseExited
        clientePanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_clientePanelMouseExited

    private void productoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoPanelMouseClicked
        AgrupacionesForm agrupacion = new AgrupacionesForm();
        agrupacion.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_productoPanelMouseClicked

    private void productoPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoPanelMouseMoved
        productoPanel.setBackground(new Color(0,102,145));
    }//GEN-LAST:event_productoPanelMouseMoved

    private void productoPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoPanelMouseExited
        productoPanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_productoPanelMouseExited

    private void proveedorPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedorPanelMouseClicked
        ProveedorForm proveedor = new ProveedorForm();
        proveedor.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_proveedorPanelMouseClicked

    private void proveedorPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedorPanelMouseMoved
        proveedorPanel.setBackground(new Color(0,102,145));
    }//GEN-LAST:event_proveedorPanelMouseMoved

    private void proveedorPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedorPanelMouseExited
        proveedorPanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_proveedorPanelMouseExited

    private void medidaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medidaPanelMouseClicked
        UnidadMedidaForm unidadMedida = new UnidadMedidaForm();
        unidadMedida.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_medidaPanelMouseClicked

    private void medidaPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medidaPanelMouseMoved
        medidaPanel.setBackground(new Color(0,102,145));
    }//GEN-LAST:event_medidaPanelMouseMoved

    private void medidaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medidaPanelMouseExited
        medidaPanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_medidaPanelMouseExited

    private void facturaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaPanelMouseClicked
        FacturaForm factura = new FacturaForm();
        factura.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_facturaPanelMouseClicked

    private void facturaPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaPanelMouseMoved
        facturaPanel.setBackground(new Color(0,102,145));
    }//GEN-LAST:event_facturaPanelMouseMoved

    private void facturaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaPanelMouseExited
        facturaPanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_facturaPanelMouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setExtendedState(1);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clientePanel;
    private javax.swing.JPanel facturaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel medidaPanel;
    private javax.swing.JPanel productoPanel;
    private javax.swing.JPanel proveedorPanel;
    // End of variables declaration//GEN-END:variables
}