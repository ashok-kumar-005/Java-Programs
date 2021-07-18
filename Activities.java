import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Activities  extends JFrame implements ItemListener,ActionListener
{
	String hobbies;

	JFrame jf;
	JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
	JRadioButton rb1,rb2,rb3,rb4,rb5;
	JButton jb;
	JLabel logo,jl1,jl2,jl3,jl4,q1,q2;
	
	Activities()
	{
		JFrame jf = new JFrame("User Activities");
		q1 = new JLabel("Select your hobbies ");
		
		cb1 = new JCheckBox("Caligraphy");
		cb2 = new JCheckBox("Writing");
		cb3 = new JCheckBox("Photography");
		cb4 = new JCheckBox("Blogging");
		cb5 = new JCheckBox("Cooking");
		cb6 = new JCheckBox("Travelling");
		cb7 = new JCheckBox("Meditation");

		Font  ckclr  = new Font("serif",  Font.BOLD, 17);
		cb1.setFont(ckclr);		
		cb1.setForeground(new Color(104, 217, 9));
		cb2.setFont(ckclr);		
		cb2.setForeground(new Color(104, 217, 9));
		cb3.setFont(ckclr);		
		cb3.setForeground(new Color(104, 217, 9));
		cb4.setFont(ckclr);		
		cb4.setForeground(new Color(104, 217, 9));
		cb5.setFont(ckclr);		
		cb5.setForeground(new Color(104, 217, 9));
		cb6.setFont(ckclr);		
		cb6.setForeground(new Color(104, 217, 9));
		cb7.setFont(ckclr);		
		cb7.setForeground(new Color(104, 217, 9));

		q2 = new JLabel("Select your favourite movie ");
		rb1 = new JRadioButton("Mr. Robot");
		rb2 = new JRadioButton("Halt & catch fire");
		rb3 = new JRadioButton("Silicon Valley");
		rb4 = new JRadioButton("Catch me if you can");
		rb5 = new JRadioButton("Snowden");
	
		jl1 = new JLabel("Your hobbies are : ");
		jl2 = new JLabel("Your favourite movie is : ");
		jl3 = new JLabel();
		jl4 = new JLabel();
		logo = new JLabel(new ImageIcon("java.png"));

		jb = new JButton(new ImageIcon("done.png"));
		jb.setText("done");		

		logo.setBounds(500,-120,320,585);
		q1.setBounds(10,358,280,30);
		q2.setBounds(10,400,250,30);

		cb1.setBounds(250,350,130,50);
		cb2.setBounds(385,350,100,50);
		cb3.setBounds(495,350,130,50);
		cb4.setBounds(640,350,120,50);
		cb5.setBounds(765,350,100,50);
		cb6.setBounds(875,350,120,50);
		cb7.setBounds(1000,350,130,50);


		
		rb1.setBounds(250,400,120,30);
		rb2.setBounds(370,400,160,30);
		rb3.setBounds(530,400,140,30);
		rb4.setBounds(670,400,180,30);
		rb5.setBounds(850,400,100,30);
		jb.setBounds(600,450,70,50);

		rb1.setFont(ckclr);		
		rb1.setForeground(new Color(104, 217, 9));
		rb2.setFont(ckclr);		
		rb2.setForeground(new Color(104, 217, 9));
		rb3.setFont(ckclr);		
		rb3.setForeground(new Color(104, 217, 9));
		rb4.setFont(ckclr);		
		rb4.setForeground(new Color(104, 217, 9));
		rb5.setFont(ckclr);		
		rb5.setForeground(new Color(104, 217, 9));
			
		jl1.setBounds(10,540,250,40);
		jl2.setBounds(10,560,250,50);
		jl3.setBounds(240,540,1000,40);
		jl4.setBounds(250,560,1000,50);
		
		Font  f1  = new Font("serif",  Font.BOLD, 21);
		jl1.setFont(f1);		
		jl1.setForeground(new Color(201, 8, 118));
		jl2.setFont(f1);		
		jl2.setForeground(new Color(201, 8, 118));

		q1.setFont(f1);		
		q1.setForeground(new Color(201, 8, 118));

		q2.setFont(f1);		
		q2.setForeground(new Color(201, 8, 118));

		jf.add(q1);
		jf.add(q2);
		jf.add(jl1);
		jf.add(jl2);
		jf.add(jl3);
		jf.add(jl4);
		jf.add(cb1);
		jf.add(cb2);
		jf.add(cb3);
		jf.add(cb4);
		jf.add(cb5);
		jf.add(cb6);
		jf.add(cb7);
		jf.add(jb);
		jf.add(logo);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		bg.add(rb5);

		jf.add(rb1);
		jf.add(rb2);
		jf.add(rb3);
		jf.add(rb4);
		jf.add(rb5);
		
		jf.setSize(1400,1400);
		jf.setLayout(null);
		jf.setVisible(true);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		cb7.addItemListener(this);
		
		jb.addActionListener(this);
		

		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		rb4.addActionListener(this);
		rb5.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public void itemStateChanged(ItemEvent e)
	{
		hobbies = "";
		if(cb1.isSelected() )
			hobbies += cb1.getText();
		
		if(cb2.isSelected())
			hobbies = hobbies+"  "+cb2.getText();
		
		if(cb3.isSelected())
			hobbies = hobbies+"  "+cb3.getText();

		if(cb4.isSelected())
			hobbies = hobbies+"  "+cb4.getText();

		if(cb5.isSelected())
			hobbies = hobbies+"  "+cb5.getText();

		if(cb6.isSelected())
			hobbies = hobbies+"  "+cb6.getText();

		if(cb7.isSelected())
			hobbies = hobbies+"  "+cb7.getText();

		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String movie="";
		//jl.setText("You have selected your fav movie as : ");
		if(rb1.isSelected())
			movie = rb1.getText();
			//movie = "Your favourite movies is : "+ae.getActionCommand();
		
		if(rb2.isSelected())
			movie = rb2.getText();

		if(rb3.isSelected())
			movie = rb3.getText();
		
		if(rb4.isSelected())
			movie = rb4.getText();

		if(rb5.isSelected())
			movie = rb5.getText();
	//			jl2.setText("Your favourite movies is : "+ae.getActionCommand();
		Font  f19  = new Font("serif",  Font.BOLD, 21);
		//textArea.setFont(new Font("Monaco", Font.PLAIN, 20));
		if(ae.getActionCommand()=="done")
		{
			jl3.setText(hobbies);
			jl3.setFont(f19);		
			jl3.setForeground(new Color(4, 93, 176));
			jl4.setText(movie);
			jl4.setFont(f19);
			jl4.setForeground(new Color(4, 93, 176));
		}
		// jl1.setForeground(Color.red);


	}

	public static void main(String args[])
	{
		Activities c = new Activities();
	}
}
