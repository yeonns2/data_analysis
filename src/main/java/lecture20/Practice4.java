package lecture20;

import java.util.*;
import java.util.stream.*;

public class Practice4 {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		for (int i = 2000; i < 10000; i++) {
			numbers.add(i);
		}

		List<Integer> list = numbers.parallelStream().takeWhile(e -> e > 3000).collect(Collectors.toList());
		System.out.println(list.size());
	

	}

}
