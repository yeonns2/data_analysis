package midterm_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Practice2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		HashSet<Integer> leftSet = new HashSet<Integer>();
		HashSet<Integer> rightSet = new HashSet<Integer>();
		while(true) {
			String line = br.readLine();
			if(line == null )
				break;
			if(line.startsWith("#"))
				continue;
			
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			leftSet.add(left);
			rightSet.add(right);			
		}
		
		leftSet.removeAll(rightSet);
		System.out.println(leftSet.size());
		
		
	}

}
