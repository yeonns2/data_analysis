package lecture20;

import java.util.*;
import java.util.stream.*;



public class Practice1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i=0;i< 100; i++) {
			numbers.add(i);
		}
		Stream<Integer> stream = numbers.stream();
		boolean isAllOver100 = stream.anyMatch(e->e>50);
		System.out.println(isAllOver100);
	} 

}
