package lecture23;

import java.util.*;

public class Practice9 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int x = list.stream().reduce((e1,e2) -> e1+e2).get();
		System.out.println(x);
		
		int y = list.stream().reduce(0, (e1,e2)-> e1>e2? e1 : e2);
		System.out.println(y);

	}

}
