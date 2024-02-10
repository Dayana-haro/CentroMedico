/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.PersonasModelo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tutut
 */
public class CitasAgregarVistas extends javax.swing.JInternalFrame {
    ArrayList<PersonasModelo> listaNombres=new ArrayList<>();
    DefaultTableModel modelo =new DefaultTableModel();
    public CitasAgregarVistas() {
        initComponents();
        setModelo();
    }
     public void setModelo(){
        String[] cabecera={"Nro", "Nombres"};
        modelo.setColumnIdentifiers(cabecera);
        tbNombres.setModel(modelo);
    }

     public void llenarArrayListNombres(){
        String nombre=txtNombres.getText();
        PersonasModelo persona=new PersonasModelo();
        persona.setNombre(nombre);
        listaNombres.add(persona);  
    }

    public void SetDatos(){
    Object[] informacion=new Object[modelo.getColumnCount()];
    int cont=1;
        modelo.setRowCount(0);
        for (PersonasModelo persona : listaNombres) {
            informacion[0]=cont;
            informacion[1]=persona.getNombre();
            cont++;
            modelo.addRow(informacion);
        }
        tbNombres.setModel(modelo);
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
        txtNombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNombres = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel2.setText("Ingrese el nombre: ");

        txtNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombresMouseClicked(evt);
            }
        });

        tbNombres.setModel(new javax.swing.table.DefaultTableModel(
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
        tbNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombresMouseClicked
        // TODO add your handling code here:
        this.llenarArrayListNombres();
        this.SetDatos();
        txtNombres.setText("");
    }//GEN-LAST:event_txtNombresMouseClicked

    private void tbNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNombresMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tbNombresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbNombres;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
