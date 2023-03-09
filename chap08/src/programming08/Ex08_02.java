package programming08;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex08_02 {

	public static void main(String[] args) {
		// 입력값 넣기
		String text = "Empty vessels make the most sound";
		// 입력값 출력
		System.out.println("입력 : " + text);
		// Tokenizer로 text에서 공백으로 나눔
		StringTokenizer num = new StringTokenizer(text, " ");
		// num.countTokens로 단어의 개수 확인
		System.out.println("단어 개수 : " + num.countTokens());
		// String[]배열을 만들어서 num.countTokens의 길이만큼 배열을 만듬
		String[] s = new String[num.countTokens()];
		// 배열 0부터 넣을값 0 변수 만들어줌
		int i = 0;
		// 토큰이 다 나올때까지 돌려서 배열에 삽입
		while (num.hasMoreTokens()) {
			s[i] = num.nextToken();
			i++;
		}
		// 정렬
		Arrays.sort(s);
		// s의 길이만큼 돌려서 출력

		for (int j = 0; j < s.length; j++)
			System.out.print(s[j] + ", ");

	}

}
//호성님 방법