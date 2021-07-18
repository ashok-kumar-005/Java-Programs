import javax.awt.*;
import javax.swing.*;
class JavaLayout extends JFrame implements ChangeListener
{
	JSlider js;
	JLabel jl;
	JavaSlider()
	{
		JFrame jf =new JFrame("JavaSlider");
		JButton b1 = new JButton("A");
		JButton b2 = new JButton("e");
		JButton b3 = new JButton("r");
		JButton b4 = new JButton("f");
		JButton b5 = new JButton("b");
		jf.add(b1,BorderLayout.EAST);
		jf.add(b2,BorderLayout.WEST);
		jf.add(b3,BorderLayout.NORTH);
		jf.add(b4,BorderLayout.SOUTH);
		jf.add(b5,BorderLayout.CENTER);
	//	jf.add(jl);

		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setLayout(null);
		js.addChangeListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String a[])
	{
		JavaSlider j = new JavaSlider();
	}
}