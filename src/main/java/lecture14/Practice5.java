package lecture14;

public class Practice5 {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("A");
				System.out.println("A");
				System.out.println("A");
				System.out.println("A");
				System.out.println("A");
				System.out.println(Thread.currentThread().getState().name());
			}
		});

		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t.getName());
		System.out.println(t.getId());
		t.setName("T1");
		System.out.println(t.getName());
		System.out.println(t.getState().name());

		t.start();
		System.out.println(t.getPriority());
		Thread.sleep(2000);

		System.out.println(t.getState().name());
	}
}
