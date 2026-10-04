package Assignment3;

class Student1 {
    int id;
    String name;
    int total;

    Student1(int i, String n, int t) {
        id = i;
        name = n;
        total = t;
    }
    static Student1 maxMarks(Student1 s1, Student1 s2) {
        if (s1.total > s2.total) {
            return s1;
        } else {
            return s2;
        }
    }
}

public class Que_02 {
	 public static void main(String[] args) {

	     Student1 s1 = new Student1(1, "Aakash", 450);
	     Student1 s2 = new Student1(2, "Rahul", 480);

	     Student1 max = Student1.maxMarks(s1, s2);
	        
	     System.out.println("Student with maximum marks:");
	     System.out.println("ID = " + max.id);
	     System.out.println("Name = " + max.name);
	     System.out.println("Total Marks = " + max.total);
	}
}
