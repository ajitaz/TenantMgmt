package lab.lab1;
import java.util.Scanner;

public class SwapWithNoVariable {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a,b;
		System.out.println("Enter values:");
		a=scan.nextInt();
		b=scan.nextInt();
		scan.close();
		System.out.println("Before swap\n a="+a+"\n b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap\n a="+a+"\n b="+b);
	}

}
