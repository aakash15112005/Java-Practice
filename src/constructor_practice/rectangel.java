package constructor_practice;

class rectangel1{
	int length;
	int width;
	rectangel1() {
		this.length=0;
		this.width=0;
	}
	rectangel1(int l,int w) {
		this.length=l;
		this.width=w;
		
	}
	public int area(){
		return length*width;
		}
}

public class rectangel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangel1 rec=new rectangel1();
		rectangel1 rec1 = new rectangel1(10,20);
	
		System.out.println("default contructor area =" + rec.area());
		System.out.println("parameterize area is = " + rec1.area());
		
	}

}
