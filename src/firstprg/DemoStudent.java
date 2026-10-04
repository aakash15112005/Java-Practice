package firstprg;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int m1, m2, m3;
    int total;
    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        System.out.print("Enter Student Name: ");
        name = sc.next();

        System.out.print("Enter Marks 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        m3 = sc.nextInt();
    }
    void calculate() {
        total = m1 + m2 + m3;
    }
    void putdata() {
        System.out.println("Student ID = " + id);
        System.out.println("Student Name = " + name);
        System.out.println("Marks 1 = " + m1);
        System.out.println("Marks 2 = " + m2);
        System.out.println("Marks 3 = " + m3);
        System.out.println("Total = " + total);
    }
}

public class DemoStudent {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details of Student 1:");
        s1.getdata();
        s1.calculate();

        System.out.println("\nEnter details of Student 2:");
        s2.getdata();
        s2.calculate();

        System.out.println("\nDetails of Student 1:");
        s1.putdata();

        System.out.println("\nDetails of Student 2:");
        s2.putdata();
    }
}