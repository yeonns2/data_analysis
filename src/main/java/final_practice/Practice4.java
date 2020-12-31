package final_practice;

import java.util.*;
import java.util.stream.*;

public class Practice4 {

	public static void main(String[] args) {
	
		Random r  = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<100;i++) {
			list.add(r.nextInt(100));
		}
		list.stream().filter(e->e%5==0).forEach(System.out::println);
		
		HashSet<Integer> hs = list.stream()
			.filter(e->e%5==0)
			.collect(Collectors.toCollection(()->{
				return new HashSet<Integer>();
			}));
		
		System.out.println(hs);
		
	}

}
