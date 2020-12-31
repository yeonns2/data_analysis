package lecture13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Motivation13 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));

		HashMap<Integer, HashSet<Integer>> data = new HashMap<Integer, HashSet<Integer>>();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;
			
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			
			if(data.containsKey(left)) {
				HashSet<Integer> s = data.get(left);
				s.add(right);
				data.put(left, s);
			}else {
				HashSet<Integer> n = new HashSet<Integer>();
				n.add(right);
				
				data.put(left, n);
			}
		}
		System.out.println("적재끝");
		

		long pre = System.currentTimeMillis();
		Iterator<Integer> ki = data.keySet().iterator();
		while(ki.hasNext()) {
			Integer k = ki.next();
			HashSet<Integer> v = data.get(k);
			for(Integer ve: v) {
				HashSet<Integer> vv = data.get(ve);
				if(vv != null) {
					for(Integer vve: vv) {
						HashSet<Integer> vvv = data.get(vve);
						System.out.println(k + "->3" + vvv);
					}
				}
			}
		}
		System.out.println("ET: " + (System.currentTimeMillis()-pre));

	}


}
