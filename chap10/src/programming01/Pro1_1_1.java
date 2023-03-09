package programming01;

import java.util.Arrays;

public class Pro1_1_1 {
	public static void main(String[] args) {
		String[] arr = { "K", "o", "r", "e", "a", "n" };
		System.out.println("정렬 전 : " + Arrays.toString(arr));

		Arrays.sort(arr, new Pro1_1_2());

		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}
}
//승민님 코드