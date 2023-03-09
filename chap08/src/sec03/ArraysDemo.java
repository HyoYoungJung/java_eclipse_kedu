package sec03;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		char[] a1 = { 'J', 'a', 'v', 'a' };
		char[] a2 = Arrays.copyOf(a1, a1.length); // a1배열을 a1배열의 길이만큼 복사한다.
		System.out.println(a2);
//		print(a2); //기본자료형이라 자동 박싱할 수 없기때문에, a2는 print 메서드를 활용할 수 없다.
		// 배열 타입을 char에서 character 타입으로 바꾸면 가능해짐.

		String[] sa = { "케이크", "애플", "도넛", "바나나" };
		print(sa);

		Arrays.sort(sa);
		print(sa);

		System.out.println(Arrays.binarySearch(sa, "애플")); // 배열을 이진 탐색

		Arrays.fill(sa, 2, 4, "기타");
		print(sa);
	}

	static void print(Object[] oa) { // 오브젝트 타입의 oa
		for (Object o : oa)
			System.out.print(o + " ");
		System.out.println();
	}
}
