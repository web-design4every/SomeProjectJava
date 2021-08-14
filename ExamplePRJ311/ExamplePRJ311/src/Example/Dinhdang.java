/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class Dinhdang implements FocusListener, ActionListener, DocumentListener{
    private JLabel lblTittle, lbla, lblb, lblc, lbld;
    private JTextField txtd;
    private JTextArea txta;
    private JButton btnOk, btnXoa, btnExit;
    private JComboBox cboMau;
    private JRadioButton rbtn1, rbtn2, VI, EN;
    
    public Dinhdang(){
        JFrame frm = new JFrame("Bai thuc hanh so 3 ");
        
        lblTittle = new JLabel("DINH DANG DU LIEU");
        lblTittle.setFont(new Font("Arial", Font.BOLD, 25));
        lblTittle.setForeground(Color.blue);
        
        Font f1 = new Font("Arial", Font.BOLD, 18);
        lbla = new JLabel("Noi dung dinh dang: ");
        lbla.setFont(f1);
        lbla.setForeground(Color.black);
        
        lblb = new JLabel("Chon mau chu: ");
        lblb.setFont(f1);
        lblb.setForeground(Color.black);
        
        lblc = new JLabel("Chon kieu chu: ");
        lblc.setFont(f1);
        lblc.setForeground(Color.black);
        
        lbld = new JLabel("Chon co chu: ");
        lbld.setFont(f1);
        lbld.setForeground(Color.black);
        
        txta = new JTextArea(10, 10);
        txta.setFont(f1);
        txta.setForeground(Color.blue);
        txta.addFocusListener(this);
        txta.getDocument().addDocumentListener(this);
        
        txtd = new JTextField(10);
        txtd.setFont(f1);
        txtd.setForeground(Color.blue);
        txtd.addFocusListener(this);
        txtd.getDocument().addDocumentListener(this);
        txtd.addActionListener(this);
        
        Font f2 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
//        btnOk = new JButton("OK");
//        btnOk.setFont(f2);
//        btnOk.setForeground(Color.black);
//        btnOk.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String a = txtd.getText();
//                if(rbtn1.isSelected()){
//                    txta.setFont(new Font("Arial", Font.BOLD, Integer.valueOf(a)));
//                }
//                if (rbtn2.isSelected()) {
//                    txta.setFont(new Font("Arial", Font.ITALIC, Integer.valueOf(a)));
//                }
//                else{
//                    txta.setFont(new Font("Arial", Font.BOLD, Integer.valueOf(a)));
//                }
//            }
//        });
    
        btnXoa = new JButton("Xoa");
        btnXoa.setFont(f2);
        btnXoa.setForeground(Color.black);
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txta.setText("");
                txtd.setText("");
                txta.setFont(f1);
            }
        });
        btnXoa.setVisible(false);
        
        btnExit = new JButton("Thoat");
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
        
        String[] item = { "Mau do", "Mau xanh", "Mau luc", "Mau vang" , "Mau xam" , "Mau den"};
        cboMau= new JComboBox(item);
        cboMau.setFont(f1);
        cboMau.setForeground(Color.black);
        cboMau.setPreferredSize(new Dimension(180,25));
        cboMau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) cboMau.getSelectedItem();
                switch(s){
                    case "Mau do":
                        txta.setForeground(Color.red);
                        break;
                    case "Mau xanh":
                        txta.setForeground(Color.blue);
                        break;
                    case "Mau luc":
                        txta.setForeground(Color.green);
                        break;
                    case "Mau vang":
                        txta.setForeground(Color.yellow);
                        break;
                    case "Mau xam":
                        txta.setForeground(Color.GRAY);
                        break;
                    case "Mau den":
                        txta.setForeground(Color.black);
                        break;
                }
            }
        });
        
        rbtn1 = new JRadioButton("Chu dam");
        rbtn1.setFont(new Font("Arial", Font.BOLD, 14));
        rbtn2 = new JRadioButton("Chu nghieng");
        rbtn2.setFont(new Font("Arial", Font.ITALIC, 14));
        VI = new JRadioButton("VI");
        EN = new JRadioButton("EN");
        VI.setBounds(50, 100, 170, 30);
        EN.setBounds(50, 100, 170, 30);
        rbtn1.setBounds(50, 60, 170, 30);
        rbtn2.setBounds(50, 100, 170, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtn1);
        bg.add(rbtn2);
        bg.add(VI);
        bg.add(EN);
        rbtn1.addActionListener(this);
        rbtn2.addActionListener(this);
        VI.addActionListener(this);
        EN.addActionListener(this);
        Locale.setDefault(new Locale("en"));
        System.setProperty("user.language", "en");
        
        JScrollPane sp = new JScrollPane(txta);
        frm.getContentPane().add(sp);
        sp.setBounds(3,3,400,400);
        
        JPanel pNorth = new JPanel();
        pNorth.add(lblTittle);
        
        JPanel pSouth = new JPanel();
