package sec04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "귤", "망고", "수박", "샤인머스켓" };
		List<String> list = Arrays.asList(fruits);

		Collections.sort(list, Collections.reverseOrder()); // 역순으로 정렬된 list 출력
		System.out.println(list);

		Collections.reverse(list); // 다시 역순으로
		System.out.println(list);
	}
}