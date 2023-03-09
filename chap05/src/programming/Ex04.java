package programming;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s1 = "com";
		String s2 = "java";
		String s3 = "bye";

		while (true) {
			System.out.print("URL을 입력하세요 : "); // url 입력 안내 문구 출력
			String input = in.nextLine(); // url 입력

			if (input.endsWith(s1)) { // com으로 끝나는지 조사
				System.out.println(input + "은 " + "'" + s1 + "'으로 끝납니다.");
			}
			if (input.contains(s2)) { // java를 포함하는지 조사
				System.out.println(input + "은 " + "'" + s2 + "'를 포함합니다.");
			}
//			if (input.contains(s3)) {
//				break;
			if (input.equals(s3)) { // *point* equals 함수 사용!
				break;
			}
		}
	}

}

////공유 코드 -> 입력한 문자의 순서를 기준으로 그 값을 찾아 반환하는 코드임.
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String m = "";
//		do {
//			System.out.print("URL을 입력하세요 : ");
//			m = in.nextLine();
//			if (!m.equals("bye")) {
//				System.out.println(m + "은" + "'" + m.substring(9, m.length()) + "'" + "으로 끝납니다.");
//
//				System.out.println(m + "은" + "'" + m.substring(4, 8) + "'" + "를 포함힙니다.");
//			} else {
//
//			}
//		} while (!m.equals("bye"));
//		{
//
//		}
//
//	}
//}

//	public static void main(String[] args) {
//		System.out.print("URL을 입력하세요 : "); // url 입력 안내 문구 출력
//
//		Scanner in = new Scanner(System.in);
//		String input = in.nextLine(); // url 입력
//
//		String s1 = new String("com");
//		String s2 = new String("java");
//		String s3 = new String("bye");
//
//		if (input != s3) {
//			if (input.endsWith(s1)) { // com으로 끝나는지 조사
//				System.out.println(input + "은 " + "'" + s1 + "'으로 끝납니다.");
//			} else {
//				System.out.println(input + "은 " + "'" + s1 + "'으로 끝나지 않습니다.");
//			}
//			if (input.contains(s2)) { // java를 포함하는지 조사
//				System.out.println(input + "은 " + "'" + s2 + "'를 포함합니다.");
//			} else {
//				System.out.println(input + "은 " + "'" + s2 + "'를 포함하지 않습니다.");
//			}
//
//			System.out.print("URL을 입력하세요 : ");
//		}
//	}
//}