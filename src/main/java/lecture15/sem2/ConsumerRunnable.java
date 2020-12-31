package lecture15.sem2;

public class ConsumerRunnable implements Runnable {

	@Override
	public void run() {
		while (true) {
			if (!App.sharedCollection.isEmpty()) {
				System.out.println(App.sharedCollection.remove(0));
			}
		}
	}

}
