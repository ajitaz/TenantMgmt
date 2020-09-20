package exceptionHandling;
import java.util.Scanner;

public class Example1 {
 public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 int data,divider,ans;
	 System.out.println("Enter the data and divider");
	 data=input.nextInt();
	 divider=input.nextInt();
	
	 try {
		 ans=data/divider;
		 System.out.println("ANSWER = "+ans);
		 
	 }
	 catch(ArithmeticException e) {
		 System.out.println("Error");
	 }finally {
		 input.close();
	}
	
	
	
 }
}
