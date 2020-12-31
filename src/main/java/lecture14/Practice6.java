package lecture14;


public class Practice6 {
	public static void main(String[] args) throws InterruptedException {
		FlagBasedTerminationRunnable r = new FlagBasedTerminationRunnable();
		InterupptTerminatedThread i = new InterupptTerminatedThread();
		Thread t = new Thread(i);
		
		t.start();
		
		Thread.sleep(2000);
		
		t.interrupt();
	}

}
