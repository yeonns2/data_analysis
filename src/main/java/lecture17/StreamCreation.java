package lecture17;

import java.util.*;
import java.util.Map.*;
import java.util.concurrent.*;
import java.util.stream.*;


public class StreamCreation {

	public static void main(String[] args) {
		// 스트림의 생성 
		
		// 개별 요소를 스트림으로 만드는 방법 
		Stream s1 = Stream.of(3,1,4,2,5,3,4,2,6);
		
		// Array 를 스트림으로 만드는 방법 
		double[] dArray = {3.0d,1.4d, 8.6d, 9.7d};
		DoubleStream s2 = Arrays.stream(dArray);
		
		
		// Collection을 스트림으로 만드는 방법 
		List<Integer> list = new ArrayList<Integer>();
		for (int i =0; i<100;i++) {
			list.add(i);
		}
		
		Stream<Integer> s3 = list.stream();
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("ABC");
		hs.add("ADB");
		hs.add("ABC");
		hs.add("Hello");
		Stream<String> s4 = hs.stream();
		
		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
		hm.put(1,2.0d);
		hm.put(1,3.0d);
		hm.put(2,4.2d);
		hm.put(4,1.2d);
		Stream<Entry<Integer,Double>> s5 = hm.entrySet().stream();
		
		s5.forEach(System.out::println);
		
		Stack<Boolean> stack = new Stack<Boolean>();
		stack.stream(); 
		ArrayBlockingQueue<Double> abq = new ArrayBlockingQueue<Double>(3);
		abq.stream(); 
		
		
	}

}
