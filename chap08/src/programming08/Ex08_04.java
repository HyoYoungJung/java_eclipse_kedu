package programming08;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex08_04 {

	String s;

	public Ex08_04(String s) {
		this.s = s;
	}

	public void show() {
		StringTokenizer st = new StringTokenizer(s);
		String[] ss = new String[st.countTokens()];
		int ctLength = st.countTokens();
		System.out.println("입력 : " + s);
		System.out.println("단어 개수 : " + ctLength);
		for (int a = 0; a < ctLength; a++) { // st.countTokens() 넣으면 포문이 줄어듦(넥스트토큰스 때문에?)
			ss[a] = st.nextToken();
		}
		Arrays.sort(ss);
		for (String ab : ss)
			System.out.print(ab + ", ");

	}
}
//동완님 방법 소스1