package lecture20;

import java.util.*;
import java.util.stream.*;

public class Practice8_2 {

	public static void main(String[] args) {
		ArrayList<Email> emails = new ArrayList<Email>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			emails.add(new Email(r.nextInt(1000), r.nextInt(1000)));
		}

		//이메일 클래스에 comparable 인터페이스가 없어도 실행됨.
		List<Email> list = emails.stream().sorted((e1, e2) -> {
			if(e1.getLeft() > e2.getLeft())
				return 1;
			else if(e1.getLeft() == e2.getLeft())
				return 0;
			else
				return -1;
		}).collect(Collectors.toList());
		System.out.println(list);

	}

}
