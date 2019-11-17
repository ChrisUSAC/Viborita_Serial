/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author cris
 */
public class frameAdmin extends javax.swing.JFrame {
    
    public static boolean visible=false;

    /**
     * Creates new form frameAdmin
     */
    public frameAdmin() {
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
        jbReporteTiempos = new javax.swing.JButton();
        jbReportePuntos = new javax.swing.JButton();
        jbVerUsuarios = new javax.swing.JButton();
        jbEliminarUsuarios = new javax.swing.JButton();
        jbConfirmarUsuarios = new javax.swing.JButton();
        jbCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setText("Bienvenido Administrador");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 0, 790, 110);

        jbReporteTiempos.setText("Top 10 Tiempos");
        jbReporteTiempos.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jbReporteTiempos);
        jbReporteTiempos.setBounds(420, 130, 150, 30);

        jbReportePuntos.setText("Top 10 Puntos");
        jbReportePuntos.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jbReportePuntos);
        jbReportePuntos.setBounds(420, 190, 150, 30);

        jbVerUsuarios.setText("Ver Usuarios");
        jbVerUsuarios.setPreferredSize(new java.awt.Dimension(150, 30));
        jbVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jbVerUsuarios);
        jbVerUsuarios.setBounds(420, 250, 150, 30);

        jbEliminarUsuarios.setText("Eliminar Usuarios");
        jbEliminarUsuarios.setPreferredSize(new java.awt.Dimension(150, 30));
        jbEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminarUsuarios);
        jbEliminarUsuarios.setBounds(420, 310, 150, 30);

        jbConfirmarUsuarios.setText("Confirmar Usuarios");
        jbConfirmarUsuarios.setPreferredSize(new java.awt.Dimension(150, 30));
        jbConfirmarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jbConfirmarUsuarios);
        jbConfirmarUsuarios.setBounds(420, 370, 150, 30);

        jbCerrarSesion.setText("Cerrar Sesion");
        jbCerrarSesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jbCerrarSesion);
        jbCerrarSesion.setBounds(420, 430, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoAdmin.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();//destruir ventana anterior
        new Login().setVisible(true); // abrir ventana de admin
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void jbVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerUsuariosActionPerformed
        
        visible = false;
        this.dispose();//destruir ventana anterior
        new TablaAceptados().setVisible(true); // abrir ventana de admin
    }//GEN-LAST:event_jbVerUsuariosActionPerformed

    private void jbConfirmarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarUsuariosActionPerformed
        
        this.dispose();//destruir ventana anterior
        new TablaSolicitud().setVisible(true); // abrir ventana de admin
    }//GEN-LAST:event_jbConfirmarUsuariosActionPerformed

    private void jbEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarUsuariosActionPerformed
        visible = true;
        this.dispose();//destruir ventana anterior
        new TablaAceptados().setVisible(true); // abrir ventana de admin
    }//GEN-LAST:event_jbEliminarUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbConfirmarUsuarios;
    private javax.swing.JButton jbEliminarUsuarios;
    private javax.swing.JButton jbReportePuntos;
    private javax.swing.JButton jbReporteTiempos;
    private javax.swing.JButton jbVerUsuarios;
    // End of variables declaration//GEN-END:variables
}
