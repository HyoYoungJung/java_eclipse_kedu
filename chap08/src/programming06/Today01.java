package programming06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Today01 {
	public static void main(String[] args) {
		Date now = new Date(); // 현재 날짜 및 시간 가져옴
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss"); // 원하는 포맷의 패턴을 가진 객체 생성, a는 오전과 오후 표시
		System.out.println(sdf1.format(now)); // Date 객체를 날짜 포맷에 맞춘 문자열로 반환

		Calendar c = Calendar.getInstance(); // 현시각 캘린더 객체에 접근
		System.out.printf("오늘은 %d월의 %d번째 날\n", c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH));
		System.out.printf("오늘은 %d년의 %d번째 날", c.get(Calendar.YEAR), c.get(Calendar.DAY_OF_YEAR)); // get()은 주어진 필드값을 반환
	}
}


