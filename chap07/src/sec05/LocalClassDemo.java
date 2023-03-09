package sec05;

public class LocalClassDemo {
	private String s1 = "외부";

	void method() { // =>지역클래스라고 함.
		int x = 1; // 지역변수 (이 메서드 내에서만 유효)
		class LocalClass { // 지역클래스
			String s2 = "내부";
			String s3 = s1;

			public void show() { // => 지역 클래스 안에 있는 메서드임
				System.out.println("지역 클래스" + x);
//				 x = 2; //  final로 번역이 된다.(=컴파일러가 x에 final을 붙인다)
			}
		}
//		x = 2;

		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}

	public static void main(String[] args) {
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();
	}
}
