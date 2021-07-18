import javax.swing.event.*;
import javax.swing.*;
class JavaSlider extends JFrame implements ChangeListener
{
	JSlider js;
	JLabel jl;
	JavaSlider()
	{
		JFrame jf =new JFrame("JavaSlider");
		js =new JSlider(JSlider.HORIZONTAL,0,100,10);
		js.setMinorTickSpacing(5);
		js.setMajorTickSpacing(10);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		jl = new JLabel();
	jl.setBounds(100,400,100,20);
		JPanel jp = new JPanel();
		jp.add(js);
		jf.add(jp);
	
	//	jf.add(jl);

		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setLayout(null);
		js.addChangeListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void stateChanged(ChangeEvent ce)
	{
		String message = "Current value is "+js.getValue();
		jl.setText(message);
		//JOptionPane.showMessageDialog(message);
	}
	public static void main(String a[])
	{
		JavaSlider j = new JavaSlider();
	}
}