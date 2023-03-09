package challenge03;

import java.util.Arrays;

public class FindBest {
//동완님 코드
	static <T> T findBest(T[] a) {
		Arrays.sort(a);
		T best = a[0];
		return best;
	}

	static <T> T findScore(T[] a, String name) throws Exception {
		T who = null;
		for (int num = 0; num < a.length; num++) {
			if (a[num].toString().substring(0, 3).equals(name)) { // contains로 했다가 문제에 있는 해법대로 그냥 다시 풀었습니다...
				who = a[num];
			}
		}
		if (who == null) {
			throw new Exception(); // 검사형 예외기 때문에 throws로 던져줘야함
		}
		return who;

	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };
		String name = null;

		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));

		try {
			name = args[0];
			System.out.println("영어     점수 : " + findScore(ea, name));
			System.out.println("수학     점수 : " + findScore(ma, name));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("명령행 인자가 없습니다.");
		} catch (Exception e) {
			System.out.println("일치하는 이름이 없습니다.");
		}
	}
}

//	static <T> T findBest(T[] a, String name) {
//	T best = a[0];
//
//	// 주어진 name을 포함하는 배열 a의 원소를 반환하는 코드
//	for (T e : a)
//		if (best.compareTo(e) < 0)
//			best = e;
//	return best;
//}
//
//public static void main(String[] args) {
//	EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
//	MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };
//
//	System.out.println("영어 최고 점수 : " + findBest(ea));
//	System.out.println("영어 최고 점수 : " + findBest(ma));
//}
//}