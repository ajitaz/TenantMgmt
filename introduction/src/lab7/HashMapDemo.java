package lab7;

import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> items= new LinkedHashMap<>();
		items.put("ajit", 1);
		items.put("rj", 2);
		items.put("image", 3);
		items.put("janak", 4);
		for(String var:items.keySet()) {
			System.out.print(var);
			System.out.println(" => "+items.get(var));
		}
		System.out.println(items.get("rj"));
	}
}
