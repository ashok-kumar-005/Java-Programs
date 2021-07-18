import javax.swing.*;
import javax.swing.event.*;
class JTable1  extends JFrame implements ListSelectionListener
{
	JFrame jf;
	JTable jt;
	JTable1()
	{
		 jf = new JFrame("JComboBox");
		
		String names[][]={{"1","Ashok","A"},{"2","Tripti","A"}};
		String col[]={"Id","Name","Grade"};
		jt = new JTable(names,col); 
		JScrollPane jsp = new JScrollPane(jt);
		jt.setCellSelectionEnabled(true);
		ListSelectionModel ls1 = jt.getSelectionModel();
		ls1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ls1.addListSelectionListener(this);  
		jt.setBounds(10,10,200,30);
		
		jf.add(jt);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		//jb.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent lse)
	{
		int row = jt.getSelectedRow();
		int col = jt.getSelectedColumn();
		String val = (String)jt.getValueAt(row,col);
		String sel = "Content selected is : "+val;
		JOptionPane.showMessageDialog(this,sel);
	}	
	public static void main(String a[])
	{
		JTable1 c = new JTable1();
	}
}