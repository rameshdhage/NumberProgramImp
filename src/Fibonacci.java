import java.util.Scanner;

public class Fibonacci {
    static int fib(int n)
    {
    	if(n==0)
    		return 0;
    	if(n==1)
    		return 1;
    	return fib(n-1)+fib(n-2);
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int	n=sc.nextInt();
		int f=fib(n);
     System.out.println(f);
	}}
		
		
	
	
	
   