//By extending Frame class (inheritance)
import java.awt.*;  
class Button1 extends Frame
{  
	Button1()
	{  
		//Button class
		Button b=new Button("Click Me");  

		//Setting button position  
/*setBounds(int x, int y, int width, int height) - Specifies the size of the frame and the location
 of the upper left corner x axis to the right and y axis to the bottom*/
		b.setBounds(30,100,80,30);	
		
		//Adding button into frame  
		add(b);
		
		//Frame size - 300 width and 300 height  
		setSize(300,300);

		//No layout manager  
		setLayout(null);

		//Now frame will be visible, by default not visible  
		setVisible(true);
	}  
	public static void main(String args[])
	{  
		Button1 p=new Button1();  
	}
}  