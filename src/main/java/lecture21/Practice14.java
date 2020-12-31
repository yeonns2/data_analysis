package lecture21;

import java.util.*;
import java.util.concurrent.atomic.*;



public class Practice14 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < 100 ; i++) {
			numbers.add(i);
		}
		AtomicInteger sum = numbers.parallelStream()
				.collect(
						// 저장될 용기 supplier						
						()-> new AtomicInteger()
						//AtomicInteger::new
						, (AtomicInteger base, Integer delta) -> {
							base.addAndGet(delta);
						}, (AtomicInteger partial1, AtomicInteger partial2) -> {
							partial1.addAndGet(partial2.get());
						});
		
		System.out.println(sum.get());

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
