package lecture21;

import java.util.*;
import java.util.stream.*;

public class Practice17 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			numbers.add(i);
		}

		String joinedStr = numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining());
		System.out.println(joinedStr);

		joinedStr = numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(","));
		System.out.println(joinedStr);

		joinedStr = numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining("\t"));
		System.out.println(joinedStr);

		joinedStr = numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(",", "$", "^"));
		System.out.println(joinedStr);
		
		// -0|1|2|3|4-
		
		joinedStr = numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining("|","-","-"));
		System.out.println(joinedStr);
	}

}
