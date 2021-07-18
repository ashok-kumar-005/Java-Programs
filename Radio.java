import javax.swing.*;
import java.awt.event.*;
class Radio extends JFrame implements ActionListener
{
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;
	JFrame jf;
	JLabel jl;
	Radio()
	{
		jf = new JFrame("Radio Button");
		rb1 = new JRadioButton("Mr. Robot");
		rb2 = new JRadioButton("Halt & catch fire");
		rb3 = new JRadioButton("Silicon Valley");
		jl = new JLabel();
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		rb1.setBounds(10,10,100,30);
		rb2.setBounds(120,10,150,30);
		rb3.setBounds(270,10,350,30);
		jl.setBounds(10,50,800,20);
		jf.add(rb1);
		jf.add(rb2);
		jf.add(rb3);
		jf.add(jl);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		jf.setLayout(null);
		jf.setSize(1000,1000);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//jl.setText("You have selected your fav movie as : ");
		if(rb1.isSelected())
		{
			jl.setText(ae.getActionCommand());
			//JOptionPane.showMessageDialog(this,"Red ");
		}
		else if(rb2.isSelected())
		{
			jl.setText("You have selected your fav movie as : "+ae.getActionCommand());
			//JOptionPane.showMessageDialog(this,"Brown ");
		
		}
		else if(rb3.isSelected())
		{
			jl.setText("You have selected your fav movie as : "+ae.getActionCommand());
			//JOptionPane.showMessageDialog(this,"Yellow ");
		}
		
	}
	public static void main(String args[])
	{
		Radio r = new Radio();
	}
}