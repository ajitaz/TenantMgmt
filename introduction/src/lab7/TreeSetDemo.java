package lab7;
import java.util.TreeSet;
import java.util.Scanner;
public class TreeSetDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char b;
		TreeSet<Character> tS = new TreeSet<Character>();
		tS.add('v');
		tS.add('a');
		tS.add('n');
		tS.add('s');
		System.out.println(tS);
		System.out.println("Enter a character to check");
		b=input.next().charAt(0);
		System.out.println("Is item in the list??"+tS.contains(b));
		input.close();
		
		TreeSet <String> test = new TreeSet<String>();
		test.add("hello"+" world");
		test.add("how are you");
		test.add("hope you are doing well" + " if not dont worry,everything will be right");
		System.out.println(test);
		for(String var : test) {
			System.out.println(var);
		}
		
	}
}
