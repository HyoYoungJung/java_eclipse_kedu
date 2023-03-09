package programming02;

public class Student {

	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "학생[" + name + "]";
	}
}