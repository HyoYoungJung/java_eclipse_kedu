package programming;

public class Lotto01 {
	// 절차 지향적으로 로또 프로그래밍 하기
	public static void main(String[] args) {
		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int lotto6 = 0;
		while (true) {
			int num = (int) (Math.random() * 45) + 1; // Math 같은 애들이 Static임
			if (lotto1 == 0 && lotto1 != num) {
				lotto1 = num;
			} else if (lotto2 == 0 && lotto2 != num) {
				lotto2 = num;
			} else if (lotto3 == 0 && lotto3 != num) {
				lotto3 = num;
			} else if (lotto4 == 0 && lotto4 != num) {
				lotto4 = num;
			} else if (lotto5 == 0 && lotto5 != num) {
				lotto5 = num;
			} else if (lotto6 == 0 && lotto6 != num) {
				lotto6 = num;
			}
			if (lotto1 > 0 && lotto2 > 0 && lotto3 > 0 && lotto4 > 0 && lotto5 > 0 && lotto6 > 0) {
				break;
			}
		}
		System.out.printf("로또 번호 ; %d, %d, %d, %d, %d, %d", lotto1, lotto2, lotto3, lotto4, lotto5, lotto6);
	}
}

// 객체 지향적으로 로또 프로그래밍 하기
//	public static void main(String[] args) {
//		int lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
//		
//		while (true) {
//			int num = (int)(Math.random()*45);
//			
//			
//		}
//	}
//}