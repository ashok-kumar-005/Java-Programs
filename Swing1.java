import javax.swing.*;
public class Swing1
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame("Swing");
		JButton jb = new JButton("Java");
		JButton jb2 = new JButton("Programming");
		jb.setBounds(100,100,300,20);
		jb2.setBounds(200,200,300,20);
		jf.add(jb); 
		jf.add(jb2);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}