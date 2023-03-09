package programming08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08_05 {

	public static void array(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		String[] arr = s.split(" ");
		int num = arr.length;

		Arrays.sort(arr);
		System.out.println("입력 : " + s);
		System.out.println("단어개수 : " + num);
		System.out.print("정렬된 토큰 :");
		array(arr);

	}
// 잘라서 배열에 넣어주는 방법이라고~~~?
}
//승민님 방법