package lecture22;

import java.util.*;
import java.util.stream.*;

public class Practice20 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			numbers.add(r.nextInt(100));
		}

		Map<Integer, List<Integer>> map = numbers
				.stream().collect(Collectors.groupingBy(e -> e % 5));
		map.entrySet().forEach(System.out::println);

	}

}
