//공유 코드 내용임

package test;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("소문자를 적으시오 : ");

		String b = in.next();
		char d = b.charAt(0);
		int c = (int) 'A' - (int) 'a';

		System.out.printf("당신이 적은 문자는 %s이며 대문자로는 %s 입니다. \n", b, (char) (d + c));

	}

}
