/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class Nhanvien implements FocusListener, DocumentListener{
    private JLabel lblTittle, lbla, lblb, lblc, lbld, lble, lblf;
    private JTextField txta, txtb, txte;
    private JTextArea txtf;
    private JButton btnOk, btnReset, btnExit;
    private JComboBox cboChucvu;
    private JRadioButton rbtn1, rbtn2;
    
    public Nhanvien(){
    JFrame frm = new JFrame("Bai thuc hanh so 1 ");
    
    lblTittle = new JLabel("THONG TIN NHAN VIEN");
    lblTittle.setFont(new Font("Arial", Font.BOLD, 25));
    lblTittle.setForeground(Color.blue);
    
    Font f1 = new Font("Arial", Font.BOLD, 18);
    lbla = new JLabel("Ma nhan vien: ");
    lbla.setFont(f1);
    lbla.setForeground(Color.blue);
    
    lblb = new JLabel("Ten nhan vien: ");
    lblb.setFont(f1);
    lblb.setForeground(Color.blue);
    
    lblc = new JLabel("Gioi tinh: ");
    lblc.setFont(f1);
    lblc.setForeground(Color.blue);
    
    lbld = new JLabel("Chuc vu: ");
    lbld.setFont(f1);
    lbld.setForeground(Color.blue);
    
    lble = new JLabel("Luong: ");
    lble.setFont(f1);
    lble.setForeground(Color.blue);
    
    lblf = new JLabel("Thong tin: ");
    lblf.setFont(f1);
    lblf.setForeground(Color.blue);

    txta = new JTextField(10);
    txta.setFont(f1);
    txta.setForeground(Color.blue);
    txta.addFocusListener(this);
    
    txtb = new JTextField(10);
    txtb.setFont(f1);
    txtb.setForeground(Color.blue);
    txtb.addFocusListener(this);
    txtb.getDocument().addDocumentListener(this);
    
    txte = new JTextField(10);
    txte.setFont(f1);
    txte.setForeground(Color.blue);
    txte.setEditable(false);
    
    txtf = new JTextArea(5, 20);
    txtf.setFont(f1);
    txtf.setForeground(Color.blue);
    txtf.setEditable(false);
    
    
    StringBuffer t = new StringBuffer();
    Font f2 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
    btnOk = new JButton("OK");
    btnOk.setFont(f2);
    btnOk.setForeground(Color.black);
    btnOk.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            t.append(txta.getText()+" ");
            t.append(txtb.getText()+" ");
            if (rbtn1.isSelected()) {
                t.append("Nam ");
            }else if(rbtn2.isSelected()){
                t.append("Nu ");
            }
            String a = (String) cboChucvu.getSelectedItem();
            t.append(a+" ");
            t.append(txte.getText()+"\n");
            txtf.setText(String.valueOf(t));
        }
    });
    
    btnReset = new JButton("RESET");
    btnReset.setFont(f2);
    btnReset.setForeground(Color.black);
    btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txta.setText("");
                txtb.setText("");
                txte.setText("");
                txtf.setText("");
            }
        });
    
    btnExit = new JButton("EXIT");
    btnExit.setFont(f2);
    btnExit.setForeground(Color.black);
    btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null, "May co muon thoat ko?","Thong bao",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                System.exit(0);
                }
            }
        });
    
    String[] item = { "Giam doc", "Pho giam doc", "Truong phong", "Ke toan" , "Nhan vien" , "Bao ve"};
    cboChucvu = new JComboBox(item);
    cboChucvu.setFont(f1);
    cboChucvu.setForeground(Color.black);
    cboChucvu.setPreferredSize(new Dimension(180,25));
    cboChucvu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rd = new Random();  
            String s = (String) cboChucvu.getSelectedItem();
            switch(s){
                case "Giam doc":
                     int number1 = 1+rd.nextInt(100); 
                     txte.setText("10000000");
                     txta.setText("GD"+number1);
                     break;
                case "Pho giam doc":
                     int number2 = 1+rd.nextInt(70);
                     txte.setText("7000000");
                     txta.setText("PGD"+number2);
                     break;
                case "Truong phong":
                    int number3 = 1+rd.nextInt(60);
                     txte.setText("6000000");
                     txta.setText("TP"+number3);
                     break;
                case "Ke toan":
                    int number4 = 1+rd.nextInt(50);
                     txte.setText("5000000");
                     txta.setText("KT"+number4);
                     break;
                case "Nhan vien":
                    int number5 = 1+rd.nextInt(40);
                     txte.setText("4000000");
                     txta.setText("NV"+number5);
                     break;
                case "Bao ve":
                    int number6 = 1+rd.nextInt(20);
                     txte.setText("2000000");
                     txta.setText("BV"+number6);
                     break;
            }
        }
    });
    
    rbtn1 = new JRadioButton("Nam");
    rbtn2 = new JRadioButton("Nu");
    rbtn1.setBounds(50, 60, 170, 30);
    rbtn2.setBounds(50, 100, 170, 30);
    ButtonGroup bg = new ButtonGroup();
    bg.add(rbtn1);
    bg.add(rbtn2);
    
    JPanel pNorth = new JPanel();
    pNorth.add(lblTittle);
    
    JPanel pSouth = new JPanel();
    pSouth.setLayout(new GridLayout(2, 1));
    JPanel p10 = new JPanel();
    p10.add(btnOk);
    p10.add(btnReset);
    p10.add(btnExit);
    JPanel p4 = new JPanel();
    p4.add(lblf);
    p4.add(txtf);
    pSouth.add(p10);
    pSouth.add(p4);
    
    JPanel pWest = new JPanel();
    pWest.setLayout(new GridLayout(5, 1));
    JPanel p5 = new JPanel();
    p5.add(lbla);
    JPanel p6 = new JPanel();
    p6.add(lblb);
    JPanel p7 = new JPanel();
    p7.add(lblc);
    JPanel p8 = new JPanel();
    p8.add(lbld);
    JPanel p9 = new JPanel();
    p9.add(lble);
    pWest.add(p5);
    pWest.add(p6);
    pWest.add(p7);
    pWest.add(p8);
    pWest.add(p9);
    
    JPanel pCenter = new JPanel();
    pCenter.setLayout(new GridLayout(5, 1));
    JPanel p1 = new JPanel();
    p1.add(txta);
    JPanel p2 = new JPanel();
    p2.add(txtb);
    JPanel p11 = new JPanel();
    p11.add(rbtn1);
    JPanel p12 = new JPanel();
    p11.add(rbtn2);
    JPanel p13 = new JPanel();
    p13.add(cboChucvu);
    JPanel p3 = new JPanel();
    p3.add(txte); 
    pCenter.add(p1);
    pCenter.add(p2);
    pCenter.add(p11);
    pCenter.add(p13);
    pCenter.add(p3);
    
    frm.add(pNorth, BorderLayout.NORTH);
    frm.add(pSouth, BorderLayout.SOUTH);
    frm.add(pWest, BorderLayout.WEST);
    frm.add(pCenter, BorderLayout.CENTER);
        
    frm.setSize(500,600);
    frm.setVisible(true);
}
    public static void main(String[] args) {
        // TODO code application logic here
        Nhanvien f = new Nhanvien();
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
           try {
            char c = ' ';
            char firstCh = txtb.getText().charAt(0);
            String getName = "";
            char[] ch = txtb.getText().toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (txtb.getText().charAt(i) == c) {
                    getName += txtb.getText().charAt(i + 1);
                }
            }
            txta.setText(firstCh + getName);
            String gender = "";
            if (rbtn1.isSelected()) {
                txta.setText(firstCh + getName + '1');
            }
            else if (rbtn2.isSelected()) {
                txta.setText(firstCh + getName + '0');
            }
        } catch (Exception ex) {    
        }
        
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        try {
            char c = ' ';
            char firstCh = txtb.getText().charAt(0);
            String getName = "";
            char[] ch = txtb.getText().toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (txtb.getText().charAt(i) == c) {
                    getName += txtb.getText().charAt(i + 1);
                }
            }
            txta.setText(firstCh + getName);
            String gender = "";
            if (rbtn1.isSelected()) {
                txta.setText(firstCh + getName + '1');
            } else if (rbtn2.isSelected()) {
                txta.setText(firstCh + getName + '0');
            }
        } catch (Exception ex) {    
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}