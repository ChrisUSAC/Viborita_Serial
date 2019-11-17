/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;
import logica.Usuario;

/**
 *
 * @author cris
 */
public class TablaAceptados extends javax.swing.JFrame {

    /**
     * Creates new form TablaAceptados
     */
    public TablaAceptados() {
        
        initComponents();
        jbEliminar.setVisible(false);
        if (frameAdmin.visible) {
            
            jbEliminar.setVisible(true);
        }
        this.setLocationRelativeTo(null); // centra el frame en la pantalla
        this.setResizable(false);
        mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAceptados = new javax.swing.JTable();
        jbRegresar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(797, 499));
        setMinimumSize(new java.awt.Dimension(797, 499));
        setPreferredSize(new java.awt.Dimension(797, 499));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setText("Tabla Usuario del Sistema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 10, 400, 60);

        jtAceptados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(jtAceptados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 86, 470, 300);

        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbRegresar);
        jbRegresar.setBounds(600, 240, 120, 40);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar);
        jbEliminar.setBounds(600, 170, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoAdmin.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        this.dispose();//destruir ventana anterior
        new frameAdmin().setVisible(true); // abrir ventana de admin
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        int filaSelect = jtAceptados.getSelectedRow();
        
        if (filaSelect == -1) {
            
           JOptionPane.showMessageDialog(this, "Seleccione Usuario Primero", "AVISO", 1);
            
        }
        else{
            System.out.println("filaSelect "+filaSelect);
            //se elimina de la lista de aceptados
            JOptionPane.showMessageDialog(this, "Usuario Eliminado Exitosamente", "AVISO", 1);
            
            viborita_serial.Viborita_Serial.ListaAceptados.remove(filaSelect);//elimina de la lista de solicitudes
            mostrar();
            
            
        
        }
        
    }//GEN-LAST:event_jbEliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JTable jtAceptados;
    // End of variables declaration//GEN-END:variables

public void mostrar(){
    
    //creacion de la matriz para mostrar las filas
    String matriz[][]=new String[viborita_serial.Viborita_Serial.ListaAceptados.size()][2];
    
    for (int i = 0; i < viborita_serial.Viborita_Serial.ListaAceptados.size(); i++) {
        
        matriz[i][0]= viborita_serial.Viborita_Serial.ListaAceptados.get(i).getUsuario();
        matriz[i][1]= viborita_serial.Viborita_Serial.ListaAceptados.get(i).getContraseña();
        
    }
    
    
    jtAceptados.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Usuario", "Contraseña"
            }
        )); 
}

}