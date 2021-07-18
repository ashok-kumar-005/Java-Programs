import javax.swing.*; 
import java.awt.*; 
class Testing extends JFrame 
{ 
	Testing() 
	{ 
		JFrame f1=new JFrame("GridLayout"); 
	JButton b1=new JButton("1"); 
	JButton b2=new JButton("2"); 
	JButton b3=new JButton("3"); 
	JButton b4=new JButton("4"); 
JButton b5=new JButton("5"); 
JButton b6=new JButton("6"); 
JButton b7=new JButton("7"); 
JButton b8=new JButton("8"); 
JButton b9=new JButton("9"); f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5); f1.add(b6);f1.add(b7);f1.add(b8);f1.add(b9); 
f1.setLayout(new FlowLayout(FlowLayout.LEFT)); 
f1.setSize(300,300); 
f1.setVisible(true); 
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
public static void main(String args[]) 
{ Testing t1=new Testing(); 
} 
}