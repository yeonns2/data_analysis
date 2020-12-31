package lecture20;

import java.util.*;
import java.util.stream.*;

public class Practice3 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i=0;i< 100; i++) {
			numbers.add(i);
		}
		List<Integer> list = numbers.stream().takeWhile(e -> e < 10).collect(Collectors.toList());
		System.out.println(list);


	}

}
