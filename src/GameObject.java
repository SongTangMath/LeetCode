

import java.awt.*;
import javax.swing.*;

public class GameObject {
Image img;
 double x,y;
int speed,height,width;
public void draw(Graphics g) {
	
}
public GameObject(Image img, double x, double y, int speed, int height, int width) {
	super();
	this.img = img;
	this.x = x;
	this.y = y;
	this.speed = speed;
	this.height = height;
	this.width = width;
}
public GameObject(Image img, double x, double y) {
	super();
	this.img = img;
	this.x = x;
	this.y = y;
}
public GameObject() {
	
}
public Rectangle getRcet()
{
	return new Rectangle((int)x,(int)y,width,height);
}
}
