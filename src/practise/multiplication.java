package practise;

public class multiplication {
	static void multi(int n) {
	for(int i=1; i<=10; i++)
	{
		System.out.format("%d x %d = %d \n",n,i,n*i);
	}
	}
	
	static void pattern1(int n) {
		for (int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	static int recursion(int n) {
		if (n==1) {
			return 1;
		}
		return n + recursion(n-1);
	}
	static void pattern2(int n)
	{
		for (int i=0;i<n;i++)
		{
			for(int j=0; j<n-i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	static int fibbo(int n)
	{
		if(n==1 || n==2) {
			return n-1;
		}else {
			return fibbo(n-1) + (n-2); 
		}
	}
	
	public static void main(String[] args) {
		// practise questions :
		// multi(5);
		// pattern1(5);
		// int c = recursion (4);
		// System.out.println(c);
		// pattern2(5);
		// int c = fibbo(7);
		// System.out.println(c);
		
		
	}
	

}
