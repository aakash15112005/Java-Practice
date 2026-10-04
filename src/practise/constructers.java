package practise;

class employee1{
	int id;
	String name;
}
public employee1(int myid,String myname) {
	id=myid;
	name=myname;
}
public class constructers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 emp=new employee1(1,"Aakash");
		
		System.out.println(emp.id);
		System.out.println(emp.name);
	}

}
