package lecture15.sem1;

import java.util.concurrent.Semaphore;

public class App {

	public static int count = 0;
	public static Semaphore sem = new Semaphore(1);
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Thread(new IncreaseRunnable()).start();
		new Thread(new IncreaseRunnable()).start();
		new Thread(new IncreaseRunnable()).start();
		new Thread(new IncreaseRunnable()).start();
		
		Thread.sleep(3000);
		
		System.out.println(count);

	}

}
