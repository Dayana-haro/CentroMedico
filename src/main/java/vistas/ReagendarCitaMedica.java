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
public class ReagendarCitaMedica extends javax.swing.JInternalFrame {
    FondoPanel fondo = new FondoPanel();

    /**
     * Creates new form ReagendarCitaMedica
     */
    public ReagendarCitaMedica() {
        initComponents();
        this.setContentPane(fondo);
        lblTipoUsuario.setIcon(MostrarLabel("/vistas/Imagenes/iconPaciente.jpg", lblTipoUsuario));
        btnRegresar.setIcon(MostrarBoton("/vistas/Imagenes/botonRegresar.png", btnRegresar));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipoUsuario = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        Paciente = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsutasCitas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfoCitas = new javax.swing.JTable();
        lblCedula = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        NombrePaciente = new javax.swing.JLabel();
        btnReagendar = new javax.swing.JButton();

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        Paciente.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        Paciente.setForeground(new java.awt.Color(0, 204, 204));
        Paciente.setText("Paciente");

        Menu.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Menu.setText("Menu");

        tblConsutasCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblConsutasCitas);

        tblInfoCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblInfoCitas);

        Cedula.setText("N° de Cedula");

        NombrePaciente.setText("Nombre Paciente");

        btnReagendar.setBackground(new java.awt.Color(153, 255, 0));
        btnReagendar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnReagendar.setForeground(new java.awt.Color(255, 255, 255));
        btnReagendar.setText("Reagendar");
        btnReagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReagendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(Menu))
                            .addComponent(Paciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NombrePaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReagendar)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Paciente))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cedula)
                            .addComponent(NombrePaciente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnReagendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        menuPaciente ventanaMP = new menuPaciente();
        ventanaMP.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnReagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReagendarActionPerformed
        // TODO add your handling code here:
        menuPaciente ventanaMP = new menuPaciente();
        ventanaMP.setVisible(true);
    }//GEN-LAST:event_btnReagendarActionPerformed

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
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel NombrePaciente;
    private javax.swing.JLabel Paciente;
    private javax.swing.JButton btnReagendar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JTable tblConsutasCitas;
    private javax.swing.JTable tblInfoCitas;
    // End of variables declaration//GEN-END:variables
}
