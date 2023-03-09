package programming07;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class PersonTest {
	public static void main(String[] args) {
// ④ PersonTest 클래스의 메인메서드 작성

		double avgHeight = average(Person.persons, c -> c.getHeight());
		double avgWeight = average(Person.persons, c -> c.getWeight());

		System.out.println("평균 신장 : " + avgHeight);
		System.out.println("평균 체중 : " + avgWeight);
	}

// ③ 신장, 체중에 대해 평균을 반환하는 정적 메서드 average() 작성
// average()의 매개변수를 Function 유형의 타입으로 사용

	static double average(ArrayList<Person> persons, ToIntFunction<Person> p) {
		double sum = 0.0;

		for (Person person : persons)
			sum += p.applyAsInt(person);

		return sum / persons.size();
	}
}
