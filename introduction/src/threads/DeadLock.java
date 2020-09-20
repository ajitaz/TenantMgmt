package threads;

public class DeadLock {
	public static void main(String[] args) {
		String chair1="chair1";
		String chair2="chair2";
		
		Thread sulav=new Thread("Sulav"){
			public void run() {
				synchronized (chair1){
				System.out.println(Thread.currentThread().getName()+" Locked chair 1");
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					
				}
				synchronized (chair2){
					System.out.println(Thread.currentThread().getName()+" Locked chair 2");
				}
			}
		}
	};
		Thread utsav=new Thread("Utsav") {
			public void run() {
				synchronized (chair2) {
					System.out.println(Thread.currentThread().getName()+" Locked chair 2");
					try {
						Thread.sleep(100);
						}
					catch(Exception e) {
						}
					synchronized (chair1){
						System.out.println(Thread.currentThread().getName()+" Locked chair 1");
					}
				}
			}
		};
		sulav.start();
		utsav.start();
}
}
