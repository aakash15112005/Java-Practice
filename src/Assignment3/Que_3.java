package Assignment3;

class number{
	int x;
	int y;
	number(int x,int y){
		this.x=x;
		this.y=y;
	}
	public boolean equals(number n) {
		return this.x==n.x && this.y==n.y;
	}
	
}

public class Que_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number no1=new number(10,20);
		number no2=new number(10,20);
		number no3=no1;
		
		System.out.println("Using Equals : " + no1.equals(no2));
		System.out.println("Using == : "+ (no1==no2));
		System.out.println("Using == with no3 : "+(no1==no3));
		
	}

}
