package lecture12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message implements Comparable{

	private int from;
	private int to;
	private long t;

	public Message(int from, int to, long t) {
		super();
		this.from = from;
		this.to = to;
		this.t = t;
	}

	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'T' hh:mm:ss");
		Date date =  new Date(t*1000);
		return from + " -> " + to + " at " + sdf.format(date);
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public long getT() {
		return t;
	}

	public void setT(long t) {
		this.t = t;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
