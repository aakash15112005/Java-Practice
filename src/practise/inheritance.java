package practise;

class animal{
	public String x;
	
	public String getdog(){
		return x;
	} 
	public void setdog(String x) {
		this.x=x;
	}
}
class cat1 extends animal{
	public String y;
	
	public String getcat() {
		return y;
	}
	public void setcat(String y) {
		this.y=y;
	}
}


public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat1 c=new cat1();
		
		c.setdog("Dog is barking");
		c.setcat("Cat is meowing");
		
		System.out.println(c.x);
		System.out.println(c.y);
		
	}

}