//        pSouth.add(btnOk);
        pSouth.add(btnXoa);
        pSouth.add(btnExit);
        
        JPanel pWest= new JPanel();
        pWest.setLayout(new GridLayout(3, 1));
        JPanel p1 = new JPanel();
        p1.add(lbla);
        pWest.add(p1);
        
        JPanel pCenter = new JPanel();
        pCenter.add(sp);
        
        JPanel pEast = new JPanel();
        pEast.setLayout(new GridLayout(3, 1));
        JPanel p2 = new JPanel();
        p2.add(lblb);
        p2.add(cboMau);
        JPanel p3 = new JPanel();
        p3.add(lblc);
        p3.add(rbtn1);
        p3.add(rbtn2);
        p3.add(VI);
        p3.add(EN);
        JPanel p4 = new JPanel();
        p4.add(lbld);
        p4.add(txtd);
        pEast.add(p2);
        pEast.add(p3);
        pEast.add(p4);
        
        frm.add(pNorth, BorderLayout.NORTH);
        frm.add(pSouth, BorderLayout.SOUTH);
        frm.add(pWest, BorderLayout.WEST);
        frm.add(pCenter, BorderLayout.CENTER);
        frm.add(pEast, BorderLayout.EAST);
        
        frm.setSize(800,400);
        frm.setVisible(true);
    }
    
    public static void main(String[] args) {
        Dinhdang dd = new Dinhdang();
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource()==txta) {
            txta.setBackground(Color.pink);
        }
        if (e.getSource()==txtd) {
            txtd.setBackground(Color.pink);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource()==txta) {
            txta.setBackground(Color.white);
        }
        if (e.getSource()==txtd) {
            txtd.setBackground(Color.white);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rbtn1) {
            if (txtd.getText().isEmpty()) {
                    txta.setFont(new Font("Arial", Font.BOLD, 18));
            }else{
                    txta.setFont(new Font("Arial", Font.BOLD, Integer.valueOf(txtd.getText())));
            }
        }
        if (e.getSource()==rbtn2) {
            if (txtd.getText().isEmpty()) {
                    txta.setFont(new Font("Arial", Font.ITALIC, 18));
            }else{
                txta.setFont(new Font("Arial", Font.ITALIC, Integer.valueOf(txtd.getText())));
            }
        }
        int a;
        if (e.getSource()==txtd) {
            try {
                a = Integer.parseInt(txtd.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Wrong invalid integer");
                return;
            }
                if(rbtn1.isSelected()){
                    txta.setFont(new Font("Arial", Font.BOLD, a));
                }
                if (rbtn2.isSelected()) {
                    txta.setFont(new Font("Arial", Font.ITALIC, a));
                }
                else{
                    txta.setFont(new Font("Arial", Font.BOLD, a));
                }
        }
        if (e.getSource()==EN) {
          lblTittle.setText("Data format");
          lbla.setText("Formatted content");
          lblb.setText("Choose color");
          lblc.setText("Choose font");
          lbld.setText("Choose size");
          btnExit.setText("Exit");
          btnXoa.setText("Clear");
        }
        if (e.getSource()==VI) {
          lblTittle.setText("Dinh dang du lieu");
          lbla.setText("Noi dung dinh dang");
          lblb.setText("Chon mau chu");
          lblc.setText("Chon kieu chu");
          lbld.setText("Chon co chu");
          btnExit.setText("Thoat");
          btnXoa.setText("Xoa");
        }
    }

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

//them 2 radio button co ten la VI va EN. Chon VI thi tat ca chu tren cua so la tieng viet, nguoc lai la tieng anh
