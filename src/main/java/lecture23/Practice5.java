package lecture23;

import java.util.*;
import java.util.stream.*;

public class Practice5 {

	public static void main(String[] args) {
		ArrayList<Email> list = new ArrayList<Email>();
		list.add(new Email(1, 2));
		list.add(new Email(1, 4));
		list.add(new Email(1, 7));
		list.add(new Email(2, 4));
		list.add(new Email(2, 7));
		list.add(new Email(3, 7));
		list.add(new Email(4, 5));

		Email minLeft = list.stream().collect(Collectors.reducing((Email e1, Email e2)-> {
			if(e1.getLeft() < e2.getLeft())
				return e1;
			else
				return e2;
		})).get();
		System.out.println(minLeft);
		
		int minLeft2 = list.stream().collect(Collectors.reducing((e1, e2) -> {
			if (e1.getLeft() < e2.getLeft())
				return e1;
			else
				return e2;
		})).get().getLeft();

		System.out.println(minLeft2);


	}

}
