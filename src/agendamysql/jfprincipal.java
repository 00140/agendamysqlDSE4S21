/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamysql;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ideapad 330
 */
public class jfprincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfprincipal
     */
    DefaultTableModel tablaModelo = new DefaultTableModel();
    List<datosdto>listaDatos = new ArrayList<>();
    int Vid=0;
    public jfprincipal() {
        initComponents();
        cargartitulos();
        cargar();
    }

    jfprincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        btnregistra = new javax.swing.JButton();
        btnactualiza = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        btnlimpia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agenda");

        jLabel2.setText("Nombre");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Edad");

        jLabel4.setText("Sexo");

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabladatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabladatos);

        btnregistra.setText("Registrar");
        btnregistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraActionPerformed(evt);
            }
        });

        btnactualiza.setText("Actualizar");
        btnactualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizaActionPerformed(evt);
            }
        });

        btnelimina.setText("Eliminar");
        btnelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaActionPerformed(evt);
            }
        });

        btnlimpia.setText("Limpiar");
        btnlimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnactualiza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnregistra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnelimina, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnlimpia, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnactualiza)
                                .addGap(18, 18, 18)
                                .addComponent(btnelimina)
                                .addGap(18, 18, 18)
                                .addComponent(btnlimpia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnregistra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnlimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiaActionPerformed
        // TODO add your handling code here:
        txtnombre.setText("");
        txtedad.setText("");
        txtsexo.setText("");
    }//GEN-LAST:event_btnlimpiaActionPerformed

    private void btnregistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraActionPerformed
        // TODO add your handling code here:
        datosdto datos = new datosdto();
        conexiondao conexion = new conexiondao();
        
        datos.setNombre(txtnombre.getText());
        datos.setEdad(txtedad.getText());
        datos.setSexo(txtsexo.getText());
        if (conexion.inserta(datos)){
            JOptionPane.showMessageDialog(this, "se registro...","Resgistro",JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaulTableModel) tablaDatos.getModel();
            tablaModelo.getDataVector().removeallElements();
            cargar();
        }else{
        JOptionPane.showMessageDialog(this, "no se registro...","Error",JOptionPane.INFORMATION_MESSAGE);
        
    }
        if(listaDatos.size()>0&& listaDatos !=null){
        
        }
    }//GEN-LAST:event_btnregistraActionPerformed

    private void tabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladatosMouseClicked
        // TODO add your handling code here:
        int nfilas = 0;
        int filas = 0;
        nfilas = tablaDatos.getSelectedRowCount();
        if (nfilas == 1){
            filas = tablaDatos.getSelectRow();
            Vid = (int)tablaDatos.getValueAt(fila, 0);
            txtnmobre.setText(tablaDatos.getValuesAt(filas, 1));
            txtedad.setText(tablaDatos.getValuesAt(filas, 2));
            txtsexo.setText(tablaDatos.getValuesAt(filas, 3));
    }//GEN-LAST:event_tabladatosMouseClicked
    }
    private void btnactualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizaActionPerformed
        // TODO add your handling code here:
        conexiondao conexion = new conexiondao();
        datosdto datos = new datosdto();
        datos.setId(vid);
        datos.setNombre(txtnombre.getText());
        datos.setEdad(txtedad.getText());
        datos.setSexo(txtsexo.getText());
        if (conexion.actualiza(datos)){
            JOptionPane.showMessageDialog(this, "se actualizo...","Resgistro",JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaulTableModel) tablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();
        }else{
          JOptionPane.showMessageDialog(this, "no se actualizo...","Error",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_btnactualizaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        // TODO add your handling code here:
        datosdto datos = new datosdto();
        Conexiondao conexion = new conexiondao();
        datos.setId(vid);
        if(conexion.eliminar(datos)){
            
            JOptionPane.showMessageDialog(this, "se elimino...","Resgistro",JOptionPane.INFORMATION_MESSAGE);
            tablaModelo = (DefaulTableModel) tablaDatos.getModel();
            tablaModelo.getDataVector().removeAllElements();}
        else{ JOptionPane.showMessageDialog(this, "no se elimino...","Error",JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_btneliminaActionPerformed
private void cargarcontenido(){
    Object[] filatabla = new Object[4];
    for (datosdto datos : listaDatos){
     filatabla[0]=datos.getId(); 
     filatabla[1]=datos.getNombre(); 
     filatabla[2]=datos.getEdad(); 
     filatabla[3]=datos.getSexo();
     tablaModelo.addRoe(filatabla);
        
    }
    tablaDatos.setModel(tablaModelo);
    }
    private void cargar(){
    conexiondao conexion = new conexiondao();
    if (conexion.cargar()){
    listaDatos = conexion.getdatos();
    }else{
     JOptionPane.showMessageDialog(this, "no se cargo la informacion","Error",JOptionPane.INFORMATION_MESSAGE);   
    }
}
    public void cargartitulos(){
        tablaModelo.addColumn("id");
        tablaModelo.addColumn("nombre");
        tablaModelo.addColumn("edad");
        tablaModelo.addColumn("sexo");
        tablaDatos.setModel(tablaModelo);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualiza;
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btnlimpia;
    private javax.swing.JButton btnregistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
