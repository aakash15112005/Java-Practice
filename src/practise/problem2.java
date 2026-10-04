package practise;

class rectangel{
	public int length,width;
	rectangel(){
		System.out.println("This is constuctor for rectangel...");
	}
	rectangel(int l, int w){
		this.length=l;
		this.width=w;
		System.out.println("this is parametirized constuctor for rectangel....");
	}
	public int area() {
		return this.length * this.width;
	}
}
class cuboid extends rectangel{
	public int height;
	cuboid(){
		System.out.println("this is normal constructor for cuboid...");
	}
	cuboid(int l,int w,int h){
		super(l,w);
		this.height=h;
		System.out.println("this is parametirized constucter for cuboid...");
	}
	public int area1() {
		return 2*(this.length * this.width + this.width * this.height + this.length * this.height);
	}
}
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cuboid c=new cuboid(10,20,30);
		System.out.println(c.area());
		System.out.println(c.area1());
	
	}

}
