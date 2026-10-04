package Assignment3;

class Employee {

    private int eid;
    private String ename;
    private int salary;

    static int count = 0;
    static Employee maxEmp;

    void setData() {
        eid = 101;
        ename = "Aakash";
        salary = 30000;

        count++;
        findMax(this);
    }
    void setData(int id, String name, int sal) {
        eid = id;
        ename = name;
        salary = sal;

        count++;
        findMax(this);
    }
    void setData(int id, int sal) {
        eid = id;
        ename = "Unknown";
        salary = sal;

        count++;
        findMax(this);
    }
    static void findMax(Employee e) {

        if (maxEmp == null || e.salary > maxEmp.salary) {
            maxEmp = e;
        }
    }

    void display() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Salary: " + salary);
    }

    static void displayCount() {
        System.out.println("\nTotal Employee Objects: " + count);

        System.out.println("\nEmployee with Maximum Salary:");
        maxEmp.display();
    }
}


public class Que_09 {
	
	 public static void main(String[] args) {

	        Employee e1 = new Employee();
	        Employee e2 = new Employee();
	        Employee e3 = new Employee();

	        e1.setData();
	        e2.setData(102, "Rohit", 45000);
	        e3.setData(103, 50000);

	        Employee.displayCount();
	    }
}
