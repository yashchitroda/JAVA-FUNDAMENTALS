//Java BorderLayout
/*The BorderLayout is used to arrange the components in five regions: north, south, east, west and center. Each region (area) may contain one component only. It is the default layout of frame or window. The BorderLayout provides five constants for each region:

    public static final int NORTH
    public static final int SOUTH
    public static final int EAST
    public static final int WEST
    public static final int CENTER*/

import java.awt.*;  
 
class P9
{  
    public static void main(String[] args) 
    {  
        Frame f=new Frame();  
      
            Button b1=new Button("NORTH");
            Button b2=new Button("SOUTH");
            Button b3=new Button("EAST");
            Button b4=new Button("WEST");
            Button b5=new Button("CENTER");
      
            f.add(b1,BorderLayout.NORTH);  
            f.add(b2,BorderLayout.SOUTH);  
            f.add(b3,BorderLayout.EAST);  
            f.add(b4,BorderLayout.WEST);  
            f.add(b5,BorderLayout.CENTER); 
      
            f.setSize(500,500);  
            f.setVisible(true);      
    }  
}  