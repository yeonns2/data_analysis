package midterm_practice;

import java.util.HashSet;

public class Practice3 {

	public static void main(String[] args) {
	
		HashSet<Email> set = new HashSet<Email>();
		
		set.add(new Email(0,1));
		set.add(new Email(0,3));
		set.add(new Email(1,4));
		set.add(new Email(0,1));
		
		System.out.println(set);
		
		System.out.println(set.contains(new Email(0,3)));
		

	}

}
