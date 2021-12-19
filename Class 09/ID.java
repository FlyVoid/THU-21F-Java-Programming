// Example for PPT Page No.28

public class ID {
	private int id;
	
	public ID(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String toString() {
		return String.format("%d",this.id);
	}
}