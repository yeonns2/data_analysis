package lecture16;

public class App3 {
	
	public static void func(MyFunction f) {
		f.calc(3, 5);
	}
	public static void main(String[] args) {
		MyFunction sum=(x,y)->{
			return x+y;
		};
		func(sum);
	}

}
