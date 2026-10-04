package practise;

abstract class parent{
	public parent() {
		System.out.println("i am a constructer for parent...");
	}
	public void sayhello() {
		System.out.println("hello guys...");
	}
	abstract public void greet();
	abstract public void greet1();
}
class child1 extends parent{
	public void greet() {
		System.out.println("good morning...");
	}
	public void greet1() {
		System.out.println("good afternoon...");
	}
} 

public class abstact_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 ch1= new child1();
		
		ch1.greet();
		ch1.greet1();
	}

}
