package programming08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < st.countTokens();) {
			list.add(st.nextToken());
		}

		Collections.sort(list);

		System.out.println("입력 : " + str);
		System.out.println("단어 개수 : " + list.size());
		System.out.printf("정렬된 토큰 : ");

		for (int i = 0; i < list.size(); i++) {
			System.out.printf(list.get(i) + " ");
		}
		in.close();
	}
}
// 차승현님 방법 어레이리스트 사용! 