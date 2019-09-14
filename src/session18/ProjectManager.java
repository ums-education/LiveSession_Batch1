package session18;

// final class means you CANNOT EXTEND IT any more
public final class ProjectManager extends Manager {
	/*
	 * inherited the following from Employee: 
	 * String firstName; 
	 * String lastName;
	 */
	/*
	 * inherited the following from Manager: 
	 * int bonus;
	 */
	private Project project;

	public ProjectManager(String firstName, String lastName, Project project) {
		super(firstName, lastName);
		this.project = project;
	}

	// TODO
	// HOMEWORK -> using String methods,
	// concatenate the super.toString() in such a way as
	// to avoid printing '}'
	public String toString() {
		return super.toString() + ",project:" + project + "}";
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
}
