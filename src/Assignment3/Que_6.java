package Assignment3;

class complex{
	int real,image;
	
	complex(){
		real=0;
		image=0;
	}
	complex(int r){
		real=r;
		image=r;
	}
	complex(int real,int image){
		this.real=real;
		this.image=image;
	}
	complex add_complex(complex c) {
		complex com=new complex();
		com.real = real + c.real;
		com.image= image + c.image;
		
		return com;
	}
	public boolean equals(Object obj) {
		complex c= (complex)obj;
		return real ==c.real && image== c.image; 
	}
	void display() {
		System.out.println(real + " + " + image );
	}
}

public class Que_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex c1=new complex(5,3);
		complex c2 = new complex(5,10);
		
		complex c3=c1.add_complex(c2);
		
		System.out.print("complext number c1 =");
		c1.display();
	

		System.out.print("complext number c2 =");
		c2.display();
	

		System.out.print("Addition (c3) =");
		c3.display();
		
		if(c1.equals(c2))
			System.out.println("C1 and C2 are same");
		else
			System.out.println("C1 and C2 are not same");
	
	}

}
