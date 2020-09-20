package np.edu.scst.classesandobjects;

public class Laptop {
	String screen;
	int batteryCell;
	boolean isWifi;
	boolean isGraphic;
	int ram;
	int memory;
	String os;
	
	Laptop(){
		System.out.println("\tLaptop is called once");
	}
	Laptop(int i){
		this();
		System.out.println("\tLaptop is called twice");
	}
	
	public static void main(String[] args) {
		Laptop asus = new Laptop();
		asus.screen="oled";
		asus.batteryCell=16;
		asus.isWifi=true;
		asus.isGraphic=true;
		asus.ram=16;//GB
		asus.memory=2;//TB
		asus.os="LINUX";
		System.out.println("ASUS");
		System.out.println("SCREEN = "+asus.screen);
		System.out.println("Wifi = "+asus.isWifi);
		System.out.println("Battery Cell = "+asus.batteryCell);
		System.out.println("GRAPHIC CARD = "+asus.isGraphic);
		System.out.println("MEMORY = "+asus.memory);
		new Laptop(2);
//	new Laptop().change(5); 
		Laptop m=new Laptop();
		m.change(30);
		change1(10);
		
	}
	public int change(double a) {
		return (int)(a-2);
	}
	public static int change1(double b){
		return (int)(b-2);
	}

}
