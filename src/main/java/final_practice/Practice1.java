package final_practice;

import java.util.*;
import java.util.stream.*;

public class Practice1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","신용권","김남준");
		Stream<String> stream = list.stream();
		stream.forEach(name-> System.out.println(name));

		
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "김남준", "김남준");
		names.stream().distinct().forEach(System.out::println);
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(str -> str.startsWith("신"))
			.forEach(System.out::println);

		 
		
	}

}
