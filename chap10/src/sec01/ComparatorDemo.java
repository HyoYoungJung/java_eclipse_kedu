package sec01;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		String[] strings = { "1", "123", "1234" };
//		String[] strings = { "로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다." };

		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length() - o2.length(); // 나-비교대상 => 오름차순
//				return o1.length() - o2.length(); // 빼는 순서 바꾸면 오름-내림차순도 바뀜.
			}
		});

		for (String s : strings)
			System.out.println(s);
	}
}