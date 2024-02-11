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
public class IngresarDatosPaciente extends javax.swing.JInternalFrame {
    FondoPanel fondo = new FondoPanel();

    /**
     * Creates new form IngresarDatosPaciente
     */
    public IngresarDatosPaciente() {
        initComponents();
        this.setContentPane(fondo);
        lblTipoUsuario.setIcon(MostrarLabel("/vistas.Imagenes/iconPaciente.jpg", lblTipoUsuario));
        btnRegresar.setIcon(MostrarBoton("/vistas.Imagenes/botonRegresar.png", btnRegresar));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cBoxSangre = new javax.swing.JComboBox<>();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtFechaN = new javax.swing.JTextField();
        TipoSangre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlergias = new javax.swing.JTextArea();
        NumCedula = new javax.swing.JLabel();
        Celular = new javax.swing.JLabel();
        cBoxMasculino = new javax.swing.JCheckBox();
        cBoxFemenino = new javax.swing.JCheckBox();
        NombresCompletos = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTipoUsuario = new javax.swing.JLabel();
        DatosPersonales = new javax.swing.JLabel();
        Paciente = new javax.swing.JLabel();
        Genero = new javax.swing.JLabel();
        Alergias = new javax.swing.JLabel();
        MedicamentosV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JLabel();
        FechaNacimiento = new javax.swing.JLabel();
        Enfermedades = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMedicamentos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEnfermedades = new javax.swing.JTextArea();

        cBoxSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TipoSangre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TipoSangre.setText("Tipo de Sangre");

        txtAlergias.setColumns(20);
        txtAlergias.setRows(5);
        jScrollPane1.setViewportView(txtAlergias);

        NumCedula.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        NumCedula.setText("N° de Cedula");

        Celular.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Celular.setText("N° Telefonico (Celular)");

        cBoxMasculino.setText("Masculino");

        cBoxFemenino.setText("Femenino");

        NombresCompletos.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        NombresCompletos.setText("Nombre Completos");

        DatosPersonales.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        DatosPersonales.setText("Datos Pesonales");

        Paciente.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        Paciente.setForeground(new java.awt.Color(0, 204, 204));
        Paciente.setText("Paciente");

        Genero.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Genero.setText("Genero");

        Alergias.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Alergias.setText("Alergias de Paciente");

        MedicamentosV.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        MedicamentosV.setText("Medicamentos Vitales");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Direccion");

        CorreoElectronico.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        CorreoElectronico.setText("Correo Electronico");

        FechaNacimiento.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        FechaNacimiento.setText("Fecha de Nacimiento");

        Enfermedades.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Enfermedades.setText("Enfermedades");

        btnGuardar.setBackground(new java.awt.Color(0, 102, 51));
        btnGuardar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtMedicamentos.setColumns(20);
        txtMedicamentos.setRows(5);
        jScrollPane2.setViewportView(txtMedicamentos);

        txtEnfermedades.setColumns(20);
        txtEnfermedades.setRows(5);
        jScrollPane3.setViewportView(txtEnfermedades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cBoxMasculino)
                                .addGap(92, 92, 92)
                                .addComponent(cBoxFemenino)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Genero)
                                .addGap(118, 118, 118))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Alergias)
                                .addGap(76, 76, 76)))))
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MedicamentosV)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Enfermedades)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(DatosPersonales))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(Paciente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(285, 285, 285))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFechaN, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                .addComponent(txtCelular)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(NombresCompletos))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(NumCedula)))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TipoSangre)
                                                .addComponent(CorreoElectronico)
                                                .addComponent(FechaNacimiento))
                                            .addComponent(Celular))
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(cBoxSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(33, 544, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosPersonales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Paciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(Alergias)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Genero)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cBoxFemenino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cBoxMasculino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MedicamentosV, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Enfermedades)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(24, 24, 24))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(57, 57, 57)
                    .addComponent(NombresCompletos)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(NumCedula)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Celular)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(TipoSangre)
                    .addGap(17, 17, 17)
                    .addComponent(cBoxSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(CorreoElectronico)
                    .addGap(10, 10, 10)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(FechaNacimiento)
                    .addGap(18, 18, 18)
                    .addComponent(txtFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        menuPaciente ventanaMP = new menuPaciente();
        ventanaMP.setVisible(true);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        Inicio ventanaI = new Inicio();
        ventanaI.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private Icon MostrarLabel (String url, JLabel imagen ){
     ImageIcon icono = new ImageIcon(getClass().getResource(url));
     int ancho = imagen.getWidth();
     int alto = imagen.getHeight();
     ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    return icono;
    }

private Icon MostrarBoton (String url, JButton boton ){
     ImageIcon icono = new ImageIcon(getClass().getResource(url));
     int ancho = boton.getWidth();
     int alto = boton.getHeight();
     ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alergias;
    private javax.swing.JLabel Celular;
    private javax.swing.JLabel CorreoElectronico;
    private javax.swing.JLabel DatosPersonales;
    private javax.swing.JLabel Enfermedades;
    private javax.swing.JLabel FechaNacimiento;
    private javax.swing.JLabel Genero;
    private javax.swing.JLabel MedicamentosV;
    private javax.swing.JLabel NombresCompletos;
    private javax.swing.JLabel NumCedula;
    private javax.swing.JLabel Paciente;
    private javax.swing.JLabel TipoSangre;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox cBoxFemenino;
    private javax.swing.JCheckBox cBoxMasculino;
    private javax.swing.JComboBox<String> cBoxSangre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JTextArea txtAlergias;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextArea txtEnfermedades;
    private javax.swing.JTextField txtFechaN;
    private javax.swing.JTextArea txtMedicamentos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
