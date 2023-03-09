package sec01;

public class While1Demo {

	public static void main(String[] args) {
		int i = 1;
		while (i < 5) {
			System.out.print(i);
			i++; // i++ 문을 주석처리하고 실행시키면 111111··무한 계산됨.

		}
	}

}
