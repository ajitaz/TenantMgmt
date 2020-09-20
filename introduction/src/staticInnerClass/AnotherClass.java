package staticInnerClass;

import staticInnerClass.StaticNestedClass.NestedOne;

public class AnotherClass {
	public static void main(String[] args) {
		StaticNestedClass.NestedOne nestedOne= new StaticNestedClass.NestedOne();
		nestedOne.doThis();
		NestedOne.doThat();
	}

}
