package Assignment3;

class cartesianPoint{
	private int x,y;
	
	static int count;
	
	static {
		count=0;
		System.out.println("Static block... ");
	}
	cartesianPoint(int x,int y){
		this.x=x;
		this.y = y;
		count++;
	}
	cartesianPoint(int value){
		x=value;
		y=value;
		count++;
		
	}
	void move(int x,int y) {
		this.x = x;
		this.y = y;
		
	}
	void move(int value) {
		x=value;
		y=value;
	}
	void display() {
		System.out.println("x = " + x + ", y = " + y);
	}
	static void showcount() {
		System.out.println("number of objects are "+ count);
	}
}

public class Que_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cartesianPoint c1 = new cartesianPoint(10,20);
		
		System.out.print("point c1 : ");
		c1.display();
		
		c1.move(20,30);
		System.out.print("After move (20,30): ");
		c1.display();
		
		c1.move(50);
		System.out.print("After move (50) : ");
		c1.display();
		
		cartesianPoint c2 = new cartesianPoint(10);
		System.out.print("point c2 : ");
		c2.display();
		
		cartesianPoint.showcount();
	}

}
