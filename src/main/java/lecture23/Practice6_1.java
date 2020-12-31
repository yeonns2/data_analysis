package lecture23;

import java.util.*;
import java.util.stream.*;

public class Practice6_1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int sum = list.stream().collect(Collectors.reducing((e1, e2) -> e1 + e2)).get();
		System.out.println(sum);

		int sum2 = list.parallelStream().collect(Collectors.reducing(0, (e1, e2) -> {
			return e1 + e2;
		}));
		System.out.println(sum);

		int mul = list.stream().collect(Collectors.reducing((e1, e2) -> e1 * e2)).get();
		System.out.println(mul);
		

	}

}
