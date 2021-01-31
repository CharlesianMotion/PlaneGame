import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Accessory implements Serializable {
	int aX,aY;
	int aWidth,aHeight;
	int speed=1;
	int typeint;
	int life=1000;
	int Xoffset=0;
	int intervel;
	int count=0;
	Accessorytype atype;//道具类型
	
	
	public Accessory(Accessorytype atype_in){
		  aX=getRandomIntNum(50,950);//50到950之间的随机数
		  aY=30;
		  aWidth=32;
		  aHeight=32;
		  atype=atype_in;
		  
	}
	public Accessory(int x,int y,Accessorytype atype_in){
		  aX=x;
		  aY=y;
		  aWidth=32;
		  aHeight=32;
		  atype=atype_in;
		  
	}
	public boolean hit(Bullet b){
		if ((aX<b.bX) && (b.bX<aX+aWidth) && (aY<b.bY) && (b.bY<aY+aHeight)){
			//life-=20;
			return true;
		} else return false;
		
	}
	public boolean hit(Airplane p){
		if ((aX-+aWidth<p.pX) && (p.pX<aX+aWidth) && (aY<p.pY) && (p.pY<aY+aHeight)){
			//life-=60;
			p.life-=60;
			return true;
		} else return false;
		
	}	
	public int getRandomIntNum(int a, int b)
	{
	  Random random = new Random();
	  int c = random.nextInt();
//	这里用到了Random里的nextInt()方法，这个方法会随机产生一个int型的数；
	  if(c<0)
	  {
	    c = -c ;
	  }
	  int d = ((c %(b-a)) + a + 1);
//	这里是让变量d变成a和b之中的数， % 是取余运算；
	return d;

	}
}
