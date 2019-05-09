
import javax.swing.*;
//import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
public class Mygameframe extends JFrame 
implements KeyListener,MouseMotionListener,MouseListener{
	
	//Image plane=GameUtil.getImage("./src/images/hero0.png");
	int x=200,y=200;
	Image planeImg=Toolkit.getDefaultToolkit().getImage("src/images/hero0.png");
	Image background=Toolkit.getDefaultToolkit().getImage("src/images/background.png");
	Plane plane=new Plane(planeImg,200,200);
	public void paint(Graphics g)
	{
		//this.setFocusable(true);
		//this.requestFocus();
		
		/*
		g.setColor(new Color(255,0,0));
		g.setFont(new Font("宋体",Font.BOLD,50));
		g.drawString("JR-West", 70, 70);
		*/
		g.drawImage(background,0,0,this.getWidth(),this.getHeight(),null);
		plane.draw(g);
	}
	class paintThread extends Thread{
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	 public void mouseClicked(MouseEvent e) {
	        System.out.println("鼠标点击---"+"\t"); 
	        if(e.getClickCount()==1) {
	            System.out.println("单击");
	        }else if(e.getClickCount()==2) {
	            System.out.println("双击");
	        }else if(e.getClickCount()==3) {
	            System.out.println("三连击");
	        }
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
	        System.out.println("鼠标按下");     
	    }

	    @Override
	    public void mouseReleased(MouseEvent e) {
	        System.out.println("鼠标松开");     
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
	    	 System.out.println("鼠标已经进入窗体"); 
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	    	 System.out.println("鼠标已经移出窗体");     
	    }
	    
	    @Override
	    public void mouseDragged(MouseEvent e) {
	                String str="鼠标所在的坐标:("+e.getX()+","+e.getY()+")";
	                System.out.println(str);
	    }

	    @Override
	    public void mouseMoved(MouseEvent e) {
	            System.out.println("鼠标移动了");    
	    }

    	@Override
    	public void keyTyped(KeyEvent e)
    	{
    		System.out.println("KeyTyped");
    	}
    	@Override
    	public void keyPressed(KeyEvent e)
    	{
    		System.out.println("KeyPressed");
    		//super.keyPressed(e);
    		plane.addDirection(e);
    	}
    	@Override
    	public void keyReleased(KeyEvent e)
    	{
    		System.out.println("KeyReleased");
    		//super.keyReleased(e);
    		plane.minusDirection(e);
    	}
    
	public void launchframe()
	{
		this.setTitle("Central-JR");
		this.setVisible(true);
		this.setFocusable(true);
		this.requestFocus();
		this.setSize(320, 568);
		this.setLocation(100,100);
		this.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent s)
			{
				System.exit(0);
			}
				});
		

		new paintThread().start();
	}
	public static void main(String[]args) {
		Mygameframe f=new Mygameframe();
		f.launchframe();
		
	}
}
