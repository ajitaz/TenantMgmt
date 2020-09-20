package np.edu.scst.recursion;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a numbere:");
		int i = input.nextInt();
		input.close();
		int result=fact(i);
		System.out.print("result is: "+result+"\n");
		}
public static int fact(int i) {
	if(i==1) {
		return i;
	}
	return i*fact(i-1);
}

}

