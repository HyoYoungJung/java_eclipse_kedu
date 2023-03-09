package programming;

public class Student extends Person {
	private int studentNum;

	public Student(String name, int age, int studentNum) {
		super(name, age);
		this.studentNum = studentNum;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void show() {
		System.out.printf("학생[이름 : %s, 나이 : %s, 학번 : %s]", getName(), String.valueOf(getAge()),
				String.valueOf(studentNum));
		System.out.println();
	}
}
