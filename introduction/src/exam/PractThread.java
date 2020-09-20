package exam;

public class PractThread extends Thread{
	public class ThreadA implements Runnable{
		public void run() {
			System.out.println("i m A");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		}

	}
	public class ThreadB implements Runnable{
		public void run() {
			System.out.println("i m B");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		
		}
	}
	
	public class ThreadC {
		public void test() {
			System.out.println(" i m c");
		}
	}
	
	public static void main(String[] args) {
		Thread Ta = new Thread(new PractThread().new ThreadA());
		Thread Tb= new Thread(new PractThread().new ThreadB());
		//Thread Tc= new Thread(new PractThread().new ThreadC());
		Tb.setPriority(MAX_PRIORITY);
		Ta.start();  
		Tb.start();
		
	
	}
}
