package programming;

public class Ex9 {
	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕", 1, 2);
		foo("잘 있어");

	}

	static void foo(String s) {
		System.out.println(s);
	}

	static void foo(String s, int x) {
		System.out.println(s + " " + x);
	}

	static void foo(String s, int x, int y) {
		System.out.println(s + " " + x + y);
	}

}
// 오버로딩 문제. 매개변수의 갯수가 다름. void 이므로 