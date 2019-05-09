
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket server=new DatagramSocket(8888);
		byte[] container=new byte[1024];

		DatagramPacket dp=new DatagramPacket(container,container.length);
		server.receive(dp);
//		byte[]data=dp.getData();
//		int len=dp.getLength();
//		System.out.println(len);
//		String str=new String(data,0,len);
//		System.out.println(str);
		byte[]data1=dp.getData();
		System.out.println(data1.length);
		DataInputStream dis=new DataInputStream(new ByteArrayInputStream(data1));
		System.out.println(dis.readDouble());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		dis.close();
		server.close();
	}

}
