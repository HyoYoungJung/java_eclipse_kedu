package programming06;

interface Human {
	void eat();

	static void echo() {
		System.out.println("야호!!!");

	}

	// Worker 클래스를 수정할수 없기 때문에 부모클래스에 default를 넣어줘야 함
	// 디폴트 => 만오백개 다 수정하기 싫어서 만들었다~~
	default void print() {
		System.out.println("인간입니다.");
	}
}
