package lecture9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingAppOccurence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));

		// 0이 등장한 횟수를 유지하고 있는 변수 cnt0
		int cnt0 = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			if (left == 0)
				cnt0++;
			int right = Integer.parseInt(arr[1]);
			if (right ==0 )
				cnt0++;
		}
		System.out.println("적재끝");
		System.out.println(cnt0);

	}

}
