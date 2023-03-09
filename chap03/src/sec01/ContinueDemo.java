package sec01;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}
	// 0에서부터 10보다 작을때 까지 for문을 돌린다.

}
