package np.edu.scst.classesandobjects;

public class Mobile {
	String screen;
	int memory=2;//in GB
	boolean isWifi;

public void call() {
	System.out.println("tring..... tring");
}
public void entertainment() {
	System.out.println("i am entertaining...");
}
public static void main(String[] args) {
	Mobile samsung = new Mobile();
	samsung.screen="lcd";
	samsung.isWifi=true;
	System.out.println("SAMSUNG");
	System.out.println("screen = "+samsung.screen);
	System.out.println("memory = "+samsung.memory);
	System.out.println("WIFI is available = "+samsung.isWifi);
	samsung.call();
	samsung.entertainment();
	Mobile iphone = new Mobile();
	iphone.screen = "led";
	iphone.isWifi=true;
	System.out.print("\n");
	System.out.println("IPHONE");
	System.out.println("screen = "+iphone.screen);
	System.out.println("memory = "+iphone.memory);
	System.out.println("WIFI is available = "+iphone.isWifi);
	iphone.call();
	iphone.entertainment();
	
}
}