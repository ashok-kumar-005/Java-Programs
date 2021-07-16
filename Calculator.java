
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener
{
	JFrame jf;
	JLabel l1,l2,l3;
	JButton jb;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	JTextField jt;	
	JTextField jt2;  //
	JTextField jt3;
	Calculator() 	//public static void main(String args[])
	{
		jf = new JFrame("Active Listner");
		l1 = new JLabel("Enter number 1 ");
		l2 = new JLabel("Enter number 2 ");
		l3 = new JLabel("Result ");
		//jb = new JButton("Add");
		jb = new JButton(new ImageIcon("Add.png"));
		jb.setText("Add");
		jb2 = new JButton(new ImageIcon("Mul.png"));
		jb2.setText("Multiplication");
		jb3 = new JButton(new ImageIcon("Div.png"));
		jb3.setText("Division");
		jb4 = new JButton(new ImageIcon("Mod.png"));
		jb4.setText("Modulous");
		jb5 = new JButton(new ImageIcon("Sub.png"));
		jb5.setText("Subtraction");
		//jb4 = new JButton("Division");
		//jb5 = new JButton("Modulous");
		jt=new JTextField();
		jt2=new JTextField();
		jt3=new JTextField();
		
		l1.setBounds(10,10,150,60);
		jt.setBounds(110,30,50,20);
		l2.setBounds(180,10,150,60);
		jt2.setBounds(280,30,50,20);
		l3.setBounds(10,40,50,60);
		jt3.setBounds(70,60,50,20);
		
		
		jb.setBounds(10,100,30,20);
		jb2.setBounds(43,100,30,20);
		jb3.setBounds(76,100,30,20);
		jb4.setBounds(109,100,30,20);
		jb5.setBounds(145,100,30,20);
		
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(jb);
		jf.add(jb2);
		jf.add(jb3);
		jf.add(jb4);
		jf.add(jb5); 
		jf.add(jt);
		jf.add(jt2);
		jf.add(jt3);
		jf.setSize(200,200);
		jf.setLayout(null);
		jf.setVisible(true);
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent e)
			{
				String str = e.getActionCommand();
				if(str.equals("Add"))
				{
					jt3.setText(String.valueOf(Integer.parseInt(jt.getText())+Integer.parseInt(jt2.getText())));
					// int a = Integer.parseInt(jt.getText());int b = Integer.parseInt(jt2.getText()); int c = a+b; jt3.setText(String.valueOf(c)); 
				}
				else if(str.equals("Multiplication"))
					jt3.setText(String.valueOf(Integer.parseInt(jt.getText())*Integer.parseInt(jt2.getText())));
				else if(str.equals("Division"))
					jt3.setText(String.valueOf(Integer.parseInt(jt.getText())/Integer.parseInt(jt2.getText())));
				else if(str.equals("Modulous"))
					jt3.setText(String.valueOf(Integer.parseInt(jt.getText())%Integer.parseInt(jt2.getText())));
				else if(str.equals("Subtraction"))
					jt3.setText(String.valueOf(Integer.parseInt(jt.getText())-Integer.parseInt(jt2.getText())));
			}
								



				/*int a = Integer.parseInt(jt.getText());
				int b = Integer.parseInt(jt2.getText());
				int c = a+b;
				jt3.setText(String.valueOf(c));*/
			
		

	public static void main(String args[])
	{
		Calculator c = new Calculator();
	}

}
