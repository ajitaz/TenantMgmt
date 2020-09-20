package multilevelinhertiance;

public class Parent extends Grandparent {
	String eye="black";
	String bloodColor="green";
	
	public void testsu() {
		System.out.println("Eye and blood color of Grandparent "+super.eye+" and " +super.bloodColor);
	}
}
