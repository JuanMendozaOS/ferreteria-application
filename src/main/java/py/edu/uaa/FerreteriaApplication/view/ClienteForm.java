/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.uaa.FerreteriaApplication.view;

import py.edu.uaa.FerreteriaApplication.*;
import py.edu.uaa.FerreteriaApplication.controller.ClienteController;
import py.edu.uaa.FerreteriaApplication.model.Cliente;
import py.edu.uaa.FerreteriaApplication.model.TipoCliente;
import py.edu.uaa.FerreteriaApplication.model.TipoDocumento;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import py.edu.uaa.FerreteriaApplication.model.Agrupacion;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.math.BigDecimal;

/**
 *
 * @author franc
 */
public class ClienteForm extends javax.swing.JFrame {


    public ClienteForm() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        razonSocialTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nroDocuTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nroCelularTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tipoDocuTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipoCliTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        actualizarBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        idCliTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(67, 118, 244));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(506, 506, 506)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10))
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setText("Razon Social");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 28, -1, -1));
        jPanel2.add(razonSocialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 25, 82, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setText("Numero de documento");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 80, -1, -1));
        jPanel2.add(nroDocuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 77, 82, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setText("Direccion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 137, -1, -1));
        jPanel2.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 134, 82, -1));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setText("Numero de Celular");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 28, -1, -1));
        jPanel2.add(nroCelularTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 25, 140, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel6.setText("Tipo de documento");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 80, -1, -1));

        tipoDocuTxt.setForeground(new java.awt.Color(153, 153, 153));
        tipoDocuTxt.setText("CI, Pasaporte, RUC");
        tipoDocuTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tipoDocuTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tipoDocuTxtFocusLost(evt);
            }
        });
        jPanel2.add(tipoDocuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 77, 140, -1));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de Cliente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 137, -1, -1));

        tipoCliTxt.setForeground(new java.awt.Color(153, 153, 153));
        tipoCliTxt.setText("Individual, Empresa");
        tipoCliTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tipoCliTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tipoCliTxtFocusLost(evt);
            }
        });
        jPanel2.add(tipoCliTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 134, 140, -1));

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 185, -1, -1));
        jPanel2.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 185, 82, -1));

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 254, -1, -1));

        actualizarBtn.setText("Actualizar");
        actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(actualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 254, -1, -1));

        borrarBtn.setText("Borrar");
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 254, -1, -1));

        jLabel9.setText("ID Cliente");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 188, -1, -1));
        jPanel2.add(idCliTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 185, 140, -1));

        fetchData();
        jScrollPane1.setViewportView(clienteTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fetchData(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Cliente[]> response = restTemplate.getForEntity("http://localhost:8080/api/clientes",
                Cliente[].class);

        Cliente[] dataList = response.getBody();

        // Get the table model
        DefaultTableModel model = (DefaultTableModel) clienteTable.getModel();
        if(model.getColumnCount() == 0) {
            model.addColumn("ID");
            model.addColumn("Razon Social");
            model.addColumn("Nro de documento");
            model.addColumn("Direccion");
            model.addColumn("Telefono");
            model.addColumn("Nro Celular");
            model.addColumn("Tipo documento");
            model.addColumn("Tipo cliente");
        }

        // Clear existing data in the table
        model.setRowCount(0);

        // Populate the table with the fetched data
        for (Cliente cliente : dataList) {
            Object[] rowData = {cliente.getId(), cliente.getRazonSocial(), cliente.getNumeroDocumento(),
                    cliente.getDireccion(), cliente.getTelefono(), cliente.getNumeroCelular(),
                    cliente.getTipoDocumento().getId(), cliente.getTipoCliente().getId()};
            model.addRow(rowData);
        }
    }
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        String razonSocial = razonSocialTxt.getText();
        String nroDocumento = nroDocuTxt.getText();
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setId(tipoDocuTxt.getText());
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setId(tipoCliTxt.getText());
        String direccion = direccionTxt.getText();
        String telefono = telefonoTxt.getText();
        String nroCelular = nroCelularTxt.getText();
        
        
        Cliente nuevoCliente = new Cliente(razonSocial, nroDocumento, direccion,telefono,nroCelular, tipoDocumento, tipoCliente);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Cliente> response = restTemplate.exchange("http://localhost:8080/api/clientes",
                HttpMethod.POST, new HttpEntity<>(nuevoCliente), Cliente.class);


        JOptionPane.showMessageDialog(this, "Creado con ID: " + response.getBody().getId());

        fetchData();
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void actualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtnActionPerformed
        if(idCliTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el id del cliente para actualizar");
            return;
        }
        Long id = Long.valueOf(idCliTxt.getText());
        String razonSocial = razonSocialTxt.getText();
        String nroDocumento = nroDocuTxt.getText();
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setId(tipoDocuTxt.getText());
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setId(tipoCliTxt.getText());
        String direccion = direccionTxt.getText();
        String telefono = telefonoTxt.getText();
        String nroCelular = nroCelularTxt.getText();

        Cliente nuevoCliente = new Cliente(id ,razonSocial, nroDocumento, direccion,telefono,nroCelular, tipoDocumento, tipoCliente);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put("http://localhost:8080/api/clientes", nuevoCliente);


        JOptionPane.showMessageDialog(this, "Cliente actualizado correctamente");
        fetchData();
    }//GEN-LAST:event_actualizarBtnActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        if(idCliTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el id del cliente para eliminar");
            return;
        }
        Long id = Long.valueOf(idCliTxt.getText());
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete("http://localhost:8080/api/clientes/" + id);
        JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente");
        fetchData();
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void tipoDocuTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipoDocuTxtFocusGained
        if (tipoDocuTxt.getText().equals("CI, Pasaporte, RUC")){
            tipoDocuTxt.setText("");
            tipoDocuTxt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tipoDocuTxtFocusGained

    private void tipoDocuTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipoDocuTxtFocusLost
        if(tipoDocuTxt.getText().equals("")){
            tipoDocuTxt.setText("CI, Pasaporte, RUC");
            tipoDocuTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_tipoDocuTxtFocusLost

    private void tipoCliTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipoCliTxtFocusGained
        if (tipoCliTxt.getText().equals("Individual, Empresa")){
            tipoCliTxt.setText("");
            tipoCliTxt.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_tipoCliTxtFocusGained

    private void tipoCliTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipoCliTxtFocusLost
         if(tipoCliTxt.getText().equals("")){
            tipoCliTxt.setText("Individual, Empresa");
            tipoCliTxt.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_tipoCliTxtFocusLost

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setExtendedState(1);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBtn;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JTable clienteTable;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JTextField idCliTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nroCelularTxt;
    private javax.swing.JTextField nroDocuTxt;
    private javax.swing.JTextField razonSocialTxt;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JTextField tipoCliTxt;
    private javax.swing.JTextField tipoDocuTxt;
    // End of variables declaration//GEN-END:variables
}
