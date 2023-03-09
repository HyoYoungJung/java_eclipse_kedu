package programming08;

import java.util.Scanner;

public class EchoerTest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// 익명 클래스 -> 계속 쓸거면 부모클래스에 추상메서드로, 한번만 쓰고 말거라면 익명클래스로 사용
		Echoer e = new Echoer() { // 추상클래스는 인스턴스화X (Echoer e = new Echoer();)
			@Override
			void echo() {
				String input = in.nextLine();
				while (!(input.equals("끝"))) {
					System.out.println(input);
					input = in.nextLine();
				}
				System.out.println(input);
			}
		};

		e.start();
		e.echo();
		e.stop();
	}
}

// 방법 ②
//		Scanner in = new Scanner(System.in);
//		String start = null;
//		Echoer e = new Echoer() {
//
//			@Override
//			void echo() {
//				String start = in.nextLine();
//				while (!start.equals("끝")) {
//
//					System.out.println(start);
//					start = in.nextLine();
//				}
//				System.out.println(start);
//			}
//		};
//
////		Echoer e = in.nextLine();
//
//		e.start();
//		e.echo();
//		e.stop();
//	}
//}
