package practise;

interface bicycle{
	void applybrake();
	void speedup();
}
interface blowhorn{
	void blowhorn1();
	void blowhorn2();
}
class avoncycle implements bicycle,blowhorn{
	public void applybrake() {
		System.out.println("applying brake...");
		}
	public void speedup() {
		System.out.println("speeding up...");
		
	}
	public void blowhorn1() {
		System.out.println("blowing horn 1...");
	}
	public void blowhorn2() {
		System.out.println("blowing horn 2...");
	}
}

public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		avoncycle avon=new avoncycle();
		
		avon.applybrake();
		avon.speedup();
		avon.blowhorn1();
		avon.blowhorn2();
	}

}
