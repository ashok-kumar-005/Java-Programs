import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Bar extends JFrame implements ActionListener
{
	JFrame jf;
	JProgressBar jpb;
	int i = 0;
	Bar()
	{
		jf = new JFrame("Progress bar");
		jpb = new JProgressBar(0,100);
		jpb.setBounds(100,100,300,40);
		jpb.setValue(30);
		jpb.setStringPainted(true);
		jf.add(jpb);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true); 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	void display()
	{
		int j=50;
		int k =150;
		int l = 255;
		for(;i<=100;i++,j++,k++,l--)
		{
			jpb.setValue(i);
			jpb.setForeground(new Color(k,l,j));
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{}
			if(i==100)
			{
				JOptionPane.showMessageDialog(this,"Oh yead !!!");
			}
		}
	}
	public void actionPerformed(ActionEvent ae)
	{

	}
	public static void main(String args[])
	{
		Bar b = new Bar();
		b.display();
	}
}