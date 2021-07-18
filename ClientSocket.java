import java.net.*;
import java.io.*;
class ClientSocket
{
	public static void main(String v[]) throws Exception
	{
		Socket s=new Socket("localHost",9999);
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println("Client says hello");
		pw.flush();
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		String str = br.readLine();
		System.out.println("Message received from server : "+str);

	}
}
