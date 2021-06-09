import javax.swing.*;    
public class RadioButton
{    
	JFrame f;    
	RadioButton()
	{    
		f=new JFrame();     
		JRadioButton r1=new JRadioButton("Male");    
		JRadioButton r2=new JRadioButton("Female");    
		JRadioButton r3=new JRadioButton("Others");  
		
		r1.setBounds(160,50,100,30);    
		r2.setBounds(160,100,100,30);   
		r3.setBounds(160,150,100,30);  
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);
		bg.add(r2);    
		bg.add(r3);
		
		f.add(r1);
		f.add(r2);   
		f.add(r3);     
		
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
	}    
	public static void main(String[] args) 
	{    
    		new RadioButton();    
	}    
}    