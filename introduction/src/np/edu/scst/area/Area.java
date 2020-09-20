package np.edu.scst.area;

public class Area {
	public static void area(int i) {
		System.out.println("Area of squre is"+(i*i));
	}
	public static void main(String[] args) {
		area(10);
		area(10,2);
		
	}
	public static void area(int j,int i) {
		System.out.println("Area of rectangle is"+(j*i));
	}

}
