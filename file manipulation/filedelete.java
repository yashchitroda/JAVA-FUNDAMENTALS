import java.io.*; 
public class filedelete
{
	public static void main(String [] args) throws IOException
	{
        File f = new File ("Documents//java programs//demo1.txt");
        boolean deletefile = f.delete();
        if (deletefile){
        System.out.println("\"demo1.txt\" is deleted successfully");
        System.out.println("delete() returns the value " + deletefile);
        }
        else{
                System.out.println("\"demo1.txt\" does not exists");
                System.out.println("delete() returns the value " + deletefile);
        }
	}//main()
}//class FileTest
