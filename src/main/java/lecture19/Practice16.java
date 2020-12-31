package lecture19;

import java.util.*;
import java.util.stream.*;

public class Practice16 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i< 100;i++) {
			numbers.add(i);
		}
		
		List<Integer> list = numbers.stream()
				.map(e->e%5)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println(numbers.stream().map(e->e%5).distinct().count());

	}

}
