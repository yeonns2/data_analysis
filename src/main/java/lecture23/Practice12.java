package lecture23;

import java.util.*;
import java.util.stream.*;

public class Practice12 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);

		int x = StreamSupport.stream(new MySpliterator<Integer>(list), true).collect(Collectors.reducing(0, (e1, e2) -> {
			return e1 + e2;
		}));
		System.out.println(x);


	}

}
