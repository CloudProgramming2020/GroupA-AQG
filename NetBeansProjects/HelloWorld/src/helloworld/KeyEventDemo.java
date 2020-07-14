package helloworld;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;





class KeyEventExample extends JFrame implements ActionListener,KeyListener{
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b;
    
    public KeyEventExample(){
    setLayout(null);
    setVisible(true);
    setSize(600,600);
    l1= new JLabel("Enter First Number");
    l2= new JLabel("Enter Second Number");
    l3= new JLabel("Result:");
    t1 = new JTextField(20);
    t2= new JTextField(20);
    t3 = new JTextField("Type s or d");
    b= new JButton("Sum");
    l1.setBounds(50,50,150,30);
    t1.setBounds(250,50,150,30);
    l2.setBounds(50,100,150,30);
    t2.setBounds(250,100,150,30);
    l3.setBounds(50,150,150,30);
    t3.setBounds(250,150,150,30);
    b.setBounds(100,200,100,50);
    add(b);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    b.addActionListener(this);
    t3.addKeyListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        String s1,s2;
        int n1,n2,n3;
        s1= t1.getText();
        s2= t2.getText();
        n1= Integer.parseInt(s1);
        n2= Integer.parseInt(s2);
        n3= n1+n2;
        t3.setText(String.valueOf(n3));
               
        
    }
    public void keyPressed(KeyEvent Ke){
         
        String s1,s2,s3;
        int n1,n2,n3 = 0;
        s1= t1.getText();
        s2= t2.getText();
        n1= Integer.parseInt(s1);
        n2= Integer.parseInt(s2);
        s3= t3.getText();
        if(Ke.getKeyChar()=='s'){
            n3= n1+n2;
        }
        else if(Ke.getKeyChar()=='d'){
            n3= n2-n1;
            
        }
        t3.setText(String.valueOf(n3));
    }
    public void keyTyped(KeyEvent Ke){
        
        
    
}
    public void keyReleased(KeyEvent Ke){
        
        
    }
} 

public class KeyEventDemo {
    
    public static void main(String[] args) {
        new KeyEventExample();
    }
}
