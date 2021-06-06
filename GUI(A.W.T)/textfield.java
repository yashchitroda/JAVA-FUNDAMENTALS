//TextField
import java.awt.*;  
class textfield

{  
	public static void main(String args[])
	{  
    		Frame f= new Frame("TextField");  

		//Labels
		Label l1,l2;  
    		l1=new Label("Username");  
   		l1.setBounds(50,100, 100,30); 
 
    		l2=new Label("Password");  
    		l2.setBounds(50,150, 100,30);  

    		f.add(l1); 
		f.add(l2);     

		//TextField
		TextField t1,t2;  
    		t1=new TextField();  //Textbox
    		t1.setBounds(160,100, 100,30);  

    		t2=new TextField();  
    		t2.setBounds(160,150, 100,30);  

    		f.add(t1); 
		f.add(t2);  		

		//Buttons
		Button b1, b2;
		b1=new Button("cancel");  
		b1.setBounds(50,200,50,40); 
	
		b2=new Button("login");  
		b2.setBounds(120,200,50,40); 
		 
		f.add(b1);  
		f.add(b2); 

		f.setSize(600,400);  
    		f.setLayout(null);  
    		f.setVisible(true);  
	}  
}  