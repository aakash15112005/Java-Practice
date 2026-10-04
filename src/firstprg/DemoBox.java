package firstprg;
import java.util.Scanner;

class Box {

    int l, b, h;
    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        l = sc.nextInt();

        System.out.print("Enter breadth: ");
        b = sc.nextInt();

        System.out.print("Enter height: ");
        h = sc.nextInt();
    }
    void putdata() {
        System.out.println("Length = " + l);
        System.out.println("Breadth = " + b);
        System.out.println("Height = " + h);
    }
}

public class DemoBox {

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();

        System.out.println("Enter details of Box 1:");
        b1.getdata();

        System.out.println("\nEnter details of Box 2:");
        b2.getdata();

        System.out.println("\nDetails of Box 1:");
        b1.putdata();

        System.out.println("\nDetails of Box 2:");
        b2.putdata();
    }
}