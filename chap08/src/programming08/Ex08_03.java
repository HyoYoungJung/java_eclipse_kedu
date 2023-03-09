package programming08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_03 {

	public static void main(String[] args) {

		Scanner token = new Scanner(System.in); // Scanner(스캐너)를 token변수로 넣어준다

		System.out.print("입력 : "); // 입력 : 이라는 타이밍 출력

		String s = token.nextLine();// 입력 : "Empty vessels make the most sound.";

//	      StringTokenizer st = new StringTokenizer(s, " ,"); // 입력받은 s 값을 " "과 "," 를 구분하여 st 에 넣어서 나열
		StringTokenizer st = new StringTokenizer(s); // 입력받은 s 값을 " "과 "," 를 구분하여 st 에 넣어서 나열
		int con = st.countTokens(); // 단어 갯수를 세어 con 변수에 삽입
		System.out.println("단어 개수 : " + con); // 단어 갯수 출력

//	      System.out.print("입력 : ");

		String[] ss = new String[con];
		///////////////////////// 문자를 토큰화 하고 토큰을 배열에 넣어서 위치를 잡고
		///////////////////////// ///////////////////////////////
		for (int i = 0; i < con; i++) {
			ss[i] = st.nextToken(); // st. 값에 받은 토큰들을 ss[] 배열에 넣는다
		}

		Arrays.sort(ss); // Arrays.sort를 통해서 순차 배열

		System.out.print("정렬된 토큰 : ");
		for (int i = 0; i < con; i++) {
			System.out.print(ss[i] + ", ");
		}
	}
}
// 경원님 소스