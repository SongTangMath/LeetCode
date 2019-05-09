

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	
	boolean left=false,right=false,up=false,down=false;
public void draw(Graphics g) {
	g.drawImage(img,(int)x,(int)y,null);
	//System.out.println("Plane drawed");
	if(left)
		x-=speed;
	if(right)
		x+=speed;
	if(up)
		y-=speed;
	if(down)
		y+=speed;
}
public void addDirection(KeyEvent e)
{
	System.out.println("addDirection"+e.getKeyCode());
	switch(e.getKeyCode())
	{
	case KeyEvent.VK_LEFT:left=true;
	break;
	case KeyEvent.VK_UP:up=true;
	break;
	case KeyEvent.VK_RIGHT:right=true;
	break;
	case KeyEvent.VK_DOWN:down=true;
	break;
	}
}

public void minusDirection(KeyEvent e)
{
	System.out.println("minusDirection"+e.getKeyCode());
	switch(e.getKeyCode())
	{
	case KeyEvent.VK_LEFT:left=false;
	break;
	case KeyEvent.VK_UP:up=false;
	break;
	case KeyEvent.VK_RIGHT:right=false;
	break;
	case KeyEvent.VK_DOWN:down=false;
	break;
	}
}
public Plane(Image img,double x,double y) {
	this.img=img;
	this.x=x;
	this.y=y;
	this.speed=5;
}
}
