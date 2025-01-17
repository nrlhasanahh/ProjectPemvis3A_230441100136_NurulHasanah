/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

/**
 *
 * @author Fadila Nur Habibah
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public void setWelcomeMessage(String username) {
        labelUcapan1.setText("Selamat datang, " + username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new untukpraktikum5.GradientRoundedPanel();
        btnNext = new rojerusan.RSMaterialButtonRectangle();
        gambarHome2 = new javax.swing.JLabel();
        gambarHome4 = new javax.swing.JLabel();
        gambarHome5 = new javax.swing.JLabel();
        gambarHome6 = new javax.swing.JLabel();
        labelUcapan1 = new javax.swing.JLabel();
        gambarHome3 = new javax.swing.JLabel();
        labelUcapan2 = new javax.swing.JLabel();
        labelUcapan3 = new javax.swing.JLabel();
        labelUcapan4 = new javax.swing.JLabel();
        gambarHome7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Home.setColorEnd(new java.awt.Color(153, 153, 255));
        Home.setColorStart(new java.awt.Color(255, 153, 153));
        Home.setLayout(null);

        btnNext.setBackground(new java.awt.Color(0, 0, 102));
        btnNext.setText("N E X T");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        Home.add(btnNext);
        btnNext.setBounds(570, 450, 260, 70);

        gambarHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/home3.png"))); // NOI18N
        Home.add(gambarHome2);
        gambarHome2.setBounds(850, 290, 80, 70);

        gambarHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/home.png"))); // NOI18N
        Home.add(gambarHome4);
        gambarHome4.setBounds(470, 400, 180, 190);

        gambarHome5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/home.png"))); // NOI18N
        Home.add(gambarHome5);
        gambarHome5.setBounds(790, 400, 180, 190);

        gambarHome6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/home1.png"))); // NOI18N
        Home.add(gambarHome6);
        gambarHome6.setBounds(930, 70, 210, 200);

        labelUcapan1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelUcapan1.setText("Selamat Datang");
        Home.add(labelUcapan1);
        labelUcapan1.setBounds(420, 160, 640, 64);

        gambarHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/home4.png"))); // NOI18N
        Home.add(gambarHome3);
        gambarHome3.setBounds(280, 120, 140, 180);

        labelUcapan2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        labelUcapan2.setText("\"Terima kasih telah bergabung dengan kami\"");
        Home.add(labelUcapan2);
        labelUcapan2.setBounds(470, 240, 490, 30);

        labelUcapan3.setFont(new java.awt.Font("Palatino Linotype", 1, 60)); // NOI18N
        labelUcapan3.setForeground(new java.awt.Color(255, 255, 255));
        labelUcapan3.setText("B A T I K");
        Home.add(labelUcapan3);
        labelUcapan3.setBounds(570, 290, 270, 90);

        labelUcapan4.setFont(new java.awt.Font("Palatino Linotype", 3, 50)); // NOI18N
        labelUcapan4.setText("Warisan budaya, tren masa kini!");
        Home.add(labelUcapan4);
        labelUcapan4.setBounds(330, 370, 770, 70);

        gambarHome7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/home3.png"))); // NOI18N
        Home.add(gambarHome7);
        gambarHome7.setBounds(460, 280, 80, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 1410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        Desain desain = new Desain();
        desain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private untukpraktikum5.GradientRoundedPanel Home;
    private rojerusan.RSMaterialButtonRectangle btnNext;
    private javax.swing.JLabel gambarHome2;
    private javax.swing.JLabel gambarHome3;
    private javax.swing.JLabel gambarHome4;
    private javax.swing.JLabel gambarHome5;
    private javax.swing.JLabel gambarHome6;
    private javax.swing.JLabel gambarHome7;
    private javax.swing.JLabel labelUcapan1;
    private javax.swing.JLabel labelUcapan2;
    private javax.swing.JLabel labelUcapan3;
    private javax.swing.JLabel labelUcapan4;
    // End of variables declaration//GEN-END:variables
}
