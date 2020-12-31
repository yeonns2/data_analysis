package lecture15.sem2;

import java.util.ArrayList;

public class App {
	public static ArrayList<Integer> sharedCollection = new ArrayList<Integer>();

	public static void main(String[] args) {
		new Thread(new ProducerRunnable()).start();
		new Thread(new ConsumerRunnable()).start();
	}


}
