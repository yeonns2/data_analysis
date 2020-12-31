package lecture21;

import java.util.*;

public class Practice12 {

	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		Random r = new Random();
		for (int i = 0; i<5;i++) {
			ArrayList<Integer> grades = new ArrayList<Integer>();
			grades.add(r.nextInt(100));
			grades.add(r.nextInt(100));
			grades.add(r.nextInt(100));
			grades.add(r.nextInt(100));
			grades.add(r.nextInt(100));
			map.put(String.valueOf(i), grades);
		}
		
		map.entrySet().stream().forEach(System.out::println);
		map.entrySet().stream().map(e->e.getValue()).forEach(System.out::println);
		map.entrySet().stream().flatMap(e->e.getValue().stream()).forEach(System.out::println);
		
		map.entrySet().stream().flatMapToInt(e->e.getValue().stream().mapToInt(i->i));
		
		int sum = map.entrySet().stream().flatMapToInt(e->{
			return e.getValue().stream().mapToInt(i->i);
		}).sum();
		
		
		System.out.println(sum/(float)map.size());
		
		
	}

}
