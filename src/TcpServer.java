
import java.io.*;

import java.net.*;
public class TcpServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ServerSocket ss=new ServerSocket(8888);
Socket soc=ss.accept();
System.out.println("Connected");
String msg="welcome";
//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
//	bw.write(msg);
//	bw.newLine();
//	bw.flush();
ObjectOutputStream oow=new ObjectOutputStream(soc.getOutputStream());
oow.reset();
oow.writeInt(123);

oow.flush();
oow.reset();
oow.writeUTF("welcome");

oow.flush();
soc.shutdownOutput();
	}

}
