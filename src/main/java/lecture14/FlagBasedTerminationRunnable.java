package lecture14;

public class FlagBasedTerminationRunnable implements Runnable {

	private boolean doExit = false;

	public boolean isDoExit() {
		return doExit;
	}

	public void setDoExit(boolean doExit) {
		this.doExit = doExit;
	}

	@Override
	public void run() {
		while (!doExit) {
			System.out.println("A");
		}
	}

}