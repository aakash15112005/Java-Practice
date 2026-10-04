package constructor_practice;

class area{
	int side;
	int length;
	int width;
	
	public area(){
		this.side=0;
	}
	area(int s){
		this.side=s;
	}
	area(int l,int w){
		this.length=l;
		this.width=w;
	}
	public int square() {
		return side * side;
	}
	public int rectangel() {
		return length * width;
	}
}

public class area_calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		area a1=new area();
		area a2=new area(10);
		area a3=new area(10,20);
		
		System.out.println("default area = " + a1.square());
		System.out.println("square is = "+a2.square());
		System.out.println("rectangel is = "+ a3.rectangel());
		
	}

}
