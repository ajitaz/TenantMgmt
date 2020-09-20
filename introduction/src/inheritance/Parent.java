package inheritance;

public class Parent {
	String eye = "green";
	String hairColor = "red";
	String bloodColor = "purple";
	int money=10000;
	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println("Eye color = "+p.eye+"\nHair color = "+p.hairColor+"\nBlood color = "+p.bloodColor );
		p.sec();
	}
	public void sec() {//non static to non static..........
		System.out.println(eye);
	}
}
