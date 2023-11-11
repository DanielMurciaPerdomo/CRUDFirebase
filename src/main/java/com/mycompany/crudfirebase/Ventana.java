/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crudfirebase;

import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Murcia
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        Conexion.conectar();
        initComponents();
        this.setLocationRelativeTo(null);
        Controlador.llenarTabla(tblVeterinaria);
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
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeterinaria = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbCedula = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        tbMascota = new javax.swing.JTextField();
        tbRaza = new javax.swing.JTextField();
        tbPeso = new javax.swing.JTextField();
        tbTamaño = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAlergias = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblVeterinaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVeterinaria);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Cedula del cliente: *");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Nombre completo del cliente: *");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Nombre de la mascota: *");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Raza de la mascota: *");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Peso de la mascota (Kg): *");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Tamaño de la mascota (m): *");

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setText("Alergias:");

        tbCedula.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCedulaActionPerformed(evt);
            }
        });

        tbNombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tbMascota.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tbRaza.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tbPeso.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        tbTamaño.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        taAlergias.setColumns(20);
        taAlergias.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        taAlergias.setRows(5);
        jScrollPane2.setViewportView(taAlergias);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Veterinaria");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbCedula)
                            .addComponent(tbNombre)
                            .addComponent(tbMascota)
                            .addComponent(tbRaza)
                            .addComponent(tbPeso)
                            .addComponent(tbTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(tbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tbTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tbCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCedulaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taAlergias;
    private javax.swing.JTextField tbCedula;
    private javax.swing.JTextField tbMascota;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbPeso;
    private javax.swing.JTextField tbRaza;
    private javax.swing.JTextField tbTamaño;
    private javax.swing.JTable tblVeterinaria;
    // End of variables declaration//GEN-END:variables

    private void guardar() {
        if (tbCedula.getText().equals("") || tbNombre.getText().equals("")
                || tbMascota.getText().equals("") || tbRaza.getText().equals("")
                || tbPeso.getText().equals("") || tbTamaño.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error, faltan campos por llenar");
        } else {
            int id = (int) (Math.random() * 1000000);
            double cedula = Double.parseDouble(tbCedula.getText());
            double peso = Double.parseDouble(tbPeso.getText());
            double tamaño = Double.parseDouble(tbTamaño.getText());

            try {
                Map<String, Object> datos = new HashMap<>();
                datos.put("Cedula", cedula);
                datos.put("Nombre", tbNombre.getText());
                datos.put("Nombre mascota", tbMascota.getText());
                datos.put("Raza mascota", tbRaza.getText());
                datos.put("Peso mascota", peso);
                datos.put("Tamaño mascota", tamaño);
                datos.put("Alergias", taAlergias.getText());
                Controlador.guardar("Veterinaria", String.valueOf(id), datos);
                JOptionPane.showMessageDialog(null, "Guardado con exito");
                clearForm();
            } catch (HeadlessException e) {
                System.err.println("Error: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al guardar");
            } finally {
                Controlador.llenarTabla(tblVeterinaria);
            }
        }
    }
    
    private void actualizar() {   
        if (tbCedula.getText().equals("") && tbMascota.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor especifique cedula y nombre de la mascota");
        } else if (tbNombre.getText().equals("") || tbRaza.getText().equals("")
                || tbPeso.getText().equals("") || tbTamaño.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor revise que todos los valores menos de Alergia esten obligatoriamente ocupados");
        } else {

            double cedula = Double.parseDouble(tbCedula.getText());
            double peso = Double.parseDouble(tbPeso.getText());
            double tamaño = Double.parseDouble(tbTamaño.getText());

            int respuesta = Controlador.buscarId(cedula, tbMascota.getText());

            if (respuesta == -1) {
                JOptionPane.showMessageDialog(null, "No se encontro este registro, deberia darle en guardar o revisar los datos correctos");
                return;
            }
            try {
                Map<String, Object> datos = new HashMap<>();
                datos.put("Cedula", cedula);
                datos.put("Nombre", tbNombre.getText());
                datos.put("Nombre mascota", tbMascota.getText());
                datos.put("Raza mascota", tbRaza.getText());
                datos.put("Peso mascota", peso);
                datos.put("Tamaño mascota", tamaño);
                datos.put("Alergias", taAlergias.getText());
                Controlador.actualizar("Veterinaria", String.valueOf(respuesta), datos);
                JOptionPane.showMessageDialog(null, "Actualizado con exito");
                clearForm();
            } catch (HeadlessException e) {
                System.err.println("Error: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            } finally {
                Controlador.llenarTabla(tblVeterinaria);
            }
        }
    }
    
    private void eliminar() {
        if (tbCedula.getText().equals("") || tbMascota.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor especifique cedula y nombre de la mascota, para eliminar el registro");
        } else {
            double cedula = Double.parseDouble(tbCedula.getText());
            
            int respuesta = Controlador.buscarId(cedula, tbMascota.getText());

            if (respuesta == -1) {
                JOptionPane.showMessageDialog(null, "No se encontro este registro, deberia darle en guardar o revisar los datos correctos");
                return;
            }
            try {
                int i = JOptionPane.showConfirmDialog(null, "Seguro desea borrar todos los datos del registro",
                        "Confirmacion", JOptionPane.OK_CANCEL_OPTION);
                if (i == 2) {
                    JOptionPane.showMessageDialog(null, "Cancelado");
                } else {
                    Controlador.eliminar("Veterinaria", String.valueOf(respuesta));
                    JOptionPane.showMessageDialog(null, "Eliminado con exito");
                    clearForm();
                }
            } catch (HeadlessException e) {
                System.err.println("Error: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            } finally {
                Controlador.llenarTabla(tblVeterinaria);
            }
        }
    }
    
     private void buscar() {
         
         int i = JOptionPane.showConfirmDialog(null, "Desea buscar todos los registros?",
                 "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
         if (i == 1) {
             if (tbCedula.getText().equals("") || tbMascota.getText().equals("")) {
                 JOptionPane.showMessageDialog(null, "Por favor especifique cedula y nombre de la mascota, para buscar el registro");
             } else {
                 double cedula = Double.parseDouble(tbCedula.getText());

                 int respuesta = Controlador.buscarId(cedula, tbMascota.getText());

                 if (respuesta == -1) {
                     JOptionPane.showMessageDialog(null, "No se encontro este registro, deberia darle en guardar o revisar los datos correctos");
                 } else {
                     Controlador.tablaBuscada(tblVeterinaria, respuesta);
                     clearForm();
                 }
             }       
        }else{
             Controlador.llenarTabla(tblVeterinaria);
             clearForm();
         }
     }
    
    void clearForm(){
        tbCedula.setText("");
        tbNombre.setText("");
        tbMascota.setText("");
        tbRaza.setText("");
        tbPeso.setText("");
        tbTamaño.setText("");
        taAlergias.setText("");        
    }    
}
