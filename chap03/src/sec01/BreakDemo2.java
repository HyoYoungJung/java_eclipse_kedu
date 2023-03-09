package sec01;

public class BreakDemo2 {

	public static void main(String[] args) {
//		int num = 1;
//		boolean search = false; // 무슨 의미??
//
//		while (num < 100) {
//			if ((num % 5 == 0) && (num % 7 == 0)) {
//				search = true;
//				break;
//			}
//
//			num++;
//		}
//		if (search)
//			System.out.println("찾는 정수 : " + num);
//		else
//			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
//	}
//}

// *응용 : 10,000이하의 정수 중 5의 배수이고 7의 배수인 것 5개를 출력하시오. (이런 경우에 break 문이 유용함.)

		int num = 1;
		int search = 0; // counter

		while (num < 10000) {
			if ((num % 5 == 0) && (num % 7 == 0)) {
				search++; // 5&7의 공배수(counter) 찾았다고 하나 증가시키는 것.
				System.out.printf("5의 배수이고 7의 배수인 정수 %d => %4d\n", search, num); // %4d의 의미는?? 4자리를 확보해라.
				if (search > 4) {
					break;
				}
			}
			num++;
		}
		System.out.println("while문의 반복횟수 => " + num);
		// System.out.println("while문의 반복횟수 => " + search); *이건 5&7의최소공배수를 찾았을 때의 횟수임.
	}

}
