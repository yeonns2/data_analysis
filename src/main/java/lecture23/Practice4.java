package lecture23;

import java.util.*;
import java.util.stream.*;

public class Practice4 {

	public static void main(String[] args) {
		ArrayList<Email> list = new ArrayList<Email>();
		list.add(new Email(1, 2));
		list.add(new Email(1, 4));
		list.add(new Email(1, 7));
		list.add(new Email(2, 4));
		list.add(new Email(2, 7));
		list.add(new Email(3, 7));
		list.add(new Email(4, 5));

		TreeMap<Integer, Set<Integer>> map = list.stream()
				.collect(Collectors.toMap(Email::getLeft, e -> {
					HashSet<Integer> s = new HashSet<Integer>();
					s.add(e.getRight());
					return s;
				}, (e1, e2) -> {
					e1.addAll(e2);
					return e1;
				}, TreeMap::new));
		map.entrySet().forEach(System.out::println);

	}

}
