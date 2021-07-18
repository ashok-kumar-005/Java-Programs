import java.net.*;
import java.io.*;
class ServerSockett
{
	public static void main(String v[])  throws Exception
	{
		ServerSocket ss=new ServerSocket(9999);
		Socket s=ss.accept();
		System.out.println("Connection Created");
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		String str = br.readLine();
		System.out.println("Message received from client : "+str);

		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println("I'm Server");
		pw.flush();
	}
}
