package lecture18;

import java.util.*;

public class Practice7 {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		Random r = new Random();
		for (int i =0 ; i< 10000; i++) {
			numbers.add(r.nextInt(100000001));
			
		}
		numbers.stream().findFirst().ifPresent(e->{
			System.out.println(e);
		});
		
		System.out.println(numbers.parallelStream().findFirst().get());

	}

}
