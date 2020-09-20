package memberinnerclass;

public class NestedMemberInnerClass {
	public class MemberInnerClass{
		public void doThis() {
			System.out.println("do this of memberInnerClass");
			
		}
		
	}
	public void innerMethodCaller() {
		//NestedMemberInnerClass mic = new NestedMemberInnerClass();
		MemberInnerClass c = new MemberInnerClass();
		c.doThis();
	}
}
