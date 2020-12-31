package lecture10;

public class Occurrence {
	// id 가 몇번 등장했는지 추상화 해놓은 클래스 
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

		return this.id == ((Occurrence) obj).getId();
	}
	@Override
	public String toString() {
		return id + " -> " + occurrence;
	}


}
