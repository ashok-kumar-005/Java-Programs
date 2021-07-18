import java.awt.event.*;
import javax.swing.*;
public class Label extends JFrame implements ActionListener
{
	JFrame jf;
	JButton jb,jb2;
	JLabel jl,jl2,jl3;
	JTextField tf;
	Label()
	{
		jf = new JFrame("Labels");
		jb = new JButton("Java");
		jb2 = new JButton("Programming");
		jl = new JLabel("Java's First label");
		jl2 = new JLabel();
		jl3 = new JLabel();
		tf = new JTextField();
		jl.setBounds(10,10,200,10);
		jl2.setBounds(50,50,300,20);
		jl3.setBounds(50,70,300,20);
		jb.setBounds(10,30,150,20);
		jb2.setBounds(200,30,160,20);
		tf.setBounds(10,100,300,20);
		jf.add(jl);
		
		jf.add(tf);
		jf.add(jb); 
		jf.add(jb2);

		jf.add(jl2); 
		jf.add(jl3);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("Java"))
			jl2.setText("Java Button is pressed");
		else
			jl3.setText("Programming Button is pressed");
		//tf.setText("hello");
		if(s.equals("Java"))
			tf.setText("Java Button is pressed");
		else
			tf.setText("Programming Button is pressed");
	}
	public static void main(String args[])
	{
		Label l = new Label();
	}
}