package helloworld;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class TextBoxDemo extends JFrame{
 JTextArea ta;
  public TextBoxDemo(){
     setLayout(null);
     ta= new JTextArea("Welcome to Swing Components!!!");
     ta.setBounds(50,50,200,200);
     setSize(300,300);
     setVisible(true);
     add(ta);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}

public class TextBox  {
    public static void main(String[] args) {
        new TextBoxDemo();
    }
}
