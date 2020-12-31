package lecture11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class App3 {

	public static void main(String[] args) throws IOException {
		// 각각의 ID에 대한 등장 횟수 구하기
		BufferedReader r = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		HashMap<Integer,Integer> occ = new HashMap<Integer,Integer>();
		
		while (true) {
			String line = r.readLine();
			if(line == null)
				break;
			if (line.startsWith("#"))
				continue;
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]); // 왼쪽은 이메일을 보낸 사람의 ID
			
			// map에 아직 left가 없다면 -> left, 1
			if (!occ.containsKey(left)) {
				occ.put(left,1);
			}
			// map에 left가 있다면 -> left, x+1
			else {
				occ.put(left,occ.get(left)+1);
			}
	
			int right = Integer.parseInt(arr[1]); // 오른쪽은 이메일을 받은 사람의 ID
			
			// map에 아직 right가 없다면 -> right, 1
			if (!occ.containsKey(right)) {
				occ.put(right,1);
			}
			// map에 right가 있다면 -> right, x+1
			else {
				occ.put(right,occ.get(right)+1);
			}
			
			System.out.println(left + " -> " + right);
			
		}
		
		Iterator<Entry<Integer,Integer>> iter = occ.entrySet().iterator();
		Entry<Integer,Integer> maxEntry = null;
		
		while(iter.hasNext()) {
			Entry<Integer,Integer> entry = iter.next();
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
		            maxEntry = entry;
		        }
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		// 가장 등장을 많이 한 ID는??
		
		System.out.println(maxEntry.getKey());
		
		
		r.close();
		

	}

}
