/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.event.KeyEvent;

/**
 *
 * @author Fadila Nur Habibah
 */
public class jarikNew extends javax.swing.JFrame {

    /**
     * Creates new form jarikNew
     */
    public jarikNew() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelJaket = new untukpraktikum5.GradientRoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backJaket = new rojerusan.RSMaterialButtonRectangle();
        bayarJarik = new rojerusan.RSMaterialButtonRectangle();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jarik1 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        TFjarik1 = new javax.swing.JTextField();
        jarik2 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        TFjarik2 = new javax.swing.JTextField();
        jarik3 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        TFjarik3 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        TFjarik4 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jarik6 = new javax.swing.JRadioButton();
        jarik4 = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        TFjarik6 = new javax.swing.JTextField();
        jarik5 = new javax.swing.JRadioButton();
        TFjarik5 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(903, 1563));

        panelJaket.setColorEnd(new java.awt.Color(153, 153, 255));
        panelJaket.setColorStart(new java.awt.Color(255, 153, 153));
        panelJaket.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FashionJarik/jarik5.png"))); // NOI18N
        panelJaket.add(jLabel3);
        jLabel3.setBounds(350, 570, 190, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FashionJarik/jarik6.png"))); // NOI18N
        panelJaket.add(jLabel4);
        jLabel4.setBounds(640, 570, 190, 190);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FashionJarik/jarik2.png"))); // NOI18N
        panelJaket.add(jLabel5);
        jLabel5.setBounds(350, 210, 190, 190);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FashionJarik/jarik1.png"))); // NOI18N
        panelJaket.add(jLabel6);
        jLabel6.setBounds(70, 210, 190, 190);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FashionJarik/jarik3.png"))); // NOI18N
        panelJaket.add(jLabel7);
        jLabel7.setBounds(630, 210, 190, 190);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FashionJarik/jarik4.png"))); // NOI18N
        panelJaket.add(jLabel8);
        jLabel8.setBounds(70, 570, 190, 190);

        backJaket.setBackground(new java.awt.Color(0, 0, 102));
        backJaket.setText("B A C K");
        backJaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJaketActionPerformed(evt);
            }
        });
        panelJaket.add(backJaket);
        backJaket.setBounds(150, 940, 240, 70);

        bayarJarik.setBackground(new java.awt.Color(0, 0, 102));
        bayarJarik.setText("B A Y A R");
        bayarJarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarJarikActionPerformed(evt);
            }
        });
        panelJaket.add(bayarJarik);
        bayarJarik.setBounds(490, 940, 240, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 3, 60)); // NOI18N
        jLabel1.setText("BATIK JARIK");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(210, 40, 390, 110);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/home1.png"))); // NOI18N
        jPanel2.add(jLabel32);
        jLabel32.setBounds(570, 0, 210, 170);

        panelJaket.add(jPanel2);
        jPanel2.setBounds(0, 0, 890, 160);

        jarik1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jarik1.setText("Batik Jarik Biru Bunga");
        jarik1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarik1ActionPerformed(evt);
            }
        });
        panelJaket.add(jarik1);
        jarik1.setBounds(40, 400, 240, 30);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("Jarik Traditional from Indonesia");
        panelJaket.add(jLabel33);
        jLabel33.setBounds(60, 430, 210, 30);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("Rp 380.000");
        panelJaket.add(jLabel34);
        jLabel34.setBounds(120, 460, 90, 20);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("JUMLAH");
        panelJaket.add(jLabel36);
        jLabel36.setBounds(70, 490, 80, 30);

        TFjarik1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFjarik1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFjarik1KeyTyped(evt);
            }
        });
        panelJaket.add(TFjarik1);
        TFjarik1.setBounds(160, 490, 90, 30);

        jarik2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jarik2.setText("Batik Jarik Merah");
        jarik2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarik2ActionPerformed(evt);
            }
        });
        panelJaket.add(jarik2);
        jarik2.setBounds(350, 400, 210, 30);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setText("Jarik Traditional from Indonesia");
        panelJaket.add(jLabel37);
        jLabel37.setBounds(350, 430, 210, 30);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("Rp 270.000");
        panelJaket.add(jLabel38);
        jLabel38.setBounds(400, 460, 90, 20);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setText("JUMLAH");
        panelJaket.add(jLabel40);
        jLabel40.setBounds(350, 490, 80, 30);

        TFjarik2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFjarik2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFjarik2KeyTyped(evt);
            }
        });
        panelJaket.add(TFjarik2);
        TFjarik2.setBounds(440, 490, 90, 30);

        jarik3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jarik3.setText("Batik Jarik Hitam Abu");
        jarik3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarik3ActionPerformed(evt);
            }
        });
        panelJaket.add(jarik3);
        jarik3.setBounds(610, 400, 230, 30);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setText("Rp 350.000");
        panelJaket.add(jLabel42);
        jLabel42.setBounds(680, 460, 90, 20);

        TFjarik3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFjarik3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFjarik3KeyTyped(evt);
            }
        });
        panelJaket.add(TFjarik3);
        TFjarik3.setBounds(720, 490, 90, 30);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setText("Jarik Traditional from Indonesia");
        panelJaket.add(jLabel43);
        jLabel43.setBounds(630, 430, 210, 30);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setText("JUMLAH");
        panelJaket.add(jLabel44);
        jLabel44.setBounds(630, 490, 80, 30);

        TFjarik4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFjarik4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFjarik4KeyTyped(evt);
            }
        });
        panelJaket.add(TFjarik4);
        TFjarik4.setBounds(170, 850, 90, 30);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setText("JUMLAH");
        panelJaket.add(jLabel46);
        jLabel46.setBounds(640, 850, 80, 30);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setText("Rp 250.000");
        panelJaket.add(jLabel49);
        jLabel49.setBounds(410, 820, 90, 20);

        jarik6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jarik6.setText("Batik Jarik Abu Motif");
        jarik6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarik6ActionPerformed(evt);
            }
        });
        panelJaket.add(jarik6);
        jarik6.setBounds(630, 760, 220, 30);

        jarik4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jarik4.setText("Batik Jarik Hitam Coklat");
        jarik4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarik4ActionPerformed(evt);
            }
        });
        panelJaket.add(jarik4);
        jarik4.setBounds(50, 760, 240, 30);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setText("JUMLAH");
        panelJaket.add(jLabel51);
        jLabel51.setBounds(360, 850, 80, 30);

        TFjarik6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFjarik6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFjarik6KeyTyped(evt);
            }
        });
        panelJaket.add(TFjarik6);
        TFjarik6.setBounds(730, 850, 90, 30);

        jarik5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jarik5.setText("Batik Jarik Coklat Motif");
        jarik5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarik5ActionPerformed(evt);
            }
        });
        panelJaket.add(jarik5);
        jarik5.setBounds(330, 760, 240, 30);

        TFjarik5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TFjarik5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFjarik5ActionPerformed(evt);
            }
        });
        TFjarik5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFjarik5KeyTyped(evt);
            }
        });
        panelJaket.add(TFjarik5);
        TFjarik5.setBounds(450, 850, 90, 30);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel54.setText("JUMLAH");
        panelJaket.add(jLabel54);
        jLabel54.setBounds(80, 850, 80, 30);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel55.setText("Rp 300.000");
        panelJaket.add(jLabel55);
        jLabel55.setBounds(130, 820, 90, 20);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setText("Rp290.000");
        panelJaket.add(jLabel56);
        jLabel56.setBounds(690, 820, 90, 20);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setText("Jarik Traditional from Indonesia");
        panelJaket.add(jLabel47);
        jLabel47.setBounds(80, 790, 210, 30);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setText("Jarik Traditional from Indonesia");
        panelJaket.add(jLabel48);
        jLabel48.setBounds(350, 790, 210, 30);

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setText("Jarik Traditional from Indonesia");
        panelJaket.add(jLabel53);
        jLabel53.setBounds(630, 790, 210, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelJaket, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelJaket, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backJaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJaketActionPerformed
        // TODO add your handling code here:
        Desain desain = new Desain();
        desain.getTabbedPane().setSelectedIndex(1);
        desain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backJaketActionPerformed

    private void bayarJarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarJarikActionPerformed
        // TODO add your handling code here:
        int total = 0;
        try {
            if (jarik1.isSelected()) {
                int jumlah = Integer.parseInt(TFjarik1.getText());
                if (jumlah <= 0) {
                    throw new NumberFormatException("Jumlah jaket harus lebih dari nol.");
                }
                total += 380000 * jumlah;
            }

            if (jarik2.isSelected()) {
                int jumlah = Integer.parseInt(TFjarik2.getText());
                if (jumlah <= 0) {
                    throw new NumberFormatException("Jumlah jaket harus lebih dari nol.");
                }
                total += 270000 * jumlah;
            }

            if (jarik3.isSelected()) {
                int jumlah = Integer.parseInt(TFjarik3.getText());
                if (jumlah <= 0) {
                    throw new NumberFormatException("Jumlah jaket harus lebih dari nol.");
                }
                total += 350000 * jumlah;
            }

            if (jarik4.isSelected()) {
                int jumlah = Integer.parseInt(TFjarik4.getText());
                if (jumlah <= 0) {
                    throw new NumberFormatException("Jumlah jaket harus lebih dari nol.");
                }
                total += 300000 * jumlah;
            }

            if (jarik5.isSelected()) {
                int jumlah = Integer.parseInt(TFjarik5.getText());
                if (jumlah <= 0) {
                    throw new NumberFormatException("Jumlah jaket harus lebih dari nol.");
                }
                total += 250000 * jumlah;
            }

            if (jarik6.isSelected()) {
                int jumlah = Integer.parseInt(TFjarik6.getText());
                if (jumlah <= 0) {
                    throw new NumberFormatException("Jumlah jaket harus lebih dari nol.");
                }
                total += 290000 * jumlah;
            }

            if (total == 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Pilih setidaknya satu harga dan jumlah produk!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            Pembayaran pembayaran = new Pembayaran();
            pembayaran.setTotal("Rp " + total); 
            pembayaran.setVisible(true); 
            this.dispose();

        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Masukkan jumlah yang sesuai! " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bayarJarikActionPerformed

    private void jarik1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarik1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jarik1ActionPerformed

    private void jarik2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarik2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jarik2ActionPerformed

    private void jarik3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarik3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jarik3ActionPerformed

    private void jarik6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarik6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jarik6ActionPerformed

    private void jarik4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarik4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jarik4ActionPerformed

    private void jarik5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarik5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jarik5ActionPerformed

    private void TFjarik5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFjarik5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFjarik5ActionPerformed

    private void TFjarik1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjarik1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_TFjarik1KeyTyped

    private void TFjarik2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjarik2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_TFjarik2KeyTyped

    private void TFjarik3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjarik3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_TFjarik3KeyTyped

    private void TFjarik4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjarik4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_TFjarik4KeyTyped

    private void TFjarik5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjarik5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_TFjarik5KeyTyped

    private void TFjarik6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjarik6KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
           evt.consume(); 
        }
    }//GEN-LAST:event_TFjarik6KeyTyped

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
            java.util.logging.Logger.getLogger(jarikNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jarikNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jarikNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jarikNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jarikNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFjarik1;
    private javax.swing.JTextField TFjarik2;
    private javax.swing.JTextField TFjarik3;
    private javax.swing.JTextField TFjarik4;
    private javax.swing.JTextField TFjarik5;
    private javax.swing.JTextField TFjarik6;
    private rojerusan.RSMaterialButtonRectangle backJaket;
    private rojerusan.RSMaterialButtonRectangle bayarJarik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jarik1;
    private javax.swing.JRadioButton jarik2;
    private javax.swing.JRadioButton jarik3;
    private javax.swing.JRadioButton jarik4;
    private javax.swing.JRadioButton jarik5;
    private javax.swing.JRadioButton jarik6;
    private untukpraktikum5.GradientRoundedPanel panelJaket;
    // End of variables declaration//GEN-END:variables
}