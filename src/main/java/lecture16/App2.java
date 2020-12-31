package lecture16;

public class App2 {
	public static void main(String[] args) {
		
		MyFunction sum = (x,y)->{return x+y;};
		System.out.println(sum.calc(3, 5));
		
		MyFunction sub = (x,y) ->{return x-y;};
		System.out.println(sub.calc(3, 5));
		
		MyFunction mul = (x,y)->{return x*y;};
		System.out.println(mul.calc(3, 5));
		
		MyFunction div = (x,y)->{return x/y;};
		System.out.println(div.calc(3, 5));
		
		
		
	}
}
