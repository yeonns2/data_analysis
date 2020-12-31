package lecture13;

public class App3 {

	public static void main(String[] args) {
		
		// Runnable interface를 구현한 클래스의 인스턴스를 넣는다.
		new Thread(new PrintRunnable()).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("d");
				
			}
			
		}).start();
		
	
	}
}
