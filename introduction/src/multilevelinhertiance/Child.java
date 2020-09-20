package multilevelinhertiance;

public class Child extends Parent{
	String eye="blue";
	String bloodColor="pink";
	public void test() {
		System.out.println("Eye and blood color of Parent "+super.eye+" and " +super.bloodColor);
		super.testsu();
	}

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println("Eye and blood color of child "+ch.eye+" and " +ch.bloodColor);
	
		ch.test();
	}
	
}
