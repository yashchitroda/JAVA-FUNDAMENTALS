//Java CardLayout
/*The CardLayout class manages the components in such a manner that only one component is visible at a time. It treats each component as a card that is why it is known as CardLayout.*/

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

//class extends JFrame and implements actionlistener 
public class p12 extends JFrame implements ActionListener
{  
    //Declaration of objects of CardLayout class. 
    CardLayout card;  

    //Declaration of objects of JButton class. 
    JButton b1,b2,b3;  

    // Declaration of objects of Container class to get the content 
    Container c;  
        p12()
    {            
        //Gets the content
                c=getContentPane();  

        //CardLayout class object with 40 horizontal space and 30 vertical space . 
                card=new CardLayout(40,30);         
                c.setLayout(card);  
          
            b1=new JButton("Core Java");  
                b2=new JButton("is very");  
                b3=new JButton("Easy ....");  
                
        b1.addActionListener(this);  
                b2.addActionListener(this);  
                b3.addActionListener(this);  
              
                c.add(b1);
        c.add(b2);
        c.add(b3);                            
        }  
        public void actionPerformed(ActionEvent e) 
    {  
        //Call the next card 
            card.next(c);  
    }  
  
        public static void main(String[] args) 
    {  
                p12 cl=new p12();  
                cl.setSize(400,400);  
                cl.setVisible(true);  

         //Function to set default operation of JFrame. 
                cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
        }  
}  