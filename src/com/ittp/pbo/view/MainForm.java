/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ittp.pbo.view;

/**
 *
 * @author MHIKAM
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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
        btnEntry = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnKTerparkir = new javax.swing.JButton();
        btnKTerdaftar = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 216));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentRemoved(evt);
            }
        });

        btnEntry.setBackground(new java.awt.Color(255, 255, 153));
        btnEntry.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        btnEntry.setForeground(new java.awt.Color(102, 102, 102));
        btnEntry.setText("Parkirkan Kendaraan");
        btnEntry.setBorderPainted(false);
        btnEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntryActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 153));
        btnExit.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 102, 102));
        btnExit.setText("Keluarkan Kendaraan");
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDetail.setBackground(new java.awt.Color(255, 255, 153));
        btnDetail.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        btnDetail.setForeground(new java.awt.Color(102, 102, 102));
        btnDetail.setText("Detail Parkir");
        btnDetail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setFont(new java.awt.Font("Gotham", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 223, 150));
        jLabel1.setText("Manajemen");

        jLabel2.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(175, 163, 73));
        jLabel2.setText("TPQ Al-Munawar");

        jLabel3.setFont(new java.awt.Font("Gotham", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 191, 81));
        jLabel3.setText("Loket Parkir");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-parking-lot-vector-png-image_6897193 (1).png"))); // NOI18N

        btnKTerparkir.setBackground(new java.awt.Color(255, 255, 153));
        btnKTerparkir.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        btnKTerparkir.setForeground(new java.awt.Color(102, 102, 102));
        btnKTerparkir.setText("Lihat Kendaraan Terparkir");
        btnKTerparkir.setBorderPainted(false);
        btnKTerparkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKTerparkirActionPerformed(evt);
            }
        });

        btnKTerdaftar.setBackground(new java.awt.Color(255, 255, 153));
        btnKTerdaftar.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        btnKTerdaftar.setForeground(new java.awt.Color(102, 102, 102));
        btnKTerdaftar.setText("Lihat Kendaraan Terdaftar");
        btnKTerdaftar.setBorderPainted(false);
        btnKTerdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKTerdaftarActionPerformed(evt);
            }
        });

        btnStaff.setBackground(new java.awt.Color(255, 255, 153));
        btnStaff.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(102, 102, 102));
        btnStaff.setText("Lihat Akun Staff");
        btnStaff.setBorderPainted(false);
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKTerparkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnKTerdaftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(btnEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnKTerparkir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKTerdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntryActionPerformed
        // TODO add your handling code here:
            EntryForm entryform = new EntryForm();
            entryform.setVisible(true);
            setVisible(false); 
    }//GEN-LAST:event_btnEntryActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
            DetailForm detailform = new DetailForm();
            detailform.setVisible(true);
            setVisible(false); 
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
            ExitForm exitform = new ExitForm();
            exitform.setVisible(true);
            setVisible(false); 
    }//GEN-LAST:event_btnExitActionPerformed

    private void jPanel1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentRemoved

    private void btnKTerparkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKTerparkirActionPerformed
        // TODO add your handling code here:
        TerparkirForm terparkirform = new TerparkirForm();
        terparkirform.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btnKTerparkirActionPerformed

    private void btnKTerdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKTerdaftarActionPerformed
        // TODO add your handling code here:
        TerdaftarForm terdaftarform = new TerdaftarForm();
        terdaftarform.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnKTerdaftarActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        // TODO add your handling code here:
        StaffForm staffform = new StaffForm();
        staffform.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnStaffActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnEntry;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKTerdaftar;
    private javax.swing.JButton btnKTerparkir;
    private javax.swing.JButton btnStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
