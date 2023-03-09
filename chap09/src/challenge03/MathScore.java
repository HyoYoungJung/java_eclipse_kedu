package challenge03;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;

	// 문제1-① 생성자
	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		// 문제1-② 이름과 점수로 구성된 문자열을 반환하는 코드
		return name + ", " + score;
	}

	@Override
	public int compareTo(MathScore e) {
		return score - e.score;
	}
}
