package constructor_practice;

class Mobile1{
	String brand;
	String model;
	int price;
	
	Mobile1(){
		this.brand="unknown";
		this.model="unknown";
		this.price=0;
		System.out.println("this is defult constructor...");
	}
	Mobile1(String b,String m){
		this.brand=b;
		this.model=m;
		
	}
	Mobile1(String b,String m,int p){
		this.brand=b;
		this.model=m;
		this.price=p;
		
	}
	public void display() {
		System.out.println("brand is "+ brand + " model is " + model + " price is"+ price);
	}
}

public class mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile1 mo1=new Mobile1();
		Mobile1 mo2=new Mobile1("samsung","s24");
		Mobile1 mo3=new Mobile1("apple","18pro",150000);
		
		mo1.display();
		mo2.display();
		mo3.display();
		
	}

}
