/*Write a Program to create a GUI application to calculate the Net Salary of the
Employee. (Basic Salary in Rs. and TA, DA, HRA in % to be taken by the user).
Net Salary = Basic Salary + TA + DA + HRA */
import java.awt.event.*;
import javax.swing.*;
public class Salary extends JFrame implements ActionListener
{
	JFrame jf;
	JLabel net,sal,ta,da,hra;
	JButton calculate;
	
	JTextField netsal,basic,TA,DA,HRA;	

	Salary() 	
	{
		jf = new JFrame("Employee Salary");
		sal = new JLabel("Enter basic salary ");
		ta = new JLabel("Enter TA % ");
		da = new JLabel("Enter DA % ");
		hra = new JLabel("Enter HRA % ");
		net = new JLabel("Net Salary ");
		//jb = new JButton("Add");
		basic=new JTextField();
		TA=new JTextField();
		DA=new JTextField();
		HRA=new JTextField();
		netsal=new JTextField();

		basic.setText("Basic Salary");
		TA.setText("TA");
		DA.setText("DA");
		HRA.setText("HRA");
		netsal.setText("Net Salary");
		
		//jb5 = new JButton("Modulous");
		
		calculate = new JButton("Calculate");
		sal.setBounds(10,10,150,30);
		ta.setBounds(10,40,150,30);
		da.setBounds(10,70,150,30);
		hra.setBounds(10,100,150,30);
		net.setBounds(10,140,150,30);
		
		
		
		basic.setBounds(150,10,80,30);
		TA.setBounds(150,40,80,30);
		DA.setBounds(150,70,80,30);
		HRA.setBounds(150,100,80,30);
		netsal.setBounds(150,140,80,30);
		calculate.setBounds(10,180,100,30);
		jf.add(sal);
		jf.add(netsal);
		jf.add(net);
		jf.add(ta);
		jf.add(da);
		jf.add(hra);
		jf.add(basic);
		jf.add(TA);
		jf.add(DA);
		jf.add(HRA); 
		jf.add(calculate); 
		
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		calculate.addActionListener(this);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent e)
			{
				String str = e.getActionCommand();
				if(str.equals("Calculate"))
				{
					float t = ((Float.parseFloat(basic.getText()) * Float.parseFloat(TA.getText())))/100;
					float d = ((Float.parseFloat(basic.getText()) * Float.parseFloat(DA.getText())))/100;
					float h = ((Float.parseFloat(basic.getText()) * Float.parseFloat(HRA.getText())))/100;
					
					netsal.setText(String.valueOf(t+d+h+Float.parseFloat(basic.getText())));
					
				}
				
			}
	public static void main(String args[])
	{
		Salary s = new Salary();
	}

}