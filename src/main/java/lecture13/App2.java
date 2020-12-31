package lecture13;

public class App2 {

	public static void main(String[] args) {
		
		new PrintThread("A").start();
		new PrintThread("B").start();
		
	}

}
