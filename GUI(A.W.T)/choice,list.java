//Choice and List
import java.awt.*;  
class P7
{  
    public static void main(String args[])  
    {           
                Frame f= new Frame();  

        Label l1=new Label("Select Item");  
        l1.setBounds(40,100, 100,30);
        f.add(l1);

                Choice c=new Choice();  
                c.setBounds(150,100, 100,75);  
                c.add("Vada Pav");  
                c.add("Pani Puri");  
                c.add("Sev Puri");  
                c.add("Dabeli");  
                c.add("Samosa");  
        
        f.add(c);  

        Label l2=new Label("Select Item");  
        l2.setBounds(40,200, 100,30);
        f.add(l2);

        List lst=new List(5);  
                lst.setBounds(150,200, 100,75);  
                lst.add("Vada Pav");  
                lst.add("Pani Puri");  
                lst.add("Sev Puri");  
                lst.add("Dabeli");  
                lst.add("Samosa");  
                f.add(lst);  

                f.setSize(400,400);  
                f.setLayout(null);  
                f.setVisible(true);  
    }  
}  