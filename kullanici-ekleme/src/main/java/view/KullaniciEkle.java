/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class KullaniciEkle extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();

    /**
     * Creates new form KullaniciEkle
     */
    public KullaniciEkle() {
        initComponents();
        kullaniciList.setModel(model);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        kullaniciList = new javax.swing.JList<>();
        mesajYazisiLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullaniciEkleButton = new javax.swing.JButton();
        kullaniciSilButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcılar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Kullanıcılar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        kullaniciList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(kullaniciList);

        mesajYazisiLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mesajYazisiLabel.setForeground(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kullanıcılar");

        kullaniciEkleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kullaniciEkleButton.setText("Kullanıcı Ekle");
        kullaniciEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciEkleButtonActionPerformed(evt);
            }
        });

        kullaniciSilButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kullaniciSilButton.setText("Kullanıcı Sil");
        kullaniciSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciSilButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kullaniciEkleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kullaniciSilButton))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(mesajYazisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciEkleButton)
                    .addComponent(kullaniciSilButton))
                .addGap(18, 18, 18)
                .addComponent(mesajYazisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void kullaniciEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciEkleButtonActionPerformed
        mesajYazisiLabel.setText("");
        String cevap = JOptionPane.showInputDialog("Kullanıcı Adı");

        if (cevap != null) {
            if (cevap.trim().equals("")) {
                mesajYazisiLabel.setText("Boş bir kullanıcı adı girdiniz.");
            } else {
                model.addElement(cevap);
                mesajYazisiLabel.setText("Kullanıcı başarılı bir şekilde eklendi.");
            }
        } else {
            mesajYazisiLabel.setText("İşlem iptal edildi.");
        }
    }//GEN-LAST:event_kullaniciEkleButtonActionPerformed

    private void kullaniciSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciSilButtonActionPerformed
        mesajYazisiLabel.setText("");

        int selectedIndex = kullaniciList.getSelectedIndex();
        // liste boşsa veya hiçbir yere tıklanmamışsa getSelectedIndex -1 döndürür

        if (selectedIndex == -1) {
            if (model.getSize() == 0) {
                mesajYazisiLabel.setText("Liste şu anda boş.");
            } else {
                mesajYazisiLabel.setText("Lütfen silinecek bir kullanıcı seçin.");
            }
        } else {
            Object silinecek = model.getElementAt(selectedIndex);
            model.removeElement(silinecek);
            mesajYazisiLabel.setText("Kullanıcı başarıyla silindi.");
        }
    }//GEN-LAST:event_kullaniciSilButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kullaniciEkleButton;
    private javax.swing.JList<String> kullaniciList;
    private javax.swing.JButton kullaniciSilButton;
    private javax.swing.JLabel mesajYazisiLabel;
    // End of variables declaration//GEN-END:variables
}