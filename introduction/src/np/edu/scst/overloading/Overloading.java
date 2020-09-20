package np.edu.scst.overloading;

public class Overloading {
	public static void main(String[] args) {
		area(10);
		area(10,20);
	}
	public static void area(int length) {
		System.out.println("Area of Square is:"+(length*length));
	}
	public static void area(int length, int breadth) {	//overloading(same method name but different parameters).
		System.out.println("Area of Rectangle:"+(length*breadth));
	}

}
