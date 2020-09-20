import java.util.Scanner;


public class Fibonacci {
 public  static int fibo(int n) {
	 if (n==1 || n==0) {
		 return n;
	 }
	 else {
		 return (fibo(n-1)+fibo(n-2));
	 }
 }
 public static void main (String[] args) {
	 Scanner input=new Scanner(System.in);
	 int a,x=0,y=1,z;
	 char ch;
	 System.out.println("how many terms?");
	 a=input.nextInt();
	 
	 for(int i=0;i<a;i++) {
	 System.out.print("\t"+fibo(i));
	 }
	System.out.println();
	 System.out.println("Do you want see the sequence genereted by without using recursion?");
	 System.out.println(" What say y or n?");
	 ch=input.next().charAt(0);
	 input.close();
	 if(ch=='Y'|| ch=='y') {
	 System.out.println("you entered "+ch+" so here is the sequence without using recursion");
	 
	 for(int i=0;i<a;i++) {
		 System.out.print("\t"+x);
		 z=x+y;
		 x=y;
		 y=z;
	 }
	 }
	 else {
		 System.out.println("you enterd"+ch+"so no sequence");
	 }
 }
}
