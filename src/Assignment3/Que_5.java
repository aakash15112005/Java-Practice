package Assignment3;

class shape{
	double d1,d2,d3,vol;
	
	shape(){
		d1=d2=d3=0;
		vol=0;
	}
	shape(double d){
		d1=d2=d3=d;
		vol= d1 * d2 * d3;
	}
	shape(double d1,double d2, double d3){
		this.d1=d1;
		this.d2=d2;
		this.d3=d3;
		vol = d1 * d2 * d3;
	}
	
	
	public boolean equals(shape s) {
		return this.vol == s.vol;
	}
}


public class Que_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new shape(5);
		shape s2=new shape(5,5,10);
		
		System.out.println("Volume of shape 1 is :" + s1.vol);
		System.out.println("Volume of shape 2 is :" + s2.vol);
		
		if(s1.equals(s2))
			System.out.println("Both shapes have same volume..");
		else
			System.out.println("Both shapes have different volume..");
	}

}
