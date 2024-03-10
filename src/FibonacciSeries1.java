import java.util.Scanner;

public class FibonacciSeries1 {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
	     int n=sc.nextInt();*/
	int n=5;
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			if (c<=n)
			{
				System.out.println(c);
			a=b;
			b=c;
			}
		}}}
	
	
	


