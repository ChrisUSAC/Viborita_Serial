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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jbIniciarSesion = new javax.swing.JButton();
        jbRegistrarse = new javax.swing.JButton();
        jtnombreUsuario = new javax.swing.JTextField();
        jtContraseñaUsuario = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viborita_Serial");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jbIniciarSesion.setText("Iniciar Sesion");
        jbIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jbIniciarSesion);
        jbIniciarSesion.setBounds(330, 400, 120, 28);

        jbRegistrarse.setText("Registrarse");
        jbRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(jbRegistrarse);
        jbRegistrarse.setBounds(330, 450, 120, 28);

        jtnombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jtnombreUsuario);
        jtnombreUsuario.setBounds(290, 230, 290, 30);
        getContentPane().add(jtContraseñaUsuario);
        jtContraseñaUsuario.setBounds(290, 330, 290, 28);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 310, 200, 70);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Viborita");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 0, 170, 100);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 230, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtnombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnombreUsuarioActionPerformed

    private void jbRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarseActionPerformed
        
        this.dispose();//destruir ventana anterior
        new Solicitud().setVisible(true); // abrir ventana
    }//GEN-LAST:event_jbRegistrarseActionPerformed

    private void jbIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarSesionActionPerformed

    
        if (jtnombreUsuario.getText().equals("Admin_ORGA") && jtContraseñaUsuario.getText().equals("12345")) {
            this.dispose();//destruir ventana anterior
            new frameAdmin().setVisible(true); // abrir ventana de admin
        }
        
    }//GEN-LAST:event_jbIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbIniciarSesion;
    private javax.swing.JButton jbRegistrarse;
    private javax.swing.JPasswordField jtContraseñaUsuario;
    public javax.swing.JTextField jtnombreUsuario;
    // End of variables declaration//GEN-END:variables
}
