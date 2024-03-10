import java.util.Scanner;

public class prime2 {
	   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		   int i;
		   if(n==1) {
			   System.out.println("prime start form 2");
		   }
		 for(i=2;i<n;i++)
		 {
			 if (n%i==0)
				 System.out.println("not a prime");
			 break;
		 }
		     if(n==i)
			 System.out.println("prime number");
	}}
	
	
	
	
	
	


