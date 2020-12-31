package lecture20;

import java.util.*;
import java.util.stream.*;

public class Practice9 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			numbers.add(i);
		}

		Stream<Integer> stream = numbers.stream();
		
		
//		Practice #9 onClose and close
//		Make ArrayList of 0 to 5 
//		Print out each element
//		Collect each element to list
//		Print out list
//		Then close  print out x
		
		List<Integer> list = stream.onClose(() -> {
			System.out.println("x");
		}).peek(e -> {
			System.out.println(e);
		}).collect(Collectors.toList());
		
		System.out.println(list);
		
		stream.close();


	}

}
