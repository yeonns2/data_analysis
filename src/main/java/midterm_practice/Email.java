package midterm_practice;

public class Email{

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
	public String toString() {
		return "("+left +","+right+")";
	}
	@Override
	public int hashCode() {
		return left+right;
	}
	@Override
	public boolean equals(Object o) {
		if (this.left == ((Email) o).left && this.right == ((Email) o).right)
			return true;
		return false;
	}
	
	
}
