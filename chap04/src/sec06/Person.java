package sec06;

public class Person {
	String name;
	int age;

	Person setName(String name) {
		this.name = name;
		return this;
	}

	Person setAge(int age) {
		this.age = age;
		return this;
	}

	void sayHello() {
		System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야.");
	}
}
