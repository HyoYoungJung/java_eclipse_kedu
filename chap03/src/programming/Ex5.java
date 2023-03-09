package programming;

public class Ex5 {
//
//	public static void main(String[] args) {
//
//		int a, b, c;
//		(a + b + c)=<20;
//
//	}
//
//}

//공유 코드 내용
	public static void main(String[] args) {
		// a 1부터 20까지 증가
		for (int a = 1; a < 21; a++) {
			// b 1부터 20까지 증가
			for (int b = 1; b < 21; b++) {
				// c 1부터 20까지 증가
				for (int c = 1; c < 21; c++) {
					// a, b, c가 각 1씩 증가하였을 경우 해당 조건에 맞으면 출력
					if ((a * a) + (b * b) == (c * c)) { // (c*c)뒤에 && a + b + c <= 60 넣어도O,빼도O
						System.out.println(a + "," + b + "," + c);
					}
				}
			}
		}
	}
}