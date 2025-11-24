/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programa;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.text.BadLocationException;

public class Tareas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tareas.class.getName());
    
    
    
    public Tareas() throws FileNotFoundException {
        initComponents();
        DefaultListModel modelo = new DefaultListModel();
        jList1.setModel(modelo);
        jList1.setCellRenderer(new TareaRenderer());
        cargarDatos();
    }
    
    private void cargarDatos() throws FileNotFoundException {
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();

        try (BufferedReader br = new BufferedReader(new FileReader("tareas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                modelo.addElement(linea);
            }
        } catch (IOException e) {
            System.out.println("No hay archivo todavía.");
        }

    }  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CampoTexto = new javax.swing.JTextField();
        JButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        JButton3 = new javax.swing.JButton();
        JButton4 = new javax.swing.JButton();
        JButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Tareas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 10, 180, 60);

        JButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton1.setText("Agregar");
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton1);
        JButton1.setBounds(10, 130, 90, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel2.setText("Ingrese su tarea:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 170, 30);

        CampoTexto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CampoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTextoActionPerformed(evt);
            }
        });
        CampoTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoTextoKeyReleased(evt);
            }
        });
        jPanel1.add(CampoTexto);
        CampoTexto.setBounds(10, 80, 530, 40);

        JButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton2.setText("Eliminar seleccionada");
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton2);
        JButton2.setBounds(110, 130, 190, 30);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 72, 23);

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 530, 210);

        JButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton3.setText("Limpiar todo");
        JButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton3);
        JButton3.setBounds(310, 130, 130, 30);

        JButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton4.setText("Marcar");
        JButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton4);
        JButton4.setBounds(10, 180, 80, 30);

        JButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton5.setText("Desmarcar");
        JButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton5);
        JButton5.setBounds(100, 180, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton1ActionPerformed
    DefaultListModel modelo = (DefaultListModel) jList1.getModel();
    String texto = CampoTexto.getText().trim();

    if (!texto.isEmpty()) {
        modelo.addElement("• " + texto);
        CampoTexto.setText("");
    }

        
    }//GEN-LAST:event_JButton1ActionPerformed

    private void CampoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTextoActionPerformed
        JButton1.doClick(); // Simula presionar el botón
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTextoActionPerformed

    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton2ActionPerformed
    DefaultListModel modelo = (DefaultListModel) jList1.getModel();
    int idx = jList1.getSelectedIndex();

    if (idx != -1) {
    modelo.remove(idx);
    }

    }//GEN-LAST:event_JButton2ActionPerformed

    private void CampoTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoTextoKeyReleased
        
    }//GEN-LAST:event_CampoTextoKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            FileWriter fw = new FileWriter("tareas.txt");

            for (int i = 0; i < modelo.size(); i++) {
                fw.write(modelo.get(i).toString() + "\n");
            }

            fw.close();

        } catch (IOException ex) {
            System.getLogger(Tareas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio newframe = new Inicio();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton3ActionPerformed
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();
        modelo.clear();
    }//GEN-LAST:event_JButton3ActionPerformed

    private void JButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton4ActionPerformed
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();
        int index = jList1.getSelectedIndex();

        if (index != -1) {
         String tarea = modelo.get(index).toString();

    // Evitar marcar dos veces
            if (!tarea.startsWith("✔")) {
                modelo.set(index, "✔ " + tarea);
            }
        }
     // TODO add your handling code here:
    }//GEN-LAST:event_JButton4ActionPerformed

    private void JButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton5ActionPerformed
      DefaultListModel modelo = (DefaultListModel) jList1.getModel();
      int index = jList1.getSelectedIndex();

      if (index != -1) {
          String tarea = modelo.get(index).toString();

          if (tarea.startsWith("✔ ")) {
              modelo.set(index, tarea.substring(2)); // Quita el "✔ "
          }
      }
  // TODO add your handling code here:
    }//GEN-LAST:event_JButton5ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Tareas().setVisible(true);
            } catch (FileNotFoundException ex) {
                System.getLogger(Tareas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoTexto;
    private javax.swing.JButton JButton1;
    private javax.swing.JButton JButton2;
    private javax.swing.JButton JButton3;
    private javax.swing.JButton JButton4;
    private javax.swing.JButton JButton5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    

}
