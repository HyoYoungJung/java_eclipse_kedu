package sec03;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		// 현재 날짜와 시간
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		// 22시간 45분 후
		LocalDateTime mt = dt.plusHours(22);
		mt.plusHours(45);

		System.out.println(mt);

	}
}
