package lecture8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadingAppWihtoutRedun {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		// 메모리 (String ArrayList 데이터를 모두 적재하고 재이용하기) + 중복없이  
		//모두 적재하기
		ArrayList<Integer> data = new ArrayList<Integer>();
		int cnt = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			
			//왼쪽 아이디가 arraylist 있는지 확인하고 
			//방법1
			boolean isExist = false;
			for(Integer val : data ) {
				if (left == val) {
					isExist = true;
					break;
				}
			}
		
			//방법2
			if (!data.contains(left)) {
					data.add(left);
				}
				
				//System.out.println(++cnt);
			
		}
		System.out.println("적재 끝");

		System.out.println(data.size());
	}
 
}
