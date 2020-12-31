package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NavigableSet;

public class Assignment3App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		// left, right ID를 TreeSet에 모두 적재하기
		//NavigableSet<Integer> data = new TreeSet<Integer>();
		// MyTreeSet을 완성하여 TreeSet과 같은 결과값이 나오도록 하시오.
		NavigableSet<Integer> data = new MyTreeSet<Integer>();
		
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			data.add(left);
			data.add(right);
		}
		System.out.println("적재끝");
		

		// 난이도를 낮추기 위해 이 부분은 주석처리 개인적으로 해보세요.
		// Iterator<Integer> i = data.descendingIterator();
		// while(i.hasNext()) {
		// 	System.out.println(i.next());
		// }
		
		System.out.println("가장 작은 값: " + data.first());
		System.out.println("가장 큰 값: " + data.last());
		
		System.out.println("3535가 있는가?: " + data.contains(3535));
		
		br.close();
	}

}
