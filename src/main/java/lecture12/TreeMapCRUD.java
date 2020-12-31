package lecture12;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapCRUD {

	public static void main(String[] args) {
		
		//특정 시간에 방문수를 treemap으로 구현.
		TreeMap<Long,Integer> map = new TreeMap<Long,Integer>();
		
		//3 시에는 5명, 4시에는 6명, 5시에는 7명방문 
		
		//Create
		map.put(3l,5);
		map.put(4l,6);
		map.put(5l,7);
		map.put(6l,8);
		map.put(7l,9);
		map.put(9l,11);
		map.put(11l,13);
		map.put(13l,15);

		System.out.println(map);
		
		//Retrieve
		System.out.println(map.get(6l));
		System.out.println(map.firstEntry());
		System.out.println(map.firstKey());
		System.out.println(map.lastEntry());
		System.out.println(map.lastKey());
		
		System.out.println(map.lowerEntry(10l));
		System.out.println(map.lowerKey(10l));
		System.out.println(map.higherEntry(10l));
		System.out.println(map.higherKey(10l));
		
		//Update
		System.out.println(map);
		map.put(13l, 7);
		System.out.println(map);
		
		//Iteration 1 : key 를 기반으로 순회
		Iterator<Long> i1 = map.keySet().iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		Iterator<Long> i2 = map.descendingKeySet().iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		
		//Iteration 2 : entry 를 기반으로 순회
		
		Iterator<Entry<Long,Integer>> i3 = map.entrySet().iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		Iterator<Entry<Long,Integer>> i4 = map.descendingMap().entrySet().iterator();
		while(i4.hasNext()) {
			System.out.println(i4.next()); 
		}
		
		
		
		
	}

}
