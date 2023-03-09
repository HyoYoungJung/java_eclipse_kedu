package programming03;

public class Book implements Comparable<Book> {
	int price; // 필드

	public Book(int price) { // 생성자
		this.price = price;
	}

	public void show() { // 메서드
		System.out.println("Book [price=" + price + "]");
	}

	@Override // comparator 는 변수와 변수를 비교, comparable은 나자신과 변수를 비교!
	public int compareTo(Book o) {
		return price - o.price;
	}
}
