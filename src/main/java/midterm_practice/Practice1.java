package midterm_practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		
		ArrayList<Email> list = new ArrayList<Email>();
		
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			if(line.startsWith("#"))
				continue;
			
			
			String[] arr = line.split("\t");
			
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);
			
			list.add(new Email(left,right)); 
			
		}
		list.remove(1);
		
		System.out.println(list);
		
	
	}

}
