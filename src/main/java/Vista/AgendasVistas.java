/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author tutut
 */
public class AgendasVistas extends javax.swing.JInternalFrame {

    /**
     * Creates new form LEEj1
     */
    public AgendasVistas() {
        initComponents();
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
        btnIndicar = new javax.swing.JToggleButton();
        lblTitulo = new javax.swing.JLabel();
        lblEtiqueta = new javax.swing.JLabel();
        txtNumeros = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        LbMensaje = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ejercicio 1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        btnIndicar.setText("Indicar");
        btnIndicar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIndicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Ejercicio 1");

        lblEtiqueta.setText("Ingrese los números:");

        txtNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerosActionPerformed(evt);
            }
        });

        btnGuardar.setText("Registrar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnGuardar)
                        .addGap(42, 42, 42)
                        .addComponent(btnIndicar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(LbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEtiqueta)
                    .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIndicar)
                    .addComponent(btnGuardar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIndicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndicarActionPerformed
        // TODO add your handling code here:
        tablaNum.numeroMax = comprobarNumeroMax(tablaNum.numeros);
        tablaNum.numeroMin = comprobarNumeroMin(tablaNum.numeros);
        Menu.escritorio.add(tablaNum);
        tablaNum.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIndicarActionPerformed

    private void txtNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (!txtNumeros.getText().isEmpty()) {
            if (contNumeros < 10) {
                int numeroActual = Integer.parseInt(txtNumeros.getText());
                tablaNum.numeros[contNumeros] = numeroActual;

                contNumeros++;
                LbMensaje.setText("Va en el numero: "+contNumeros);
                txtNumeros.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ya ingresó 10 números");
                for (int i = 0; i < tablaNum.numeros.length; i++) {
                    System.out.println(tablaNum.numeros[i]);
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un número");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    int contNumeros = 0;
    ConsultorioVistas tablaNum = new ConsultorioVistas();

    public int comprobarNumeroMax(Integer[] array) {
        int numeroMaximo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numeroMaximo) {
                numeroMaximo = array[i];
            }
        }
        return numeroMaximo;
    }

    public int comprobarNumeroMin(Integer[] array) {
        int numeroMinimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < numeroMinimo) {
                numeroMinimo = array[i];
            }
        }
        return numeroMinimo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbMensaje;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnIndicar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
}
