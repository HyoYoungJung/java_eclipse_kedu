package sec01;

public class ContinueDemo2 {

	public static void main(String[] args) {
		// 1~1000 정수 중 ①5의 배수이고 7의 배수인 것을 출력하고, ②갯수를 출력하자. (단, continue문 사용 필수!!)

		// 방법 1
//		int num = 0;
//		int count = 0;
//
//		while ((num++) < 1000) {
//			if (!((num % 5 == 0) && (num % 7 == 0))) { // ** (!())전체를 묶어서 부정하지 않고 (!)||(!) 처럼 각 부정하고 싶다면 && 아닌 || 조건
//														// 사용해야 함.
//				continue;
//			}
//			count++;
//			System.out.printf("5와 7의 공배수인 정수 : %4d\n ", num);
//		}
//		System.out.println("count: " + count);

		// 방법 2
		int num = 0;
		int count = 0;

		while (true) {
			num++;
			if (!((num % 5 == 0) && (num % 7 == 0))) {
				continue;
			} else {
				if (num >= 1000) {
					break;
				}
			}
			count++;
			System.out.printf("5와 7의 공배수인 정수 : %4d\n ", num);
		}
		System.out.println("count: " + count);
	}

}