/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class FrmCalculator extends javax.swing.JFrame implements ActionListener, DocumentListener{

    /**
     * Creates new form FrmCalculator
     */
    public FrmCalculator() {
        initComponents();
        txtResult.setEditable(false);
        txta.getDocument().addDocumentListener(this);
        txtb.getDocument().addDocumentListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        lblb = new javax.swing.JLabel();
        lblOperator = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        cboOperator = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();
        btnEXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 0));
        lblTitle.setText("CALCULATOR");

        lbla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbla.setForeground(new java.awt.Color(51, 51, 255));
        lbla.setText("Enter a:");

        lblb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblb.setForeground(new java.awt.Color(51, 51, 255));
        lblb.setText("Enter b:");

        lblOperator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOperator.setForeground(new java.awt.Color(51, 51, 255));
        lblOperator.setText("Operator:");

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResult.setForeground(new java.awt.Color(51, 51, 255));
        lblResult.setText("Result:");

        txta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaFocusLost(evt);
            }
        });
        txta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaActionPerformed(evt);
            }
        });

        txtb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbFocusLost(evt);
            }
        });
        txtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbActionPerformed(evt);
            }
        });

        cboOperator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboOperator.setForeground(new java.awt.Color(51, 0, 255));
        cboOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                    +", "                    -", "                    *", "                    /" }));
        cboOperator.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboOperatorItemStateChanged(evt);
            }
        });

        btnOK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 51, 0));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnRESET.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRESET.setForeground(new java.awt.Color(255, 51, 0));
        btnRESET.setText("RESET");
        btnRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETActionPerformed(evt);
            }
        });

        btnEXIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEXIT.setForeground(new java.awt.Color(255, 51, 0));
        btnEXIT.setText("EXIT");
        btnEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblb)
                    .addComponent(lblResult)
                    .addComponent(lblOperator)
                    .addComponent(lbla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txta)
                    .addComponent(txtResult, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtb, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboOperator, javax.swing.GroupLayout.Alignment.LEADING, 0, 235, Short.MAX_VALUE))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnOK)
                        .addGap(18, 18, 18)
                        .addComponent(btnRESET)
                        .addGap(18, 18, 18)
                        .addComponent(btnEXIT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblTitle)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbla)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblb)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperator)
                    .addComponent(cboOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResult)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnRESET)
                    .addComponent(btnEXIT))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        calculator();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        txta.setText("");
        txtb.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btnRESETActionPerformed

    private void btnEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXITActionPerformed
        if (JOptionPane.showConfirmDialog(null, "May co muon thoat ko?","Thong bao",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                System.exit(0);
            }  
    }//GEN-LAST:event_btnEXITActionPerformed

    private void txtaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaFocusGained
       txta.setBackground(Color.pink);
    }//GEN-LAST:event_txtaFocusGained

    private void txtaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaFocusLost
        txta.setBackground(Color.white);
    }//GEN-LAST:event_txtaFocusLost

    private void txtbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbFocusGained
        txtb.setBackground(Color.pink);
    }//GEN-LAST:event_txtbFocusGained

    private void txtbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbFocusLost
       txtb.setBackground(Color.white);
    }//GEN-LAST:event_txtbFocusLost

    private void cboOperatorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboOperatorItemStateChanged
        calculator();
    }//GEN-LAST:event_cboOperatorItemStateChanged

    private void txtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaActionPerformed
        calculator();
    }//GEN-LAST:event_txtaActionPerformed

    private void txtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbActionPerformed
        calculator();
    }//GEN-LAST:event_txtbActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculator().setVisible(true);
            }
        });
    }
    
    public void calculator(){
        int a, b;
            try {
                 a = Integer.parseInt(txta.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid number for a");
                return;
            }
            try {
                b = Integer.parseInt(txtb.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid number for b");
                return;
            }
            if (cboOperator.getSelectedIndex()==0) {
                int c = a + b;
                txtResult.setText(String.valueOf(c));
            }
            if (cboOperator.getSelectedIndex()==1) {
                int c = a - b;
                txtResult.setText(String.valueOf(c));
            }
            if (cboOperator.getSelectedIndex()==2) {
                int c = a * b;
                txtResult.setText(String.valueOf(c));
            }
            if (cboOperator.getSelectedIndex()==3) {
                double c = (double) a / b;
                txtResult.setText(String.valueOf(c));
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEXIT;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnRESET;
    private javax.swing.JComboBox<String> cboOperator;
    private javax.swing.JLabel lblOperator;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        try{
            int a = Integer.parseInt(txta.getText());
            txta.setForeground(Color.blue);
            lbla.setForeground(Color.blue);
        }catch(Exception ex){
            txta.setForeground(Color.red);
            lbla.setForeground(Color.red);
        }
        try{
            int b = Integer.parseInt(txtb.getText());
            txtb.setForeground(Color.blue);
            lblb.setForeground(Color.blue);
        }catch(Exception ex){
            txtb.setForeground(Color.red);
            lblb.setForeground(Color.red);
        }
        if(txta.getText().isEmpty()){
            lbla.setForeground(Color.blue);
        }
        if(txtb.getText().isEmpty()){
            lblb.setForeground(Color.blue);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
       try{
            int a = Integer.parseInt(txta.getText());
            txta.setForeground(Color.blue);
            lbla.setForeground(Color.blue);
        }catch(Exception ex){
            txta.setForeground(Color.red);
            lbla.setForeground(Color.red);
        }
        try{
            int b = Integer.parseInt(txtb.getText());
            txtb.setForeground(Color.blue);
            lblb.setForeground(Color.blue);
        }catch(Exception ex){
            txtb.setForeground(Color.red);
            lblb.setForeground(Color.red);
        }
        if(txta.getText().isEmpty()){
            lbla.setForeground(Color.blue);
        }
        if(txtb.getText().isEmpty()){
            lblb.setForeground(Color.blue);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}