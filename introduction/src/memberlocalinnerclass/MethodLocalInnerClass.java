package memberlocalinnerclass;

public class MethodLocalInnerClass {
	public void aMethod() {
		class InnerClass{
			public void innerMethod() {
				System.out.println("method of InnerClass");
				
			}
		}
		InnerClass ic = new InnerClass();
		ic.innerMethod();
	}

}
