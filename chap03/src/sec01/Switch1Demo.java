package sec01;

public class Switch1Demo {

	public static void main(String[] args) {
		// number에 숫자 1,2,3·· 바꿔가면서 실행해보기.

//		int number = 2;
//
//		switch (number) {
//		case 3:
//			System.out.print("*");
//		case 2:
//			System.out.print("*");
//		case 1:
//			System.out.print("*");
//		default:
//			System.out.println("&");
//		}

		int number = 3;

		switch (number) {
		case 3:
			System.out.print("3");
			break; // 3만 찍고 나가게 됨.
		case 2:
			System.out.print("2");
		case 1:
			System.out.print("1");
		default:
			System.out.println("&");
		}

	}

}
