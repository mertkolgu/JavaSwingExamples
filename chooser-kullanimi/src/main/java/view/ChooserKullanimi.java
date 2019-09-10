/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/**
 *
 * @author Mert
 */
public class ChooserKullanimi extends javax.swing.JFrame {

    /**
     * Creates new form ChooserKullanimi
     */
    public ChooserKullanimi() {
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
        dosyaAcButton = new javax.swing.JButton();
        renkDegistirButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yaziAlaniTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chooser Kullanımı");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dosyaAcButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dosyaAcButton.setText("Dosya Aç");
        dosyaAcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyaAcButtonActionPerformed(evt);
            }
        });

        renkDegistirButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        renkDegistirButton.setText("Renk Değiştir");
        renkDegistirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkDegistirButtonActionPerformed(evt);
            }
        });

        yaziAlaniTextArea.setColumns(20);
        yaziAlaniTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        yaziAlaniTextArea.setRows(5);
        jScrollPane1.setViewportView(yaziAlaniTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dosyaAcButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(renkDegistirButton)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosyaAcButton)
                    .addComponent(renkDegistirButton))
                .addGap(50, 50, 50))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dosyaAcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaAcButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int i = fileChooser.showOpenDialog(this);

        if (i == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String icerik = "";

            try ( Scanner sc = new Scanner(new BufferedReader(new FileReader(file)))) {

                while (sc.hasNextLine()) {
                    icerik += sc.nextLine() + "\n";
                }

                yaziAlaniTextArea.setText(icerik);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_dosyaAcButtonActionPerformed

    private void renkDegistirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkDegistirButtonActionPerformed
        Color color = JColorChooser.showDialog(this, "Bir Renk Seçin", Color.yellow);

        yaziAlaniTextArea.setForeground(color);
    }//GEN-LAST:event_renkDegistirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooserKullanimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooserKullanimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dosyaAcButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton renkDegistirButton;
    private javax.swing.JTextArea yaziAlaniTextArea;
    // End of variables declaration//GEN-END:variables
}
