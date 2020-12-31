package lecture22;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import midterm_practice.*;


public class Practice18 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		Random r = new Random();
		for (int i =0 ; i< 100 ; i++) {
			numbers.add(r.nextInt(5));
		}
		
		System.out.println(numbers.parallelStream()
				.collect(Collectors.groupingBy(Function.identity())));
		System.out.println(numbers.parallelStream()
				.collect(Collectors.groupingBy(e->e)));
		
		List<Email> eList = new ArrayList<Email>();
		eList.add(new Email(1,2));
		eList.add(new Email(2,2));
		System.out.println(eList.parallelStream()
				.collect(Collectors.groupingBy(e->e.getRight())));
		
		
		
		

	}

}
