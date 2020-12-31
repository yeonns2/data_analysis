package lecture22;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Practice24 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			numbers.add(r.nextInt(100));
		}

		TreeMap<Integer, Long> result = numbers.stream().collect(Collectors.groupingBy(e -> e % 5, 
				TreeMap::new,
				Collectors.mapping(Function.identity(), Collectors.counting())));
		
		System.out.println();


	}

}
