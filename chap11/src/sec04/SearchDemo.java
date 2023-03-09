package sec04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
	public static void main(String[] args) {

		String[] s = { "황금을", "돌", "같이", "보라" };
		List<String> list = Arrays.asList(s);

		Collections.sort(list); // 정렬
		System.out.println(list);
		int i = Collections.binarySearch(list, "돌"); // '돌' 문자열인 인덱스번호 찾음
		System.out.println(i);
	}
}
