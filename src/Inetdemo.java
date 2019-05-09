
import java.io.*;
import java.net.*;
public class Inetdemo {

	public static void main(String[] args)
			throws IOException {
		// TODO Auto-generated method stub
		InetAddress addr=Inet4Address.getLocalHost();
		System.out.println(addr.getHostName());
		System.out.println(addr.getHostAddress());
		addr=InetAddress.getByName("www.bilibili.tv");
		System.out.println(addr.getHostName());
		System.out.println(addr.getHostAddress());
		//addr=InetAddress.getByName("47.91.133.82");
		//System.out.println(addr.getHostName());
		//System.out.println(addr.getHostAddress());
		InetSocketAddress isa=new InetSocketAddress("localhost",9999);
		System.out.println(isa.getHostName());
		System.out.println(isa.getPort());
		InetAddress addr1=isa.getAddress();		URL url=new URL("http://www.baidu.com:80/index.html");
		System.out.println(url.getProtocol());
		InputStream is=url.openStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		String msg=null;
		
		BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream
				("C:\\Users\\Administrator\\Desktop\\index1.html")
				,"utf-8"));
		while((msg=br.readLine())!=null) {
			System.out.println(msg);
			bw.append(msg);
			bw.newLine();
	}
		bw.flush();
		bw.close();
	}

}
