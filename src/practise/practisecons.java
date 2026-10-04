package practise;

class cylinder{
	int radios=10;
	int height=20;
	double volume=5;
	double pi=3.14;
	double surface=10;

	public int getradios() {
		return radios;
	}	
	public int setradios(int rad) {
		return rad;
	}
	public int getheight() {
		return height;
	}
	public int setheight(int hei) {
		return hei;
	}
	public double getvolume() {
		return pi * (radios *radios) * height;
	}
	public double setvolume(double vol) {
		return vol;
	}
	public double getsurface() {
		return (2*pi*radios*height) + (2*pi*(radios*radios));
	}
	public double setsurface(double sur) {
		return sur;
	}
	
}
public class practisecons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder cyl = new cylinder();
		
		
		int rad=cyl.getradios();
		System.out.println(rad);
		
	
		int hei=cyl.getheight();
		System.out.println(hei);
		
		double vol=cyl.getvolume();
		System.out.println(vol);
		
		double sur=cyl.getsurface();
		System.out.println(sur);
		// System.out.println(cyl.getradios());
		// System.out.println(cyl.getheight());
	}

}
