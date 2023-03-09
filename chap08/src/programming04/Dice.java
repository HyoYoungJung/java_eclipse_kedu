package programming04;

public class Dice {

	public int roll() {
// Math.random() 사용하여 최대값 6, 최소값 1인 랜덤값 추출! (숫자 6이지만 실제론 0부터 5까지만 출력되기 때문에 6과 1로 기재)
		int num = (int) (Math.random() * 6) + 1; // double에서 int타입으로 형변환
		return num;
	}
}