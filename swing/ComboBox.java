import javax.swing.*;    
public class ComboBox
{    
	JFrame f;    
	ComboBox()
	{    
    		f=new JFrame("ComboBox");    
    		String course[]={"FYBSc (CS)","SYBSc (CS)","TYBSc (CS)", "FYBSc (IT)","SYBSc (IT)","TYBSc (IT)"};        
    	
		JComboBox cb=new JComboBox(course);    
    		cb.setBounds(50, 50,90,20);    
    		f.add(cb);        
    		f.setLayout(null);    
    		f.setSize(400,500);    
    		f.setVisible(true);         
	}    
	public static void main(String[] args) 
	{    
    		new ComboBox();         
	}    
}   