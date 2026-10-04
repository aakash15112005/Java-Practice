package constructor_practice;

class student1{
	String name="aakash";
	int roll_no=1;
	int marks=100;
	public student1(){
		System.out.println("default constructor...");
	}	
	public student1(String s,int r,int m) {
		this.name=s;
		this.roll_no=r;
		this.marks=m;
	}
	void display() {
		System.out.println("my name is "+ name + " and roll no is "+roll_no + " and marks is "+marks);
	}
}

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 stu=new student1();
		student1 st=new student1("virat",2,100);
		stu.display();
		st.display();
		
				
				
	}

}
