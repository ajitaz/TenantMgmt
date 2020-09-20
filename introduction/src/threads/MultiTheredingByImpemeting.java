package threads;

public class MultiTheredingByImpemeting implements Runnable{
	@Override 
	public void run() {
		print();
	}
	public void print() {
		synchronized (this) {
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(1000);}
				catch(Exception e) {}
		}
	}

}
public static void main(String[] args) {
	MultiTheredingByImpemeting obj =new MultiTheredingByImpemeting();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj);//new Thread(new MultiTheredingByImpemeting());
	t1.setPriority(10);
	t2.setPriority(1);
	t1.start();
	t2.start();
	obj.print();
}
}