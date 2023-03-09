package sec06;

public class Unboxer {
	public static <T> T openBox(Box<T> box) { // 오픈박스가 제네릭메서드란 뜻
		return box.get();
	}

	public static <T> void peekBox(Box<T> box) { // 픽박스도 제네릭 메서드임
		System.out.println(box);
	}

	public static void peekBox2(Box<?> box) { // 제네릭 메서드 아니라 <T> 빠짐. 와일드카드를 매개변수로 받는 메서드임.
		System.out.println(box);
	} // 픽박스랑 픽박스투는 기능이 완전 같음. 와일드카드문이 더 간결해서 사용 권장.

	public static void peekBox3(Box<? extends Number> box) { // extends Number면 스트링은 쓸수X
		System.out.println(box);
	}

	public static void peekBox4(Box<? super Integer> box) {
		// 하한제한: 인티저와 인티저 조상들을 매개변수로 반아서 쓸수 있다 인티저가 막내란 얘기. 인티저 넘버 오브젝트 다 들어올수 있다
		System.out.println(box);
	}
}
