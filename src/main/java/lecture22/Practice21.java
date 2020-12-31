package lecture22;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Practice21 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			numbers.add(r.nextInt(100));
		}
		
		System.out.println(numbers.stream().collect(Collectors.groupingBy(e -> e%5,
				Collectors.mapping(Function.identity(), Collectors.counting()))));

		System.out.println(numbers.stream().collect(Collectors.groupingBy(e -> e%5,
				Collectors.mapping(Function.identity(), Collectors.averagingDouble(e -> e)))));
				
		System.out.println(numbers.stream().collect(Collectors.groupingBy(e -> e%5,
				Collectors.mapping(Function.identity(), Collectors.summarizingDouble(e -> e)))));



	}

}
