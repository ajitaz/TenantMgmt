package staticInnerClass;

public class StaticNestedClass {
	int i = 10;
	static class NestedOne{
		public static void doThat() {
			System.out.println("static one");
		}
	public void doThis() {
		System.out.println("do this,non static one");
		StaticNestedClass sc = new StaticNestedClass();
		System.out.println(sc.i);
		
	}
}
}
