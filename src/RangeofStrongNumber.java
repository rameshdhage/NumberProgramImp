import java.util.Scanner;

public class RangeofStrongNumber {
	static int fact(int n) {
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
			
		}return fact;
	}
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range");
			int n=sc.nextInt();
			
			for(int  i=1;i<=n;i++) {
				int num=i;
				int sum=0;
				int t=num;
				while(num!=0)
				{	
			int r=num%10;
			sum=sum+fact(r);
			num=num/10;
		}
		if (sum==t)
			System.out.println(t +"is a strong number");
	}}}
	
	
	
	
	
	


