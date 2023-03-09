package sec02;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울");

		System.out.println(list.indexOf("소나타"));
		System.out.println(list.contains("싼타페"));

		List<String> cars1 = new LinkedList<>(list); // Array를 Linked로 바꿔도 출력값이 똑같다. 둘의 사용법이 같기 때문.
		cars1.add("싼타페");
		List<String> cars2 = new LinkedList<>(list); // 수정 삭제가 빈번한 경우엔 Linked 사용이 적합
		cars2.remove("제네시스");
		System.out.println(cars1.containsAll(cars2));

		cars1.removeIf(c -> c.startsWith("소"));
		cars1.replaceAll(s -> "뉴" + s);
		cars1.forEach(s -> System.out.print(s + " "));
		System.out.println();

		cars1.clear();
		System.out.println(cars1.isEmpty());
	}
}