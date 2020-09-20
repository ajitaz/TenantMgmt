package inheritance;

public class Child extends Parent {
	String bloodColor = "violet";
	int money=200000;
	public  void rich() {
		System.out.println(super.money);
		System.out.println(this.money);
	}
public static void main(String[] args) {
	Child ch=new Child();
	System.out.println("Eye color = "+ch.eye+"\nHair color = "+ch.hairColor+"\nBlood color = "+ch.bloodColor );
	ch.rich();
}
}	