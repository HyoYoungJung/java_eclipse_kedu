package programming;

import java.util.Scanner;

public class Ex0_1 {
	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("팩토리얼을 구할 정수 : ");
		n = in.nextInt();

		result = 1;

		while (n > 1) {
			result = result * n; // result *= n;
			n = n - 1; // n--;
		}
		System.out.println("result= " + result);
	}
}

// ⑤ while(true)
//		while (true) {
//			if (n < 1) {
//				break;
//			}
//			result = result * n; // result *= n;
//			n = n - 1; // n--;
//		}
//		System.out.println(result);
//	}
//}

// ①~④ 작성 코딩
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("팩토리얼 값을 구할 정수 : ");
//		int n = in.nextInt();
//
//		int result = 1;
//		while (n > 0) {
//			result *= n;
//			n--;
//		}
//		System.out.println(result);
//	}
//}

// ⑤ while(true)&if문을 이용해 수정해보자
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("팩토리얼 값을 구할 정수 : ");
//		int n = in.nextInt();
//
//		int result = 1;
//		while (true) {
//			if (n < 1) {
//				break;
//			}
//			result *= n;
//			n--;
//		}
//		System.out.println(result);
//	}
//}