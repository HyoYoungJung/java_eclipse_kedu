package programming;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void show() { // public return으로 쓰는게 더 좋음(?)
		System.out.printf("사람[이름 : %s, 나이 : %s]", name, String.valueOf(age));
		System.out.println();
	}
}
