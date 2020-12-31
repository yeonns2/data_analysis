package lecture22;

import java.util.*;
import java.util.stream.*;

public class Practice26_1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			numbers.add(r.nextInt(100));
		}

		Stream<Integer> gradeStream = Stream.of(30, 50, 70, 90);
		System.out.println(gradeStream
				.collect(Collectors
						.groupingBy(e -> {
							if(e >= 90)
								return "A";
							else if(e >= 80)
								return "B";
							else if(e >= 70)
								return "C";
							else
								return "FAIL";
						})));

		gradeStream = Stream.of(30, 50, 70, 90);
		System.out.println(gradeStream
				.collect(Collectors
						.partitioningBy(e -> e > 60)));
	}

}
