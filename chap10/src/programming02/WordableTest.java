package programming02;

public class WordableTest {
	public static void main(String[] args) {
		Wordable[] m = {
				// 필요한 코드
				() -> System.out.println("가위"), () -> System.out.println("나비"), () -> System.out.println("다리"),
				() -> System.out.println("마차") };

		// 반복문
		for (int i = 0; i < m.length; i++) {
			m[i].word();
		}
	}
}
//호성님 코드