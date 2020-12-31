package lecture23;

import java.util.*;
import java.util.stream.*;

public class Practice11 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		List<Integer> sumMul = list.stream().collect(
				Collectors
				.teeing(Collectors.reducing((e1, e2) -> (int) e1 + (int) e2), 
						Collectors.reducing((e1, e2) -> {
					return (int) e1 * (int) e2;
				}), (e1, e2) -> {
					return List.of(e1.get(), e2.get());
				}));
		System.out.println(sumMul);

//		stream.spliterator();

	}

}
