package programming;

//public class Ex7 {

//
//	public static void main(String[] args) {
//		String c = input("철수");
//		String y = input("영희");
//		whoWin(c, y);
//
//	}
//
//	private static String input(String c) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private static void whoWin(String c, String y) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

//공유 코드 내용
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		String c = input("철수"); // c는 변수 , 메서드이름 input , 매개변수 String(철수) , 리턴타입 String
		String y = input("영희");
		whoswin(c, y);

	}

	static String input(String name) {

		Scanner sc = new Scanner(System.in);
		System.out.print(name + " : ");
		String rsp;
		rsp = sc.next();
		return rsp; // 철수,영희가 입력한 rsp값을 String c&y로 넣어준다.

	}
	// 입력한 값에 대한 유효성 검사를 꼭 넣어줘야 함. (r,s,p 값만 넣을수 있도록! )

	static void whoswin(String first, String second) {

		boolean firstR = first.equals("r");
		boolean firstS = first.equals("s");
		boolean firstP = first.equals("p");

		boolean secondR = second.equals("r");
		boolean secondS = second.equals("s");
		boolean secondP = second.equals("p");
		if (firstR && secondR || firstS && secondS || firstP && secondP) {
			System.out.println("무승부");

		} else if (firstR && secondS || firstS && secondP || firstP && secondR) {
			System.out.println("철수, 승!");
		} else if (secondR && firstS || secondS && firstP || secondP && firstR) {
			System.out.println("영희, 승!");
		} else {
			System.out.println("r, s, p를 입력하세요. ");
		}

	}
}