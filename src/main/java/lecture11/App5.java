package lecture11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class App5 {

	public static void main(String[] args) throws IOException {
		// 각 사람에게 이메일을 보낸 사람들을 구하시오.
		BufferedReader r = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		HashMap<Integer,HashSet<Integer>> sSet = new HashMap<Integer,HashSet<Integer>>();
		
		while (true) {
			String line = r.readLine();
			if(line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]); // 왼쪽은 이메일을 보낸 사람의 ID
			int right = Integer.parseInt(arr[1]); // 오른쪽은 이메일을 받은 사람의 ID
			
			// right가 만약에 sSet에 없다. -> right, HashSet 에 left를 넣어서 value로 넣는다. 
			if (!sSet.containsKey(right)) { 
				HashSet<Integer> s = new HashSet<Integer>();
				s.add(left);
				sSet.put(right,s);
			}
			//  right가 이미 있어요. -> 기존에 HashSet을 가져와서 left로 추가하여 value로 넣는다. 
			else {
				HashSet<Integer> existing = sSet.get(right);
				existing.add(left);
				sSet.put(right,existing);
			}
			
			//System.out.println(left + " -> " + right);
			
		}
		
		
		// 순회 
		Set<Entry<Integer,HashSet<Integer>>> entrySet = sSet.entrySet();
		Iterator<Entry<Integer,HashSet<Integer>>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<Integer,HashSet<Integer>> entry = entryIterator.next();
			System.out.println(entry.getKey()+" <- "+entry.getValue());
		}
		
		
		r.close();
		


	}

}
