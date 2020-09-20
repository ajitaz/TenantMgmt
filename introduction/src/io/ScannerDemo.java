package io;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
		String s = input.nextLine();
		System.out.println(s);
		System.out.println("enter an integer");
		int i = input.nextInt();
		System.out.println(i);
		System.out.println("enter an double");
		double d = input.nextDouble();
		System.out.println(d);
		input.close();
	}

}
