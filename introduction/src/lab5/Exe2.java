package lab5;
import java.lang.String;
public class Exe2 {
	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Ajit");
	sb.append(" Bhattarai");
	System.out.println(sb);
	System.out.println(sb.capacity());
	sb.trimToSize();
	System.out.println(sb);
	System.out.println(sb.capacity());

}
}
