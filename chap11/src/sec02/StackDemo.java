package sec02;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();

		s1.push("사과");
		s1.push("바나나");
		s1.push("체리");

		System.out.println(s1.peek());
//		for (String s : s1)
//			System.out.print(s + " "); //for문 이용해 꺼냄
//		System.out.println();

		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
//		for (String s : s1)
//			System.out.print(s + ", "); //s1 비어있어서 아무것도 나올수 X
//		System.out.println();

		Stack<Integer> s2 = new Stack<>();

		s2.add(10);
		s2.add(20);
		s2.add(1, 100);

		for (int value : s2)
			System.out.print(value + " ");
		System.out.println();

		while (!s2.empty()) // s2가 비어있지 않으면
			System.out.print(s2.pop() + " "); // 팝을 해서 출력해라
	}
}
