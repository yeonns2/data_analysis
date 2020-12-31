package midterm_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Practice5 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			if(line.startsWith("#"))
				continue;
			
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			
			if(!map.containsKey(left))
				map.put(left,1);			
			else
				map.put(left, map.get(left)+1);
		
			if(!map.containsKey(right))
				map.put(right, 1);
			else
				map.put(right,map.get(right)+1);
			
			
		}
//		// map의 iteration 방법은 두가지
//		//1 : keyset
//		Set<Integer> set = map.keySet();
//		Iterator<Integer> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			Integer key = iterator.next();
//			System.out.println(key+"->"+map.get(key));
//		}
//		//2: entryset
//		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
//		Iterator<Entry<Integer,Integer>> entryIter = entrySet.iterator();
//		while(iterator.hasNext()) {
//			Entry<Integer,Integer> entry = entryIter.next();
//			System.out.print(entry.getKey()+"->"+entry.getValue());
//		}
		
		
		//최대 많이 나온 id 구하기
		Iterator<Entry<Integer,Integer>> iter = map.entrySet().iterator();
		Entry<Integer,Integer> maxEntry = null;
		while(iter.hasNext()) {
			Entry<Integer,Integer> entry = iter.next();
			if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue())>0) {
				maxEntry = entry;
			}
		}
		System.out.println(maxEntry.getKey());
		

	}

}
