
import java.awt.event.*;
import javax.swing.*;
public class EventListner
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame("Active Listner");
		JButton jb = new JButton("Add");
		JButton jb2 = new JButton("Multiplication");
		JButton jb3 = new JButton("Subtraction");
		JButton jb4 = new JButton("Division");
		JButton jb5 = new JButton("modulous");
		JTextField jt=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();
		
		jt.setBounds(100,120,50,20);
		jt2.setBounds(180,120,50,20);
		jt3.setBounds(100,150,50,20);
		jb.setBounds(100,180,100,20);
		jb2.setBounds(100,180,100,20);
		jb3.setBounds(220,180,100,20);
		jb4.setBounds(340,180,100,20);
		jb5.setBounds(460,180,100,20);
		

		jf.add(jb);
		jf.add(jb2);
		jf.add(jb3);
		jf.add(jb4);
		jf.add(jb5); 
		jf.add(jt);
		jf.add(jt2);
		jf.add(jt3);
		jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(jt.getText());
				int b = Integer.parseInt(jt2.getText());
				int c = a+b;
				jt3.setText(String.valueOf(c));
			}
		});
		jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(jt.getText());
				int b = Integer.parseInt(jt2.getText());
				int c = a*b;
				jt3.setText(String.valueOf(c));
			}
		});
	   jb3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(jt.getText());
				int b = Integer.parseInt(jt2.getText());
				int c = a-b;
				jt3.setText(String.valueOf(c));
			}
		});
	   jb4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(jt.getText());
				int b = Integer.parseInt(jt2.getText());
				int c = a/b;
				jt3.setText(String.valueOf(c));
			}
		});
	   jb5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(jt.getText());
				int b = Integer.parseInt(jt2.getText());
				int c = a%b;
				jt3.setText(String.valueOf(c));
			}
		});
		jf.setSize(800,800);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}