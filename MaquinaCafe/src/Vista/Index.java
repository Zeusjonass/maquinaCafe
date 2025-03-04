/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.*;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author zeusj
 */
public class Index extends javax.swing.JFrame {
    ControladorOrdenes controlador;
    /**
     * Creates new form index
     */
    public Index() {
        initComponents();
        inicializarAzucarComboBox();
        controlador = MainPrincipal.controlador;
    }

    private void inicializarAzucarComboBox(){
        cucharadasAzucarbox.removeAllItems();
        cucharadasAzucarbox.addItem("0");
        cucharadasAzucarbox.addItem("1");
        cucharadasAzucarbox.addItem("2");
        cucharadasAzucarbox.addItem("3");
        cucharadasAzucarbox.addItem("4");      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capuccinobtn = new javax.swing.JButton();
        descafeinadobtn = new javax.swing.JButton();
        negrobtn = new javax.swing.JButton();
        diezPesosbtn = new javax.swing.JButton();
        veintePesosbtn = new javax.swing.JButton();
        cincuentaPesosbtn = new javax.swing.JButton();
        dineroIntroducidotxt = new javax.swing.JTextField();
        dineroIntroducidolb = new javax.swing.JLabel();
        cancelarbtn = new javax.swing.JButton();
        costoOrdenlb = new javax.swing.JLabel();
        costoOrdentxt = new javax.swing.JTextField();
        costoCapuccinolb = new javax.swing.JLabel();
        costoDescafeinadolb = new javax.swing.JLabel();
        costoNegrolb = new javax.swing.JLabel();
        confirmarbtn = new javax.swing.JButton();
        cucharadasAzucarbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        signoPesoslb = new javax.swing.JLabel();
        signoPesoslb2 = new javax.swing.JLabel();
        cafeSeleccionadolb = new javax.swing.JLabel();
        cafeSeleccionadotxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        capuccinobtn.setText("capuccino");
        capuccinobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capuccinobtnMouseClicked(evt);
            }
        });
        capuccinobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capuccinobtnActionPerformed(evt);
            }
        });

        descafeinadobtn.setText("descafeinado");
        descafeinadobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descafeinadobtnMouseClicked(evt);
            }
        });

        negrobtn.setText("negro");
        negrobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negrobtnMouseClicked(evt);
            }
        });

        diezPesosbtn.setText("10 pesos");
        diezPesosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diezPesosbtnMouseClicked(evt);
            }
        });

        veintePesosbtn.setText("20 pesos");
        veintePesosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veintePesosbtnMouseClicked(evt);
            }
        });

        cincuentaPesosbtn.setText("50 pesos");
        cincuentaPesosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincuentaPesosbtnMouseClicked(evt);
            }
        });

        dineroIntroducidotxt.setText("0.0");

        dineroIntroducidolb.setText("Dinero Introducido:");

        cancelarbtn.setText("Cancelar Operación");
        cancelarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarbtnMouseClicked(evt);
            }
        });

        costoOrdenlb.setText("Ingrese por favor:");

        costoOrdentxt.setText("0.0");

        costoCapuccinolb.setText("$37");

        costoDescafeinadolb.setText("$35");

        costoNegrolb.setText("$33");

        confirmarbtn.setText("Confirmar");
        confirmarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarbtnMouseClicked(evt);
            }
        });

        cucharadasAzucarbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cucharadasAzucarbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cucharadasAzucarboxItemStateChanged(evt);
            }
        });

        jLabel1.setText("Seleccione la cantidad de cucharadas de azúcar");

        signoPesoslb.setText("$");

        signoPesoslb2.setText("$");

        cafeSeleccionadolb.setText("Café seleccionado:");

        cafeSeleccionadotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeSeleccionadotxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(capuccinobtn)
                        .addGap(18, 18, 18)
                        .addComponent(descafeinadobtn)
                        .addGap(18, 18, 18)
                        .addComponent(negrobtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(diezPesosbtn)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(costoCapuccinolb)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelarbtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(veintePesosbtn)
                                    .addComponent(costoDescafeinadolb))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cincuentaPesosbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(costoNegrolb, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(98, 98, 98)
                                    .addComponent(dineroIntroducidolb))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(signoPesoslb2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dineroIntroducidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costoOrdenlb)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(signoPesoslb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(costoOrdentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(cafeSeleccionadolb)
                        .addGap(18, 18, 18)
                        .addComponent(cafeSeleccionadotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(cucharadasAzucarbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirmarbtn)
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capuccinobtn)
                            .addComponent(descafeinadobtn)
                            .addComponent(negrobtn))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cafeSeleccionadolb)
                            .addComponent(cafeSeleccionadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(costoNegrolb)
                                .addComponent(costoCapuccinolb))
                            .addComponent(costoDescafeinadolb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diezPesosbtn)
                            .addComponent(veintePesosbtn)
                            .addComponent(cincuentaPesosbtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(costoOrdenlb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costoOrdentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signoPesoslb))
                        .addGap(32, 32, 32)
                        .addComponent(dineroIntroducidolb)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dineroIntroducidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signoPesoslb2))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cucharadasAzucarbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(cancelarbtn)
                .addGap(44, 44, 44)
                .addComponent(confirmarbtn)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capuccinobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capuccinobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capuccinobtnActionPerformed

    private void cucharadasAzucarboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cucharadasAzucarboxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cucharadasAzucarboxItemStateChanged

    private void cancelarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarbtnMouseClicked
        // TODO add your handling code here:
        dineroIntroducidotxt.setText("0.0");
        costoOrdentxt.setText("0.0");
        cafeSeleccionadotxt.setText("");
    }//GEN-LAST:event_cancelarbtnMouseClicked

    private void diezPesosbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diezPesosbtnMouseClicked
        // TODO add your handling code here:
        double dineroActual = Double.parseDouble(dineroIntroducidotxt.getText());
        dineroIntroducidotxt.setText(String.valueOf(dineroActual + 10));
    }//GEN-LAST:event_diezPesosbtnMouseClicked

    private void veintePesosbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veintePesosbtnMouseClicked
        // TODO add your handling code here:
        double dineroActual = Double.parseDouble(dineroIntroducidotxt.getText());
        dineroIntroducidotxt.setText(String.valueOf(dineroActual + 20));
    }//GEN-LAST:event_veintePesosbtnMouseClicked

    private void cincuentaPesosbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincuentaPesosbtnMouseClicked
        // TODO add your handling code here:
        double dineroActual = Double.parseDouble(dineroIntroducidotxt.getText());
        dineroIntroducidotxt.setText(String.valueOf(dineroActual + 50));
    }//GEN-LAST:event_cincuentaPesosbtnMouseClicked

    private void capuccinobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capuccinobtnMouseClicked
        // TODO add your handling code here:
        costoOrdentxt.setText("37.0");
        cafeSeleccionadotxt.setText("capuccino");
    }//GEN-LAST:event_capuccinobtnMouseClicked

    private void descafeinadobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descafeinadobtnMouseClicked
        // TODO add your handling code here:
        costoOrdentxt.setText("35.0");
        cafeSeleccionadotxt.setText("descafeinado");
    }//GEN-LAST:event_descafeinadobtnMouseClicked

    private void negrobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negrobtnMouseClicked
        // TODO add your handling code here:
        costoOrdentxt.setText("33.0");
        cafeSeleccionadotxt.setText("negro");
    }//GEN-LAST:event_negrobtnMouseClicked

    private void confirmarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarbtnMouseClicked
        // TODO add your handling code here:
        double dineroIngresado = Double.parseDouble(dineroIntroducidotxt.getText());
        double costoOrden = Double.parseDouble(costoOrdentxt.getText());
        String tipoCafe = cafeSeleccionadotxt.getText();
        int cucharadasAzucar = Integer.parseInt(cucharadasAzucarbox.getSelectedItem().toString());
        Orden nuevaOrden = new Orden(dineroIngresado,costoOrden, tipoCafe, cucharadasAzucar);
        String respuestaOrden = controlador.nuevaOrden(nuevaOrden);
        JOptionPane.showMessageDialog(null, respuestaOrden);
    }//GEN-LAST:event_confirmarbtnMouseClicked

    private void cafeSeleccionadotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeSeleccionadotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cafeSeleccionadotxtActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cafeSeleccionadolb;
    private javax.swing.JTextField cafeSeleccionadotxt;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JButton capuccinobtn;
    private javax.swing.JButton cincuentaPesosbtn;
    private javax.swing.JButton confirmarbtn;
    private javax.swing.JLabel costoCapuccinolb;
    private javax.swing.JLabel costoDescafeinadolb;
    private javax.swing.JLabel costoNegrolb;
    private javax.swing.JLabel costoOrdenlb;
    private javax.swing.JTextField costoOrdentxt;
    private javax.swing.JComboBox<String> cucharadasAzucarbox;
    private javax.swing.JButton descafeinadobtn;
    private javax.swing.JButton diezPesosbtn;
    private javax.swing.JLabel dineroIntroducidolb;
    private javax.swing.JTextField dineroIntroducidotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton negrobtn;
    private javax.swing.JLabel signoPesoslb;
    private javax.swing.JLabel signoPesoslb2;
    private javax.swing.JButton veintePesosbtn;
    // End of variables declaration//GEN-END:variables
}
