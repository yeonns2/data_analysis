package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingApp2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long pre = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		// 메모리 (String 배열에 데이터를 모두 적재하고 재이용하기)
		// 모두 적재하기 
		String[] dataArray = new String[0];
		int idx = 0;
		while(true) {
			String line = br.readLine();
			if (line == null) 
				break;
			if (line.startsWith("#"))
				continue;
			String[] newArr = new String[dataArray.length+1];
			for (int i=0; i<dataArray.length; i++) {
				newArr[i]=dataArray[i];
				
			}
			newArr[newArr.length-1] = line;
			dataArray = newArr; 
			dataArray[idx]=line;
			idx++;
			System.out.println(idx);
		}

		int maxLeft = Integer.MIN_VALUE;
		for (int i =0; i< idx; i++) {
			 String[] arr = dataArray[i].split("\t");
			 int left = Integer.parseInt(arr[0]);
			 if (maxLeft < left)
				 maxLeft = left; 
		}
				
		br.close();
		System.out.println("Elapsed Time: " + (System.currentTimeMillis()-pre));

	}

}
