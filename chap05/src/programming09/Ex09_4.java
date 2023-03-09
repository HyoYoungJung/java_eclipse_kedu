package programming09;

// Run Configurations에서 Arguments에 5 10 0.3 입력해서 실행. 
public class Ex09_4 {
	public static void main(String[] args) {
		int height = Integer.parseInt(args[0]); // 세로에 5 넣음
		int width = Integer.parseInt(args[1]); // 가로에 10 넣음
		String mine[][] = new String[height][width]; // 문자열 타입 5행 10열 2차원 배열
		int danger[][] = new int[height][width];
//	                                              ===지뢰 배열 생성===
		for (int a = 0; a < height; a++) { // 행만큼 반복
			for (int b = 0; b < width; b++) { // 행이 반복하는 동안 열만큼 반복
				double mineRandom = Math.random(); // 랜덤 값을 넣어줌
				if (mineRandom <= 0.3) // 랜덤값은 0에서 1까지의 실수인데 0.3이하면 30프로 확률이 나온다
					mine[a][b] = "*"; // 0.3 이하면 *
				else
					mine[a][b] = "-"; // 아니면 - 를 넣어줌
//	                                             ===지뢰 배열 생성 끝===
			}
		}
//	                                                ***지뢰 배열 호출***
		for (int a = 0; a < height; a++) {
			for (int b = 0; b < width; b++)
				System.out.print(mine[a][b] + " ");
			System.out.println();
//	                                               ***지뢰 배열 호출 끝***
		}
		System.out.println();
//	                                           ---지뢰개수 배열 만들기---
		for (int a = 0; a < height; a++) {
			for (int b = 0; b < width; b++) {
				if (mine[a][b] == "*") { // 지뢰 배열 훑으면서 지뢰가 나오면
					danger[a][b] = 10; // 위험 배열에 10 값을 넣어줌
					for (int c = a - 1; c <= a + 1; c++) { // 지뢰가 나온 행에서 -1부터 +1까지
						for (int d = b - 1; d <= b + 1; d++) { // 지뢰가 나온 열에서 -1부터 +1까지
							if (c >= 0 && d >= 0 && c < height && d < width) // 인덱스 값에서 벗어나지 않게 if문
								danger[c][d]++; // safe에 +1 넣어줌
//	                                          ---지뢰개수 배열 만들기 끝----
						}

					}
				}

			}
		}
//	                                          ***지뢰 및 지뢰 개수 배열 출력***
		for (int a = 0; a < height; a++) { // 행
			for (int b = 0; b < width; b++) { // 열 반복
				if (danger[a][b] < 10) { // 10보다 작으면 세이프자리 출력
					System.out.print(danger[a][b] + " ");
				} else
					System.out.print(mine[a][b] + " "); // 그 외의 경우는 지뢰 자리 출력
			}
			System.out.println();
//	                                          ***지뢰 및 지뢰 개수 배열 출력 끝***
		}
	}
}