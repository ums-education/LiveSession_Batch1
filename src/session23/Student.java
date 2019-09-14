package session23;

// pojos - Plain Old Java Objact
// aka beans, aka modal, aka model, aka module

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String major;
	private String className;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String major, String className) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.className = className;
	}
	
	@Override
	// since we are implementing an interface
	// we have to implement all of its abstract methods
	// in case of Comparable interface, we have only 'int compareTo(T t);'
	public int compareTo(Student student) {
		if (this.id == student.id) {
			return 0;
		} else if (this.id < student.id) {
			return -1;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return "Student {id=" + id + ", name=" + name + ", major=" + major + ", className=" + className + "}";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
