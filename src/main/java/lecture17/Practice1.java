package lecture17;

import java.util.*;
import java.util.stream.*;

public class Practice1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i< 100; i++) {
			numbers.add(i);
		}
//		numbers.parallelStream().forEach((Integer e)->{
//			if(e%2 == 0)
//			System.out.println(e);
//		});
		
		// filter 부분을 바꾸어서 5의 배수만 출력하기 
		Stream<Integer> s = numbers.stream();
//		s.filter(e-> {
//			if(e%5== 0) 
//				return true; 
//			else 
//				return false;
//			}).forEach(e->System.out.println(e));
		
		HashSet<Integer> hs = s.filter(e-> {
			if(e%5== 0) 
				return true; 
			else 
				return false;
			}).collect(Collectors.toCollection(()->{
				return new HashSet<Integer>();
			}));
		// .collect(Collectors.toCollection(HasgSet<Integer>::new)); 위와 동치 
		System.out.println(hs);
		
	}

}
 