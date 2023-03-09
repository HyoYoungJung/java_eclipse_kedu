package sec05;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import sec01.Nation;

public class Reduce2Demo {

	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream();
		// 스트림 원소에 있는 나라 중 인구가 가장 많은 나라로 좁히는 연산
		s1.reduce((n1, n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2).ifPresent(System.out::println);

		Stream<Nation> s2 = Nation.nations.stream();
		double sumOfPopulation = s2.filter(n -> n.getGdpRank() <= 20) // 스트림 원소의 나라 중 GDP가 20 이하인 나라만 통과시키는 연산
				.mapToDouble(n -> n.getPopulation()) // 스트림 원소를 Nation 객체에서 population 필드로 매핑하는 연산
				.reduce(0.0, (p1, p2) -> p1 + p2); // 스트림 원소인 population 필드값을 모두 합하는 연산

		System.out.println("리스트에서 GDP가 20위 이내의 나라의 인구 총합은 " + sumOfPopulation + "백만명이다.");
		Stream<Nation> s3 = Nation.nations.stream();
		DoubleStream ds = s3.mapToDouble(Nation::getPopulation);
		DoubleSummaryStatistics dss = ds.summaryStatistics();
		System.out.println(dss);
	}
}