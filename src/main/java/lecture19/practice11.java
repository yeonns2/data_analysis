package lecture19;

import java.util.*;
import java.util.stream.*;

public class practice11 {

	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 4; i++) {
			numbers.add(i);
		}
		List<List<Integer>> list = numbers.stream().map(e->{
			ArrayList<Integer> n = new ArrayList<Integer>();
			for (int i = 0; i<5 ; i++) {
				n.add(e);
			}
			return n;
		}).collect(Collectors.toList());
		System.out.println(list);
	}

}
