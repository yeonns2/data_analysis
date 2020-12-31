package lecture11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class App6 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));

		// 각 사람에게 이메일을 받은 사람들을 구하시오
		HashMap<Integer, HashSet<Integer>> rSet = new HashMap<Integer, HashSet<Integer>>();
		while (true) {
			String line = r.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] arr = line.split("\\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);

			// left 가 만약에 rSet에 없다. left, HashSet에 right 넣어서 value로 넣는다.
			if (!rSet.containsKey(left)) {
				HashSet<Integer> s = new HashSet<Integer>();
				s.add(right);
				rSet.put(left, s);
			} else {
				// left 가 이미 있어요. -> 기존에 hashset을 가져와서 right을 추가하여 value로 넣는다.
				HashSet<Integer> existing = rSet.get(left);
				existing.add(right);
				rSet.put(left, existing);
			}
		}

		// 각 사람에게 이메일을 받은 사람들에게 이메일을 받은 사람들을 구하라. 
		HashMap<Integer, HashSet<Integer>> rrSet = new HashMap();
		// 순회
		Set<Entry<Integer, HashSet<Integer>>> entrySet = rSet.entrySet();
		Iterator<Entry<Integer, HashSet<Integer>>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Entry<Integer, HashSet<Integer>> entry = entryIterator.next();

			HashSet<Integer> val = entry.getValue();
			
			for (Integer i : val) {
				// key -> 집합중 각각 i에 대해서 
				// 받은 사람들을 rSetI 
				HashSet<Integer> rSetI = null;
				if( rSet.get(i) != null )
					rSetI = (HashSet)rSet.get(i).clone();
				else
					rSetI = new HashSet<Integer>();
				if (!rrSet.containsKey(entry.getKey())) {
					rrSet.put(entry.getKey(), rSetI);
				} else {
					HashSet<Integer> ex = rrSet.get(entry.getKey());
					ex.addAll(rSetI);
					rrSet.put(entry.getKey(), ex);
				}
			}
		}
		
		Iterator<Entry<Integer, HashSet<Integer>>> rrEntrySet = rrSet.entrySet().iterator();
		while(rrEntrySet.hasNext()) {
			System.out.println(rrEntrySet.next());
		}

		r.close();

	}

		

}
