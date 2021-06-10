import java.net.*;
import java.io.*;
public class Server3
{
	public static void main(String [] args) throws Exception
	{
		ServerSocket sersock = new ServerSocket(8001);
		Socket sock = sersock.accept();
		System.out.println("\n--------Server--------");
		System.out.println("Client Connected");

		InputStream istream = sock.getInputStream();
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
		String  receiveMessage = receiveRead.readLine();
		System.out.println("\nClient : "+ receiveMessage);

		OutputStream ostream = sock.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream);

		pwrite.println("Hello Client");
		pwrite.flush();		
	}
}