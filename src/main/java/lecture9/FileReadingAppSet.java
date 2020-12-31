package lecture9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class FileReadingAppSet {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));

		// 왼쪽 아이디 중복 없이 유지한다.
		// 모두 적재하기
		HashSet<Integer> leftSet = new HashSet<Integer>();
		HashSet<Integer> rightSet = new HashSet<Integer>();

		int cnt = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			leftSet.add(left);
			int right = Integer.parseInt(arr[1]);
			rightSet.add(right);

		}
		System.out.println("적재끝");

		System.out.println("왼쪽 ID 갯수 : " + leftSet.size());
		System.out.println("오른쪽 ID 갯수 : " + rightSet.size());
		leftSet.removeAll(rightSet);
		System.out.println("LEFT - RIGHT: " + leftSet.size());
		rightSet.removeAll(leftSet);
		System.out.println("RIGHT - LEFT: " +rightSet.size());
		leftSet.addAll(rightSet);
		System.out.println("LEFT 교집합 RIGHT: "+leftSet.size());
		leftSet.retainAll(rightSet);
		System.out.println("LEFT 교집합 RIGHT: "+leftSet.size());
		
		
	}


}
