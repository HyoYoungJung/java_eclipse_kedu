package sec04;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01.Nation;
import sec01.Util;

public class LoopAggregateDemo {

	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis); // 중간 연산으로 최종 연산이 연결될 때 실행됨
		System.out.println("어디 나타날까?");
		Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));
		System.out.println();
		System.out.println(on.get()); //max()로 가져온 nation을 반환하는 get()

		System.out.println(IntStream.of(5, 1, 2, 3).min().getAsInt());
		//정수 스트림 min() 연산 결과로 OptionalInt 타입. 즉, OptionalInt 타입에서 정숫값을 얻기 위해 getAsInt를 사용

		sn = Nation.nations.stream();
		System.out.println(sn.count());
	}
}