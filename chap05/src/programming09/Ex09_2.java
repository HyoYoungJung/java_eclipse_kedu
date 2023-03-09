package programming09;

import java.util.Scanner;

public class Ex09_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("지뢰찾기 세로 크기 숫자를 입력해주세요 : ");
		int 행 = in.nextInt();
		System.out.print("지뢰찾기 가로 크기 숫자를 입력해주세요 : ");
		int 열 = in.nextInt();
		System.out.print("폭탄을 몇퍼센트 넣을까요 ? (0.1(10%)~0.9(90%) : ");
		double 퍼센트 = in.nextFloat();
		// 입력받은 행과 열을 가지고 배열 만들기
		int[][] 크기 = new int[행 + 2][열 + 2];
		// 랜덤값 삽입
		for (int i = 1; i < 행 + 1; i++) {
			System.out.println("");
			for (int j = 1; j < 열 + 1; j++) {
				// 배열안에 1~10까지 숫자를 넣음
				크기[i][j] = (int) (Math.random() * 10) + 1;
				if (크기[i][j] <= (int) (퍼센트 * 10)) {
					크기[i][j] = 10;
				} else {
					크기[i][j] = 0;
				}
			}
		}
		for (int i = 1; i < 행 + 1; i++) {
			System.out.println("");
			for (int j = 1; j < 열 + 1; j++) {
				if (크기[i][j] >= 10) {

					System.out.print("* "); // 잘 들어갔는지 확인
				} else {
					System.out.print("- "); // 남은거 다 -로 넣자
				}

			}

		}
		// 폭탄이 주변에 있는 만큼 +1
		for (int i = 1; i < 행 + 1; i++) {
			for (int j = 1; j < 열 + 1; j++) {

				if (크기[i + 1][j] >= 10) {
					크기[i][j] += 1;
				} else {
				}
				if (크기[i - 1][j] >= 10) {
					크기[i][j] += 1;
				} else {
				}
				if (크기[i - 1][j - 1] >= 10) {
					크기[i][j] += 1;
				} else {
				}

				if (크기[i][j + 1] >= 10) {
					크기[i][j] += 1;
				} else {
				}
				if (크기[i][j - 1] >= 10) {
					크기[i][j] += 1;
				} else {
				}
				if (크기[i + 1][j + 1] >= 10) {
					크기[i][j] += 1;
				} else {
				}
				if (크기[i - 1][j + 1] >= 10) {
					크기[i][j] += 1;
				} else {
				}
				if (크기[i + 1][j - 1] >= 10) {
					크기[i][j] += 1;
				} else {
				}
			}
		}
		// 칸 구별을 위해 넣음
		System.out.println('\n');

		// 출력 !!!!!!
		for (int i = 1; i < 행 + 1; i++) {
			System.out.println("");
			for (int j = 1; j < 열 + 1; j++) {
				if (크기[i][j] >= 10) {

					System.out.print("* "); // 10이상은 다 *로 삽입
				} else {
					System.out.print(크기[i][j] + " ");
				}

			}

		}
	}
}