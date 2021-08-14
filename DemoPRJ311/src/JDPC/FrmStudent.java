/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDPC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class FrmStudent extends javax.swing.JFrame {
    //Khai bao 1 so thanh phan xu ly database
    Connection cnn; // Ket noi DB
    Statement stm; // Thuc thi cau lenh SQL
    ResultSet rs; // Luu tru va xu ly data
    /**
     * Creates new form FrmStudent
     */
    ButtonGroup bt = new ButtonGroup();
    public FrmStudent() {
        initComponents();
        connect();
        loadSubject();
        loadStudent();
        bt.add(rbtnMale);
        bt.add(rbtnFemale);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMahs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenhs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        cboMamon = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Ma hoc sinh:");

        txtMahs.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Ten hoc sinh:");

        txtTenhs.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Ma mon:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Diem:");

        txtDiem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        btnFirst.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnFirst.setText("<<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnPre.setText("<");
        btnPre.setEnabled(false);
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnNext.setText(">");
        btnNext.setEnabled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tbStudent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma hoc sinh", "Ten hoc sinh", "Ma mon", "Diem", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbStudent);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Gender:");

        rbtnMale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtnMale.setText("Male");

        rbtnFemale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtnFemale.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnFirst)
                                .addGap(18, 18, 18)
                                .addComponent(btnPre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLast)
                                .addGap(60, 60, 60)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMahs, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbtnMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rbtnFemale))
                                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenhs, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(cboMamon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMahs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenhs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(cboMamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnMale)
                        .addComponent(rbtnFemale)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirst)
                            .addComponent(btnPre)
                            .addComponent(btnNext)
                            .addComponent(btnLast)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnReset))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            rs.first();
            txtMahs.setText(rs.getString(1));
            txtTenhs.setText(rs.getString(2));
            txtDiem.setText(String.valueOf(rs.getFloat(4)));
            String gender = String.valueOf(rs.getBoolean(5));
            if (gender.equalsIgnoreCase("true")) {
                rbtnMale.setSelected(true);
            }else{
                rbtnFemale.setSelected(true);
            }
        } catch (Exception e) {
            System.out.println("Loi First: "+e.getMessage());
        }
        btnNext.setEnabled(true);
        btnPre.setEnabled(true);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        try {
            if (rs.isFirst()) {
                rs.last();
            } else
            rs.previous();
            txtMahs.setText(rs.getString(1));
            txtTenhs.setText(rs.getString(2));
            txtDiem.setText(String.valueOf(rs.getFloat(4)));
            String gender = String.valueOf(rs.getBoolean(5));
            if (gender.equalsIgnoreCase("true")) {
                rbtnMale.setSelected(true);
            }else{
                rbtnFemale.setSelected(true);
            }
        } catch (Exception e) {
            System.out.println("Loi Previous: "+e.getMessage());
        }
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (rs.isLast()) {
                rs.first();
            } else
            rs.next();
            txtMahs.setText(rs.getString(1));
            txtTenhs.setText(rs.getString(2));
            txtDiem.setText(String.valueOf(rs.getFloat(4)));
            String gender = String.valueOf(rs.getBoolean(5));
            if (gender.equalsIgnoreCase("true")) {
                rbtnMale.setSelected(true);
            }else{
                rbtnFemale.setSelected(true);
            }
        } catch (Exception e) {
            System.out.println("Loi Next: "+e.getMessage());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            rs.last();
            txtMahs.setText(rs.getString(1));
            txtTenhs.setText(rs.getString(2));
            txtDiem.setText(String.valueOf(rs.getFloat(4)));
            String gender = String.valueOf(rs.getBoolean(5));
            if (gender.equalsIgnoreCase("true")) {
                rbtnMale.setSelected(true);
            }else{
                rbtnFemale.setSelected(true);
            }
        } catch (Exception e) {
            System.out.println("Loi Last: "+e.getMessage());
        }
        btnNext.setEnabled(true);
        btnPre.setEnabled(true);
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (checkExist(txtMahs.getText())) {
            JOptionPane.showMessageDialog(null, "id is existed !!");
            return;
        }
        try {
             Boolean Gender = true;
            if (rbtnMale.isSelected()) {
                Gender = true;
            } else if (rbtnFemale.isSelected()) {
                Gender = false;
            }
            String StrSubName = cboMamon.getSelectedItem().toString();
            String StrSubId="Select subjectId from tblSubject where subjectName='"+StrSubName+"'";
            rs = stm.executeQuery(StrSubId);
            if(rs.next()){
            int resultSe = rs.getInt(1);
            String strAdd = "insert into tblStudent values ( '"+txtMahs.getText()+"', '"+txtTenhs.getText()+"', '"+resultSe+"', '"+txtDiem.getText()+"', '"+Gender+"')";
            stm.execute(strAdd);
            JOptionPane.showMessageDialog(null, "Add successfully");
            loadStudent();
            }
        } catch (Exception e) {
            System.out.println("Loi Add: "+e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!checkExist(txtMahs.getText())) {
            JOptionPane.showMessageDialog(null, "id is not existed !!");
            return;
        }
        try {
            //Tao cau lenh sql update data
            Boolean Gender = true;
            if (rbtnMale.isSelected()) {
                Gender = true;
            } else if (rbtnFemale.isSelected()) {
                Gender = false;
            }
            String StrSubName = cboMamon.getSelectedItem().toString();
            String StrSubId="Select subjectId from tblSubject where subjectName='"+StrSubName+"'";
            rs = stm.executeQuery(StrSubId);
            if(rs.next()){
            int resultSe = rs.getInt(1);
            String strUpdate = "update tblStudent set studentName = '"+txtTenhs.getText()+"', subjectId = '"+resultSe+"', mark = '"+txtDiem.getText()+"', gender = '"+Gender+"' where studentId='"+txtMahs.getText()+"'";
            stm.execute(strUpdate);
            JOptionPane.showMessageDialog(null, "Update successfully");
            loadStudent();
            }
        } catch (Exception e) {
            System.out.println("Loi Update: "+e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!checkExist(txtMahs.getText())) {
            JOptionPane.showMessageDialog(null, "id is not existed !!");
            return;
        }
        try {
            //Tao cau lenh sql update data
            String strDelete = "delete from tblStudent where studentId='"+txtMahs.getText()+"'";
            stm.execute(strDelete);
            JOptionPane.showMessageDialog(null, "Delete successfully");
            loadStudent();
        } catch (Exception e) {
            System.out.println("Loi Delete: "+e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMahs.setText("");
        txtTenhs.setText("");
        txtDiem.setText("");
        bt.clearSelection();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked
        try {
            txtMahs.setText(tbStudent.getValueAt(tbStudent.getSelectedRow(), 0).toString());
            txtTenhs.setText(tbStudent.getValueAt(tbStudent.getSelectedRow(), 1).toString());
            txtDiem.setText(tbStudent.getValueAt(tbStudent.getSelectedRow(), 3).toString());
            String Gender = tbStudent.getValueAt(tbStudent.getSelectedRow(), 4).toString();
            if (Gender.equalsIgnoreCase("male")) {
                rbtnMale.setSelected(true);
            } else {
                rbtnFemale.setSelected(true);
            }
            String subId = tbStudent.getValueAt(tbStudent.getSelectedRow(), 2).toString();
            String StrFindSubName = "select * from tblSubject where subjectId = '" + Integer.parseInt(subId) + "'";
            rs = stm.executeQuery(StrFindSubName);
            if (rs.next()) {
                cboMamon.setSelectedItem(rs.getString(2));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "");
        }
 
    }//GEN-LAST:event_tbStudentMouseClicked

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
            java.util.logging.Logger.getLogger(FrmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStudent().setVisible(true);
            }
        });
    }
    
    private boolean checkExist(String id) {
        String strSelect = "Select * from tblStudent where studentId = '" + id + "'";
        try {
            rs = stm.executeQuery(strSelect);
            while (rs.next()) {
                return true; // ton tai id
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter again, id is existed");
        }
        return false;
    }
    
    private void connect() {
        try {
            DBContext d = new DBContext();
            cnn = d.getConnection();
            JOptionPane.showMessageDialog(null, "Connect success");
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            System.out.println("Connect fail: "+e.getMessage());
        }
    }
    
    private void loadStudent() {
        //Khoi tao doi tuong control tblSubject (design)
        DefaultTableModel dtm = (DefaultTableModel)tbStudent.getModel();
        dtm.setRowCount(0);
        try {
//             stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             rs = stm.executeQuery("select * from tblStudent");
             //Duyet tung row trong rs
             while (rs.next()) {                
                //Lay thong tin cua 1 dong
                String studentId = rs.getString(1);
                String name = rs.getString(2);
                String subjectId = String.valueOf(rs.getInt(3));
                String mark = String.valueOf(rs.getFloat(4));
                String gender = String.valueOf(rs.getBoolean(5));
                String gender1;
                 if (gender.equalsIgnoreCase("true")) {
                     gender1="Male";
                 }else{
                     gender1="Female";
                 }
                //Add vao table
                dtm.insertRow(dtm.getRowCount(), new Object[]{studentId,name,subjectId,mark,gender1});
            }
             
        } catch (Exception e) {
            System.out.println("Loi load Student: "+e.getMessage());
        }
    }
    
    private void loadSubject() {
        try {
//             stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             rs = stm.executeQuery("select * from tblSubject");
             //Duyet tung row trong rs
             while (rs.next()) {                
                //Lay thong tin cua 1 dong
                String code = String.valueOf(rs.getInt(1));
                String name = rs.getString(2);
                cboMamon.addItem(name);
            }
             
        } catch (Exception e) {
            System.out.println("Loi load Subject: "+e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboMamon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtMahs;
    private javax.swing.JTextField txtTenhs;
    // End of variables declaration//GEN-END:variables
}