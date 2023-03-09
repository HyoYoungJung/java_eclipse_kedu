package programming01;

import java.util.Arrays;

public class Pro1_2_2 {
	public static void main(String[] args) {
		String[] strings = { "K", "o", "r", "e", "a", "n" }; // 배열생성

		// 정렬전
		System.out.print("정렬 전 : ");
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}

		System.out.println();

		Pro1_2_1 s;
//		s = n -> Arrays.sort(n, String.CASE_INSENSITIVE_ORDER); // 람다식
		s = Arrays::sort;
		s.sort(strings, String.CASE_INSENSITIVE_ORDER); // 메서드 참조 정렬
		// CASE_INSENSITIVE_ORDER는 대소문자 구분없이 출력

		System.out.print("정렬 후 : ");
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
	}
}