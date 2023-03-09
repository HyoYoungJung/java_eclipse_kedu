package programming08;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex08_01 {
	public static void main(String[] args) {
		String s = "Empty vessels make the most sound.";
		System.out.println("입력 : " + s);

		StringTokenizer st = new StringTokenizer(s, " "); // 공백을 구분자로 파싱한 StringTokenizer 객체 생성
		// 공백은 기본으로 들어가있어서? new StringTokenizer(s) 만 적어도 똑같이 실행됨!
		System.out.println("단어 개수 : " + st.countTokens()); // countTokens()은 남아있는 토큰 개수 반환

		System.out.print("정렬된 토큰 : ");

		// String 타입의 words 배열 선언 및 초기화 → 배열의 크기는 토큰의 개수(=6) 만큼
		String[] words = new String[st.countTokens()];

		// words 배열에 파싱한 토큰을 차례로 넣어줌
		for (int i = 0; i < words.length; i++) {
			words[i] = st.nextToken(); // nextToken()은 다음 토큰을 꺼내오는 메서드
		}

		Arrays.sort(words); // words 배열을 오름차순 정렬

		// 정렬된 words 배열에서 차례로 단어를 꺼내와 출력
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + ", ");
		}
	}
}