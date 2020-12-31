package lecture18;

import java.util.*;

public class Practicex {

	public static void main(String[] args) {
		
		Random r  = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<100;i++) {
			list.add(r.nextInt(100));
		}
		
		// 최대값을 reduce 를 이용하여 푼다.
		int max1 = list.stream().reduce((e1,e2)->{
			// 2개의 수가 주어졌을 때, 큰 수를 계속 내보낸다.
			if(e1>e2)
				return e1;
			else
				return e2;
		}).get();
		System.out.println(max1);
		
		
		// 최대값을 max를 이용해서 푼다.
		int max2 = list.stream().max((Integer left,Integer right)->{
			if (left > right)
				return 1;
			else if (left == right)
				return 0;
			else
				return -1;
		}).get();
		System.out.println(max2);
		

		
		// 최소값을 min을 이용해서 푼다.
		int min = list.stream().min((Integer left, Integer right)->{
			if (left > right)
				return 1;
			else if (left == right)
				return 0;
			else
				return -1;
		}).get();
		System.out.println(min);
		
	}

}
