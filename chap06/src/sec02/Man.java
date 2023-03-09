package sec02;

public class Man {
	String name;

// * 생성자는 자식에게 상속이 되지 않기 때문에,
	Man() { // ①부모 생성자에 디폴트 생성자 추가 없이
	}
	// 매개변수 하나인 Man 생성자만 추가하면

	Man(String name) { // 컴파일러가 자동으로 디폴트 생성자를 만들지 않기 때문에 자식 클래스에 에러 발생
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}
