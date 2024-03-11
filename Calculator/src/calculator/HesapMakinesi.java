package calculator;

import javax.swing.JOptionPane;

public class HesapMakinesi extends javax.swing.JFrame {

    public HesapMakinesi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScreenPanel = new javax.swing.JPanel();
        ScreenTextField = new javax.swing.JTextField();
        sonuc_Label = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JPanel();
        yedi_Btn = new javax.swing.JButton();
        sekiz_Btn = new javax.swing.JButton();
        dokuz_Btn = new javax.swing.JButton();
        artı_Btn = new javax.swing.JButton();
        altı_Btn = new javax.swing.JButton();
        bes_Btn = new javax.swing.JButton();
        dort_Btn = new javax.swing.JButton();
        eksi_Btn = new javax.swing.JButton();
        uc_Btn = new javax.swing.JButton();
        iki_Btn = new javax.swing.JButton();
        bir_Btn = new javax.swing.JButton();
        carpi_Btn = new javax.swing.JButton();
        sifir_Btn = new javax.swing.JButton();
        esittir_Btn = new javax.swing.JButton();
        temizle_Btn = new javax.swing.JButton();
        bolme_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesap Makinesi");

        ScreenTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ScreenTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        sonuc_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sonuc_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout ScreenPanelLayout = new javax.swing.GroupLayout(ScreenPanel);
        ScreenPanel.setLayout(ScreenPanelLayout);
        ScreenPanelLayout.setHorizontalGroup(
            ScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScreenTextField)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ScreenPanelLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(sonuc_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ScreenPanelLayout.setVerticalGroup(
            ScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonuc_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScreenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ControlPanel.setLayout(new java.awt.GridLayout(4, 4, 20, 20));

        yedi_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yedi_Btn.setText("7");
        yedi_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yedi_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(yedi_Btn);

        sekiz_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sekiz_Btn.setText("8");
        sekiz_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sekiz_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(sekiz_Btn);

        dokuz_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dokuz_Btn.setText("9");
        dokuz_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokuz_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(dokuz_Btn);

        artı_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        artı_Btn.setText("+");
        artı_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artı_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(artı_Btn);

        altı_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        altı_Btn.setText("6");
        altı_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altı_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(altı_Btn);

        bes_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bes_Btn.setText("5");
        bes_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bes_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(bes_Btn);

        dort_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dort_Btn.setText("4");
        dort_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dort_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(dort_Btn);

        eksi_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eksi_Btn.setText("-");
        eksi_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksi_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(eksi_Btn);

        uc_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uc_Btn.setText("3");
        uc_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(uc_Btn);

        iki_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        iki_Btn.setText("2");
        iki_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iki_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(iki_Btn);

        bir_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bir_Btn.setText("1");
        bir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bir_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(bir_Btn);

        carpi_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        carpi_Btn.setText("*");
        carpi_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpi_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(carpi_Btn);

        sifir_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sifir_Btn.setText("0");
        sifir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifir_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(sifir_Btn);

        esittir_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        esittir_Btn.setText("=");
        esittir_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esittir_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(esittir_Btn);

        temizle_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        temizle_Btn.setText("C");
        temizle_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizle_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(temizle_Btn);

        bolme_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bolme_Btn.setText("/");
        bolme_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolme_BtnActionPerformed(evt);
            }
        });
        ControlPanel.add(bolme_Btn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yedi_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yedi_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "7");
    }//GEN-LAST:event_yedi_BtnActionPerformed

    private void sekiz_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sekiz_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "8");
    }//GEN-LAST:event_sekiz_BtnActionPerformed

    private void dokuz_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokuz_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "9");
    }//GEN-LAST:event_dokuz_BtnActionPerformed

    private void altı_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altı_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "6");
    }//GEN-LAST:event_altı_BtnActionPerformed

    private void bes_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bes_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "5");
    }//GEN-LAST:event_bes_BtnActionPerformed

    private void dort_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dort_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "4");
    }//GEN-LAST:event_dort_BtnActionPerformed

    private void uc_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "3");
    }//GEN-LAST:event_uc_BtnActionPerformed

    private void iki_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iki_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "2");
    }//GEN-LAST:event_iki_BtnActionPerformed

    private void bir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bir_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "1");
    }//GEN-LAST:event_bir_BtnActionPerformed

    private void sifir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifir_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "0");
    }//GEN-LAST:event_sifir_BtnActionPerformed

    private void artı_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artı_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "+");
    }//GEN-LAST:event_artı_BtnActionPerformed

    private void eksi_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksi_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "-");
    }//GEN-LAST:event_eksi_BtnActionPerformed

    private void carpi_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpi_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "*");
    }//GEN-LAST:event_carpi_BtnActionPerformed

    private void bolme_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolme_BtnActionPerformed
        ScreenTextField.setText(ScreenTextField.getText() + "/");
    }//GEN-LAST:event_bolme_BtnActionPerformed

    private void temizle_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizle_BtnActionPerformed
        ScreenTextField.setText("");
    }//GEN-LAST:event_temizle_BtnActionPerformed

    private String calculate(String sayi1, String sayi2, char c) {
        double sonuc = 0;
        if (c == '+') {
            sonuc = Double.valueOf(sayi1) + Double.valueOf(sayi2);
        } else if (c == '-') {
            sonuc = Double.valueOf(sayi1) - Double.valueOf(sayi2);
        } else if (c == '*') {
            sonuc = Double.valueOf(sayi1) * Double.valueOf(sayi2);
        } else if (c == '/') {
            sonuc = Double.valueOf(sayi1) / Double.valueOf(sayi2);
        } else {
            JOptionPane.showMessageDialog(this, "Gecersiz İşlem!");
        }
        return String.valueOf(sonuc);
    }

    private void esittir_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esittir_BtnActionPerformed
        String sayi1 = "";
        String sayi2 = "";
        String sonuc = "";
        char islem = 32;
        boolean kontrol = false;
        for (char c : ScreenTextField.getText().toCharArray()) {

            if (c >= '0' && c <= '9') {
                if (!kontrol) {
                    sayi1 += c;
                }
                if (kontrol) {
                    sayi2 += c;
                }
            }

            if (c >= 42 && c <= 47) {
                islem = c;
                kontrol = true;
            }
        }
        sonuc = calculate(sayi1, sayi2, islem);
        sonuc_Label.setText(sonuc);
        ScreenTextField.setText(sonuc);
    }//GEN-LAST:event_esittir_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel ScreenPanel;
    private javax.swing.JTextField ScreenTextField;
    private javax.swing.JButton altı_Btn;
    private javax.swing.JButton artı_Btn;
    private javax.swing.JButton bes_Btn;
    private javax.swing.JButton bir_Btn;
    private javax.swing.JButton bolme_Btn;
    private javax.swing.JButton carpi_Btn;
    private javax.swing.JButton dokuz_Btn;
    private javax.swing.JButton dort_Btn;
    private javax.swing.JButton eksi_Btn;
    private javax.swing.JButton esittir_Btn;
    private javax.swing.JButton iki_Btn;
    private javax.swing.JButton sekiz_Btn;
    private javax.swing.JButton sifir_Btn;
    private javax.swing.JLabel sonuc_Label;
    private javax.swing.JButton temizle_Btn;
    private javax.swing.JButton uc_Btn;
    private javax.swing.JButton yedi_Btn;
    // End of variables declaration//GEN-END:variables
}
