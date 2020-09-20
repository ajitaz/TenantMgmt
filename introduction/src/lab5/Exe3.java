package lab5;

public class Exe3 {
	public  class ThreadA implements Runnable{
		public void run() {
			for(int i=1;i<=3;i++) {
				System.out.println(i+" I'm from Thread A");
			}
			System.out.println("a test");
		}
	}
	public class ThreadB implements Runnable{
		public void run() {
			for(int i=1;i<=3;i++) {
				System.out.println(i+" I'm from Thread B");
			}
		}
		public void testing() {
			System.out.println("b test");// wont be called ,only run method will be called...
		}
	}
	public class ThreadC implements Runnable{
		public void run() {
			for(int i=1;i<=3;i++) {
				System.out.println(i+" I'm from Thread C");
			}
			System.out.println(" c test");
		}
	}
	public static void main(String[] args) {
		Exe3 e = new Exe3();
		Thread t1 = new Thread(e.new ThreadA());
		Thread t2 = new Thread(e.new ThreadB());
		Thread t3 = new Thread(new Exe3().new ThreadC());
		t1.start();
		t2.start();
		t3.start();
		
	}
}
