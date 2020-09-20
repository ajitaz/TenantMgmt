package exam;

public class Prime {
public static boolean primeFinder(int a) {
	int count=1;
	for(int i=2;i<=a;i++) {
	if(a%i==0) {
		count++;
	}
	}
	return((count>2)? false: true);
	

}
}
