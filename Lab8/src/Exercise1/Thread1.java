package Exercise1;

public class Thread1 {

	public static void main(String[] args) {
		
		Thread thread1 = new CurrrentTime();
		Thread thread2 = new CurrrentTime();
		
		Thread printerThread1 = new Thread(thread1, "Thread 1");
		Thread printerThread2 = new Thread(thread2, "Thread 2");
		
		//Execute
		printerThread1.start();
		printerThread2.start();
	}
}
