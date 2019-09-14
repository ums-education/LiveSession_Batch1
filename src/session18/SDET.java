package session18;

public class SDET extends Employee {
//	private String firstName; => NOT NEEDED because SDET already has a 
	// firstName filed INHERITED from its parent EMPLOYEE class
	private String programmingLang;

	public SDET(String firstName, String lastName, String programmingLang) {
		super(firstName, lastName);
//		super();
		this.programmingLang = programmingLang;
//		super.setFirstName(firstName);
//		super.setLastName(lastName);
	}
	
	
	
	//TODO 
	// HOMEWORK -> using String methods,
		// concatenate the super.toString() in such a way as
		// to avoid printing '}' 
	public String toString() {
		return super.toString() + ",programmingLang:" + programmingLang + "}";
	}
	
	public String getProgrammingLang() {
		return programmingLang;
	}

	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}
}
