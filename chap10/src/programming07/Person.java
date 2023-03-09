package programming07;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
	// ① 이름, 신장, 체중을 나타내는 필드
	String name;
	int height;
	int weight;

	// ① getter 메서드
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	// Person 생성자
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// ② 5명의 Person 객체를 포함하는 ArrayList<Person> 타입 persons
	static ArrayList<Person> persons = new ArrayList<>(
			Arrays.asList(new Person("황진이", 160, 45), new Person("이순신", 180, 80), new Person("김삿갓", 175, 65),
					new Person("홍길동", 170, 68), new Person("배장화", 155, 48)));
}