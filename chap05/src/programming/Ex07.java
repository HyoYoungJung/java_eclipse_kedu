package programming;

public class Ex07 {
	public static void main(String[] args) {
		int a[] = { 3, 2, 4, 1, 5 };
		int b[] = { 3, 2, 4, 1 };
		int c[] = { 3, 2, 4, 1, 5 };
		int d[] = { 2, 7, 1, 8, 2 };

		equal(a, b); // 배열 a와 b를 비교하기 위한 equal 메서드 호출
		equal(a, c); // 배열 a와 c를 비교하기 위한 equal 메서드 호출
		equal(a, d); // 배열 a와 d를 비교하기 위한 equal 메서드 호출
		equal(b, c); // 배열 b와 c를 비교하기 위한 equal 메서드 호출
		equal(b, d); // 배열 b와 d를 비교하기 위한 equal 메서드 호출
		equal(c, d); // 배열 c와 d를 비교하기 위한 equal 메서드 호출
	}

	private static void equal(int[] a, int[] b) {
		// 배열의 원소가 몇개가 동일한지 체크
		int count = 0;

		// 첫 번째 조건 배열의 길이가 같은지
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				// 각 배열의 원소가 같은지
				if (a[i] == b[i]) {
					count++;
				}
			}
		}
		// 배열의 길이만큼 원소가 동일한지
		if (count == a.length) {
			System.out.println("같습니다.");
		} else
			System.out.println("다릅니다.");
	}
}