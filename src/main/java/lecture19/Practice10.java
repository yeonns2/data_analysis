package lecture19;

import java.util.*;
import java.util.stream.*;

public class Practice10 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=0;i<100;i++) {
			numbers.add(i);
		}
		Set<Integer> newList = numbers.stream()
				.map(e->e%10)
				.collect(Collectors.toSet());
		
		HashSet<Integer> hs = numbers.stream()
				.map(e->e%10)
				.collect(Collectors.toCollection(HashSet::new));
		
		System.out.println(hs);
		System.out.println(newList);
	}

}
