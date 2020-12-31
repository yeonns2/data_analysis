package lecture7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class FileReadingAppWithArrayList {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		// 메모리 (String ArrayList 데이터를 모두 적재하고 재이용하기)
		//모두 적재하기
		ArrayList<String> data = new ArrayList<String>();
		
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			
			data.add(line);
			
		}
		System.out.println("적재 끝");
		
		// ListIterator 패턴을 이용해서 최대, 최소값 구하기
		
		int maxLeft = Integer.MIN_VALUE;
		
		ListIterator<String> iterator = data.listIterator();
		while(iterator.hasNext()) {
			String val = iterator.next();
			String[] arr = val.split("\t");
			int left = Integer.parseInt(arr[0]);
			if (maxLeft < left)
				maxLeft = left;
		}

		br.close(); 
		System.out.println(maxLeft);
		 
		int maxRight = Integer.MIN_VALUE;
		
		iterator = data.listIterator();
		while(iterator.hasNext()) {
			String val = iterator.next();
			String[] arr = val.split("\t");
			int right = Integer.parseInt(arr[1]);
			if (maxRight < right)
				maxRight = right;
		}

		br.close(); 
		System.out.println(maxRight);
	}

}
