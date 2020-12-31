package lecture14;

public class SyncMotivationApp {
	
	public static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread(new IncreaseCountRunnable()).start();
		new Thread(new IncreaseCountRunnable()).start();
		new Thread(new IncreaseCountRunnable()).start();
		new Thread(new IncreaseCountRunnable()).start();
				
		Thread.sleep(3000);

		System.out.println(count);
	}


}
