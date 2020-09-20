package anonymousinnerclass;

public class Child {
	public static void main(String[] args) {
		AbstractClass ac =new AbstractClass() {
			public void doThis() {
				System.out.println("do this");
			}
		};
		ac.doThis();
	}
}
