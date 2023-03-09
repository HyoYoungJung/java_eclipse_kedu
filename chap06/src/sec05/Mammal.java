package sec05;

public class Mammal extends Animal { // Animal을 상속 받음
	public Mammal() { // 디폴트 생성자
//		super(); // 에러 방지를 위해 ①부모(Animal)에 디폴트 생성자 만들거나, ②자식(Mammal)에 super("원숭이"); 만들면 오류 해결됨.
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}

	public Mammal(String s) { // String s 하나를 매개변수로 하는 생성자
		super(s); // 없으면 에러남.
		System.out.println("포유류 : " + s);
	}
}
