package midterm_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Practice7 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		HashMap<Integer,HashSet<Integer>> map = new HashMap<Integer,HashSet<Integer>>();
		
		
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			if(line.startsWith("#"))
				continue;
		
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			
			if(!map.containsKey(left)) {
				HashSet<Integer> set = new HashSet<Integer>();
				set.add(right);
				map.put(left, set);
			}
			else {
				HashSet<Integer> set = map.get(left);
				set.add(right);
				map.put(left,set);
			}
			
		}
		
		System.out.println(map.get(1000));
		System.out.println(map.get(3094));
		System.out.println(map.get(1001));
		
		
		HashSet<Integer> val = map.get(1000);
		HashSet<Integer> s_1000 = new HashSet<Integer>();
		for(Integer i: val) {
			HashSet<Integer> s = null;
			
			if(map.containsKey(i)) {
				s = map.get(i);
				s_1000.addAll(s);
			}
			
		}
		
		System.out.println(s_1000.containsAll(map.get(1001)));
		System.out.println(s_1000.containsAll(map.get(3094)));
		br.close();
		
	}
}
