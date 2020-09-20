package threads;

public class MultiThreadingByExtension extends Thread{
	public void run() {
		print();
	}
public void print() {
	for (int i=0;i<3;i++) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
	}
	}
}
		public  static void main(String[] args) {
			MultiThreadingByExtension obj = new MultiThreadingByExtension();
			MultiThreadingByExtension obj2= new MultiThreadingByExtension();
			MultiThreadingByExtension obj3 = new MultiThreadingByExtension();
			obj.setPriority(MAX_PRIORITY);
			obj2.setPriority(MIN_PRIORITY);
			obj3.setPriority(5);
			obj.start();
			obj2.start();
			obj3.start();
			obj.print();
		}
		
		

}
