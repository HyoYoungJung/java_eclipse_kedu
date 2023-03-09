package sec02;

// 공유 코드①
//import java.util.Random;
//import java.util.Scanner;
//
//public class Lotto {
//
//	public static void main(String[] args) {
//		Scanner start = new Scanner(System.in);
//
//		int[] in = new int[45];
//		System.out.println("=====2022. 10. 12. 로또 추첨=====");
//		for (int i = 0; i < in.length; i++) {
//			in[i] = i + 1;
//			System.out.printf("%3d", in[i]);
//			if ((i + 1) % 10 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.printf("\n=====2022. 10. 12. 로또 추첨=====\n");
//		System.out.printf("\n몇번 흔드시겠습니까 ? ");
//		int s = start.nextInt();
//		Random random = new Random();
//		for (int i = 0; i < s; i++) {
//			int r = random.nextInt(44) + 1;
//			int null01 = in[0];
//			in[0] = in[r];
//			in[r] = null01;
//
//		}
//		for (int i = 0; i < 6; i++) {
//
//			System.out.printf("%5d", in[i]);
//
//		}
//	}
//}

// 공유 코드②
//public class Lotto {
//	public static void main(String[] args) {
//		int iFlag = 0; // 플래그 변수
//		int[] iLottos = new int[6]; // 배열 선언
//
//		for (int iLoopCountFirst = 0; iLoopCountFirst < iLottos.length; iLoopCountFirst++) { // 6개의 로또번호 반복루프
//			int num = (int) (Math.random() * 45) + 1;
//			for (int iLoopCountSecond = 0; iLoopCountSecond < iLoopCountFirst + 1; iLoopCountSecond++) { // 중복 조건 반복루프
//				if (iLottos[iLoopCountSecond] == num) { // 중복 조건확인
//					iFlag = 1;
//					break;
//				}
//			}
//
//			if (iFlag == 0) { // 중복이 아닐 시 값 추가
//				iLottos[iLoopCountFirst] = num;
//				if (iLottos[iLoopCountFirst] > 0) {
//					System.out.println(iLottos[iLoopCountFirst]); // 출력
//				}
//			} else { // 중복 시 재실행, 플래그 원복
//				iLoopCountFirst--;
//				iFlag = 0;
//			}
//		}
//	}
//}

//배열을 이용해 로또번호 뽑기 - ing
//public class Lotto {
//	public static void main(String[] args) {
//
//		int[] lotto = new int[6];
//
//		for (int i = 0; i < 6; i++)
//			while (true) {
//				int num = (int) (Math.random() * 45);
////			num += lotto[i];
//			}
////	System.out.printf("로또 번호 ; %d, %d, %d, %d, %d, %d", lotto1, lotto2, lotto3, lotto4, lotto5, lotto6);
//	}
//}

public class Lotto {
	public static void main(String[] args) {

		int[] lottos = new int[6];
		int count = 0;
		while (count < lottos.length) {
			int num = (int) (Math.random() * 45) + 1;
			for (int i = 0; i < lottos.length; i++) {
				if (lottos[i] == num) {
					break; // for문 빠져나감
				}
				if (lottos[i] != num && lottos[i] == 0) {
					lottos[i] = num;
					count++;
					break; // for문 빠져나감
				}
			}
		}
		for (int lotto : lottos) {
			System.out.println(lotto + " ");
		}
	}
}