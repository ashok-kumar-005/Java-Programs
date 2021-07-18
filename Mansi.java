//import javax.swing.*; 
import javax.swing.event.*;
class testing extends JFrame implements ChangeListener 
{
	 JSlider s1;
	 //JLabel l1;
	 JFrame jf =new JFrame("JavaSlider");
	 testing() 
		{
		 s1=new JSlider(JSlider.HORIZONTAL,0,100,5);
		 //l1=new JLabel("Slide To Increase The Label Size"); 
		 s1.setMinorTickSpacing(5); 
		 s1.setMajorTickSpacing(10); 
		 s1.setPaintLabels(true); 
		s1.setPaintTicks(true);
		 JPanel p1=new JPanel(); 
		p1.add(s1); 
		add(p1);
		//add(l1);
		p1.setBounds(200,100,100,1000);
		//l1.setBounds(100,400,100,1000);
		 
		jf.setSize(400,400); 
		jf.setVisible(true); 
		jf.setLayout(null); 
		s1.addChangeListener(this);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		} 
		public void stateChanged(ChangeEvent e)
		 { 
		String msg="Current value is: " + s1.getValue();
		//int height=s1.getValue()+100;
		//int width=s1.getValue()+100;
		JOptionPane.showMessageDialog(this,msg);
		//l1.setBounds(50,50,height,width); 
		}
		 public static void main(String args[])
		 {
			 testing t1=new testing();
 }
 }