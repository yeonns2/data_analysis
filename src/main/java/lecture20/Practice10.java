package lecture20;

import java.util.*;
import java.util.stream.*;

public class Practice10 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			numbers.add(i);
		}

		Stream<Integer> stream = numbers.stream();
		stream.parallel();
		System.out.println(stream.isParallel());
		stream.sequential();
		System.out.println(stream.isParallel());


	}

}
