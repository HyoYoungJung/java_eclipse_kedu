package sec03;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriodDemo {

	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("오늘 : " + today);

		// 올해의 크리스마스
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("올해의 크리스마스 : " + xmas);

		// 크리스마스까지의 일 수
		Period left = Period.between(today, xmas);
		System.out.println("크리스마스까지 앞으로 : " + left);
		System.out.println("크리스마스까지 앞으로 : " + left.getMonths() + "월" + left.getDays() + "일");

		// 올해 수능 날짜 11/17
		LocalDate exam = LocalDate.of(today.getYear(), 11, 17);
		System.out.println("올해의 수능일 : " + exam);

		// 수능까지 며칠 남았나요
		left = Period.between(today, exam);
		System.out.println("수능까지 앞으로 : " + left);
		System.out.println("수능까지 앞으로 : " + left.getDays() + "일");
		// Period 는 LocalDate랑 찰떡궁합
	}

}
