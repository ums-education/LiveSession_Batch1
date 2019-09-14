package session18;

public class Manager extends Employee {
	private int bonus;

//	public Manager() {
//		super("Manager", "N/A");
//	}

	public Manager(String firstName, String lastName) {
		super(firstName, lastName);
	}

	// TODO
	// HOMEWORK -> using String methods,
	// concatenate the super.toString() in such a way as
	// to avoid printing '}'
	public String toString() {
		return super.toString() + ",bonus:" + bonus + "}";
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
