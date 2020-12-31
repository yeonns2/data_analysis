package lecture19;

import java.util.*;
import java.util.stream.*;

public class Practice15 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> numbers = new HashSet<Integer>();
		for(int i = 0; i< 1000;i++) {
			numbers.add(r.nextInt(1000));
		}
		
		List<Integer> list = numbers
				.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(list);

	}

}
