package practise;

class base{
	base(){
		System.out.println("This is base class");
	}
	base(int x){
		System.out.println("This is base class with value " + x);
	}
}	
class derived extends base{
	
	derived(){
		System.out.println("This is derived class");
	}
	derived(int x,int y){
		super(x);
		System.out.println("This is derived class with value " + x + " and " + y);
	}
}
class child extends derived{
	child(){
		System.out.println("This is child class");
	}
	child(int x,int y, int z){
		super(x,y);
		System.out.println("This is child class with value "+x+" , "+y+ " and "+z);
	}
}
public class ConstructerInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// base b= new base();
		// derived d=new derived();	
		// derived d=new derived(10,20);
		// child ch=new child();
		 child ch=new child(10,20,30);
	}

}
