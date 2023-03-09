package sec03;

import java.util.Calendar;
import java.util.Date; // *주의* sql.Date; 가 아님! 

public class CalendarDemo {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		Calendar c = Calendar.getInstance(); // 현시각 캘린더 객체 접근
		System.out.println(c);
		System.out.println();

		// ↓ 접근한 캘린터 인스턴스에서 상수들을 꺼내오는 방식으로 출력!
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);

		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 한달 중 몇일?
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 한주 중 몇일째?
		System.out.println(c.get(Calendar.WEEK_OF_YEAR)); // 일년 중 몇주차?
		System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // 한달 중 몇주차?

		System.out.println(c.get(Calendar.HOUR)); // 12시간 기준 현재 시간
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 24시간 기준 현재 시간
		System.out.println(c.get(Calendar.MINUTE)); // 현재 몇분?
	}
}
