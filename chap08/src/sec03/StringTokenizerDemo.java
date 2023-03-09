package sec03;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";

		StringTokenizer st = new StringTokenizer(s, " ,"); // 공백과 콤마를 구분자로 파싱한 객체 생성

		System.out.println(st.countTokens()); // 토큰 수. 9개의 토큰으로 쪼개짐

		while (st.hasMoreTokens()) { // 남아있는 토큰이 있는지 여부 반환
			System.out.print("[" + st.nextToken() + "] "); // 다음 토큰을 꺼내온다
		}
	}
}

// 문자열과 구분자를 주면 나눠진 문자열의 갯수와 내용을 출력하는 메소드 작성

//	public void tokenizer(String string, String d) {
//		StringTokenizer st = new StringTokenizer(string, d);
//
//		System.out.println(st.countTokens());
//
//		while (st.hasMoreTokens()) {
//			System.out.println("[" + st.nextToken() + "] ");
//		}
//		System.out.println();
//
//	}
//
//}
