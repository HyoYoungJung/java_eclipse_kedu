package programming07;

import java.text.MessageFormat;

public class MessageFormatTest_change {
// 방법 1 (동완님 방법)
	public static void main(String[] args) {
		// 오브젝트 타입으로 date 2차원 배열 넣음
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

		String[] s = { "번호", "이름", "국적" };
		MessageFormat message = new MessageFormat("{1}\t {0}\t\t {2}");
		System.out.println(message.format(s));
		System.out.println("----------------------------");
		for (int i = 0; i < data.length; i++) {
			System.out.println(message.format(data[i]));
		}
	}

}

// 방법 2 (수작업,,)
//	public static void main(String[] args) {
//		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };
//
//		System.out.printf("%s\t\t%s\t\t%s\n", "번호", "이름", "국적");
//		MessageFormat message = new MessageFormat("{1}\t\t {0}\t\t {2}");
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(message.format(data[i]));
//
//		}
//	}
//}

// 방법 3 (성진님 방법)
//
////<문제>
////실행 결과를 보고 다음 프로그램을 완성하라.
////
////<출력>
////이름 : 세종대왕   번호 : 1    국적 : 조선
////이름 : 오바마      번호 : 2      국적 : 미국
////이름 : 징기스칸   번호   : 3      국적 : 몽고
//
//	public static void main(String[] args) {
//		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };
//
//		System.out.printf("번호\t이름\t\t국적\n");
//		for (Object[] k : data) {
//			System.out.println(MessageFormat.format("{1}\t{0}\t{2}", k));
//
//		}
//	}
//}