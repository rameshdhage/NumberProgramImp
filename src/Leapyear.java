import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		int m=2016;
		
		if (m%4==0 && m%100!=0||m%400==0)
		
		{
		System.out.println("this is leap year");
	    }
		else 
		{
		System.out.println("this is not leap year");
		}
		
	}
	

}
