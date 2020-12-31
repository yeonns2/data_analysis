package lecture20;

import java.util.*;
import java.util.stream.*;

public class Practice8_1 {

	public static void main(String[] args) {
		ArrayList<Email> emails = new ArrayList<Email>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			emails.add(new Email(r.nextInt(1000), r.nextInt(1000)));
		}

		// 이메일을 솔팅할려는 근거가 없으므로 이메일 클래스에 comparable 인터페이스 추가!
		List<Email> list = emails.stream().sorted().collect(Collectors.toList());
		System.out.println(list);

	}
}
