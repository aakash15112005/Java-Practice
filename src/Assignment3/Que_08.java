package Assignment3;

class Student {

    private int id;
    private String name;
    private int total;

    static int count = 0;

    static {
        System.out.println("Student class static block");
    }
    void getData(int i, String n, int t) {
        id = i;
        name = n;
        total = t;
        count++;
    }
    void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
    }
    static void countStud() {
        System.out.println("Number of students: " + count);
    }
}
public class Que_08 {
	static {
        System.out.println("DemoStudent class static block");
}
	    public static void main(String[] args) {

	        Student s1 = new Student();
	        Student s2 = new Student();

	        s1.getData(101, "Aakash", 450);
	        s2.getData(102, "Virat", 420);

	        System.out.println("\nStudent 1:");
	        s1.displayData();

	        System.out.println("\nStudent 2:");
	        s2.displayData();

	        Student.countStud();
	    }
}
