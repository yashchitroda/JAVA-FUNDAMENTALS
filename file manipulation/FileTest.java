import java.io.*; 
public class FileTest
{
	public static void main(String [] args) throws IOException
	{
		File f = new File ("Documents//java programs//demo.txt");
		System.out.println("File exists : " + f.exists());

		//It requires throws IOException in the main() method
		f.createNewFile(); 
		System.out.println("File exists : " + f.exists());
	}//main()
}//class FileTest
