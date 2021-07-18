import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class IPAddress extends JFrame implements ActionListener
{
	JFrame jf = new JFrame("IP Address");
	JTextField jt;
	JLabel jl;
	JButton jb;
	JLabel jl2;
	IPAddress()
	{
		jt = new JTextField();		
		jl = new JLabel();
		jb = new JButton("Get IP Address");
		jl2 = new JLabel();
		jt.setBounds(10,30,200,20);
		
		jb.setBounds(10,50,200,20);
		jl.setBounds(10,80,350,70);
		jl2.setBounds(10,200,450,70);
		jf.add(jl2);
		jf.add(jt);
		jf.add(jl);
		jf.add(jb);
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setVisible(true);
		jb.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String host = jt.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			jl.setText("IP of "+host+" is : "+ip);
			jl2.setText("Host is : "+java.net.InetAddress.getByName(host));
		}
		catch(Exception ex){}
	}
	public static void main(String args[])
	{
		IPAddress i = new IPAddress();
	}
}