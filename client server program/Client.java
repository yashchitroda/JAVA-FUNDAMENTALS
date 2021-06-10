import java.net.*;
import java.io.*;
public class client
{
	public static void main(String [] args) throws Exception
	{	
		Socket s = new Socket("localhost",8001);
		System.out.println("\n--------client--------");
	}
}
