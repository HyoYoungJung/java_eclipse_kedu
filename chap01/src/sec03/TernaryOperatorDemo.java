package sec03;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		int x = 1;
		int y; // x는 초기값 1 설정돼 있고, y는 선언만 되어있는 차이점.

		y = (x == 1) ? 10 : 20; // 삼항연산자
		System.out.println(y);

		y = (x > 1) ? x++ : x + 20; // x=1이므로 x>1은 false, 연산식 1 수행할 필요 X. 연산식 2 수행하면 y = x(1)+20= 21 이 됨.
		System.out.println(x); // 따라서 x = 1 , y = 21
		System.out.println(y);
	}

}