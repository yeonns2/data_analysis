package lecture8;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		//1 3 5 3
		
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(3);
		
		System.out.println(set);
		
		System.out.println(set.contains(3));
		
		System.out.println(set.isEmpty());
		
		set.remove(3);
		System.out.println(set.remove(1));
		System.out.println(set);
		
		set.add(1);
		set.add(3);
		set.add(5);
		
		System.out.println(set.contains(Integer.valueOf(3)));
		
		
		for(Integer val : set) {
			System.out.println(val);
		}

		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
