import java.awt.*;
import javax.swing.*;
class JavaGridLayout extends JFrame
{
	JSlider js;
	JLabel jl;
	JavaGridLayout()
	{
		JFrame jf =new JFrame("JavaSlider");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("4");
		JButton b4 = new JButton("10");
		JButton b5 = new JButton("54");
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		jf.add(b5);
	//	jf.add(jl);
		jf.setLayout(new GridLayout(2,3));
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String a[])
	{
		JavaGridLayout j = new JavaGridLayout();
	}
}