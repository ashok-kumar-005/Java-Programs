import java.net.*;
import java.io.*;
class ClientDatagram
{
	public static void main(String v[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket();
		String s1="Hello Server datagram";
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(s1.getBytes(),s1.length(),ip,1234);
		ds.send(dp);
		ds.close();
		
	}
}
