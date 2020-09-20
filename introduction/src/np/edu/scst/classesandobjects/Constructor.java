package np.edu.scst.classesandobjects;

public class Constructor {
	String screen;
	int memory=2;//in GB
	boolean isWifi;
	Constructor(){
		System.out.println("\ta mobile is made");
	}
	Constructor(String scr,int mem,boolean isw){
		this();
		this.screen=scr;
		this.memory=mem;
		this.isWifi=isw;
	}

public static void main(String[] args) {
	Constructor samsung = new Constructor();
	samsung.screen="lcd";
	samsung.memory=4;
	System.out.println("SAMSUNG\nscreen="+samsung.screen+"\nMEMORY="+samsung.memory);
	Constructor mi = new Constructor("led",6,true);
	System.out.println("MI\nscreen="+mi.screen+"\nMEMORY="+mi.memory);
	Constructor nokia = new Constructor("oled",4,true);
	System.out.println("NOKIA\nscreen="+nokia.screen);
	Constructor iphone = new Constructor("lcd",2,false);
	System.out.println("IPHONE\nscreen="+iphone.screen);
}

}
