package lecture13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Motivation13p {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("/Users/jeongyeon/Documents/eclipse_workspace/data_analysis/data/data.txt"));

		// 메모리 (String ArrayList 데이터를 모두 적재하고 재이용하기)
		// 모두 적재하기
		final HashMap<Integer, HashSet<Integer>> data = new HashMap<Integer, HashSet<Integer>>();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] arr = line.split("\t");
			int left = Integer.parseInt(arr[0]);
			int right = Integer.parseInt(arr[1]);

			if (data.containsKey(left)) {
				HashSet<Integer> s = data.get(left);
				s.add(right);
				data.put(left, s);
			} else {
				HashSet<Integer> n = new HashSet<Integer>();
				n.add(right);
				data.put(left, n);
			}
		}
		System.out.println("적재끝");

		final long pre = System.currentTimeMillis();
		final Object[] ki = data.keySet().toArray();

		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < ki.length / 4; i++) {
					Integer k = (Integer) ki[i];
					HashSet<Integer> v = data.get(k);
					for (Integer ve : v) {
						HashSet<Integer> vv = data.get(ve);
						if (vv != null) {
							for (Integer vve : vv) {
								HashSet<Integer> vvv = data.get(vve);
							}
						}
					}
				}
				System.out.println("ET: " + (System.currentTimeMillis() - pre));
			}
		}).start();

		new Thread(new Runnable() {
			
			public void run() {
				for (int i = ki.length / 4; i < ki.length / 2; i++) {

					Integer k = (Integer) ki[i];
					HashSet<Integer> v = data.get(k);
					for (Integer ve : v) {
						HashSet<Integer> vv = data.get(ve);
						if (vv != null) {
							for (Integer vve : vv) {
								HashSet<Integer> vvv = data.get(vve);
							}
						}
					}
				}
				System.out.println("ET: " + (System.currentTimeMillis() - pre));
			}
		}).start();

		new Thread(new Runnable() {
			
			public void run() {
				for (int i = ki.length / 2; i < ki.length * 3 / 4; i++) {
					Integer k = (Integer) ki[i];
					HashSet<Integer> v = data.get(k);
					for (Integer ve : v) {
						HashSet<Integer> vv = data.get(ve);
						if (vv != null) {
							for (Integer vve : vv) {
								HashSet<Integer> vvv = data.get(vve);
							}
						}
					}
				}
				System.out.println("ET: " + (System.currentTimeMillis() - pre));
			}
		}).start();

		new Thread(new Runnable() {
			
			public void run() {
				for (int i = ki.length * 3 / 4; i < ki.length; i++) {
					Integer k = (Integer) ki[i];
					HashSet<Integer> v = data.get(k);
					for (Integer ve : v) {
						HashSet<Integer> vv = data.get(ve);
						if (vv != null) {
							for (Integer vve : vv) {
								HashSet<Integer> vvv = data.get(vve);
							}
						}
					}
				}
				System.out.println("ET: " + (System.currentTimeMillis() - pre));
			}
		}).start();
	}
	
}

