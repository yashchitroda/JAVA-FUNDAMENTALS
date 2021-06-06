//Java FlowLayout
/*The FlowLayout is used to arrange the components in a line, one after another (in a flow). It is the default layout of applet or panel.

Fields of FlowLayout class
    public static final int LEFT
    public static final int RIGHT
    public static final int CENTER*/

import java.awt.*;  
  
class P11
{  
    public static void main(String[] args) 
    {  
        Frame f=new Frame();  
      
        Button b1=new Button("1");  
            Button b2=new Button("2");  
            Button b3=new Button("3");  
            Button b4=new Button("4");  
            Button b5=new Button("5");  
              
            f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);  
      
             //Setting flow layout of right alignment  
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));    
  
            f.setSize(300,300);  
            f.setVisible(true);
    }  
}  