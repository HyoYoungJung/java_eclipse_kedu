package sec04;

public class LibraryDemo {

	public static Library library = new Library(); // 공통으로 하나 만들어짐

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();

		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();

	}
}
