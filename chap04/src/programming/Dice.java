package programming;

public class Dice {
	int x = 0; // 필드 변수 선언 및 초기화

	// public Dice() { //생성자
	// }

	public double roll() { // 작동에 필요한 메소드
		x = (int) ((Math.random() * 6) + 1);
		return x;
	}

}