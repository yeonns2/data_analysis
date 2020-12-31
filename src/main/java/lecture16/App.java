package lecture16;

public class App {

	public static void main(String[] args) {
		
		MyFunction f1 = (x,y)->{return x+y;};
		System.out.println(f1.calc(3, 5));
		
		//기존의 방식
		new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i=0; i<100;i++) {
					System.out.println(i);
				}
			}
		}).start();
		
		Runnable r = () ->{
			for (int i=0; i<100;i++) {
				System.out.println(i);
			}	
		};
		
		// 람다식을 쓰면 runnable을 바로 구현하여 실행가능.
		new Thread(()->{
			for (int i =0; i<100;i++) {
				System.out.println(i);
			}
		}).start();
	}

}
