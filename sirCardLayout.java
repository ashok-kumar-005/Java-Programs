import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Testing extends JFrame implements ActionListener
{
CardLayout card;
JButton b1,b2,b3;
Container c1;
Testing()
{
JFrame f1=new JFrame();
b1=new JButton("Button 1");
b2=new JButton("Button 2");
b3=new JButton("Button 3");
c1=getContentPane();
card=new CardLayout(50,50);
c1.setLayout(card);
c1.add(b1);c1.add(b2);c1.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f1.add(c1);
f1.setSize(400,400);
f1.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
card.next(c1);
}
public static void main(String args[])
{
Testing t1=new Testing();
}
}