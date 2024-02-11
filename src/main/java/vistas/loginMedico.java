/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author USUARIO
 */
public class loginMedico extends javax.swing.JInternalFrame {

    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form loginMedico
     */
    public loginMedico() {
        initComponents();
        this.setContentPane(fondo);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        tbnRecupararC = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblInit = new javax.swing.JLabel();
        btnaAcceder = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        tbnRecupararC.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tbnRecupararC.setForeground(new java.awt.Color(0, 0, 204));
        tbnRecupararC.setText("¿ Olvidaste la contraseña ?");
        tbnRecupararC.setBorder(null);
        tbnRecupararC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnRecupararCActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUsuario.setText("Nombre de Usuario: ");

        lblClave.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblClave.setText("Contraseña: ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Imagenes/iconMedico.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));

        lblInit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblInit.setText("Iniciar Sesion");

        btnaAcceder.setBackground(new java.awt.Color(51, 255, 51));
        btnaAcceder.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnaAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnaAcceder.setText("Acceder");
        btnaAcceder.setBorder(null);
        btnaAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsuario)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(lblInit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(lblClave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(tbnRecupararC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnaAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblInit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblClave)
                .addGap(18, 18, 18)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnaAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbnRecupararC)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaAccederActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnaAccederActionPerformed

    private void tbnRecupararCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnRecupararCActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbnRecupararCActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblInit;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JButton tbnRecupararC;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}