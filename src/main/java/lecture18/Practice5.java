package lecture18;

import java.util.*;

public class Practice5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<100;i++) {
			list.add(i);
		}
		// filter 에서 true 가 반환되면 남는다는 얘기
		
		list.stream().filter(e->e%2!=0).forEach(e->{
			System.out.println(e);
		});
		

	}

}
