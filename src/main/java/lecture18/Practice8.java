package lecture18;

import java.util.*;

public class Practice8 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<100;i++) {
			list.add(i);
		}
		
		Integer[] arr = list.stream().toArray(Integer[]::new);
		// list.stream().toArray(e-> new Integer[e]);
		
		for ( int i =0 ; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
