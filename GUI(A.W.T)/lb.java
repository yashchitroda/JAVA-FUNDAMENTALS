//Labels and Buttons
import java.awt.*;  
class lb
{  
	public static void main(String args[])
	{  
    		Frame f= new Frame("Labels and Buttons");  

		//Labels
		Label l1,l2;  
    		l1=new Label("Label 1");  
   		l1.setBounds(50,100, 100,30); 
 
    		l2=new Label("Label 2");  
    		l2.setBounds(50,150, 100,30);  

    		f.add(l1); 
		f.add(l2);     		

		//Buttons
		Button b1, b2;
		b1=new Button("Label 1");  
		b1.setBounds(160,100, 100,30); 
	
		b2=new Button("Label 2");  
		b2.setBounds(160,150, 100,30); 
		 
		f.add(b1);  
		f.add(b2); 

		f.setSize(400,400);  
    		f.setLayout(null);  
    		f.setVisible(true);  
	}  
}  