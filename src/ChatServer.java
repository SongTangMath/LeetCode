
import java.net.*;
import java.io.*;
public class ChatServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(8888);
		Socket client=server.accept();
		 DataInputStream dis=new DataInputStream(client.getInputStream());
		 String info;
		 info=dis.readUTF();
		 String msg="Server"+info;
		 
		 DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		 dos.writeUTF(msg);
		 dos.flush();
		
		 
		 System.out.println(msg);
	}

}
