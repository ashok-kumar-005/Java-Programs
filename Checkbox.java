import java.awt.event.*;
import javax.swing.*;
class Checkbox  extends JFrame implements ItemListener
{
	JFrame jf;
	JCheckBox cb1; 
	JCheckBox cb2; 
	JCheckBox cb3; 
	JLabel jl;
	Checkbox()
	{

		JFrame jf = new JFrame("CheckBox Swing");
		cb1 = new JCheckBox("Red");
		cb2 = new JCheckBox("Brown");
		cb3 = new JCheckBox("Yellow");
		jl = new JLabel("Nothing is checked");
		jl.setBounds(10,300,200,50);
		cb1.setBounds(10,10,100,50);
		cb2.setBounds(10,100,100,50);
		cb3.setBounds(10,200,100,50);
		jf.add(jl);
		jf.add(cb1);
		jf.add(cb2);
		jf.add(cb3);
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public void itemStateChanged(ItemEvent e)
	{

		if(cb1.isSelected())
		{
			jl.setText(cb1.getText()+" is Selected");
			//JOptionPane.showMessageDialog(this,"Red ");
		}
		else if(cb2.isSelected())
		{
			jl.setText(cb2.getText()+" is Selected");
			//JOptionPane.showMessageDialog(this,"Brown ");
		
		}
		else if(cb3.isSelected())
		{
			jl.setText(cb3.getText()+" is Selected");
			//JOptionPane.showMessageDialog(this,"Yellow ");
		}
		

		
	}

	public static void main(String args[])
	{
		Checkbox c = new Checkbox();
	}
}