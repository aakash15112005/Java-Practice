package practise;

class first{
	int salary;
	String name;
	
	public int getsalary() {
		return salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String n) {
		name = n;
	}
}
class celphone{
	public void ringing() {
		System.out.println("Ringing...");
	}
	public void vibrating() {
		System.out.println("Vibrating...");
	}
}
class rectangle{
	int length;
	int breadth;
	
	public int area() {
		return length * breadth;
	}
	public int peremeter() {
		return 2 * (length  + breadth);
	}
}
class circle{
	int r=10;
	double pi = 3.14;
	
	public double area() {
		return pi * (r * r);
	}
	public double peremeter() {
		return 2 * (pi * r);
	}
}

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		first aakash = new first();
		celphone calling = new celphone();
		rectangle rec = new rectangle();
		circle cir = new circle();
		
		aakash.setname("aakash");
		aakash.salary = 50000;
		System.out.println(aakash.getname());
		System.out.println(aakash.getsalary());
	
		calling.ringing();
		calling.vibrating();
		
		rec.length = 10;
		rec.breadth = 20;
		
		System.out.println(rec.area());
		System.out.println(rec.peremeter());
	
		System.out.println(cir.area());
		System.out.println(cir.peremeter());
	}
	
	

}
