package programming03;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
		String[] noonName = { "오전", "오후" };
		Calendar c = Calendar.getInstance(); // 현시각 캘린더 객체에 접근

		// 코드 추가
		c.set(2017, 06, 15, 3, 33, 40); // 캘린더 클래스의 set 메서드로 날짜와 시간 값을 변경

		int year = c.get(Calendar.YEAR); // 객체의 연도 값을 year에 대입
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);

		String week = weekName[4]; // 배열의 4번 인덱스 '목'을 week에 대입
		String noon = noonName[1];

		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		// 코드 추가 끝

		System.out.println(year + "년 " + month + "월 " + day + "일 ");
		System.out.println(week + "요일 " + noon);
		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
	}
}
