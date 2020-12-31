package lecture18;

import java.util.*;

public class Practicex2 {

	public static void main(String[] args) {
		// ArrayList 0에서 99 까지 넣는다.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<100;i++) {
			list.add(i);
		}

		// 2의 배수만 출력해보세요.
		list.stream().forEach(e->{
			if(e%2 ==0)
				System.out.println(e);
		});
		
		// 각각의 요소들을 1씩 증가시키고 홀수만 출력하기 
		list.stream().map(e->e+1).forEach(e->{
			if (e % 2 != 0)
				System.out.println(e);
		});
	
	}

}
