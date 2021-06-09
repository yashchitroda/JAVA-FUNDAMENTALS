import javax.swing.*;  
public class CheckBox
{  
     	CheckBox()
	{  
        		JFrame f= new JFrame("CheckBox");  
        		JCheckBox checkBox1 = new JCheckBox("Core Java");  
        		checkBox1.setBounds(100,100, 100,50);  
        
		JCheckBox checkBox2 = new JCheckBox("Adavanced Java");  
        		checkBox2.setBounds(100,150, 150,50); 
	
		JCheckBox checkBox3 = new JCheckBox("Web Services");  
        		checkBox3.setBounds(100,200, 150,50);   
        
		f.add(checkBox1);  
        		f.add(checkBox2);  
		f.add(checkBox3);  
        
		f.setSize(400,400);  
        		f.setLayout(null);  
        		f.setVisible(true);  
     	}  
	public static void main(String args[])  
    	{  
    		new CheckBox();  
    	}
}