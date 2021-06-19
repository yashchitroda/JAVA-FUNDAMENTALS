import java.io.*; 
public class filetestdir
{
	public static void main(String [] args) throws IOException
	{
        File d = new File ("Documents//java programs//javafilehandling");
        boolean dir = d.mkdir();
        if (dir)
        System.out.println("Directory created successfully");
        else
        System.out.println(" Failed to create a Directory Try again...");
	}//main()
}//class FileTest
