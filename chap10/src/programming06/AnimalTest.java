package programming06;

import java.util.function.Supplier;

public class AnimalTest {
	public static void main(String[] args) {
		// soundAnimal(Supplier<Animal> s) 메서드
		Supplier<Animal> a = () -> new Animal();
		Supplier<Animal> b = () -> new Dog();

		// soundAnimal 메서드에 들어가면 .sound값이 출력되도록 생성
		soundAnimal(a).sound();
		soundAnimal(b).sound();
	}

	static Animal soundAnimal(Supplier<Animal> s) {
		// soundAnimal() 메서드 호출
		return s.get();
	}
}
//호성님 코드