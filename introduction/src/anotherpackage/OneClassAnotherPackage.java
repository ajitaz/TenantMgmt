package anotherpackage;
import samepackage.OneClass; 
public class OneClassAnotherPackage extends OneClass {
	public static void main(String[] args) {
		System.out.println(var+" Another package");
		OneClass.trying();
		OneClassAnotherPackage one=new OneClassAnotherPackage();
		System.out.println(one.vari);
		one.sathi();
		
	}
}
