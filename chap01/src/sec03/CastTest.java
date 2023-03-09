package sec03;

public class CastTest {

	public static void main(String[] args) {
		// 자동 형 변환

		double d1 = 5 * 3.14; // 5 -> 5.0 더블로 바뀜.
		double d2 = 1; // 1 -> 1.0 더블로 바뀜.

		int num1 = 50;
		long num2 = 3147483647L;
		System.out.println(num1 + num2); // num1 50이 -> 롱 50L로 자동 형변환됨

		System.out.println(59L + 34.5); // 59L -> 59.0으로 자동 형변환

		// 명시적 형 변환

		// float f1 = 3.14; // 에러 이유 : 실수 3.14는 double을 사용해야 함.
		// ↓ 수정할 수 있는 방법들
		// float f1 = 3.14f; // 뒤에 f 안붙일 시 에러가 나타남.
		// 또는 double f1 = 3.14;
		// 또는 float f1 = (float) 3.14;

		// byte b1 = 300; // 300이 byte의 표현 범위(-128~127을 넘음)
		// ↓ 오류 수정
		byte b1 = (byte) 300; // 또는 int b1 = 300;
		System.out.println(b1); // 출력

		// byte x1 = 3.14; // 에러 이유 : 실수 3.14는 double을 사용해야 함.
		// ↓ 오류 수정
		// double x1 = 3.14; // byte를 double로 변경
		double d = 3.14f;

		double pi = 3.1415;
		// int wholeNumber = pi; // pi값이 실수 이므로 double 아닌 int로 대입할 수 없음.
		// ↓ 오류 수정
		int wholeNumber = (int) pi; // pi를 int로 명시적 형변환
		System.out.println(wholeNumber); // 출력

		long num11 = 3000000007L;
		// int num22 = num11; // int 보다 큰 long 값을 int로 대입할 수 없음.
		// ↓ 오류 수정 (int로 형변환 또는 int를 long으로 바꿔야 함)
		int num22 = (int) num11;
		System.out.println(num22); // 출력

		short num31 = 1;
		short num32 = 2;
		// short num33 = num31 + num32;
		// ↓ 오류 수정
		short num33 = (short) (num31 + num32); // int+int 먼저 한 값을 short로 바꿈.
		System.out.println(num33);
	}

}
