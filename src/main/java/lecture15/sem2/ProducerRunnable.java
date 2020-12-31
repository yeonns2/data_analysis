package lecture15.sem2;

import java.util.Random;

public class ProducerRunnable implements Runnable {

	@Override
	public void run() {
		Random r = new Random();

		while (true) {
			// shared collection 계속 무언가 집어 넣는다.
			App.sharedCollection.add(r.nextInt(100));
		}



	}

}
