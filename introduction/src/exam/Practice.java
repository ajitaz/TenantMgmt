package exam;
import java.util.Scanner;
import np.edu.scst.overloading.Overloading;
import np.edu.scst.recursion.Factorial;
import exam.Hanoi;

public class Practice {
	public static void main(String[] args) {
		int ch;
		do {
		ch=menu();
		switch(ch) {
		case 1:
			oddEven();
			break;
		case 2:
//			Practice fac=new Practice();
//			fac.fact();
			Factorial.main(args);
			break;
		case 3:
		 Overloading.area(10,20);
		
		case 4:	
			Hanoi.main(args);
			
		case 5:System.exit(0);
		default:
			System.out.println("Wrong entry!!! Choose correct number.");
		}
	}while(true);
	}
public static int menu() {
	Scanner input= new Scanner(System.in);
	int n;
	System.out.println("\t____MENU____\n\t1.Check Odd or Even.\n\t2.Factorial.\n\t3.Area.\n\t4.Hanoi.\n\t5.Quit.");
	n=input.nextInt();
	input.close();
	return n;
	
}
public static void oddEven(){
	int n;
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the number:");
	n=input.nextInt();
	input.close();
	if(n%2==0) {
		System.out.println("Its Even.");
	}
	System.out.println("Its Odd.");
}
//public void fact() {
//	int n;
//	System.out.println("Enter the number:");
//	Scanner input= new Scanner(System.in);
//	n=input.nextInt();
//	System.out.println("Factorial="+facto(n));
//	
//}
//public static int facto(int n) {
//	if(n==1) {
//		return 1;
//	}
//	return facto(n-1)*n;
//}
}
