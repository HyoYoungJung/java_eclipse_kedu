package programming;

//import java.util.Scanner;
//
//public class Ex6 {
//
//	public static void main(String[] args) {
//		int r, s, p;
//		Scanner in = new Scanner(System.in);
//		System.out.println("철수 : ");
//		String cs = in.next();
//		System.out.println("영희 : ");
//		String yh = in.next();
//
////		equals();
////		s.equals("r");
//
//	}
//
//}

//공유 코드 내용

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		String RspGameInput = "", RspGameInput2 = "";
		Scanner GameInput = new Scanner(System.in);
		boolean goodChoice, goodChoice2, goodChoice3;

		do {
			System.out.println("r 혹은 s 혹은 p 중 하나를 입력해 주세요");
			System.out.print("철수 : ");
			RspGameInput = GameInput.next(); // 철수값 입력받음
			System.out.print("영희 : ");
			RspGameInput2 = GameInput.next(); // 영희값 입력받음

			goodChoice = RspGameInput.equals("r") || RspGameInput.equals("s") || RspGameInput.equals("p");
			goodChoice2 = RspGameInput2.equals("r") || RspGameInput2.equals("s") || RspGameInput2.equals("p");
			goodChoice3 = (goodChoice && goodChoice2) ? true : false; // 입력한 값이 r,s,p이면 true, 아니면 false

		} while (goodChoice3 == false); // 조건식이 틀릴 때까지 반복하므로 true 일 때만 반복해제

		if (RspGameInput.equals(RspGameInput2)) { // 철수값과 영희값이 동일하다면 무승부
			System.out.println("무승부");
		} else {
			if (RspGameInput.equals("r")) { // 철수값이 r이면 실행
				if (RspGameInput2.equals("s")) { // 영희값이 s이면 철수 승 출력
					System.out.println("철수, 승!");
				} else
					System.out.println("영희, 승!"); // 영희값이 s가 아니면 p밖에 없으니 영희 승 출력
			} else if (RspGameInput.equals("s")) { // 철수값이 s이면 실행
				if (RspGameInput2.equals("p")) { // 영희값이 p이면 철수 승 출력
					System.out.println("철수, 승!");
				} else
					System.out.println("영희, 승!"); // 영희값이 p가 아니면 s밖에 없으니 영희 승 출력
			} else { // 철수값이 무조건 p
				if (RspGameInput2.equals("r")) { // 영희값이 r이면 철수 승 출력
					System.out.println("철수, 승!");
				} else
					System.out.println("영희, 승!"); // 영희값이 r이 아니면 s밖에 없으니 영희 승 출력
			}
		}
	}
}