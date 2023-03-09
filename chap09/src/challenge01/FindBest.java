package challenge01;

public class FindBest {
	// 반환타입이 EnglishScore, 메서드명이 findBest, EnglishScore배열 타입의 변수 a
	static EnglishScore findBest(EnglishScore[] a) {
		EnglishScore best = a[0]; // EnglishScore 타입의 변수 best = a 0번 인덱스

		// 점수가 최고인 학생의 이름과 영어 점수를 반환하는 코드

		for (EnglishScore e : a)
			if (best.compareTo(e) < 0)
				best = e;
		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), // EnglishScore 타입의 ea 배열
				new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };

		System.out.println("영어 최고 점수 : " + findBest(ea));
	}
}