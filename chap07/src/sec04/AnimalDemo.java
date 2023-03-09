package sec04;

public class AnimalDemo {

	public static void main(String[] args) {
// 방법 ①
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();

		makeSound(d);
		makeSound(c);

// 방법 ② (dog, cuckoo 각각 만들 것 없이 배열로 하면)
		Animal[] zoo = { new Dog(), new Cuckoo() };

		for (Animal a : zoo) {
			makeSound(a);
		}
	}

	static void makeSound(Animal a) {
		a.sound();
	}

	// 원래라면(쿡쿠 도그가 공통분모 없을 경우) 아래와 같이 두개로 생성해야 함.
//	private static void makeSound(Cuckoo c) {}
//	private static void makeSound(Dog d) {}

}
