import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class ColorPixer extends JFrame implements ActionListener
{
	JFrame jf;
	JButton jb,jbl;
	JLabel jl;
	ColorPixer()
	{

		jf = new JFrame("Color Chooser");
		jb = new JButton("Select background color");
		jbl = new JButton("Select foreground color");
		jl = new JLabel("Hello world");
		jb.setBounds(100,100,200,20);
		jbl.setBounds(300,100,250,20);
		jl.setBounds(10,10,200,20);
		jf.add(jb); jf.add(jl); jf.add(jbl);
		jf.setSize(500,700);
		jf.setLayout(null);
		jf.setVisible(true);
		jb.addActionListener(this);
		jbl.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Color clr=Color.GREEN;
		Color newColor = JColorChooser.showDialog(this,"Select color",clr);
		jl.setBackground(newColor);
		jl.setForeground(newColor);
	}
	public static void main(String a[])
	{
		ColorPixer c = new ColorPixer();
	}
}