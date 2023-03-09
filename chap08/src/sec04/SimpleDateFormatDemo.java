package sec04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date d = new Date(); // 날짜 가져옴(util.Date로 import)

		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z"); // E = 요일 , a = 오전/오후, z = 타임존(KST)
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd"); // MM은 대문자로 써야함
		// 아래 22행 try-catch문 오류 발생하게 하려면 yyyy-MM-dd를 yyyy.MM.dd로 포맷 불일치 시켜야 함.

		System.out.println(sdf1.format(d)); // Date 객체를 날짜 포맷에 맞춘 문자열로 반환
		System.out.println(sdf2.format(d));

		try {
			d = sdf2.parse("2023-11-30"); // 16행과 포맷을 일치시켜야 오류가 나지 않음 (ex. yyyy.MM.dd 이면 2023.11.30으로 일지해야 정상출력됨)
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));

		Calendar c = Calendar.getInstance();

		SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd", Locale.US);
		System.out.println(sdf3.format(c.getTime()));

		SimpleDateFormat sdf4 = new SimpleDateFormat("E yyyy.MM.dd", Locale.KOREA);
		System.out.println(sdf4.format(c.getTime()));

// 로컬데이트타임 활용
		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("E yyyy.MM.dd");

//		System.out.println(sdf4.format(lt));
		System.out.println(lt.format(dt));
		System.out.println(dt.format(lt));

	}
}
