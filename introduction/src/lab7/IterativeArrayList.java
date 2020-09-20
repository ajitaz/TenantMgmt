package lab7;
import java.util.ArrayList;
public class IterativeArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ball");
		list.add("Football");
		list.add("Basketball");
		list.add("Volleyball");
		list.add("TT Ball");
	for(String l:list) {
		System.out.println(l);
	}
	}
}
