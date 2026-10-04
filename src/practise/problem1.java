package practise;

class circle1{
	public int radios;
	circle1(){
		System.out.println("this is a normal constructer for circle...");
		}
	circle1(int r){
		System.out.println("this is paramitirized constucter for circle...");
		this.radios=r;
	}
	public double area() {
		return Math.PI * this.radios * this.radios;
	}
}
class cyclinder extends circle1{
	public int height;
	
	cyclinder(int r,int h){
		super(r);
		System.out.println("this is parameterized constucter for cyclinder...");
		this.height=h;
	}
	public double volume() {
		return Math.PI * this.radios * this.radios * this.height;
	}
}

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cyclinder cyc = new cyclinder(10,20);
		System.out.println(cyc.area());
		System.out.println(cyc.volume());
		
	
	}

}
