import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Choice  extends JFrame implements ItemListener,ActionListener
{
	String hobbies;

	JFrame frame;
	JCheckBox check1,check2,check3,check4,check5;
	JRadioButton radio1,radio2,radio3,radio4,radio5;
	JButton button;
	JLabel label1,label2,label3,label4,label5,label6;
	
	Choice()
	{
		JFrame frame = new JFrame("User Choice");
		label1 = new JLabel("What's your hobbies ");
		
		check1 = new JCheckBox("Shopping");
		check2 = new JCheckBox("Dancing");
		check3 = new JCheckBox("Blogging");
		check4 = new JCheckBox("Swimming");
		check5 = new JCheckBox("Travelling");
		

		
		label2 = new JLabel("What's your favourite movie ");
		radio1 = new JRadioButton("Inception");
		radio2 = new JRadioButton("Mad Max");
		radio3 = new JRadioButton("Mission");
		radio4 = new JRadioButton("Avengers");
		radio5 = new JRadioButton("Lion");
	
		label3 = new JLabel("Your hobbies : ");
		label4 = new JLabel("Your favourite movie : ");
		label5 = new JLabel();
		label6 = new JLabel();
		

		button = new JButton("Submit your response");		

		
		label1.setBounds(200,40,280,20);
		

		check1.setBounds(10,100,130,30);
		check2.setBounds(140,100,100,30);
		check3.setBounds(250,100,100,30);
		check4.setBounds(350,100,120,30);
		check5.setBounds(500,100,100,30);
		

		label2.setBounds(200,150,250,30);
		
		radio1.setBounds(10,200,120,30);
		radio2.setBounds(130,200,100,30);
		radio3.setBounds(240,200,100,30);
		radio4.setBounds(350,200,100,30);
		radio5.setBounds(450,200,100,30);
		button.setBounds(200,300,200,30);

		label3.setBounds(10,400,120,40);
		label4.setBounds(10,430,150,50);
		label5.setBounds(150,400,1000,40);
		label6.setBounds(150,430,1000,50);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(check1);
		frame.add(check2);
		frame.add(check3);
		frame.add(check4);
		frame.add(check5);
		
		frame.add(button);
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		bg.add(radio3);
		bg.add(radio4);
		bg.add(radio5);

		frame.add(radio1);
		frame.add(radio2);
		frame.add(radio3);
		frame.add(radio4);
		frame.add(radio5);
		
		frame.setSize(1400,1400);
		frame.setLayout(null);
		frame.setVisible(true);
		check1.addItemListener(this);
		check2.addItemListener(this);
		check3.addItemListener(this);
		check4.addItemListener(this);
		check5.addItemListener(this);
		
		
		button.addActionListener(this);
		

		radio1.addActionListener(this);
		radio2.addActionListener(this);
		radio3.addActionListener(this);
		radio4.addActionListener(this);
		radio5.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public void itemStateChanged(ItemEvent e)
	{
		hobbies = "";
		if(check1.isSelected() )
			hobbies += check1.getText();
		
		if(check2.isSelected())
			hobbies = hobbies+"  "+check2.getText();
		
		if(check3.isSelected())
			hobbies = hobbies+"  "+check3.getText();

		if(check4.isSelected())
			hobbies = hobbies+"  "+check4.getText();

		if(check5.isSelected())
			hobbies = hobbies+"  "+check5.getText();

	}
	public void actionPerformed(ActionEvent ae)
	{
		String movie="";
		//jl.setText("You have selected your fav movie as : ");
		if(radio1.isSelected())
			movie = radio1.getText();
			//movie = "Your favourite movies is : "+ae.getActionCommand();
		
		if(radio2.isSelected())
			movie = radio2.getText();

		if(radio3.isSelected())
			movie = radio3.getText();
		
		if(radio4.isSelected())
			movie = radio4.getText();

		if(radio5.isSelected())
			movie = radio5.getText();
		if(ae.getActionCommand()=="Submit your response")
		{
			label5.setText(hobbies);
			label6.setText(movie);
		}
	}

	public static void main(String args[])
	{
		Choice c = new Choice();
	}
}
