package programming;

public class Ex02 {
//공유 코드
	static int sumExceptFirst(int j, int... num) {
		int sum = 0;
		for (int i : num)
			sum += i;

		return sum;

	}

	public static void main(String[] args) {

//		      코드를 실행하면 9 , 5 , 14 를 출력한다. 메소드를 완성하라.

		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));

//		      println에서 메소드를 호출하여 결과 값 정수를 출력하기 때문에
//		      반환타입 int 인 메소드로 생성

	}
}

//	public static void main(String[] args) {
//		System.out.println(sumExceptFirt(1, 2, 3, 4));
//		int arr[] = { 2, 3 };
//		System.out.println(sumExceptFirst(1, arr));
//		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
//	}
