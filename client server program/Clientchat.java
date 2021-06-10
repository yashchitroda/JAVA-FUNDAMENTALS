import java.net.*;
import java.io.*;
public class Clientchat
{
	public static void main(String [] args) throws Exception
	{
		Socket sock = new Socket("127.0.0.1", 8001);
		BufferedReader keyRead = new BufferedReader (new InputStreamReader(System.in));
		OutputStream ostream = sock.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream, true);
		InputStream istream = sock.getInputStream();
		BufferedReader receiveRead= new BufferedReader (new InputStreamReader(istream));
		System.out.println("\n--------Client--------");
		System.out.println("\nStart the chat with Server and Press Enter ....");
		String receiveMessage, sendMessage;
		while(true)
		{
			System.out.print("\nClient : ");
			sendMessage = keyRead.readLine();
			pwrite.println(sendMessage);
			pwrite.flush();
			if((receiveMessage = receiveRead.readLine()) != null)
			{
				System.out.print("\nServer : ");
				System.out.println(receiveMessage);
			}
		}
	}
}