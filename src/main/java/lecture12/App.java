package lecture12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws IOException {
		
		// Source Destination Time
				BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data2.txt"));

				ArrayList<Message> data = new ArrayList<Message>();
				while (true) {
					String line = br.readLine();
					if (line == null)
						break;
					if (line.startsWith("#"))
						continue;

					String[] arr = line.split("\\s");
					data.add(new Message(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Long.parseLong(arr[2])));
				}
				System.out.println("적재끝: " + data.size());
				data.trimToSize();
				br.close();
				
				for(Message m : data) {
					System.out.println(m);
				}


	}

}
