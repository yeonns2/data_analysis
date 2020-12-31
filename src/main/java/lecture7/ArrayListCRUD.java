package lecture7;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);

//		System.out.println(list.size());
//		
//		list.add(2,11);
//		System.out.println(list.size());
//		
		list.add(0,13);
		System.out.println(list);
		System.out.println(list.get(4));
//		
//		list.set(0, 1);
//		System.out.println(list);
//		
//		System.out.println(list.remove(2));// index(위치)로 지우고 싶을 
//		System.out.println(list);
//		
		System.out.println(list.remove(Integer.valueOf(7))); //정확히 값 7을 지우고 싶을 
//		System.out.println(list);
		
		
		System.out.println(list);
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i));

		}
		
		for (Integer i:list) {
			System.out.println(i);
		}
		
		ListIterator<Integer> iterator = list.listIterator();
		while(iterator.hasNext()) { //다음 요소가 있는지 확인 있으면 true
			Integer val = iterator.next(); // 다음 요소를 가져오고, 다음 위치로 이동  
			System.out.println(val);
		}
		
		
		
	}

}
 