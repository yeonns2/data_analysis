package lecture12;

import java.util.TreeMap;

public class TreeMapCRUD2 {

	public static void main(String[] args) {
		
		// Map 에 custom class 적용하기  
		TreeMap<Message,Integer> map = new TreeMap<Message,Integer>();
		
		map.put(new Message(3,4,5l),3);
		map.put(new Message(2,3,5l),2);
		map.put(new Message(1,2,5l),1);
		
		System.out.println(map);
	}

}
