package programming01;

import java.util.Arrays;

public class StringArray_HY {
	public static void main(String[] args) {
// 문자열 배열에 포함된 원소를 Arrays.sort() 메서드로 정렬하라.
// 정렬할 때 문자열의 대소문자를 구분하지 않는다.
// ①람다식 이용, ②메서드 참조 이용

		String[] word = { "K", "o", "r", "e", "a", "n" };

		System.out.print("정렬 전 : ");
		for (String s1 : word)
			System.out.print(s1 + " ");

		System.out.println();

		Arrays.sort(word, (o1, o2) -> {
			char a = o1.toString().toUpperCase().charAt(0);
			char b = o2.toString().toUpperCase().charAt(0);
			return a - b;
		});

		System.out.print("정렬 후 : ");
		for (String s2 : word)
			System.out.print(s2 + " ");
	}
}
