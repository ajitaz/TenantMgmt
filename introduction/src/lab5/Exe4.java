package lab5;

public class Exe4 {
	public static void main(String[] args) {
		new ThreadA().start();
		new ThreadB().start();
		new ThreadC().start();
	}

}
 
class ThreadA extends Thread{
	public void run() {
		System.out.println("This is Thread A");
	}
}

class ThreadB extends Thread{
	public void run() {
		System.out.println("This is Thread B");
	}
}

class ThreadC extends Thread{
	public void run() {
		System.out.println("This is Thread C");
	}
}