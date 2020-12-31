package lecture18;

import java.util.*;
import java.util.stream.*;

public class Practice4 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		for(int i =0;i<100;i++) {
			numbers.add(i);
		}

		Stream x;
		
		numbers.stream().map(e->{
			return (char)((int) e);
		}).forEach(e->{
			System.out.println(e);
		});
	}

}
  