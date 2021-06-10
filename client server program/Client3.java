import java.net.*;
import java.io.*;
public class Client3
{
	public static void main(String [] args) throws Exception
	{
		Socket s = new Socket("localhost", 8001);
		System.out.println("\n--------Client--------");
		System.out.println("Server Connected");

		OutputStream ostream = s.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream);
		pwrite.println("Hello Server");
		pwrite.flush();

		InputStream istream = s.getInputStream();
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
		String  receiveMessage = receiveRead.readLine();
		System.out.println("\nServer : "+ receiveMessage);		
	}
}
