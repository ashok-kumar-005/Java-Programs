import java.awt.event.*;
import java.awt.*;
 
import javax.swing.*;
class cardLayout extends JFrame implements ActionListener
{
	JFrame f;
	CardLayout card;
	Container c1;
	cardLayout()
	{
		f =new JFrame("JavaSlider");
		 JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
          c1 = getContentPane();
          card = new CardLayout(50,50);
          c1.setLayout(card);
    c1.add(b1);c1.add(b2);c1.add(b3);c1.add(b4);c1.add(b5);  
      
    
    //setting flow layout of right alignment  
	b1.addActionListener(this);
	b2.addActionListener(this);  
    f.setSize(300,300);  
    f.setVisible(true);  
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(c1);
	}
	public static void main(String a[])
	{
		cardLayout j = new cardLayout();
	}
}