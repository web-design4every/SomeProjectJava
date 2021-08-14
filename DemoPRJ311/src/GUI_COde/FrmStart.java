/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_COde;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class FrmStart {
    public FrmStart(){
        //design o day
        JFrame frm = new JFrame("Dat la tittle");
        frm.setLayout(new FlowLayout());
        //tao cac thanh phan tren cua so
        //JLabel - hien thi thong tin
        JLabel lbl = new JLabel("What's your name?");
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setForeground(Color.red);
        
        //JTextField - o nhap van ban
        JTextField txt = new JTextField(10);
        txt.setFont(new Font("Arial", Font.ITALIC, 20));
        txt.setForeground(Color.blue);
        
        //JButton - tao nut nhan
        JButton btn = new JButton("OK");
        btn.setFont(new Font("Sans-serif", Font.BOLD + Font.ITALIC, 18));
        btn.setForeground(Color.orange);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  //Viet code xu ly khi nhan nut OK o 
                 boolean check = true;
                 for (int i = 0; i < txt.getText().length(); i++) {
                        if (Character.isDigit(txt.getText().charAt(i))) {
                                JOptionPane.showMessageDialog(null, "Wrong!");
                                check = false;
                                break;
                }
                }
                  if(check == true){
                  JOptionPane.showMessageDialog(null, "Hello " + txt.getText() + "\nTen ban co: " + txt.getText().trim().length()+" ki tu. ");
                  
                  //Di chuyen sang FrmCalculator
                  FrmCalculator f = new FrmCalculator(txt.getText().trim());
                  }
                  frm.setVisible(false);   
            }});
        
        JButton btn2 = new JButton("20");
        btn2.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 18));
        btn2.setForeground(Color.CYAN);
        //mess box cac so nguyen to nho hon 20
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuffer res = new StringBuffer();
                for (int i = 2; i < 20; i++) {
                      if (isPrimeNumber(i)) {
                            res.append(i+", ");
                      }
                }
                JOptionPane.showMessageDialog(null, "Cac so nguyen to nho hon 20: \n"+res);   
            }
        });
        
        JButton btn3 = new JButton("1");
        btn3.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 18));
        btn3.setForeground(Color.BLUE);
        //Button hien thi so chinh phuong moi lan bam
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(btn3.getText().trim());
                num++;
                while(!kiemTra(num)){
                    num++;
                }
                btn3.setText(String.valueOf(num));
            }
        });
        
        
        //add cac thanh phan len cua so
        frm.add(lbl);
        frm.add(txt);
        frm.add(btn);
        frm.add(btn2);
        frm.add(btn3);
        frm.setSize(400,300);
        frm.setVisible(true);
    }
    //Ham check so nguyen to
    public static boolean isPrimeNumber(int i) {
        for (int j = 2; j < i; j++) {
            {
                if (i % j == 0) {
                    return false;
                }
            }

        }
        return true;
    }
    public static boolean kiemTra(int n){
        int temp = (int)Math.sqrt(n);
        if(temp * temp == n){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        FrmStart f = new FrmStart();
        
    }
}
