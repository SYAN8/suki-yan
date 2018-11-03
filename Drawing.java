 
import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class Drawing  extends JFrame{
	MyPanel2 mp = null;
	//constructor
	public Drawing(){
		mp = new MyPanel2();
		
		this.add(mp);
		
		this.setTitle("Herding Cats!");
		// the size of windeow
		this.setSize(600,600);
		this.setVisible(true);
		// the location of windeow in the screen
		this.setLocation(300,0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// public static void main(String[] args) {
	// 	Drawing mtg = new Drawing();
		
	// }			
}

//我的面板。只有JPanel有画图方法，JFrame没有，故必须在JFrame中添加JPanel
class MyPanel2 extends JPanel{
	//定义一个乌龟
	Cat t = null;
	
	//构造函数
    public MyPanel2(){	
    	//t = new  Cat(0,0);
    }
    
    //画乌龟
    public void drawCats(int x, int y, Graphics g){
    	//face fillOval(x,y,width,height)
    	g.setColor(Color.white);
    	g.fillOval(x, y, 50, 30);
    	// Moustache
    	g.setColor(Color.black);
    	g.drawLine(x-15, y+10, x+10, y+15);
    	g.drawLine(x-15, y+20, x+10, y+20);
    	g.drawLine(x-15, y+30, x+10, y+25);
    	g.drawLine(x+40, y+15, x+65, y+10);
    	g.drawLine(x+40, y+20, x+65, y+20);
    	g.drawLine(x+40, y+25, x+65, y+30);
    }
 	//画乌龟
    public void drawDog(int x, int y, Graphics g){
    	//face fillOval(x,y,width,height)
    	g.setColor(Color.black);
    	g.fillOval(x, y, 50, 30);
    	//mouth
    	g.setColor(Color.red);
    	//fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
    	g.fillArc(x+10, y+17, 30, 10, 180, 180);
    }
   
	//覆盖JPanel的paint方法
	//Graphics 是绘图的重要类。你可以把他理解成一只画笔
	public void paint(Graphics g){
			//1.调用父类函数完成初始化任务
			int x;
			int y;
			Random randomPosition = new Random();
			//这句话不能少
			super.paint(g);
			//drawRect(int x, int y, int width, int height)
			//g.drawRect(0, 0, 900, 900);
			g.setColor(Color.pink);
			//row
			g.drawLine(0, 200, 600, 200);
			g.drawLine(0, 400, 600, 400);
			//column
			g.drawLine(200, 0, 200, 600);
			g.drawLine(400, 0, 400, 600);
			//paint cats
			for(int i = 0; i < 10; i++){			
				x = randomPosition.nextInt(530);
				y = randomPosition.nextInt(530);
				this.drawCats(x, y, g);
			}
			x = randomPosition.nextInt(530);
			y = randomPosition.nextInt(530);
			this.drawDog(x, y, g);
	}
	
}
 


class Dog {
		//表示乌龟的横坐标
		int x = 0;
 
		//表示乌龟的纵坐标
		int y = 0;
		
		public int getX() {
			return x;
		}
 
		public void setX(int x) {
			this.x = x;
		}
 
		public int getY() {
			return y;
		}
 
		public void setY(int y) {
			this.y = y;
		}
		public Dog(int x, int y){
			this.x = x;
			this.y = y;
		}
}
