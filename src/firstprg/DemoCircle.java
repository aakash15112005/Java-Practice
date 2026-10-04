package firstprg;
import java.util.Scanner;

class Circle {

    double r;

    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        r = sc.nextDouble();
    }
    void getdata(double r) {
        this.r = r;
    }
    double area() {
        return 3.14 * r * r;
    }
    void perimeter() {
        double p = 2 * 3.14 * r;
        System.out.println("Perimeter = " + p);
    }
}

public class DemoCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.getdata();
        c2.getdata(10);

        System.out.println("Area of Circle 1 = " + c1.area());
        c1.perimeter();

        System.out.println("Area of Circle 2 = " + c2.area());
        c2.perimeter();
    }
}