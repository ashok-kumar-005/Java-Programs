import java.awt.*; 
import javax.swing.*;
class FlowLayout extends JFrame
{
	
	FlowLayout()
	{
		JFrame f =new JFrame("JavaSlider");
		 JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
      
    f.setLayout(new FlowLayout(FlowLayout.LEFT));
    //setting flow layout of right alignment  
  
    f.setSize(300,300);  
    f.setVisible(true);  
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String a[])
	{
		FlowLayout j = new FlowLayout();
	}
}