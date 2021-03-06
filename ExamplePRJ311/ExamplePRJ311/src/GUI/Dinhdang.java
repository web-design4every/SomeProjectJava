/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class Dinhdang extends javax.swing.JFrame implements DocumentListener{

    /**
     * Creates new form Dinhdang
     */
    public Dinhdang() {
        initComponents();
        txta.getDocument().addDocumentListener(this);
        txtd.getDocument().addDocumentListener(this);
        btnXoa.setVisible(false);
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

        lblTittle = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        lblb = new javax.swing.JLabel();
        lblc = new javax.swing.JLabel();
        lbld = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        cboMau = new javax.swing.JComboBox<>();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        txtd = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(0, 0, 255));
        lblTittle.setText("Dinh Dang Du Lieu");

        lbla.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbla.setText("Noi dunh dinh dang:");

        lblb.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblb.setText("Chon mau chu:");

        lblc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblc.setText("Chon kieu chu:");

        lbld.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbld.setText("Chon co chu: ");

        txta.setColumns(20);
        txta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txta.setRows(5);
        txta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txta);

        cboMau.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        cboMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mau do", "Mau xanh", "Mau luc", "Mau vang", "Mau xam", "Mau den", " " }));
        cboMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMauActionPerformed(evt);
            }
        });

        rbtn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rbtn1.setText("Chu dam");
        rbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn1ActionPerformed(evt);
            }
        });

        rbtn2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        rbtn2.setText("Chu nghieng");
        rbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn2ActionPerformed(evt);
            }
        });

        txtd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdFocusLost(evt);
            }
        });
        txtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnExit.setText("Thoat");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblb)
                            .addComponent(lbld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtn2)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(txtd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(436, 436, 436)
                                .addComponent(btnXoa)
                                .addGap(26, 26, 26)
                                .addComponent(btnExit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTittle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblb)
                                .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbla))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblc)
                            .addComponent(rbtn1)
                            .addComponent(rbtn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbld)
                            .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnExit))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        txta.setText("");
        txtd.setText("");
        txta.setFont(new Font("Arial", Font.BOLD, 18));
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "May co muon thoat ko?","Thong bao",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                System.exit(0);
            }
    }//GEN-LAST:event_btnExitActionPerformed

    private void cboMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMauActionPerformed
        int s = cboMau.getSelectedIndex();
                switch(s){
                    case 0:
                        txta.setForeground(Color.red);
                        break;
                    case 1:
                        txta.setForeground(Color.blue);
                        break;
                    case 2:
                        txta.setForeground(Color.green);
                        break;
                    case 3:
                        txta.setForeground(Color.yellow);
                        break;
                    case 4:
                        txta.setForeground(Color.GRAY);
                        break;
                    case 5:
                        txta.setForeground(Color.black);
                        break;
                }
    }//GEN-LAST:event_cboMauActionPerformed

    private void rbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn1ActionPerformed
        if (txtd.getText().isEmpty()) {
                    txta.setFont(new Font("Arial", Font.BOLD, 18));
            }else{
                    txta.setFont(new Font("Arial", Font.BOLD, Integer.valueOf(txtd.getText())));
            }
    }//GEN-LAST:event_rbtn1ActionPerformed

    private void rbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn2ActionPerformed
         if (txtd.getText().isEmpty()) {
                    txta.setFont(new Font("Arial", Font.ITALIC, 18));
            }else{
                txta.setFont(new Font("Arial", Font.ITALIC, Integer.valueOf(txtd.getText())));
            }
    }//GEN-LAST:event_rbtn2ActionPerformed

    private void txtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdActionPerformed
        int a;
        try {
            a = Integer.parseInt(txtd.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Wrong invalid integer");
            return;
        }
        if (rbtn1.isSelected()) {
            txta.setFont(new Font("Arial", Font.BOLD, a));
        }
        if (rbtn2.isSelected()) {
            txta.setFont(new Font("Arial", Font.ITALIC, a));
        } else {
            txta.setFont(new Font("Arial", Font.BOLD, a));
        }
    }//GEN-LAST:event_txtdActionPerformed

    private void txtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdFocusGained
        txtd.setBackground(Color.pink);
    }//GEN-LAST:event_txtdFocusGained

    private void txtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdFocusLost
        txtd.setBackground(Color.white);
    }//GEN-LAST:event_txtdFocusLost

    private void txtaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaFocusGained
        txta.setBackground(Color.pink);
    }//GEN-LAST:event_txtaFocusGained

    private void txtaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaFocusLost
        txta.setBackground(Color.white);
    }//GEN-LAST:event_txtaFocusLost

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
            java.util.logging.Logger.getLogger(Dinhdang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dinhdang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dinhdang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dinhdang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dinhdang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboMau;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lbld;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JTextArea txta;
    private javax.swing.JTextField txtd;
    // End of variables declaration//GEN-END:variables

    @Override
    public void insertUpdate(DocumentEvent e) {
        try {
            int a = Integer.parseInt(txtd.getText());
            txtd.setForeground(Color.blue);
        } catch (Exception ex) {
            txtd.setForeground(Color.red);
        }
        if (txta.getText().isEmpty()&&txtd.getText().isEmpty()) {
            btnXoa.setVisible(false);
        }else{
            btnXoa.setVisible(true);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        try {
            int a = Integer.parseInt(txtd.getText());
            txtd.setForeground(Color.blue);
        } catch (Exception ex) {
            txtd.setForeground(Color.red);
        }
        if (txta.getText().isEmpty()&&txtd.getText().isEmpty()) {
            btnXoa.setVisible(false);
        }else{
            btnXoa.setVisible(true);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
