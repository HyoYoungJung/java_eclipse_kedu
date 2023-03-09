package sec01;

public class IncrementDemo {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x는 " + x);
		int y = Increment(x);
		System.out.println("increment() 메서드를 호출한 후의 x는 " + x);
		System.out.println("increment() 메서드를 호출한 후의 y는 " + y);
	}

	public static int Increment(int x) { // 위에서 x로 쓰면 아래에서도 같은 x로 쓰는 경우가 보통.
		System.out.println("increment() 메서드를 시작할 때의 n은 " + x);
		x++;
		System.out.println("increment() 메서드가 끝날 때의 n은 " + x);
		return x;
	}
}
