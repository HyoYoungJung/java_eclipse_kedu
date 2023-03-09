package programming;

import java.util.Scanner;

public class Ex2 {

	// 공유 코드 내용
	public static void main(String[] args) {
		System.out.println("몇등인가요?");
		Scanner scanner = new Scanner(System.in);
		String key = scanner.nextLine();

		switch (key) {
		case "1등":
			System.out.println("아주 잘했습니다.");
			break;
		case "2등":
		case "3등":
			System.out.println("잘했습니다.");
			break;
		case "4등":
		case "5등":
		case "6등":
			System.out.println("보통입니다.");
			break;

		default:
			System.out.println("노력해야겠습니다.");
		}
	}

	// 작성 코딩 -ing
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("등수를 입력하세요 : ");
//		int ranking = in.nextInt();

//		rank(1);
//		rank(2);
//		rank(3);
//		rank(4);

//		switch (ranking) {
//		case 1:
//			System.out.print("아주 잘했습니다");
//		case 2:
//			System.out.print("잘했습니다");
//		case 3:
//			System.out.print("잘했습니다");
//		case 4:
//			System.out.print("보통입니다");
//		case 5:
//			System.out.print("보통입니다");
//		case 6:
//			System.out.print("보통입니다");
//		default:
//			System.out.print("노력해야겠습니다");
//		}

//	public static void rank(String ranking) {
//		switch (ranking) {
//		case 1:
//			System.out.print("아주 잘했습니다");
//		case 2:
//			System.out.print("잘했습니다");
//		case 3:
//			System.out.print("잘했습니다");
//		case 4:
//			System.out.print("보통입니다");
//		case 5:
//			System.out.print("보통입니다");
//		case 6:
//			System.out.print("보통입니다");
//		default:
//			System.out.print("노력해야겠습니다");
//		}		
//	}

}
