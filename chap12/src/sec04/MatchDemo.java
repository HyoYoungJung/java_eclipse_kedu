package sec04;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01.Nation;
import sec01.Util;

public class MatchDemo {

	public static void main(String[] args) {
		boolean b1 = Stream.of("a1", "b2", "c3").anyMatch(s -> s.startsWith("c")); // 스트림에 c로 시작하는 원소가 있는지 조사(anyMatch)
		System.out.println(b1);

		boolean b2 = IntStream.of(10, 20, 30).allMatch(p -> p % 3 == 0); // 스트림의 모든 원소가 3의 배수인지 조사(allMatch)
		System.out.println(b2);

		boolean b3 = IntStream.of(1, 2, 3).noneMatch(p -> p == 3); // 스트림에 3이라는 원소가 없는지 조사(noneMatch)
		System.out.println(b3);

		if (Nation.nations.stream().allMatch(d -> d.getPopulation() > 100.0)) // Nation.nations 리스트의 모든 국가의 인구가 1억 이상인지?
			System.out.println("모든 국가의 인구가 1억이 넘는다.");
		else
			System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");

		Optional<Nation> nation = Nation.nations.stream().findFirst(); // Nation.nations 리스트에 하나의 원소도 없을수도 있어서 Optional<Nation> 타입
		nation.ifPresentOrElse(Util::print, () -> System.out.print("없음.")); // Nation.nations 리스트의 첫 원소가 있으면 그 원소를 출력, 없으면 없음을 출력
		System.out.println();

		nation = Nation.nations.stream().filter(Nation::isIsland).findAny();
//		nation = Nation.nations.stream().filter(x -> x.isIsland()).findAny(); // 위와 같은 출력값이 나옴
		nation.ifPresent(Util::print);
	}
}