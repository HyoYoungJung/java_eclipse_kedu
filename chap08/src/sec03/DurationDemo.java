package sec03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationDemo {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.of(2022, Month.JANUARY, 12, 15, 30);
		LocalDateTime dt2 = LocalDateTime.of(2022, 2, 12, 15, 30);

		LocalDateTime dt3 = LocalDateTime.of(2022, 1, 12, 15, 30);
		LocalDateTime dt4 = LocalDateTime.of(2022, 2, 13, 17, 15);

		Duration date = Duration.between(dt1, dt2);
		System.out.println(date);

		Duration date2 = Duration.between(dt3, dt4);
		System.out.println(date2);

//		Period date3 = Period.between(dt1, dt2); // Period 쓸수없다 
	}
}
