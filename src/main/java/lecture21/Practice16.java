package lecture21;

import java.util.*;
import java.util.stream.*;



public class Practice16 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i =  0; i < 100 ; i++) {
			numbers.add(i);
		}
		System.out.println(numbers.stream().collect(Collectors.averagingDouble(e -> e)));
		System.out.println(numbers.stream().collect(Collectors.averagingInt(e -> e)));
		System.out.println(numbers.stream().collect(Collectors.averagingLong(e -> e)));

		System.out.println(numbers.stream().collect(Collectors.summingDouble(e -> e)));
		System.out.println(numbers.stream().collect(Collectors.summingInt(e -> e)));
		System.out.println(numbers.stream().collect(Collectors.summingLong(e -> e)));

		System.out.println(numbers.stream().collect(Collectors.summarizingDouble(e -> e)));
		System.out.println(numbers.stream().collect(Collectors.summarizingInt(e -> e)));
		System.out.println(numbers.stream().collect(Collectors.summarizingLong(e -> e)));

		System.out.println(numbers.stream().collect(Collectors.maxBy((e1, e2) -> {
			if (e1 > e2)
				return 1;
			else if (e1 == e2)
				return 0;
			else
				return -1;
		})).get());

		System.out.println(numbers.stream().collect(Collectors.minBy((e1, e2) -> {
			if (e1 > e2)
				return 1;
			else if (e1 == e2)
				return 0;
			else
				return -1;
		})).get());

		System.out.println(numbers.stream().collect(Collectors.counting()));
	}

}
