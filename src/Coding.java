
import java.io.*;
import java.nio.CharBuffer;
public class Coding {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
String str="ÖÐ¹ú";
byte[]data=null;
try {
	data=str.getBytes("utf-8");
} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String str1=new String(data,"utf-8");
//System.out.println(str1);
BufferedReader br;
String toread=null;
String info=null;
File f=new File("D:/javacode/hello.java");
try {
	
	FileInputStream fis=new FileInputStream(f);
	InputStreamReader isr=new InputStreamReader(fis);
	
	 br=new BufferedReader(isr);
	 while((toread=br.readLine())!=null)
			System.out.println(toread);
	 
	 br.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//try {
//FileInputStream fis1=new FileInputStream(f);
//InputStreamReader isr1=new InputStreamReader(fis1);
//
//byte[] b=new byte[50];
//int len=0;
//char[] cbuf=new char[100];
//isr1.read(cbuf);
//	System.out.println(cbuf.toString());
//}
//catch (Exception e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
File dest=new File("D:/a.txt");
DataOutputStream dos=new DataOutputStream(new FileOutputStream(dest));
ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(dest));
oos.writeDouble(2.5);
oos.writeUTF("ºÍÐ³ºÅ");
//oos.writeObject(new Employee("SDK",1000));
oos.flush();
dos.flush();
oos.close();
dos.close();
//DataInputStream dis=new DataInputStream(new FileInputStream(dest));
ObjectInputStream ois=new ObjectInputStream(new FileInputStream(dest));
System.out.println(ois.readDouble()+ois.readUTF());
System.setOut(new PrintStream(new FileOutputStream(new File("D:/a.txt"))));
System.out.println("test");
String sad=new String("sad");

/*Object obj=ois.readObject();
if (obj instanceof Employee) {	
	Employee emp=(Employee)obj;
	System.out.println(emp.name);
	System.out.println(emp.salary);
	}
	*/
	}
}
class Employee implements java.io.Serializable{
	public transient String name;
	public int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}