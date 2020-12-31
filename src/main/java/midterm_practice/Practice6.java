package midterm_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Practice6 {

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
				map.put(left, set);
			}
			
		}
		
		Iterator<Entry<Integer,HashSet<Integer>>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Integer,HashSet<Integer>> entry = iter.next();
			System.out.println(entry.getKey()+"->"+entry.getValue());
			
		}
	}

}
