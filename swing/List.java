import javax.swing.*;  
public class List 
{  
     	List()
	{  
        		JFrame f= new JFrame();  
        		DefaultListModel<String> l1 = new DefaultListModel<>();  
          		
		l1.addElement("Sev Puri");  
          		l1.addElement("Dahi Puri");  
          		l1.addElement("Pani Puri");  
          		l1.addElement("Papadi Chaat"); 
		l1.addElement("Dahi Papadi Chaat"); 
		l1.addElement("Dabeli");
		l1.addElement("Amul Butter Dabeli");  
          
		JList<String> list = new JList<>(l1);  
          		list.setBounds(100,100, 150,150);  
          
		f.add(list);  
          		f.setSize(400,400);  
          		f.setLayout(null);  
          		f.setVisible(true);  
    	}  
	public static void main(String args[])  
    	{  
   		new List();  
    	}
}  