import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
	
	     int n=101;
	     
	   int t=n;
	   int rev=0;
	   while(n!=0)
	   {
		   rev=rev*10+(n%10);
		   n=n/10;
	   }
	   if(rev==t)
		   System.out.println( t + "is a palindrone number");
	   else
		   System.out.println( t +" is not palindrone number");
	   
}}
	
	
	
	
	

