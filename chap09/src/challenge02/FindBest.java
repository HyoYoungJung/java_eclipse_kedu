package challenge02;

public class FindBest {

	static <T extends Comparable> T findBest(T[] a) {
		T best = a[0];

		// 점수가 최고인 학생의 이름과 영어 점수를 반환하는 코드
		for (T e : a)
			if (best.compareTo(e) < 0) // *포인트!!
				best = e; // *포인트!!
		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };

		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("영어 최고 점수 : " + findBest(ma));
	}
}