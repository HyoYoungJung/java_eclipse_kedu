package programming;

public class Ex01 {
//공유 코드

	static String s;
	static char c;

	public int countChar(String s, char c) {
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				answer += 1;
			}

		}
		return answer;

	}

	public static void main(String[] args) {
		Ex01 in = new Ex01(); // public이면 이 부분은 없어도 됨? 그러면 다음 부분도 바뀌어야함.
		// System.out.println(in.countChar(s, c));
		System.out.println(in.countChar("84548458618", '1'));
	}

}

//	public static void main(String[] args) {
//		
//		static int countChar(String s, char c) {
//			String s1 = new String("Hello");
//			char c1 = new char("l");
//			System.out.println();
//		}
//		
//		
//	}
