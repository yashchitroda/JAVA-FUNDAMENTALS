import javax.swing.*;  
class account 
{  
	public static void main(String args[])  
    	{  
    		JFrame f= new JFrame("ACCOUNT");  
    		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;  

    		l1=new JLabel("CREATE ACCOUNT");  
    		l1.setBounds(330,20,1000,50);  
    
		    l2=new JLabel("UserName");  
    		l2.setBounds(50,100, 100,30); 

            l3=new JLabel("Password");  
            l3.setBounds(50,150, 100,30);  

            l4=new JLabel("Confirm Password");  
            l4.setBounds(50,200, 100,30);

            l5=new JLabel("Name");  
            l5.setBounds(50,250, 100,30);  

            l6=new JLabel("Email");  
            l6.setBounds(50,300, 100,30);

            l7=new JLabel("Age");  
            l7.setBounds(50,350, 100,30);  

            l8=new JLabel("Gender");  
            l8.setBounds(50,400, 100,30);
    
            l9=new JLabel("Contact");  
            l9.setBounds(50,450, 100,30);

		    f.add(l1); 
		    f.add(l2);  
            f.add(l3); 
            f.add(l4); 
            f.add(l5);  
            f.add(l6); 
            f.add(l7); 
            f.add(l8);  
            f.add(l9); 


            JTextField t1,t2,t3,t4,t5;  
            t1=new JTextField("");  
            t1.setBounds(160,100, 200,30);  
            f.add(t1); 

            t2=new JTextField("");  
            t2.setBounds(160,250, 200,30);  
            f.add(t2);

            t3=new JTextField("");  
            t3.setBounds(160,300, 200,30);  
            f.add(t3);

            t4=new JTextField("");  
            t4.setBounds(160,350, 200,30);  
            f.add(t4);

            t5=new JTextField("");  
            t5.setBounds(160,450, 200,30);  
            f.add(t5);
          

            JPasswordField value = new JPasswordField();       
            value.setBounds(160,150,200,30);    
            f.add(value);  
            JPasswordField value1 = new JPasswordField();
            value1.setBounds(160,200,200,30);    
            f.add(value1);

            JRadioButton r1=new JRadioButton("Male");    
            JRadioButton r2=new JRadioButton("Female");    
            JRadioButton r3=new JRadioButton("Others");  
        
            r1.setBounds(160,400,100,30);    
            r2.setBounds(260,400,100,30);   
            r3.setBounds(360,400,100,30);  
        
            ButtonGroup bg=new ButtonGroup();    
            bg.add(r1);
            bg.add(r2);    
            bg.add(r3);
        
            f.add(r1);
            f.add(r2);   
            f.add(r3);  

            JButton b=new JButton("Cancel");  
            b.setBounds(350,600,90,40);  
            f.add(b);  

            JButton b1=new JButton("Create");  
            b1.setBounds(500,600,90,40);  
            f.add(b1);
            

    		f.setSize(1000,800);  
    		f.setLayout(null);  
    		f.setVisible(true);  
   	}  
}  