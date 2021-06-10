	import java.net.*;
	import java.io.*;
	public class Server
	{
	public static void main(String [] args) throws Exception
	{		
		ServerSocket sersock = new ServerSocket(8001);
		Socket sock = sersock.accept();
		System.out.println("\n--------Server--------");
		System.out.println("Client Connected");
	}
	}