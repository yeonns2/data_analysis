package lecture21;

import java.io.*;
import java.util.*;

public class Practice15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\data.txt"));

		// 메모리 (String ArrayList 데이터를 모두 적재하고 재이용하기)
		// 모두 적재하기
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			list.add(line);
		}
		// 0	1
		HashMap<Integer, Integer> occ = list.stream()
				.filter(e -> !e.startsWith("#"))
				.flatMap(e -> {
			return Arrays.stream(e.split("\t"));
		}).map(e -> Integer.parseInt(e))
				.collect(
						() -> {
							return new HashMap<Integer, Integer>();
						}, 
						(HashMap<Integer, Integer> base, Integer delta) -> {
							if (base.containsKey(delta)) {
								base.put(delta, base.get(delta) + 1);
							} else {
								base.put(delta, 1);
							}
						}, 
						// <1, 3> <2, 5> < 3, 4> partial1
						// <2, 3> <4, 7>		partial2
						// <1,3><2,8>,<3,4><4,7> partial1
						(HashMap<Integer, Integer> partial1, HashMap<Integer, Integer> partial2) -> {
							partial2.forEach((key, value) -> {
								partial1.merge(key, value, (v1, v2) -> v1 + v2);
							});
		});
		
		occ.entrySet().forEach(System.out::println);

	}

}
