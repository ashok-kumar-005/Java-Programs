import javax.swing.*;
import java.awt.*;
class Testing extends Frame
{
Button b[];
Testing()
{
b=new Button[10];
for(int i=0;i<10;i++)
{
b[i]=new Button("Button " + (i));
add(b[i]);
}
setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
setSize(500,400);
setVisible(true);
}
public static void main(String args[])
{
Testing t1=new Testing();
}
}