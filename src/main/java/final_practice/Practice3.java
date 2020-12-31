package final_practice;

import java.util.*;

public class Practice3 {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
	    System.out.println("[peek()를 마지막에 호출한 경우]");
	    int sum = Arrays.stream(intArr)
	        .filter(a -> a % 2 == 0)
	        .peek(System.out::println)
	        .sum(); //동작하지 않는다.
	    
	    System.out.println(sum);


	}

}
