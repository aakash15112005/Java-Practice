package firstprg;

public class box {
	
	    void volume(int side) {
	        System.out.println("Volume of Cube = " + (side * side * side));
	    }
	    
	    void volume(int l, int h) {
	        System.out.println("Volume of Box (l=b) = " + (l * l * h));
	    }

	    void volume(int l, int b, int h) {
	        System.out.println("Volume of Box = " + (l * b * h));
	    }


	    void volume(double l, double b, double h) {
	        System.out.println("Volume of Decimal Box = " + (l * b * h));
	    }

	    public static void main(String[] args) {

	        box b = new box();
 
	        b.volume(5);
	        b.volume(5, 10);
	        b.volume(5, 6, 10);
	        b.volume(5.5, 6.5, 10.5);
	    }
}
