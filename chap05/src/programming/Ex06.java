//공유 코드 1
//package Programming;
//
//import java.util.Arrays;
//
//public class Ex06 {
//
////공유 코드
//	public static int[] reverse(int[] org) {
//
//		int l = 0; // int 생성
//		int r = org.length - 1; // 길이 생성(안에서 r은 변동되고 length는 변동 안되게
//
//		while (l < r) {
//			// 돌리기
//			int n = org[l];
//			org[l] = org[r];
//			org[r] = n;
//
//			l++;
//			r--;
//		}
//		return org;
//
//	}
//
//	public static void main(String[] args) {
//
//		int[] a = { 1, 2, 3, 4, 5 };
//
//		System.out.println(Arrays.toString(reverse(a)));
//
//	}
//}

//공유 코드 2
package programming;

public class Ex06 {
	public static void main(String[] args) {

		int[] arrays = { 5, 6, 3, 0, 9 };
		for (int array : reverse(arrays)) {
			System.out.println(array);
		}
	}

	public static int[] reverse(int[] org) {
		int[] reverseArrays = new int[org.length];
		for (int i = 0; i < org.length; i++) {
			reverseArrays[i] = org[org.length - i - 1];
		}
		return reverseArrays;
	}
}