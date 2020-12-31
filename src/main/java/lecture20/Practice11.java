package lecture20;

import java.util.*;

public class Practice11 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			numbers.add(i);
		}

		System.out.println(numbers.stream().mapToInt(i -> i).average().getAsDouble());
		
		IntSummaryStatistics stat = numbers.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println("AVG: " + stat.getAverage());
		System.out.println("CNT: " + stat.getCount());
		System.out.println("MAX: " + stat.getMax());
		System.out.println("MIN: " + stat.getMin());
		System.out.println("SUM: " + stat.getSum());

		
	}

}
