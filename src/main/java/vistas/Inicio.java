/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author USUARIO
 */
public class Inicio extends javax.swing.JInternalFrame {
    
    FondoPanel fondo = new FondoPanel();

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        this.setContentPane(fondo);
        initComponents();
        
        loginMedico lMedico = new loginMedico();
        lMedico.setVisible(false);
        
        loginPaciente lPaciente = new loginPaciente();
        lPaciente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogoSistem = new javax.swing.JLabel();
        btnUserP = new javax.swing.JButton();
        btnUserM = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        lblLogoSistem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Imagenes/nombreSistem.png"))); // NOI18N

        btnUserP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Imagenes/iconPaciente.jpg"))); // NOI18N
        btnUserP.setBorder(null);
        btnUserP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserPActionPerformed(evt);
            }
        });

        btnUserM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Imagenes/iconMedico.jpg"))); // NOI18N
        btnUserM.setBorder(null);
        btnUserM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblLogoSistem, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnUserP)
                        .addGap(58, 58, 58)
                        .addComponent(btnUserM)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLogoSistem, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUserP)
                    .addComponent(btnUserM))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserPActionPerformed
        // TODO add your handling code here:
        loginPaciente Paciente = new loginPaciente();

    }//GEN-LAST:event_btnUserPActionPerformed

    private void btnUserMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserMActionPerformed
        // TODO add your handling code here:
        loginMedico Medico = new loginMedico();
    }//GEN-LAST:event_btnUserMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserM;
    private javax.swing.JButton btnUserP;
    private javax.swing.JLabel lblLogoSistem;
    // End of variables declaration//GEN-END:variables


}

