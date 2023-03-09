package programming05;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundTest {
	// printSound() 메서드
	public static <T extends Animal> void printSound(List<T> s) {
		for (T list : s) {
			list.sound();
		}
	}

	public static void main(String[] args) {
		List<Animal> lists = new ArrayList<>();
		lists.add(new Dog());
		lists.add(new Cuckoo());
		printSound(lists);

		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		printSound(dogs);
	}
}

//주현님 공유 코드
//public class AnimalSoundTest {
//	// printSound() 메서드
//	static <T extends Animal> void printSound(List<T> lists) {
//		for (T animal : lists) {
//			((Animal) animal).sound();
//		}
//	}
//
//	public static void main(String[] args) {
//		List<Animal> lists = new ArrayList<>();
//		lists.add(new Dog());
//		lists.add(new Cuckoo());
//		printSound(lists);
//
//		List<Dog> dogs = new ArrayList<>();
//		dogs.add(new Dog());
//		printSound(dogs);
//
//	}
//}