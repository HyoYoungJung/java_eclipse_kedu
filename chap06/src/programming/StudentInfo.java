package programming;

public class StudentInfo {

	public static void main(String[] args) {

		Person[] infos = new Person[3];

		int cnt = 0;

		infos[cnt++] = new Person("길동이", 22);
		infos[cnt++] = new Student("황진이", 23, 100);
		infos[cnt++] = new ForeignStudent("Amy", 30, 200, "U.S.A");

		for (Person i : infos)
			i.show();
	}
}
