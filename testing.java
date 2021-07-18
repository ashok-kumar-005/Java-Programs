import javax.swing.*; 
import javax.swing.event.*;
class testing extends JFrame implements ChangeListener 
{
	 JSlider s1;
	 JLabel l1,display;

	 testing() 
		{
			JFrame jf =new JFrame("JavaSlider");
		 s1=new JSlider(JSlider.HORIZONTAL,1,10,1);
		 l1=new JLabel("Move slider to check factorial of a number---> "); 
		 s1.setMinorTickSpacing(1); 
		 s1.setMajorTickSpacing(1); 
		s1.setPaintLabels(true); 
		s1.setPaintTicks(true);
		 JPanel p1=new JPanel(); 
		
		p1.setBounds(20,10,500,100);
		l1.setBounds(20,200,300,30);
	    display = new JLabel("");
	    display.setBounds(340,200,1000,30);
	    
		jf.setSize(600,600); 
		jf.setVisible(true); 
		jf.setLayout(null); 
		p1.add(s1); 
		jf.add(p1);
		jf.add(l1);
		jf.add(display);
		s1.addChangeListener(this);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		} 
		public void stateChanged(ChangeEvent e)
		 { 
			int msg=s1.getValue();
			int fact=1;
			for(int i=1;i<=msg;i++)
				fact *= i;
			display.setText("Fact of "+String.valueOf(msg)+" is "+String.valueOf(fact));
		
		}
		 public static void main(String args[])
		 {
			 testing t1=new testing();
 		}
 }