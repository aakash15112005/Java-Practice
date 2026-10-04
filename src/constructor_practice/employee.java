package constructor_practice;

class employee1{
	int empid;
	String name;
	int salary;
	employee1(){
		this.empid=1;
		this.name="aakash";
		this.salary=50000;
	}
	employee1(int i,String n,int s){
		this.empid=i;
		this.name=n;
		this.salary=s;
	}
	public void display(){
		System.out.println("employee id is "+ empid +
				 " name is " + name
				+ " salary is "+ salary);
	}
}

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee1 emp1=new employee1();
		employee1 emp2=new employee1(2,"virat",40000);
		
		emp1.display();
		emp2.display();
	}

}
