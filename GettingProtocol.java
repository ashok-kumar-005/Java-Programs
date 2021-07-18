import java.net.*;
import java.io.*;
class GettingProtocol
{
	public static void main(String v[]) throws MalformedURLException
	{
		URL url = new URL("https://mail.google.com:443/");
		System.out.println("Protocol Name : "+url.getProtocol());
		System.out.println("Host Name : "+url.getHost());
		System.out.println("Port Number : "+url.getPort());
		System.out.println("File Name : "+url.getFile());
	}
}
