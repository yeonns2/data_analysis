package lecture19;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Practice17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));
		ArrayList<String> data = new ArrayList<String>();
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			data.add(line);
		} 
		
		List<Integer> list = data.stream().filter(e -> !e.startsWith("#"))
			.map(e->{
				String[] arr = e.split("\t");
				return new Email(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
			}).flatMap((Email e)->{
				int s = e.getLeft();
				int d = e. getRight();
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(s);
				a.add(d);
				return a.stream();
			}).sorted().limit(10).collect(Collectors.toList());
		
		System.out.println(list);
	}
}
