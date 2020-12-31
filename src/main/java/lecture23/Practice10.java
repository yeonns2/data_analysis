package lecture23;

import java.util.*;

public class Practice10 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Java");
		list.add("ParallelStream");
		list.add("Processing");

		int l = list.stream().reduce(0, (base, e) -> base + e.length(), (e1, e2) -> e1 + e2);
		System.out.println(l);
		
//		Collectors.teeing(downstream1, downstream2, merger);

//		stream.spliterator();

	}

}
