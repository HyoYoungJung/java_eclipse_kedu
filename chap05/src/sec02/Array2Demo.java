package sec02;

public class Array2Demo {

	public static void main(String[] args) {
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } }; // 2차원배열(3행4열)
		double[] sum1 = { 0.0, 0.0, 0.0 };
		double sum2 = 0.0;

		for (int i = 0; i < interests.length; i++) { // 0~2까지 반복하는 for문
//			System.out.println(interests.length);            // ☆interests.length는 행의 갯수☆중요☆
			for (int j = 0; j < interests[i].length; j++) { // interests[i].length는 열의 갯수
				sum1[i] += interests[i][j];
			}

			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i + 1, sum1[i] / 4);
			sum2 += sum1[i];
		}
		System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2 / (3 * 4)); // 3*4 대신 interests.length*interests[0].length 써도 됨.
																	// 길이가 바꼈을때도 자동으로 반영되는 식임.
	}

}
