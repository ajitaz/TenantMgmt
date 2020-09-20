package polymorphism;

public class Child extends Parent{
	@Override
	public void gift() {
		System.out.println("car");
	}
	public void gift(int i) {
		System.out.println(i+" no. of cars");
	}
	public static void main(String[] args) {
		Child ch=new Child();
		ch.gift();
		ch.gift(2);
		ch.gift('a');
		Parent p=new Parent();
		p.gift();
	
	}

}
