package midterm_practice;

public class Occurrence {
	private int id;
	private int occurrence;
	public Occurrence(int id, int occurrence) {
		super();
		this.id = id;
		this.occurrence = occurrence;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOccurrence() {
		return occurrence;
	}
	public void setOccurrence(int occurrence) {
		this.occurrence = occurrence;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.id == ((Occurrence)obj).id )
			return true;
		return false;
	}
	

}
