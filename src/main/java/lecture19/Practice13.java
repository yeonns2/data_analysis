package lecture19;

import java.util.*;
import java.util.stream.*;

public class Practice13 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for ( int i = 1; i< 1001; i++) {
			numbers.add(i);
		}
		List<Integer> list = numbers
				.stream()
				.limit(100)
				.collect(Collectors.toList());

		System.out.println(list);
	}

}
