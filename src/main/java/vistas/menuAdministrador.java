/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class menuAdministrador extends javax.swing.JInternalFrame {
    FondoPanel fondo = new FondoPanel();

    /**
     * Creates new form menuAdministrador
     */
    public menuAdministrador() {
        initComponents();
        this.setContentPane(fondo);
        lblTipoUsuario.setIcon(MostrarLabel("/vistas/Imagenes/iconAdmin.jpg", lblTipoUsuario));
        btnSalida.setIcon(MostrarBoton("/vistas/Imagenes/botonSalida.png", btnSalida));
        btnAgregarMedico.setIcon(MostrarBoton("/vistas/Imagenes/botonAgregarUsuario.png", btnAgregarMedico));
        btnConsultarMedico.setIcon(MostrarBoton("/vistas/Imagenes/botonBuscar.png", btnConsultarMedico));
        btnModificarMedico.setIcon(MostrarBoton("/vistas/Imagenes/botonModificar.jpg", btnModificarMedico));
        btnEliminarMedico.setIcon(MostrarBoton("/vistas/Imagenes/botonEliminarUsuario.png", btnEliminarMedico));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FotoUsuario = new javax.swing.JLabel();
        btnSalida = new javax.swing.JButton();
        btnAgregarMedico = new javax.swing.JButton();
        btnConsultarMedico = new javax.swing.JButton();
        btnModificarMedico = new javax.swing.JButton();
        lblTipoUsuario = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Administrador = new javax.swing.JLabel();
        btnEliminarMedico = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnAgregarMedico.setBackground(new java.awt.Color(0, 204, 153));
        btnAgregarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAgregarMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMedico.setText("Agregar Nuevo Personal Medico");
        btnAgregarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicoActionPerformed(evt);
            }
        });

        btnConsultarMedico.setBackground(new java.awt.Color(255, 153, 0));
        btnConsultarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnConsultarMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarMedico.setText("Consultar Personal Medico");
        btnConsultarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMedicoActionPerformed(evt);
            }
        });

        btnModificarMedico.setBackground(new java.awt.Color(255, 255, 0));
        btnModificarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnModificarMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarMedico.setText("Modificar Informacion");
        btnModificarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMedicoActionPerformed(evt);
            }
        });

        Menu.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Menu.setText("Menu");

        Administrador.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Administrador.setForeground(new java.awt.Color(204, 0, 255));
        Administrador.setText("Administrador");

        btnEliminarMedico.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnEliminarMedico.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMedico.setText("Eliminar personal medico");
        btnEliminarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(Administrador))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(Menu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Menu)
                        .addGap(18, 18, 18)
                        .addComponent(Administrador)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(FotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
        Inicio ventanaI = new Inicio();
        ventanaI.setVisible(true);
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnAgregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicoActionPerformed
        // TODO add your handling code here:
        AgregarUserMedico ventanaAM = new AgregarUserMedico();
        ventanaAM.setVisible(true);
    }//GEN-LAST:event_btnAgregarMedicoActionPerformed

    private void btnConsultarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMedicoActionPerformed
        // TODO add your handling code here:
        ConsultarMedicos ventanaCM = new ConsultarMedicos();
        ventanaCM.setVisible(true);
    }//GEN-LAST:event_btnConsultarMedicoActionPerformed

    private void btnModificarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMedicoActionPerformed
        // TODO add your handling code here:
        ModificarUserMedico ventanaMM = new ModificarUserMedico();
        ventanaMM.setVisible(true);
    }//GEN-LAST:event_btnModificarMedicoActionPerformed

    private void btnEliminarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedicoActionPerformed
        // TODO add your handling code here:
        EliminarUserMedico ventanaEM = new EliminarUserMedico();
        ventanaEM.setVisible(true);
    }//GEN-LAST:event_btnEliminarMedicoActionPerformed

   

private Icon MostrarBoton (String url, JButton boton ){
     ImageIcon icono = new ImageIcon(getClass().getResource(url));
     int ancho = boton.getWidth();
     int alto = boton.getHeight();
     ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    return icono;
    }

private Icon MostrarLabel (String url, JLabel imagen ){
     ImageIcon icono = new ImageIcon(getClass().getResource(url));
     int ancho = imagen.getWidth();
     int alto = imagen.getHeight();
     ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrador;
    private javax.swing.JLabel FotoUsuario;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton btnAgregarMedico;
    private javax.swing.JButton btnConsultarMedico;
    private javax.swing.JButton btnEliminarMedico;
    private javax.swing.JButton btnModificarMedico;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel lblTipoUsuario;
    // End of variables declaration//GEN-END:variables
}