package lab.lab1;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the numbers");
		a=input.nextInt();
		b=input.nextInt();
		input.close();
		System.out.println("Before swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		swap(a,b);
	
	}
	public static void	swap(int p,int q) {
		int t;
		t=p;
		p=q;
		q=t;
		System.out.println("After swap");
		System.out.println("a="+p);
		System.out.println("b="+q);
	}
}
