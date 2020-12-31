package lecture23;

import java.util.*;
import java.util.stream.*;

public class Practice8 {

	public static void main(String[] args) {
		ArrayList<Email> list = new ArrayList<Email>();
		list.add(new Email(1, 2));
		list.add(new Email(1, 4));
		list.add(new Email(1, 7));
		list.add(new Email(2, 4));
		list.add(new Email(2, 7));
		list.add(new Email(3, 7));
		list.add(new Email(4, 5));

		int maxLeft = list.stream().collect(Collectors.reducing(0,  e -> e.getLeft(), (e1,e2)->{
			if( e1 > e2)
				return e1;
			else
				return e2;
		}));

		System.out.println(maxLeft);
		
	

	}

}
