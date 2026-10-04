package firstprg;

import java.util.Scanner;

class Test {

    int a, b;

    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {
        System.out.println("Division = " + (a / b));
    }
}

public class DemoTest {

    public static void main(String[] args) {

        Test t = new Test();

        t.getdata();

        t.add();
        t.sub();
        t.mul();
        t.div();
    }
}