package lecture23;

import java.util.*;
import java.util.stream.*;

public class Practice2 {

	public static void main(String[] args) {
		ArrayList<Email> list = new ArrayList<Email>();
		list.add(new Email(1, 2));
		list.add(new Email(1, 4));
		list.add(new Email(1, 7));
		list.add(new Email(2, 4));
		list.add(new Email(2, 7));
		list.add(new Email(3, 7));
		list.add(new Email(4, 5));

		Map<Integer, Integer> map = list.stream()
				.collect(Collectors.toMap(Email::getLeft, Email::getRight, (e1, e2) -> e1));
		map.entrySet().forEach(System.out::println);



	}

}
