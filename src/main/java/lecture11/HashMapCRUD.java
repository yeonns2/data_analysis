package lecture11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCRUD {

	public static void main(String[] args) {
		
		// 학교번호 : 정수
		// 이름 : 문자열
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		// Create
		map.put(61458,"Jaewook Byun");
		map.put(1234,"James");
		map.put(4321,"Jack");
		
		System.out.println(map);
		
		// Update
		map.put(1234,"J.Byun");
		System.out.println(map);
		
		// Retrieve
		String name61458 = map.get(61458);
		System.out.println(name61458);
		System.out.println(map.get(1234));
		
		// Delete
		map.remove(1234);
		System.out.println(map);
		
		System.out.println(map.containsKey(61458));
		System.out.println(map.containsValue("Jack"));
		
		//map.clear();
		System.out.println(map.isEmpty());
		System.out.println(map==null); // 값이 없다고 null 아님 개념의 차이 알아두기 
		
		// Iteration1 : keyset
		Set<Integer> set = map.keySet();
		Iterator<Integer> keyIter = set.iterator();
		
		while(keyIter.hasNext()) {
			Integer key = keyIter.next();
			String value = map.get(key);
			System.out.println(key +"->"+value);
		}
		
		
		// Iteration2 : entryset
		Set<Entry<Integer,String>> entrySet=map.entrySet();
		Iterator<Entry<Integer,String>> entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()) {
			Entry<Integer,String> entry = entryIter.next();
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
	}

}
