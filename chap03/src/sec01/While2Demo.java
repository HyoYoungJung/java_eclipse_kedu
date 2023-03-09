package sec01;

public class While2Demo {
	public static void main(String[] args) {
		// 1~100까지 출력
//		int i = 1;
//		while (i <= 100) {
//			System.out.printf("%d\t", i);
//			i++;
//		}
//	}
//}

		// 구구단 출력
//		int i = 2;
//		while (i < 10) {
//			int j = 1;
//			while (j < 10) {
//				System.out.printf("%d\t", i * j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//	}
//}

		// 2x1=2 2x2=4 2x3=6 으로 나오게 출력
//		int i = 2;
//		while (i < 10) {
//			int j = 1;
//			while (j < 10) {
//				System.out.printf("%d X %d = %d\t", i, j, i * j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//	}
//}

		// 구구단이 세로로 나열되고, 2단 -> 9단이 가로로 나열되도록 해보자 ( 2x1=2 3x1=3 4x1=4 ··)
		// 방법 ①
		int j = 1;
		while (j < 10) {
			int i = 2;
			while (i < 10) {
				System.out.printf("%d X %d = %d\t", i, j, i * j);
				i++;
			}
			System.out.println();
			j++;
		}
	}
}
