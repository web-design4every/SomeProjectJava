/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Exercise3 extends javax.swing.JFrame {

    /**
     * Creates new form Exercise3
     */
    public Exercise3() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtn1);
        bg.add(rbtn2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txta = new javax.swing.JTextField();
        btnTong = new javax.swing.JButton();
        btnCountN = new javax.swing.JButton();
        btnCountC = new javax.swing.JButton();
        btnCountW = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnTong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTong.setText("Tong");
        btnTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongActionPerformed(evt);
            }
        });

        btnCountN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCountN.setText("Count number");
        btnCountN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountNActionPerformed(evt);
            }
        });

        btnCountC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCountC.setText("Count char");
        btnCountC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountCActionPerformed(evt);
            }
        });

        btnCountW.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCountW.setText("Count word");
        btnCountW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountWActionPerformed(evt);
            }
        });

        btnSort.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSort.setText("Sort word");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        rbtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtn1.setText("Ascending");

        rbtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtn2.setText("Descending");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCountW)
                    .addComponent(btnCountC)
                    .addComponent(btnCountN)
                    .addComponent(btnTong)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSort)
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn2)
                            .addComponent(rbtn1))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnTong)
                .addGap(28, 28, 28)
                .addComponent(btnCountN)
                .addGap(33, 33, 33)
                .addComponent(btnCountC)
                .addGap(32, 32, 32)
                .addComponent(btnCountW)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSort)
                    .addComponent(rbtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongActionPerformed
        String str = txta.getText();
        String temp = "";   
        int sum = 0; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if (Character.isDigit(ch))  
                temp += ch;  
                sum += Integer.parseInt(temp);
                temp="0";
        }
        JOptionPane.showMessageDialog(null, "Sum of the numbers in the txtInput: " + sum);
    }//GEN-LAST:event_btnTongActionPerformed

    private void btnCountNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountNActionPerformed
        String str = txta.getText();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))  
                count++;
        }
        JOptionPane.showMessageDialog(null, "Number of the characters as a number: " + count);
    }//GEN-LAST:event_btnCountNActionPerformed

    private void btnCountCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountCActionPerformed
        String str = txta.getText();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch))  
                count++;
        }
        JOptionPane.showMessageDialog(null, "Number of the characters as a number: " + count);
    }//GEN-LAST:event_btnCountCActionPerformed

    private void btnCountWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountWActionPerformed
        int wordCount = 0;
        String s = txta.getText();
        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        JOptionPane.showMessageDialog(null, "Number of the characters as a number: " + wordCount);
    }//GEN-LAST:event_btnCountWActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        String str = txta.getText();
        String[] str1 = str.split("\\s");
        String s="";
        for (int i = 0; i < str1.length; i++) {
            for (int j = i + 1; j < str1.length; j++) {
                if (str1[i].length() > str1[j].length()) {
                    String temp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp;
                }
            }
        }
        if (rbtn1.isSelected()) {
            for (int i = 0; i < str1.length; i++) {
                s+=str1[i]+" ";
            }
            JOptionPane.showMessageDialog(null, "Sort word in ascending order of length: " + s);
        }
        if (rbtn2.isSelected()) {
            for (int i = str1.length - 1; i >=0; i--) {
                s+=str1[i]+" ";
            }
            JOptionPane.showMessageDialog(null, "Sort word in descending order of length: " + s);
        }
    }//GEN-LAST:event_btnSortActionPerformed

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
            java.util.logging.Logger.getLogger(Exercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercise3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCountC;
    private javax.swing.JButton btnCountN;
    private javax.swing.JButton btnCountW;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnTong;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JTextField txta;
    // End of variables declaration//GEN-END:variables
}
