import java.net.*;
import java.io.*;
class URLConnect
{
	public static void main(String v[]) throws Exception
	{
		URL u1 = new URL("https://mail.google.com:443");
		URLConnection u2 =u1.openConnection();
		InputStream is = u2.getInputStream();
		int i;
		
		while((i=is.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
