//By creating the object of Frame class (association)
import java.awt.*;  
class button2
{  
	button2()
	{  
		//Frame class
		Frame f=new Frame();  
		Button b=new Button("Click Me");  
		b.setBounds(30,50,80,30);  
		f.add(b);  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
	}  
	public static void main(String args[])
	{  
		button2 p=new button2();  
	}
} 