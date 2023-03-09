//공유 코드 1 
package programming;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String[][] num = new String[10][10];
		String[][] overlap = new String[10][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 10개 입력하세요.");
		for (int a = 0; a < 10; a++) { // 10번 반복해서 input 값을 10개 받아줌
			int input = sc.nextInt();
			if (input >= 0 && input <= 99) { // 0부터 99까지의 값을 받아줌
				if (num[input / 10][input % 10] == "*")
					overlap[input / 10][a] = "*"; // 중복일 때 중복 배열에 추가해줌
				num[input / 10][input % 10] = "*"; // 받은 값을 10으로 나눈값 행위치 나머치를 열위치에 *문자열을 저장
			}
		}
		for (int a = 0; a < 10; a++) {
			System.out.printf("%2d ~ %2d : ", a * 10, a * 10 + 9);
			for (int b = 0; b < 10; b++) {
				{
					if (num[a][b] != null) // null 값이 아니면 * 출력
						System.out.print(num[a][b]);
					if (overlap[a][b] != null)
						System.out.print(overlap[a][b]);
				}
			}
			System.out.println();
		}

	}
}

//공유 코드 2
//package programming;
//
//import java.util.Scanner;
//
//public class Ex05 {
//	public static void main(String[] args) {
//
//		int a;
//
//		String[] b = new String[10];
//
//		for (int i = 0; i < b.length; i++)
//			b[i] = "";
//
//		System.out.println("0~99까지의 숫자를 입력해주세요.(100이상일시 종료)");
//		do {
//			a = new Scanner(System.in).nextInt();
//			int j = 10;
//			if (a < 0) { // if (a < 0) { 부터
//			} else if (a >= 0) { // } else 까지 삭제해도 정상 작동 함
//				for (int i = 0; i < 10; i++) {
//					if (a < j) {
//						b[i] += "*";
//						break;
//					} else {
//						j += 10;
//					}
//				}
//			}
//		} while (a < 100);
//		System.out.println(" 0~ 9 : " + b[0]);
//		System.out.println("10~19 : " + b[1]);
//		System.out.println("20~29 : " + b[2]);
//		System.out.println("30~39 : " + b[3]);
//		System.out.println("40~49 : " + b[4]);
//		System.out.println("50~59 : " + b[5]);
//		System.out.println("60~69 : " + b[6]);
//		System.out.println("70~79 : " + b[7]);
//		System.out.println("80~89 : " + b[8]);
//		System.out.println("90~99 : " + b[9]);
//	}
//
//}

//공유 코드 3 (답안) ->사진참고
//package Programming;
//
//import java.util.Scanner;
//
//public class Ex05 {
//	public static void main(String[] args) {
//		
//		
//		
//		
//		
//	}

//작성 중인 코드 
//package programming;
//
//import java.util.Scanner;
//
//public class Ex05 {
//
//   public static void main(String[] args) {
//      Scanner in = new Scanner(System.in); // 스캐너 소환
//
//      int[] numbers = new int[10]; // 입력할 숫자 10개를 저장할 배열 선언 및 초기화
//      System.out.println("숫자를 10개 입력하세요.");
//
//      for (int i = 0; i < 10; i++) { // 변수 i = 배열의 인덱스 번호
//         numbers[i] = in.nextInt(); // 입력한 숫자값을 numbers 배열 i번째 인덱스에 저장
//      }
//   }
//}

//메모
//      for (int i = 0; i < 10; i++) {
//         if (numbers[i] < 10 && numbers[i] > 0) { // 조건 : 입력한 숫자가 0~9일때 참
//            System.out.print("*");
//         } else if (numbers[i] < 20) {
//            System.out.print("*");
//         } else if (numbers[i] < 30) {
//            System.out.print("*");
//         } else if (numbers[i] < 40) {
//            System.out.print("*");
//         } else if (numbers[i] < 50) {
//            System.out.print("*");
//         } else if (numbers[i] < 60) {
//            System.out.print("*");
//         } else if (numbers[i] < 70) {
//            System.out.print("*");
//         } else if (numbers[i] < 80) {
//            System.out.print("*");
//         } else if (numbers[i] < 90) {
//            System.out.print("*");
//         } else if (numbers[i] < 100) {
//            System.out.print("*");
//         }

//      for (int x : numbers) { // numbers 배열에 저장돼 있는 숫자값을 변수 x에 대입
//         System.out.println(x);
//      }

//         int inputNum = in.
//         int[] check = new int[inputNum]; // 입력한 10개 숫자를 저장할 배열
