import javax.swing.*;  
class Label
{  
	public static void main(String args[])  
    	{  
    		JFrame f= new JFrame("Label");  
    		JLabel l1,l2;  

    		l1=new JLabel("Label 1");  
    		l1.setBounds(50,50, 100,30);  
    
		l2=new JLabel("Label 2");  
    		l2.setBounds(50,100, 100,30);  
    
		f.add(l1); 
		f.add(l2);  
    		f.setSize(300,300);  
    		f.setLayout(null);  
    		f.setVisible(true);  
   	}  
}  