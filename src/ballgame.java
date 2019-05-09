

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
public class ballgame extends JFrame{
	double x=100;
	double y=100;
	Image desk=Toolkit.getDefaultToolkit().getImage("D:/javacode/test/images/0.jpg");
	Image ball=Toolkit.getDefaultToolkit().getImage("D:/javacode/test/images/1.png");
	public void paint(Graphics g) {
		//System.out.println("print is called");
		g.drawImage(desk, 0, 0, null);
	g.drawImage(ball, (int)x, (int)y, null);
	x=x+1;
	}
	
	void launchframe() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		while(true) {
			repaint();
		try {
		Thread.sleep(40);
	        }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}	
	}
	public static void main(String[] args)
	{
	  //System.out.println("HelloWorld");
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("your name:");
		String name=scanner.nextLine();
		System.out.println("your age");
		int age=scanner.nextInt();
		int a=3;
		byte b=(byte)300;
		String str=a>=60?"pass":"fail";
		System.out.println(str);
		System.out.println(b);
		System.out.println(~a);
		*/
	  ballgame game=new ballgame();
	  game.launchframe();
	}	
}
