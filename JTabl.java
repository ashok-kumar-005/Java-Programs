import javax.swing.*;
import java.awt.event.*;
class JTabl  extends JFrame
{
	JFrame jf;

	JTabl()
	{
		 jf = new JFrame("JComboBox");
		
		String names[][]={{"1","Ashok","ad"},{"2","Tripti","djj"}};
		String col[]={"Id","Name","Add"};
		JTable jt = new JTable(names,col); 
		JScrollPane jsp = new JScrollPane(jt);
		jt.setBounds(10,10,200,30);
		//jb.setBounds(10,10,200,30);
		jf.add(jt);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		//jb.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*public void actionPerformed(ActionEvent ae)
	{
		String st = "Name selected : "+jcb.getSelectedItem();
		JOptionPane.showMessageDialog(this,st);
	}	*/
	public static void main(String a[])
	{
		JTabl c = new JTabl();
	}
}