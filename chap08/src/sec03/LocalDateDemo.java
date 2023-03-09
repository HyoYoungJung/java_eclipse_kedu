package sec03;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);

		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("올해의 크리스마스 : " + xmas);

		LocalDate eve = xmas.minusDays(1);
		System.out.println("올해의 크리스마스 이브 : " + eve);
	}
}