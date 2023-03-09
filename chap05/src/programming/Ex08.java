package programming;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		String s; // 변수선언
		String r; // 변수선언

		Scanner in = new Scanner(System.in);
		s = in.next(); // 요일입력받음
		r = s.toUpperCase(); // 모든 문자를 대문자로 바꿈

		System.out.print(Days.valueOf(r) + "은 ");
		printDays(r);

	}

	public static void printDays(String s) {
		switch (Days.valueOf(s).toString()) {
		case "월요일" -> System.out.println("싫다");
		case "금요일" -> System.out.println("좋다");
		case "토요일", "일요일" -> System.out.println("최고");
		default -> System.out.println("그저 그렇다");
		}
	}

	enum Days {
		MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일"), SUNDAY("일요일");

		private String s;

		Days(String s) { // 생성자
			this.s = s;
		}

		public String toString() { // 객체를 문자열로 반환(오버라이딩)
			return s;
		}
	}
}