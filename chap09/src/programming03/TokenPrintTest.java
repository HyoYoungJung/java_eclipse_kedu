package programming03;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {
	public static void main(String[] args) {
		String s = "of the people, by the peopel, for the people";
		try {
			showTokens(s, ", "); // 비검사형 오류 발생 지점
		} catch (NoSuchElementException e) {
			System.out.println("끝");
		}
	}

	// while(true) {}을 사용하는 showTokens()메서드 추가
	public static void showTokens(String string, String s) {
		StringTokenizer st = new StringTokenizer(string, s);

		while (true) {
			System.out.println(st.nextToken());
		}
	}
}
