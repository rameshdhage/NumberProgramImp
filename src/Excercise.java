import java.util.Scanner;

public class Excercise {
public static void main(String[] args) {
	   /* Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number");
	   int n   = sc.nextInt();
	       int cube=1;
	       
	for(int i=1;i<=n;i++)
	{
		cube=n*n*n;
	}
	System.out.println(cube);
	
}}*/
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int number=sc.nextInt();
	
	
	int cube=1;
	
	
	for(int i=1;i<=number;i++) {
		cube=number *number*number;
	}
	System.out.println(cube);
	
}}