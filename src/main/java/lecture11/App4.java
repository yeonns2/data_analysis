package lecture11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class App4 {

	public static void main(String[] args) throws IOException {
		// 각 사람에게 이메일을 받은 사람들을 구하시오.
				BufferedReader r = new BufferedReader(new FileReader("/Users/AhnJeongYeon/Documents/eclipse_project/prj1/data/data.txt"));
				
				HashMap<Integer,HashSet<Integer>> rSet = new HashMap<Integer,HashSet<Integer>>();
				
				while (true) {
					String line = r.readLine();
					if(line == null)
						break;
					if (line.startsWith("#"))
						continue;
					String[] arr = line.split("\\t");
					int left = Integer.parseInt(arr[0]); // 왼쪽은 이메일을 보낸 사람의 ID
					int right = Integer.parseInt(arr[1]); // 오른쪽은 이메일을 받은 사람의 ID
					
					// left가 만약에 rSet에 없다. -> left, HashSet 에 right를 넣어서 value로 넣는다. 
					if (!rSet.containsKey(left)) {
						HashSet<Integer> s = new HashSet<Integer>();
						s.add(right);
						rSet.put(left,s);
					}
					//  left가 이미 있어요. -> 기존에 HashSet을 가져와서 right로 추가하여 value로 넣는다. 
					else {
						HashSet<Integer> existing = rSet.get(left);
						existing.add(right);
						rSet.put(left,existing);
					}
					
					//System.out.println(left + " -> " + right);
					
				}
				
				
				// 순회 
				Set<Entry<Integer,HashSet<Integer>>> entrySet = rSet.entrySet();
				Iterator<Entry<Integer,HashSet<Integer>>> entryIterator = entrySet.iterator();
				
				while(entryIterator.hasNext()) {
					Entry<Integer,HashSet<Integer>> entry = entryIterator.next();
					System.out.println(entry.getKey()+" -> "+entry.getValue());
				}
				
				
				r.close();
				

	}

}
