import javax.swing.*;
import java.awt.event.*;
class Combo  extends JFrame implements ActionListener
{
	JFrame jf;
JComboBox jcb;
JButton jb;
JLabel jl;
	Combo()
	{
		 jf = new JFrame("JComboBox");
		
		String names[]={"Ashok","Tripti","C++","Data Structure"};
		 jl = new JLabel();
		 jcb = new JComboBox(names);
		 jb = new JButton("Click");
		jcb.setBounds(10,10,400,30);
		jb.setBounds(10,50,200,30);
		jl.setBounds(50, 100,300,20);
		jf.add(jcb);
		jf.add(jl);
		jf.add(jb);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		jb.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String st = "Name selected : "+jcb.getSelectedItem();
		jl.setText(st);
		//JOptionPane.showMessageDialog(this,st);
	}	
	public static void main(String a[])
	{
		Combo c = new Combo();
	}
}