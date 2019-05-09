

import java.io.*;
import java.util.*;


//public
//class Properties extends Hashtable<Object,Object>
public class property {
public static void main(String[]args) throws FileNotFoundException, IOException {
	Properties pro=new Properties();
	Properties pro1=new Properties();
	pro.setProperty("Boeing", "Airbus");
	pro.setProperty("Audi", "BMW");
	pro.setProperty("sigma", "rho");
	//pro.store(new FileOutputStream(new File("e:/store.txt")), "ÅäÖÃ");
	//pro.storeToXML(new FileOutputStream(new File("e:/store.xml")), "ÅäÖÃ");
	pro.store(new FileOutputStream(new File("src/store.txt")), "ÅäÖÃ");
	pro.storeToXML(new FileOutputStream(new File("src/store.xml")), "ÅäÖÃ");
	//pro1.load(new FileReader("e:/store.txt"));
	
	pro1.load(property.class.getResourceAsStream("/store.txt"));
	System.out.println(pro1.getProperty("Boeing"));
	File f=new File("D:/javacode");
	/*
	System.out.println(f.getAbsolutePath());
	System.out.println(f.getName());
	System.out.println(f.getPath());
	if(!f.exists())
		try{
			f.createNewFile();
		}
	catch(IOException e) {
		e.printStackTrace();
	}
	f.mkdirs();
	*/
	String[] strs1=f.list();
	File[] strs2=f.listFiles(new MyFilter());
	for(String temp:strs1)
		System.out.println(temp);
	System.out.println("##########");
	for(File temp:strs2)
		System.out.println(temp.getAbsolutePath());
	File f3=new File("D:/javacode/hello.java");
	InputStream is=null;
	OutputStream os=null;
	try {
 is=new FileInputStream(f3);
 os=new FileOutputStream(f3,true);
 String towrite=new String("// High advanced materials");
 os.write(towrite.getBytes());
 os.flush();
	byte[] bytes=new byte[100];
	int len=0;
	while(-1!=(len=is.read(bytes)))
		System.out.println(new String(bytes,0,len));
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(is!=null)
			is.close();
			if(os!=null)
				os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

	
}
class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		File f=new File(dir,name);
		String Fname=f.getName();
		if(Fname.endsWith("java"))
			return true;
		// TODO Auto-generated method stub
		return false;
	}
}