
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author adria
 */
public class practica2_2 extends javax.swing.JFrame {

    /**
     * Creates new form practica2_2
     */
    public practica2_2() {
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

        jPanel2 = new javax.swing.JPanel();
        boton_saluda = new javax.swing.JButton();
        campo_nombre = new javax.swing.JTextField();
        icono_mano = new javax.swing.JLabel();
        etiqueta_instruccion = new javax.swing.JLabel();
        campo_apellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_saluda.setLabel("Saluda");
        boton_saluda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_saludaActionPerformed(evt);
            }
        });

        campo_nombre.setForeground(new java.awt.Color(204, 204, 204));
        campo_nombre.setText("Introduzca nombre");
        campo_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_nombreKeyPressed(evt);
            }
        });

        icono_mano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saluda.png"))); // NOI18N

        etiqueta_instruccion.setText("Escribe el nombre del usuario");
        etiqueta_instruccion.setAlignmentY(0.0F);

        campo_apellido.setForeground(new java.awt.Color(204, 204, 204));
        campo_apellido.setText("Introduzca apellido");
        campo_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_apellidoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(icono_mano)
                                .addGap(99, 99, 99))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(etiqueta_instruccion)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(campo_apellido))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(boton_saluda)
                        .addGap(90, 90, 90))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_mano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta_instruccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_saluda)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_saludaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_saludaActionPerformed
        // Obtener el texto ingresado en el campo de texto
        String nombre = campo_nombre.getText();
        String apellido = campo_apellido.getText();
        String nombre_def = "Introduzca nombre";
        String apellido_def = "Introduzca apellido";
        if (nombre.isEmpty() || apellido.isEmpty() || nombre.equals(nombre_def) || apellido.equals(apellido_def)) {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca un nombre y un apellido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (nombre.length() < 5 || apellido.length() < 5) {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca un nombre con 5 caracteres como minimo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (nombre.matches(".*[0-9].*")) {
            JOptionPane.showMessageDialog(this, "Por favor, no introduzca caracteres numericos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "¡Hola, " + nombre + " " + apellido + "!", "Saludo", JOptionPane.INFORMATION_MESSAGE);
        }
        campo_nombre.setText(nombre_def);
        campo_apellido.setText(apellido_def);

    }//GEN-LAST:event_boton_saludaActionPerformed

    private void campo_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_nombreKeyPressed
        // TODO add your handling code here:
        if (campo_nombre.getText().equals("Introduzca nombre")) {
            campo_nombre.setText("");
        }
    }//GEN-LAST:event_campo_nombreKeyPressed

    private void campo_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_apellidoKeyPressed
        // TODO add your handling code here:
        if (campo_apellido.getText().equals("Introduzca apellido")) {
            campo_apellido.setText("");
        }
    }//GEN-LAST:event_campo_apellidoKeyPressed

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
            java.util.logging.Logger.getLogger(practica2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica2_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_saluda;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel etiqueta_instruccion;
    private javax.swing.JLabel icono_mano;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
