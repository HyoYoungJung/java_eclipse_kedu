package programming04;

public class Pair<T> {
	public T numOne;
	public T numTwo;

	public Pair(T numOne, T numTwo) {
		this.numOne = numOne;
		this.numTwo = numTwo;
	}

	public T first() {
		return numOne;
	}

	public T second() {
		return numTwo;
	}
}

// Pair 클래스는 2개의 필드와 2개의 메서드를 가진다.
// 2개의 필드는 숫자를 나타내는 어떤 타입도 될 수 있고, 
// 2개의 메서드는 first()와 second()로 각각 첫번째 필드값, 두번째 필드값을 반환한다.