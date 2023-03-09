package sec03;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {

	public static void main(String[] args) {
//		 한국 출발 현지 시간 2022년 12월 9일 13시 20분
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 13, 20, 00, 00),
				ZoneId.of("Asia/Seoul"));
		System.out.println("한국 출발 현지 시간 : " + departure);

//		 파리 도착 현지 시간 2022년 12월 9일 17시 15분
		ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 17, 15, 00, 00),
				ZoneId.of("Europe/Paris"));
		System.out.println("파리 도착 현지 시간 : " + arrival);

//		 비행에 걸린 시간은?

//		// 한국 출발 현지 시간 2022년 12월 9일 13시 20분
//		LocalDateTime koreaT = LocalDateTime.of(2022, 12, 9, 13, 20);
//		System.out.println("한국 출발 현지 시간 : " + koreaT);
//
//		// 파리 도착 현지 시간 2022년 12월 9일 17시 15분
//		LocalDateTime parisT = LocalDateTime.of(2022, 12, 9, 17, 15);
////		ZoneId paris = ZoneId.of("Eurpoe/Paris");
//		System.out.println("파리 도착 현지 시간 : " + parisT);
//
//		// 비행에 걸린 시간은?
//		Duration flightT = Duration.between(koreaT, parisT);
//		System.out.println("비행 시간 : " + flightT);
	}
}
