package exam;

public class Hanoi {
	public void toh(int n,char frod,char trod,char aux){//public static void toh(int n,char frod,char trod,char aux)
		if(n==1) {
			System.out.println("Move disk " +n+ " form " +frod+" to "+trod);
			return;
		}
		toh(n-1,frod,aux,trod);
		System.out.println("Move disk " +n+ " form " +frod+" to "+trod);
		toh(n-1,aux,trod,frod);
	}
	public static void main(String[] args) {
		int n=4;
		new Hanoi().toh(n,'A','C','B');//toh(n,'A','C','B');
	}
}
