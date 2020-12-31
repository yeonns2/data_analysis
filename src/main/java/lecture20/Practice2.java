package lecture20;

import java.util.*;
import java.util.stream.*;

public class Practice2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i=0;i< 100; i++) {
			numbers.add(i);
		}
		
		System.out.println(numbers.stream()
				.peek(System.out::println)
				.map(e->e*3)
				.collect(Collectors.toList()));
	}

}
