package sec01;

public class ReturnDemo {
	public static void main(String[] args) {
		printScore(99);
		printScore(120);
	}

	public static void printScore(int score) {
		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수 : " + score);
			return; // void문 임에도 return을 쓰는 경우가 있다.
		}
		System.out.println("점수 : " + score);
	}

}
