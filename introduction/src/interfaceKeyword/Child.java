package interfaceKeyword;

public class Child extends Parent implements TestInterface,TestInterface2{

	@Override
	public void doThis() {
	System.out.println("dong this");
		}
	public static void main (String[]args) {
		Child c = new Child();
		c.doThis();
		c.print();
	}
	@Override
	public void doneThat() {
		
	}

}
