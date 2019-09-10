/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mert
 */
public class StokUygulamasi extends javax.swing.JFrame {

    /**
     * Creates new form StokUygulamasi
     */
    public StokUygulamasi() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        urunIsmiTextField = new javax.swing.JTextField();
        fiyatTextField = new javax.swing.JTextField();
        kategoriComboBox = new javax.swing.JComboBox<>();
        mesajYazisiLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        urunTable = new javax.swing.JTable();
        ekleButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Uygulaması");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Stok Uygulaması", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ürün İsmi : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kategori : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fiyat : ");

        urunIsmiTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fiyatTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kategoriComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kategoriComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kategori Seçiniz", "Kültür Sanat", "Yemek", "Elektronik" }));

        mesajYazisiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajYazisiLabel.setForeground(new java.awt.Color(255, 0, 0));

        urunTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        urunTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        urunTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        urunTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urunTable);

        ekleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ekleButton.setText("Ürün Ekle");
        ekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButtonActionPerformed(evt);
            }
        });

        guncelleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guncelleButton.setText("Ürün Güncelle");
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        silButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        silButton.setText("Ürün Sil");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mesajYazisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kategoriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunIsmiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiyatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ekleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guncelleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(silButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(urunIsmiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekleButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kategoriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelleButton))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fiyatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silButton))
                .addGap(20, 20, 20)
                .addComponent(mesajYazisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        // mesaj yazısı kısmı sürekli güncellenebileceği için ilk başta boş bırakıyoruz
        mesajYazisiLabel.setText("");
        
        DefaultTableModel model = (DefaultTableModel) urunTable.getModel();

        // trim() ile baştaki ve sondaki boşlukları siliyoruz ve
        // ürün isminin boş bıraklıp bırakılmadığına bakıyoruz
        if (urunIsmiTextField.getText().trim().equals("")) {
            mesajYazisiLabel.setText("Ürün ismi boş bırakılamaz.");
        } else {
            Object[] eklenecek = {urunIsmiTextField.getText(), kategoriComboBox.getSelectedItem().toString(), fiyatTextField.getText()};
            
            model.addRow(eklenecek);
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        // mesaj yazısı kısmı sürekli güncellenebileceği için ilk başta boş bırakıyoruz
        mesajYazisiLabel.setText("");
        
        DefaultTableModel model = (DefaultTableModel) urunTable.getModel();
        
        int seciliRow = urunTable.getSelectedRow();

        // seciliRow -1 ise ya tablo boş ya da herhangi bir ürün seçilmemiştir
        if (seciliRow == -1) {
            if (urunTable.getRowCount() == 0) {
                mesajYazisiLabel.setText("Ürün tablosu şu anda boş.");
            } else {
                mesajYazisiLabel.setText("Lüften güncellenecek bir ürün seçin.");
            }
        } else {
            model.setValueAt(urunIsmiTextField.getText(), seciliRow, 0);
            model.setValueAt(kategoriComboBox.getSelectedItem().toString(), seciliRow, 1);
            model.setValueAt(fiyatTextField.getText(), seciliRow, 2);
            mesajYazisiLabel.setText("Ürün başarıyla güncellendi.");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisiLabel.setText("");
        
        DefaultTableModel model = (DefaultTableModel) urunTable.getModel();
        
        int seciliRow = urunTable.getSelectedRow();
        
        if (seciliRow == -1) {
            if (urunTable.getRowCount() == 0) {
                mesajYazisiLabel.setText("Ürün tablosu şu anda boş.");
            } else {
                mesajYazisiLabel.setText("Lüften silinecek bir ürün seçin.");
            }
        } else {
            model.removeRow(seciliRow);
            mesajYazisiLabel.setText("Ürün başarıyla silindi.");
        }
    }//GEN-LAST:event_silButtonActionPerformed

    private void urunTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunTableMouseClicked
        // tablo tıklanan bir yerin bilgilerini alma
        DefaultTableModel model = (DefaultTableModel) urunTable.getModel();
        
        int seciliRow = urunTable.getSelectedRow();
        
        urunIsmiTextField.setText(model.getValueAt(seciliRow, 0).toString());
        kategoriComboBox.setSelectedItem(model.getValueAt(seciliRow, 1).toString());
        fiyatTextField.setText(model.getValueAt(seciliRow, 2).toString());
    }//GEN-LAST:event_urunTableMouseClicked

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
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekleButton;
    private javax.swing.JTextField fiyatTextField;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategoriComboBox;
    private javax.swing.JLabel mesajYazisiLabel;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField urunIsmiTextField;
    private javax.swing.JTable urunTable;
    // End of variables declaration//GEN-END:variables
}