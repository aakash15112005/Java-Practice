package firstprg;

public class shape {
	
	    void area(double radius) {
	        System.out.println("Area of Circle = " + (3.14 * radius * radius));
	    }

	    void area(int side) {
	        System.out.println("Area of Square = " + (side * side));
	    }

	    void area(int length, int breadth) {
	        System.out.println("Area of Rectangle = " + (length * breadth));
	    }

	    public static void main(String[] args) {

	        shape s = new shape();

	        s.area(5.5);
	        s.area(5);
	        s.area(10, 5);
	    }
	}

