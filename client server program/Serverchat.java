import java.net.*;
import java.io.*;
public class Serverchat
{
	public static void main(String [] args) throws Exception
	{		
		ServerSocket sersock = new ServerSocket(8001);		
		System.out.println("\n--------Server--------");
		System.out.println("\nReady for chat ....");
		Socket sock = sersock.accept();
		BufferedReader keyRead = new BufferedReader (new InputStreamReader(System.in));
		OutputStream ostream = sock.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream, true);
		InputStream istream = sock.getInputStream();
		BufferedReader receiveRead= new BufferedReader (new InputStreamReader(istream));
		String receiveMessage, sendMessage;
		while(true)
		{
			if((receiveMessage = receiveRead.readLine()) != null)
			{
				System.out.print("\nClient : ");		
				System.out.println(receiveMessage);
			}
			System.out.print("\nServer : ");
			sendMessage = keyRead.readLine();
			pwrite.println(sendMessage);
			pwrite.flush();				
		}
	}
}