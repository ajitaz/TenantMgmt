package lab.lab1;
import java.util.Scanner;
public class ArrayPrint {
	public static void main(String [] args) {
		int[] a=new int[] {1,2,3,4,5};
		char ch;
		for(int i=0;i<5;i++) { 
			System.out.println("a["+i+"]="+a[i]);
		
	}
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a letter:");
	ch=scan.next().charAt(0);
	System.out.println("Letter is : "+ch);
	scan.close();
	for(Integer var:a) {
		System.out.println(var);
	}
}
}