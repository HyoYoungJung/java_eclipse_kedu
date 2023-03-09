package sec01;

public class For2Demo {

	public static void main(String[] args) {
		// for문을 이용한 구구단 출력
//		for (int row = 2; row < 10; row++) {
//			for (int column = 1; column < 10; column++) {
//				System.out.printf("%4d", row * column);
//			}
//			System.out.println();
//		}
//	}
//}

		// 초기식, 증감식 2개인 경우 작성법
		int i, j;
		for (i = 0, j = 10; i < j; i++, j--) {
			System.out.print("i=> " + i + ", ");
			System.out.println("j=> " + j);
		}
		System.out.println("-----------------------");
		System.out.print("i=> " + i + ", ");
		System.out.println("j=> " + j);
	}

}
