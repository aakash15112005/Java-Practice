package constructor_practice;

class bank{
	int accountNumber;
	String accountHolder;
	double balance;
	
	bank(){
		this.accountNumber=0;
		this.accountHolder="unknown";
		this.balance=0;
	}
	bank(int an,String ah){
		this.accountNumber=an;
		this.accountHolder=ah;
	}
	bank(int an,String ah,double b){
		this.accountNumber=an;
		this.accountHolder=ah;
		this.balance=b;
	}
	public void display() {
		System.out.println("account number is "+accountNumber
							+" account holder name is "+ accountHolder
							+ " and balance is "+balance);
	}
}

public class bankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank b1=new bank();
		bank b2=new bank(101,"aakash");
		bank b3=new bank(102,"virat",50000);
		
		b1.display();
		b2.display();
		b3.display();
	}

}
