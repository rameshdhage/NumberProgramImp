import java.util.Scanner;

public class FactRange {
	static int fact(int n) 
	{
	int fact=1;
	while(n>0) {
		fact=fact*n;
		n--;
	}
	return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the factorial range number");
		   int n =sc.nextInt();
		   
		   for(int i=1;i<=n;i++) 
		   {
			 System.out.println(i+"!----->" +fact(i));  
		   }}}
		   
		   
	
	

	
