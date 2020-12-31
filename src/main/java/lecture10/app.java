package lecture10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class app {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));

		HashSet<Occurrence> os = new HashSet<Occurrence>();

		int cnt = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			if(!os.contains(left)) {
				os.add(new Occurrence(left, 1));
			}else {
				// 기존의 Occurrence을 가져온다.
				for(Occurrence occ: os) {
					if(occ.getId() == left) {
						// Occurrence의 Occurrence를 1 늘려준다. 
						occ.setOccurrence(occ.getOccurrence()+1);
					}
				}
			}

			int right = Integer.parseInt(arr[1]);
			if(!os.contains(right)) {
				os.add(new Occurrence(right, 1));
			}else {
				// 기존의 Occurrence을 가져온다.
				for(Occurrence occ: os) {
					if(occ.getId() == right) {
						// Occurrence의 Occurrence를 1 늘려준다. 
						occ.setOccurrence(occ.getOccurrence()+1);
					}
				}
			}
			System.out.println(cnt++);
		}
		br.close();
		System.out.println("적재끝");

		
		System.out.println(os.size());
		
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
	}


}
