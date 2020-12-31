package lecture22;

public class Email implements Comparable<Email> {
	private int left;
	private int right;

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public Email(int left, int right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public int compareTo(Email o) {
		if(this.left > o.left)
			return 1;
		else if(this.left == o.left)
			return 0;
		
		return -1;
	}

	@Override
	public String toString() {
		return left + "->" + right;
	}


}
