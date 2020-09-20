package lab.lab1;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer");
		int a=input.nextInt();
		input.close();
		oddeven(a);
	}
	public static void oddeven(int b) {
		if(b%2==0) {
			System.out.println(b+" is an even integer.");
		}
		else {	
			System.out.println(b+" is an odd integer.");
		}
	}

}
