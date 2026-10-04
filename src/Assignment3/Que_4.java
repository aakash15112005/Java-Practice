package Assignment3;

class mathnumber{
	int a;
	int b;
	
	mathnumber(){
		a=0;
		b=0;
	}
	mathnumber(int x){
		this.a=x;
		this.b=x;
	}
	mathnumber(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println("a = "+a+", b = "+b);
	}
}

public class Que_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mathnumber m1= new mathnumber();
		mathnumber m2= new mathnumber(5);
		mathnumber m3= new mathnumber(5,10);
		
		System.out.print("When (a = b = 0) : " );
		m1.display();
		System.out.print("When (a = b) : " );
		m2.display();
		System.out.print("When (a! = b) : " );
		m3.display();
	}

}
