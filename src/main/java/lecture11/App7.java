package lecture11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App7 {
	
	public static void main(String[] args) throws IOException {

	BufferedReader r = new BufferedReader(new FileReader("/Users/AhnJeongYeon/Documents/eclipse_project/prj1/data/data2.txt"));
	
	
	while (true) {
		String line = r.readLine();
		if(line == null)
			break;
		if (line.startsWith("#"))
			continue;
		String[] arr = line.split("\\s");
		int left = Integer.parseInt(arr[0]); // 왼쪽은 이메일을 보낸 사람의 ID
		int right = Integer.parseInt(arr[1]); // 오른쪽은 이메일을 받은 사람의 ID
		long time = Long.parseLong(arr[2]);
		
		
		
		System.out.println(left + " -> " + right+ " at "+ time);
		
		}
	}
}
