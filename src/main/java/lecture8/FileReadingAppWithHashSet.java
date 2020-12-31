package lecture8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class FileReadingAppWithHashSet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Dev/DataAnalsis/data.txt"));
		
		// 메모리 (String ArrayList 데이터를 모두 적재하고 재이용하기)
		// 모두 적재하기
		HashSet<Integer> data = new HashSet<Integer>();

		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			data.add(left);
		}
			
		
		System.out.println("적재 끝");

		System.out.println(data.size());
	}

}
