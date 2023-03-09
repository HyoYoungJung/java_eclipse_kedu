package programming03;

import java.util.Calendar;

public class CalendarTest_02 {
	public static void main(String[] args) {
		String[] weekNames = { "일", "월", "화", "수", "목", "금", "토" };
		String[] noonNames = { "오전", "오후" };
		Calendar calendar = Calendar.getInstance();

		calendar.set(2017, 6 - 1, 15, 15, 33, 40);

		// 코드 추가
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);

		int weekNum = calendar.get(Calendar.DAY_OF_WEEK);
		int noonNum = calendar.get(Calendar.AM_PM);

		String week = weekNames[weekNum - 1];
		String noon = noonNames[noonNum];

		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(week + "요일 " + noon);
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}