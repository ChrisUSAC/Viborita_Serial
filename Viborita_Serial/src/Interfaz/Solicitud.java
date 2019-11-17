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
public class Solicitud extends javax.swing.JFrame {

    /**
     * Creates new form Solicitud
     */
    public Solicitud() {
        initComponents();
        this.setLocationRelativeTo(null); // centra el frame en la pantalla
        this.setResizable(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtSolicitudUsuario = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jbEnviarSolicitud = new javax.swing.JButton();
        jtpassUsuario = new javax.swing.JPasswordField();
        jtconfirmarPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(617, 430));
        setMinimumSize(new java.awt.Dimension(617, 430));
        setPreferredSize(new java.awt.Dimension(617, 430));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registrarse");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 10, 130, 24);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 120, 90, 24);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 190, 120, 24);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Confirmar Contraseña:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 260, 200, 24);
        getContentPane().add(jtSolicitudUsuario);
        jtSolicitudUsuario.setBounds(230, 120, 250, 28);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(320, 330, 140, 28);

        jbEnviarSolicitud.setText("Enviar Solicitud");
        jbEnviarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarSolicitudActionPerformed(evt);
            }
        });
        getContentPane().add(jbEnviarSolicitud);
        jbEnviarSolicitud.setBounds(140, 330, 140, 28);
        getContentPane().add(jtpassUsuario);
        jtpassUsuario.setBounds(230, 190, 250, 28);
        getContentPane().add(jtconfirmarPass);
        jtconfirmarPass.setBounds(230, 260, 250, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoSolicitud.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        
        this.dispose();//destruir ventana anterior
        new Login().setVisible(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEnviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarSolicitudActionPerformed
    
        String us,con,confcon;
        us = jtSolicitudUsuario.getText();
        con = jtpassUsuario.getText();
        confcon = jtconfirmarPass.getText();
        
        us = us.replaceAll(" ", ""); // quita espacios en blanco
        
        con = con.replaceAll(" ", ""); // quita espacios en blanco
        
        confcon = confcon.replaceAll(" ", ""); // quita espacios en blanco
        
        if (us.length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre de usuario", "AVISO", 2);
        }
        else if (con.length() == 0) {
             JOptionPane.showMessageDialog(this, "Ingrese una contraseña", "AVISO", 2);
        }
        else if (confcon.length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese una contraseñaaaa", "AVISO", 2);
        }
        else {
            
            if (con.equals(confcon)) {
                
                Usuario usuario = new Usuario(jtSolicitudUsuario.getText(), jtpassUsuario.getText(), "0", "0", "1");
                viborita_serial.Viborita_Serial.listaSolicitudes.add(usuario);
                
                
                JOptionPane.showMessageDialog(this, "Solicitud Enviada", "AVISO", 1);
                
            }
            else {
                JOptionPane.showMessageDialog(this, "Contraseña no coincide", "ERROR", 2);
                
            }
        
        }
        
        
        
    }//GEN-LAST:event_jbEnviarSolicitudActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEnviarSolicitud;
    private javax.swing.JTextField jtSolicitudUsuario;
    private javax.swing.JPasswordField jtconfirmarPass;
    private javax.swing.JPasswordField jtpassUsuario;
    // End of variables declaration//GEN-END:variables



}


