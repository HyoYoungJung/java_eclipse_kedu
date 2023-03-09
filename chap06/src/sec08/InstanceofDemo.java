package sec08;

public class InstanceofDemo {
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		Person p2 = new Student();
//		Student s2 = new Person(); // 아예 new Person(); 앞에 (Student)로 캐스트 해주지 않는 이상, Person에서 Student로 convert 할수없음.

		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
//		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);

		downcast(s);
	}

	static void downcast(Person p) {
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println("ok, 하향 타입 변환");
		}
	}

}
