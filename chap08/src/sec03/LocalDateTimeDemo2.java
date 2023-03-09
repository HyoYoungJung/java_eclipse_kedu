package sec03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {

	public static void main(String[] args) {
		// 현재 시각 : 2022.4.25 10:20
		LocalDateTime today = LocalDateTime.of(2022, 4, 25, 10, 20);

		// 항공 1편의 출발 시간 : 2022.6.23 11:30
		LocalDateTime flight1 = LocalDateTime.of(2022, 6, 23, 11, 30);

		// 항공 2편의 출발 시간 : 2022.6.22 17:30
		LocalDateTime flight2 = LocalDateTime.of(2022, 6, 22, 17, 30);

		// 빠른 항공편을 선택하는 과정
		LocalDateTime myFlight;
		if (flight1.isBefore(flight2)) {
			myFlight = flight1;
		} else {
			myFlight = flight2;
		}

		// Period 는 LocalDate랑 찰떡궁합이고 Duration 은 Instant, LocalTime이랑 찰떡궁합

		// 빠른 항공편의 비행 탑승까지 남은 날짜 계산
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());

		// 빠른 항공편의 비행 탑승까지 남은 시간 계산
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());

		// 비행 탑승까지 남은 날짜와 시간 출력
		System.out.println(day);
		System.out.println(time);
	}

}
