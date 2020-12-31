package lecture21;

import java.util.*;
import java.util.concurrent.atomic.*;


public class Practice13 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i< 100 ; i++) {
			numbers.add(i);
		}
		
		// 최대값 찾기
		AtomicInteger x = numbers.parallelStream().collect(AtomicInteger::new,
				(AtomicInteger base, Integer i )->{
					base.set(i);
				},(p1,p2)->{
					if(p1.get() < p2.get()) {
						p1.set(p2.get());
					}
				}
				);
		System.out.println(x);
		
		// "0123456789101112....99"
		StringBuilder ret =numbers
				.stream()
				.collect(
						// 결과값이 담길 용기를 제공 
						StringBuilder::new,
						// 각 요소 (Integer)용기에 담기는 방법을 제
						(StringBuilder sb,Integer i ) ->{
							sb.append(String.valueOf(i));
						},
						// 부분 결과 2개가 있을 때 결과를 결과1에 넣는다.
						(sb1, sb2) ->{
							sb1.append(sb2);
							});
				
		System.out.println(ret);
		
//		stream.collect(collector);
//		stream.collect(supplier, accumulator, combiner);
//		
//		
//		stream.reduce(accumulator);
//		stream.reduce(identity, accumulator);
//		stream.reduce(identity, accumulator, combiner);
//		

//		stream.spliterator();

	}

}
