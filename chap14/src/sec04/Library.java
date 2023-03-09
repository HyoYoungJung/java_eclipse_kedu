package sec04;

import java.util.ArrayList;

public class Library {
	public ArrayList<String> shelf = new ArrayList<>();

	public Library() {
		shelf.add("쉽게 배우는 자바 프로그래밍");
		shelf.add("웹 프로그래밍 기초");
		shelf.add("자바 웹을 다루는 기술");
	}

	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while (shelf.size() == 0) {
			System.out.println(t.getName() + "waiting start");
			wait();
			System.out.println(t.getName() + "waiting end");
		}
		String book = shelf.remove(0);
		System.out.println(t.getName() + ": " + book + " lend");

		return book;
	}

	public synchronized void returnBook(String book) {// 반납 받는 거니까 리턴이 X
		Thread t = Thread.currentThread();

		shelf.add(book);
		notify();
		System.out.println(t.getName() + ": " + book + " return");

	}
}
