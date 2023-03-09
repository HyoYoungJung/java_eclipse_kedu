package programming;

public class ForeignStudent extends Student {
	private String nation;

	public ForeignStudent(String name, int age, int studentNum, String nation) {
		super(name, age, studentNum);
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}

	public void show() {
		System.out.printf("외국학생[이름 : %s, 나이 : %s, 학번 : %s, 국적 : %s]", getName(), String.valueOf(getAge()),
				String.valueOf(getStudentNum()), nation);
	}
}
