//Menu and MenuItem
import java.awt.*;  
class P8 
{  
    public static void main(String args[])  
    {  
                Frame f= new Frame("Menu and MenuItem");  
                MenuBar mb=new MenuBar(); 
 
                Menu menu=new Menu("File");                 
        
                MenuItem i1=new MenuItem("New");  
                MenuItem i2=new MenuItem("Open");  
                MenuItem i3=new MenuItem("Save");

        menu.add(i1);  
                menu.add(i2);  
                menu.add(i3);  

        //Adding Menu inside MenuBar
        mb.add(menu);  

        Menu submenu=new Menu("Save As");  
                MenuItem i4=new MenuItem("PDF");  
                MenuItem i5=new MenuItem("Word");  
                  
                submenu.add(i4);  
                submenu.add(i5);  

        //Adding SubMenu inside Menu
                menu.add(submenu);  
                
                f.setMenuBar(mb);  
                f.setSize(400,400);  
                f.setLayout(null);  
                f.setVisible(true);   
    }  
}  