import java.awt.event.*;
import javax.swing.*;
class SwingEvent
{
	public static void main(String args[])
	{	
		JFrame jf = new JFrame("Event Frame");
		JButton jb = new JButton("Submit");
		jb.setBounds(100,120,200,100);
		jf.setSize(500,500);
		JLabel jl = new JLabel("Press Submit.");
		jf.add(jb);
		jf.add(jl);
		jb.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent a)
									{
										jl.setText("You have successfully submit.");
									}
								});
		
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}