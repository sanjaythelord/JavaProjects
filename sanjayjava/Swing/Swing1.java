import javax.swing.*;
public class Swing1{
    public static void main(String args[]) {
        JFrame a = new JFrame("gggg");
        JButton b = new JButton("click me");
        b.setBounds(40,90,100,20);
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
    }
}