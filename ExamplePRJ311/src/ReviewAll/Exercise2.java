/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewAll;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 *
 * @author Namhb
 */
public class Exercise2 extends javax.swing.JFrame {

    /**
     * Creates new form Exercise2
     */
    public Exercise2() {
        initComponents();
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rbLeft);
        bg1.add(rbRight);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(rbfore);
        bg2.add(rbBackground);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMain = new javax.swing.JLabel();
        rbRight = new javax.swing.JRadioButton();
        rbLeft = new javax.swing.JRadioButton();
        btnStart = new javax.swing.JButton();
        rbfore = new javax.swing.JRadioButton();
        rbBackground = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMain.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMain.setForeground(new java.awt.Color(255, 51, 51));
        lblMain.setText("Hello everyone");
        lblMain.setOpaque(true);

        rbRight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbRight.setText("Move Right");

        rbLeft.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbLeft.setText("Move Left");

        btnStart.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        rbfore.setForeground(new java.awt.Color(51, 51, 255));
        rbfore.setText("Change color");

        rbBackground.setBackground(new java.awt.Color(255, 153, 153));
        rbBackground.setForeground(new java.awt.Color(51, 51, 255));
        rbBackground.setText("Change background color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbLeft)
                    .addComponent(rbRight))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnStart))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBackground)
                            .addComponent(rbfore))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rbRight)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(rbLeft))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblMain)))
                .addGap(20, 20, 20)
                .addComponent(btnStart)
                .addGap(18, 18, 18)
                .addComponent(rbfore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbBackground)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setDefault() {
        lblMain.setForeground(Color.RED);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.BLUE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.GREEN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.YELLOW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.PINK);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setRightFore() {
        lblMain.setForeground(Color.RED);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.BLUE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.GREEN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.YELLOW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setLeftFore() {
        lblMain.setForeground(Color.RED);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.YELLOW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.GREEN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setForeground(Color.BLUE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setRightBack() {
        lblMain.setForeground(Color.BLACK);
        lblMain.setBackground(Color.RED);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setBackground(Color.BLUE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setBackground(Color.GREEN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setBackground(Color.YELLOW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setLeftBack() {
        lblMain.setForeground(Color.BLACK);
        lblMain.setBackground(Color.RED);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setBackground(Color.YELLOW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setBackground(Color.GREEN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMain.setBackground(Color.BLUE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercise2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        Thread Main = new Thread(new Thread() {
            public void run() {
                for (int i = 10;; i--) {
                    if (rbRight.isSelected()) {
                        if (rbfore.isSelected()) {
                            setRightFore();
                        } else if (rbBackground.isSelected()) {
                            setRightBack();
                        } else {
                            setDefault();
                        }
                    } else if (rbLeft.isSelected()) {
                        if (rbfore.isSelected()) {
                            setLeftFore();
                        } else if (rbBackground.isSelected()) {
                            setLeftBack();
                        } else {
                            setDefault();
                        }
                    } else {
                        setDefault();
                    }
                }
            }
        });
        Main.start();
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(Exercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercise2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblMain;
    private javax.swing.JRadioButton rbBackground;
    private javax.swing.JRadioButton rbLeft;
    private javax.swing.JRadioButton rbRight;
    private javax.swing.JRadioButton rbfore;
    // End of variables declaration//GEN-END:variables
}
