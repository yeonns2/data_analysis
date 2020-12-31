package lecture14;

public class IncreaseCountRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			SyncMotivationApp.count++;
		}
	}

}
