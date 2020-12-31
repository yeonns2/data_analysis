package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

public class Assignment1App {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		// 메모리 (String ArrayList 데이터를 모두 적재하고 재이용하기)
		// 모두 적재하기 
		List<String> data = new MyArrayList<String>();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			
			data.add(line);
		}
		System.out.println("적재완료");
		
	
		// ListIterator 
		int maxLeft = Integer.MIN_VALUE; 

		ListIterator<String> iterator = data.listIterator();
		while (iterator.hasNext()) {
			String line = iterator.next();
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			if (maxLeft < left)
				maxLeft = left;
		}

		br.close();
		System.out.println("왼쪽 ID 최대값 : " + maxLeft);

		int maxRight = Integer.MIN_VALUE;

		iterator = data.listIterator();
		while (iterator.hasNext()) {
			String line = iterator.next();
			String[] arr = line.split("\t");
			int right = Integer.parseInt(arr[1]);
			if (maxRight < right)
				maxRight = right;
		}

		System.out.println("오른쪽 ID 최대값 : "+ maxRight);

	}

}
