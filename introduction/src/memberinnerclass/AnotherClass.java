package memberinnerclass;

public class AnotherClass {
	public static void main(String[] args) {
		NestedMemberInnerClass nc = new NestedMemberInnerClass();
		nc.innerMethodCaller();//do this memberInnerClass inner method
		NestedMemberInnerClass.MemberInnerClass mic= nc.new MemberInnerClass();//do this of memberInnerClass
		mic.doThis();
	}

}
