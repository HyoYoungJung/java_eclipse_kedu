package sec04;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01.Nation;
import sec01.Util;

public class Map2Demo {

	public static void main(String[] args) {
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<String> s1 = n1.map(Nation::getName); // getName() 메서드를 이용하여 국가 이름으로 구성된 Stream<String>을 생성
		s1.limit(4).forEach(Util::printWithParenthesis);
		System.out.println();

		Stream<Nation> n2 = Nation.nations.stream();
		IntStream is = n2.mapToInt(Nation::getGdpRank); // getGDPRank() 메서드를 이용해 GDP 순위로 구성된 intStream을 생성
		is.forEach(Util::print);
	}
}