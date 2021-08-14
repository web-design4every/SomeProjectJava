/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_COde;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class FrmCalculator implements ActionListener,FocusListener,DocumentListener, ItemListener{
    //Khai bao nhung thanh phan co trong cua so
    private JLabel lblTittle, lbla, lblb, lblOperator, lblResult;
    private JTextField txta, txtb, txtResult;
    private JButton btnOk, btnReset, btnExit;
    private JComboBox cboOperator;
    
    public FrmCalculator(String msg){
        JFrame frm = new JFrame("Welcome " + msg);
        
        //Khoi tao cac thanh phan da khai bao
        
        lblTittle = new JLabel("CALCULATOR");
        lblTittle.setFont(new Font("Arial", Font.BOLD, 30));
        lblTittle.setForeground(Color.red);
        
        Font f1 = new Font("Arial", Font.BOLD, 18);
        lbla = new JLabel("Enter a: ");
        lbla.setFont(f1);
        lbla.setForeground(Color.blue);
        
        lblb = new JLabel("Enter b: ");
        lblb.setFont(f1);
        lblb.setForeground(Color.blue);
        
        lblOperator = new JLabel("Operator : ");
        lblOperator.setFont(f1);
        lblOperator.setForeground(Color.blue);
        
        lblResult = new JLabel("Result : ");
        lblResult.setFont(f1);
        lblResult.setForeground(Color.blue);
        
        txta = new JTextField(10);
        txta.setFont(f1);
        txta.setForeground(Color.blue);
        //focus hoac lostfocus se sinh ra su kien
        txta.addFocusListener(this);
        //thay doi gia tri trong text se sinh ra su kien
        txta.getDocument().addDocumentListener(this);
        //Nhap text va enter se sinh ra su kien
        txta.addActionListener(this);
        
        txtb = new JTextField(10);
        txtb.setFont(f1);
        txtb.setForeground(Color.blue);
        txtb.addFocusListener(this);
        txtb.getDocument().addDocumentListener(this);
        txtb.addActionListener(this);
        
        txtResult = new JTextField(10);
        txtResult.setFont(f1);
        txtResult.setForeground(Color.blue);
        txtResult.setEditable(false);
//        txtResult.setEnabled(false);
        
        Font f2 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
        btnOk = new JButton("OK");
        btnOk.setFont(f2);
        btnOk.setForeground(Color.blue);
        btnOk.addActionListener(this);
        
        btnReset = new JButton("RESET");
        btnReset.setFont(f2);
        btnReset.setForeground(Color.blue);
        btnReset.addActionListener(this);

        
        btnExit = new JButton("EXIT");
        btnExit.setFont(f2);
        btnExit.setForeground(Color.blue);
        btnExit.addActionListener(this);

        
        String[] item = { "+", "-", "*", "/"};
        cboOperator = new JComboBox(item);
        cboOperator.setFont(f1);
        cboOperator.setForeground(Color.blue);
        cboOperator.setPreferredSize(new Dimension(180,25));
        cboOperator.addItemListener(this);

        //Dat cac thanh phan vao dung vi tri trong cua so
        //Tao 4 panel
        JPanel pNorth = new JPanel();
        pNorth.add(lblTittle);
        
        JPanel pSouth = new JPanel();
        pSouth.add(btnOk);
        pSouth.add(btnReset);
        pSouth.add(btnExit);
        
        JPanel pWest = new JPanel();
        pWest.setLayout(new GridLayout(4, 1));
        JPanel p5 = new JPanel();
        p5.add(lbla);
        JPanel p6 = new JPanel();
        p6.add(lblb);
        JPanel p7 = new JPanel();
        p7.add(lblOperator);
        JPanel p8 = new JPanel();
        p8.add(lblResult);
        pWest.add(p5);
        pWest.add(p6);
        pWest.add(p7);
        pWest.add(p8);
        
        JPanel pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(4, 1));
        JPanel p1 = new JPanel();
        p1.add(txta);
        JPanel p2 = new JPanel();
        p2.add(txtb);
        JPanel p3 = new JPanel();
        p3.add(cboOperator);
        JPanel p4 = new JPanel();
        p4.add(txtResult);
        pCenter.add(p1);
        pCenter.add(p2);
        pCenter.add(p3);
        pCenter.add(p4);
        
        //Dat 4 panel vao cua so
        frm.add(pNorth, BorderLayout.NORTH);
        frm.add(pSouth, BorderLayout.SOUTH);
        frm.add(pWest, BorderLayout.WEST);
        frm.add(pCenter, BorderLayout.CENTER);
        
        frm.setSize(400,500);
        frm.setVisible(true);
}
    
    public static void main(String[] args) {
        FrmCalculator f = new FrmCalculator("Calculator");
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
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnOk){
            //Xu ly khi bam nut OK
            calculator();
        } 
        if (e.getSource()==btnReset) {
            //Xu ly khi bam nut Reset
            txta.setText("");
            txtb.setText("");
            txtResult.setText("");
            
        }
        if (e.getSource()==btnExit) {
            //Xu ly khi bam nut Exit
            if (JOptionPane.showConfirmDialog(null, "May co muon thoat ko?","Thong bao",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                System.exit(0);
            }    
        }
        if (e.getSource()==txta) {
            calculator();
        }
        if (e.getSource()==txtb) {
            calculator();
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource()==txta) {
            txta.setBackground(Color.pink);
        }
        if (e.getSource()==txtb) {
            txtb.setBackground(Color.pink);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource()==txta) {
            txta.setBackground(Color.white);
        }
        if (e.getSource()==txtb) {
            txtb.setBackground(Color.white);
        }
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

    @Override
    public void itemStateChanged(ItemEvent e) {
        calculator();
    }
}
