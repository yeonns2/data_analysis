package lecture18;

import java.util.*;

public class Practice6 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<100;i++) {
			list.add(i+1);
		}
		// 1~100 의 수를 갖는 리스트에서 map을 통해 각각의 요소에 랜덤수를 더하고 
		// 100보다 크면 지우고 모두 출력한다.
		
		Random r = new Random();
		
		list.parallelStream().map(e->{
			return e + r.nextInt(101);
		}).filter(e-> e<= 100).forEach(e->{
			System.out.println(e);
			}
		);
		
		System.out.println(list.stream().findFirst().get());

	}

}
