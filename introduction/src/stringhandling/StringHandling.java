package stringhandling;

public class StringHandling {
	public static void main(String[] args) {
		int[] a=new int[20];
		System.out.println(a.length);
		a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;
		String s1="apple";
		String s2=new String("apple");
		System.out.println(s1.equals(s2));//   .equals compares values inside the box
		System.out.println(s1==s2);       // == compares box
		String s3="apple";
		System.out.println(s3==s1);
		char[] ch = s1.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			System.out.println(ch[i]);
//		}
	//for each loop
	//for (arrayDataType variable:arrayVariable){} [..........for each]
	for(char var:ch) {
		System.out.println(var);
		
	}
	for (int b:a) {
		System.out.println(b);
	}
}
}
