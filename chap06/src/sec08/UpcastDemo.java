package sec08;

public class UpcastDemo {

	public static void main(String[] args) {
		Person p;
		Student s = new Student();

		p = s; // Student 타입의 참조변수 s를 p에 전달하라는 뜻. 자동 형변환이 되었음.

		// p.number = 1; //p의 시각으로 보면 number는 없는 것이므로 오류발생
		// p.work();
		p.whoami();
	}

}
