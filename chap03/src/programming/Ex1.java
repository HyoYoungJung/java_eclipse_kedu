package programming;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = in.nextInt();
		if (age >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}
	}
}

//공유 코드 내용

//	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//		System.out.print("나이를 정수로 입력하세요 : ");
//		int age = in.nextInt();
//
//		if (age >= 19) {
//			System.out.println("당신은 성년입니다.");
//		} else {
//			System.out.println("당신은 미성년 입니다.");
//		}
//	// in.close();
//	}
//}