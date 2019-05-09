
import java.io.*;
import java.net.*;
public class MyClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket client=new DatagramSocket(6666);
		//String msg=new String("udp");
		//byte[] b=msg.getBytes();
		
		//double num=123.432;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bos);
		dos.writeDouble(12.43);
		dos.writeDouble(42.43);
		dos.writeUTF("sigma");
		dos.flush();
		byte[]data=bos.toByteArray();
//		byte[] mydata=new byte[b.length+data.length];
//		for(int i=0;i<b.length;i++)
//			mydata[i]=b[i];
//				for(int i=b.length;i<b.length+data.length;i++)
//					mydata[i]=data[i-b.length];
//				DatagramPacket dp=new DatagramPacket(b,b.length,
//						new InetSocketAddress("localhost",8888));
		DatagramPacket dp=new DatagramPacket(data,data.length,
new InetSocketAddress("localhost",8888));
client.send(dp);
client.close();
		
//byte[]data=bos.toByteArray();
		dp=new DatagramPacket(data,data.length,
				new InetSocketAddress("localhost",8888));
		client.send(dp);
		client.close();
	}
	
}
