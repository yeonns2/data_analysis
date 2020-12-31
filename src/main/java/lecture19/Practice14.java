package lecture19;

import java.util.*;
import java.util.stream.*;

public class Practice14 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i< 1000;i++) {
			numbers.add(i);
		}
		//skip 900		
		//toList
		
		List<Integer> list = numbers.stream().skip(900).collect(Collectors.toList());
		System.out.println(list);

	}

}
