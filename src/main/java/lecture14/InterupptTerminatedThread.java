package lecture14;

public class InterupptTerminatedThread implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("A");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				break;
			}
		}
		System.out.println("Finish");
	}

}
