package midterm_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class Practice4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		HashSet<Occurrence> set = new HashSet<Occurrence>();
		
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			if(line.startsWith("#"))
				continue;
			
			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			
			if(!set.contains(left)) {
				set.add(new Occurrence(left,1));
			}
			else {
				for(Occurrence occ:set) {
					if(occ.getId()==left) {
						occ.setOccurrence(occ.getOccurrence()+1);
					}
				}
			}
			
			int right = Integer.parseInt(arr[1]);
			
			if(!set.contains(right)) {
				set.add(new Occurrence(right,1));
	
			}
			else {
				for (Occurrence occ : set) {
					if(occ.getId()==right) {
						occ.setOccurrence(occ.getOccurrence()+1);
					}
				}
				
			}
		
			
		}
		//매우 비효율

	}

}
