package lecture22;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Practice19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:\\data.txt"));

		// 메모리 (String ArrayList 데이터를 모두 적재하고 재이용하기)
		// 모두 적재하기
		ArrayList<Email> list = new ArrayList<Email>();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			
			list.add(new Email(left, right));
		}

		Map<Integer, List<Email>> map = list.stream().collect(Collectors.groupingBy(e -> e.getLeft()));
		
		map.entrySet().forEach(System.out::println);


	}

}
