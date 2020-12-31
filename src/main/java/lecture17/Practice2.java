package lecture17;

import java.util.*;
import java.util.stream.*;

public class Practice2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i< 100; i++) {
			numbers.add(i);
		}
		// map 메소드 -> 각각의 요소에 3배씩 시키기
		// for each 문에서 짝수만 출력시키기
		numbers.stream().map(e -> e*3).filter(e-> {
			if(e%2== 0) 
				return true; 
			else 
				return false;
			}).forEach(e->{
			System.out.println(e);
		});
		//위와 같
		numbers.stream().map(e->e*3).filter(e->e%2==0).forEach(System.out::println);
		
		// map: numbers 를 --> 5로 나머지 하기 
		// toCollect 로 : hashset에 담아보기
		HashSet<Integer> hs = numbers.stream().map(e->e%5)
				.collect(Collectors.toCollection(HashSet<Integer>::new));
		
		System.out.println(hs);
	}

}
