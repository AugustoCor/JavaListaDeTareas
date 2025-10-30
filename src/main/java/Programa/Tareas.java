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
import javax.swing.text.BadLocationException;

public class Tareas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tareas.class.getName());

    public Tareas() throws FileNotFoundException {
        initComponents();
        cargarDatos();
    }
    
    private void guardarDatos() throws IOException {
        try (FileWriter escribir = new FileWriter("ventana.txt")) {
            escribir.write(AreaTexto.getText());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    private void cargarDatos() throws FileNotFoundException {
        try (BufferedReader lector = new BufferedReader(new FileReader("ventana.txt"))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            
            while ((linea = lector.readLine()) != null) {
                sb.append(linea).append("\n"); // Añade la línea leída y un salto de línea
            }
            
            AreaTexto.setText(sb.toString());
            System.out.println("Datos cargados correctamente.");
        } catch (IOException ex) {
            // Si el archivo no existe (primera vez que se ejecuta), o hay otro error, 
            // simplemente se imprime el mensaje. El JTextArea quedará vacío.
            System.err.println("No se encontró el archivo de datos o hubo un error de lectura.");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CampoTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        JButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        JButton1.setBounds(440, 120, 100, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel2.setText("Ingrese su tarea:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 170, 30);

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
        CampoTexto.setBounds(20, 140, 400, 40);

        AreaTexto.setEditable(false);
        AreaTexto.setColumns(20);
        AreaTexto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AreaTexto.setRows(5);
        AreaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AreaTextoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(AreaTexto);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 520, 230);

        JButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JButton2.setText("Eliminar");
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton2);
        JButton2.setBounds(440, 160, 100, 30);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 72, 23);

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
        AreaTexto.append("* "+CampoTexto.getText()+"\n");
        CampoTexto.setText("");
        
    }//GEN-LAST:event_JButton1ActionPerformed

    private void CampoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTextoActionPerformed

    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton2ActionPerformed
        try {
            int conteoLineas = AreaTexto.getLineCount();
            
            String textoCompleto = AreaTexto.getText();
            
            if (textoCompleto.endsWith("\n")) {
                conteoLineas--;
            }
            
            if (conteoLineas > 0) {
                int ultimaLinea = conteoLineas - 1;
                int inicio = AreaTexto.getLineStartOffset(ultimaLinea);
                int fin = AreaTexto.getLineEndOffset(ultimaLinea);
                
                //Eliminar la última linea
                AreaTexto.replaceRange("", inicio, fin);
            }
        } catch (BadLocationException ex) {
        }
    }//GEN-LAST:event_JButton2ActionPerformed

    private void AreaTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AreaTextoKeyReleased

    }//GEN-LAST:event_AreaTextoKeyReleased

    private void CampoTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoTextoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            AreaTexto.append("* "+CampoTexto.getText()+"\n");
            CampoTexto.setText("");
        }
        else if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            try {
            int conteoLineas = AreaTexto.getLineCount();
            
            String textoCompleto = AreaTexto.getText();
            
            if (textoCompleto.endsWith("\n")) {
                conteoLineas--;
            }
            
            if (conteoLineas > 0) {
                int ultimaLinea = conteoLineas - 1;
                int inicio = AreaTexto.getLineStartOffset(ultimaLinea);
                int fin = AreaTexto.getLineEndOffset(ultimaLinea);
                
                //Eliminar la última linea
                AreaTexto.replaceRange("", inicio, fin);
            }
        } catch (BadLocationException ex) {
        }
        }
    }//GEN-LAST:event_CampoTextoKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            guardarDatos();
        } catch (IOException ex) {
            System.getLogger(Tareas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio newframe = new Inicio();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JTextField CampoTexto;
    private javax.swing.JButton JButton1;
    private javax.swing.JButton JButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
