package sec01;

public class IfTest01 {

	public static void main(String[] args) {
		int num = 120;
		if (num > 0) {
			if ((num % 2) == 0)
				System.out.println("양수이면서 짝수");
		}
		// 한문장으로 바꾸어보기
		if ((num > 0) && (num % 2 == 0)) {
			System.out.println("양수이면서 짝수~");
		}
	}
}