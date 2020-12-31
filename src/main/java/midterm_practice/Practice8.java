package midterm_practice;

import java.util.HashMap;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
        map.put(1,3);
        map.put(1,4);
        map.put(2,5);
        map.put(3,6);
        map.put(4,9);
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue(3));
	}

}
