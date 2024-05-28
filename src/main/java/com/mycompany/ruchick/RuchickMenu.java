/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ruchick;

import java.awt.Color;

/**
 *
 * @author Lenovo
 */
public class RuchickMenu extends javax.swing.JFrame {

    /**
     * Creates new form RuchickMenu
     */
    Color DefaultColor, ClickedColor, FontColor;
    public RuchickMenu() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); // Fullscreen
        DefaultColor = new Color(139,146,178);
        ClickedColor = new Color(242,242,242);
        FontColor = new Color(40,40,100);
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
        jPanel3 = new javax.swing.JPanel();
        AllMenuButton = new javax.swing.JButton();
        FoodsButton = new javax.swing.JButton();
        btn_paket = new javax.swing.JButton();
        DrinksButton = new javax.swing.JButton();
        jDesktopPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(139, 146, 178));

        jPanel3.setBackground(new java.awt.Color(40, 40, 100));

        AllMenuButton.setBackground(new java.awt.Color(139, 146, 178));
        AllMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AllMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        AllMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AllMenu.png"))); // NOI18N
        AllMenuButton.setText("Semua Menu");
        AllMenuButton.setBorder(null);
        AllMenuButton.setBorderPainted(false);
        AllMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllMenuButtonActionPerformed(evt);
            }
        });

        FoodsButton.setBackground(new java.awt.Color(139, 146, 178));
        FoodsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FoodsButton.setForeground(new java.awt.Color(255, 255, 255));
        FoodsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FriedChicken.png"))); // NOI18N
        FoodsButton.setText("Makanan");
        FoodsButton.setBorder(null);
        FoodsButton.setBorderPainted(false);
        FoodsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodsButtonActionPerformed(evt);
            }
        });

        btn_paket.setBackground(new java.awt.Color(139, 146, 178));
        btn_paket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_paket.setForeground(new java.awt.Color(255, 255, 255));
        btn_paket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FoodBar.png"))); // NOI18N
        btn_paket.setText("Paket");
        btn_paket.setBorder(null);
        btn_paket.setBorderPainted(false);
        btn_paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paketActionPerformed(evt);
            }
        });

        DrinksButton.setBackground(new java.awt.Color(139, 146, 178));
        DrinksButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DrinksButton.setForeground(new java.awt.Color(255, 255, 255));
        DrinksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Food.png"))); // NOI18N
        DrinksButton.setText("Minuman");
        DrinksButton.setBorder(null);
        DrinksButton.setBorderPainted(false);
        DrinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinksButtonActionPerformed(evt);
            }
        });

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AllMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FoodsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(DrinksButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(btn_paket, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(AllMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FoodsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(DrinksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_paket, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
            .addComponent(jDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RuChick Menu");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 225, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoruchick.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(1051, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void DrinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinksButtonActionPerformed
        // TODO add your handling code here:
        AllMenuButton.setBackground(DefaultColor);
        AllMenuButton.setForeground(Color.white);
        FoodsButton.setBackground(DefaultColor);
        FoodsButton.setForeground(Color.white);
        DrinksButton.setBackground(ClickedColor);
        DrinksButton.setForeground(FontColor);
        btn_paket.setBackground(DefaultColor);
        btn_paket.setForeground(Color.white);

    }//GEN-LAST:event_DrinksButtonActionPerformed

    private void AllMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllMenuButtonActionPerformed
        // TODO add your handling code here:
        AllMenuButton.setBackground(ClickedColor);
        AllMenuButton.setForeground(FontColor);
        FoodsButton.setBackground(DefaultColor);
        FoodsButton.setForeground(Color.white);
        DrinksButton.setBackground(DefaultColor);
        DrinksButton.setForeground(Color.white);
        btn_paket.setBackground(DefaultColor);
        btn_paket.setForeground(Color.white);
//        Menu_All menuPanel = new Menu_All();
//        jDesktopPanel.removeAll();
//        jDesktopPanel.add(menuPanel).setVisible(true);
    }//GEN-LAST:event_AllMenuButtonActionPerformed

    private void FoodsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodsButtonActionPerformed
        // TODO add your handling code here:
        AllMenuButton.setBackground(DefaultColor);
        AllMenuButton.setForeground(Color.white);
        FoodsButton.setBackground(ClickedColor);
        FoodsButton.setForeground(FontColor);
        DrinksButton.setBackground(DefaultColor);
        DrinksButton.setForeground(Color.white);
        btn_paket.setBackground(DefaultColor);
        btn_paket.setForeground(Color.white);
    }//GEN-LAST:event_FoodsButtonActionPerformed

    private void btn_paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paketActionPerformed
        // TODO add your handling code here:
        AllMenuButton.setBackground(DefaultColor);
        AllMenuButton.setForeground(Color.white);
        FoodsButton.setBackground(DefaultColor);
        FoodsButton.setForeground(Color.white);
        DrinksButton.setBackground(DefaultColor);
        DrinksButton.setForeground(Color.white);
        btn_paket.setBackground(ClickedColor);
        btn_paket.setForeground(FontColor);
    }//GEN-LAST:event_btn_paketActionPerformed

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
            java.util.logging.Logger.getLogger(RuchickMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RuchickMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RuchickMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RuchickMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RuchickMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllMenuButton;
    private javax.swing.JButton DrinksButton;
    private javax.swing.JButton FoodsButton;
    private javax.swing.JButton btn_paket;
    private javax.swing.JPanel jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}