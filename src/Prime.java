import java.util.Scanner;

public class Prime {
	
	/*public static  void main(String args[]) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int i;
		if(n==1)
		{
		System.out.println("Prime start form 2");
		}
		
	for(i=2;i<n;i++)
	{
		if (n%i==0) 
			System.out.println("not a prime" );
	break;
		}
	if(n==i) 
	System.out.println("prime number>>"  );
	}}*/
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		System.out.println("prime number between 1 and " +n);
		for(int i=2; i<=n;i++)
		{
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) 
				{
				isprime=false;
				break;
				
				}
			}
			if(isprime)
				System.out.println(i+"");
		}}}
		
		
		
		
		
		
		
		
		
		


	
