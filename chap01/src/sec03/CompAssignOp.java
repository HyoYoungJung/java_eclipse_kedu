package sec03;

public class CompAssignOp {
	public static void main(String[] args) {

		short num = 10;
		num = (short) (num + 77L);

		int rate = 3;
		rate = (int) (rate * 3.5); // rate = rate * 3.5; 에서 오류 수정 -> 명시적 형변환

		System.out.println(num);
		System.out.println(rate);

		// 대입연산자 활용
		num = 10;
		num += 77L;

		rate = 3;
		rate *= 3.5;

		System.out.println(num);
		System.out.println(rate);

	}

}
