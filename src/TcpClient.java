
import java.io.*;

import java.net.*;
public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
Socket client=new Socket("localhost",8888);
//BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
//	System.out.println(br.readLine());
ObjectInputStream ois=new ObjectInputStream(client.getInputStream());
System.out.println(ois.readInt()+ois.readUTF());
	}

}
