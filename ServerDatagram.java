import java.net.*;
import java.io.*;
class ServerDatagram
{
	public static void main(String v[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket(1234);
		byte[] arr = new byte[1000];
		DatagramPacket dp = new DatagramPacket(arr,1000);
		ds.receive(dp);
		String s1 = new String(dp.getData(),0,dp.getLength());
		System.out.println("Data received : "+s1);
		ds.close();
		
	}
}
