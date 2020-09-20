package lab5;

public class Exe5 {
	public static void main(String[] args) {
		ThreadK t1=new ThreadK();
		ThreadK t2=new ThreadK();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
//class ThreadJ extends Thread{
//	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println(getPriority()+" * "+i+" = "+(getPriority()*i));
//		}
//	}
//}

class ThreadK extends Thread{
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println(getPriority()+" * "+i+" = "+(getPriority()*i));
			}
		}
}
