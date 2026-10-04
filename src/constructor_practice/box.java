package constructor_practice;

class box1{
	int length;
	int width;
	int height;
	
	box1(){
		this.length=this.width=this.height=1;
	}
	box1(int l,int w, int h){
		this.length=l;
		this.width=w;
		this.height=h;
	}
	public int volume() {
		return length*width*height;
	}
}

public class box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		box1 b=new box1();
		box1 b1=new box1(10,5,10);
		
		System.out.println(b.volume());
		System.out.println(b1.volume());
	}

}
