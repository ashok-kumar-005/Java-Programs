import javax.swing.*;
import java.awt.event.*;
class OnOff extends JFrame implements ItemListener
{
	JLabel jl;
	JToggleButton tjb;
	JFrame jf;
	OnOff()
	{
		jf = new JFrame("On/Off Button");
		jl = new JLabel("Button is off.");
		tjb = new JToggleButton("ON/OFF");
		jl.setBounds(100,10,200,20);
		tjb.setBounds(10,10,80,20);
		tjb.addItemListener(this);
		jf.add(jl);
		jf.add(tjb);
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(tjb.isSelected())
		{
			jl.setText("Button is on.");
			//tjb = new JToggleButton(new ImageIcon("red.png"));		
		}
		else
		{
			jl.setText("Button is off.");
			//tjb = new JToggleButton(new ImageIcon("red.png"));	
		}
	
	}
	public static void main(String args[])
	{
		OnOff o =new OnOff();
	}	
}
