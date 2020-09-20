package exceptionHandling;

public class Array {
public static void main(String[] args) {
	char[] ch= new char[] {'a','b','c'};
	
		
			try {
				for(int i=0;i<5;i++) {
			System.out.println(ch[i]);
		}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("fsociety");
			}
			
			
			
	
		

}
}
