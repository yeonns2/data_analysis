package final_practice;

import java.util.*;



public class Practice5 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10000 ; i++) {
			list.add(i);
		}
		
		Random r = new Random();
		
		//list.stream().map(e->e+r.nextInt(200)).filter(e->e<=100).forEach(System.out::println);
		int s = list.stream().findFirst().get();
		System.out.println(s);
	}
	

}
