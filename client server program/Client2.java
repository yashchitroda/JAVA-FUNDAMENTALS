import java.net.*;
import java.io.*;
public class Client2
{
	public static void main(String [] args) throws Exception
	{
		Socket sock = new Socket("localhost", 8001);
		System.out.println("\n--------Client--------");

		System.out.println("Server Connected");

		OutputStream ostream = sock.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream);

		pwrite.println("Hello Server");
		pwrite.flush();		
	}
}
