
import java.net.*;
import java.io.*;
public class ChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
 Socket client=new Socket("localhost",8888);
 BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
 String info=console.readLine();
 DataOutputStream dos=new DataOutputStream(client.getOutputStream());
 dos.writeUTF(info);
 dos.flush();
 DataInputStream dis=new DataInputStream(client.getInputStream());
 String msg=dis.readUTF();
 System.out.println(msg);

}
}
