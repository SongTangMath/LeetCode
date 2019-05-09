

import java.io.*;

public class Filetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File f=new File("D:\\javacode\\test");
        File f1=new File(f,"src");
        if(f1.exists())
        {
        if(f1.isFile())
        	System.out.println("f1  is file");
        else System.out.println("f1  is directory");
        printfile(f1,1);
        FileReader reader=null;
        try {
			reader=new FileReader("D:/javacode/hello.java");
			char c=(char) reader.read();
			char c1=(char) reader.read();
			System.out.println(""+c+c1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
        	try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	    }
	

}
	static void printfile(File f,int depth)

	{
		if(f.exists())
		{
			for(int i=1;i<=depth;i++)			
				System.out.print("-");
				System.out.println(f.getName());			
			if(f.isDirectory())
			{
			File[] list=f.listFiles();
			for(File filetemp:list)
			{
				printfile(filetemp,depth+1);
			}
			}
		}
	}

}
