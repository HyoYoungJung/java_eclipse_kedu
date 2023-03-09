package sec06;

public class BoxHandler {
	public static void outBox(Box<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
		box.set(new Toy()); // 꺼내오는 아웃박스에 셋을 쓴다는 것은 논리적 에러임. 그러나 문법적 오류가 없어서 컴파일러는 오류인지 모름.
	}

	public static void outBox2(Box<? extends Toy> box) { // <? extends>를 써주는건 @Override 처럼 오류 방지 위한 안전장치
//	public static void outBox2(Box<? extends Toy> box, Toy n) { // 편법으로 , Toy n 추가해주면 됨
		Toy t = box.get(); // 메서드에 와일드카드 익스텐즈 걸어주면 박스에서 겟만 가능. 셋은 불가능!
		System.out.println(t);
//		box.set(new Toy()); // 컴파일러가 논리적 오류(?)를 잡아냄. 토이타입으론 셋할수X
		// ex. 토이를 상속받은 카 꺼내올때 부모타입으로 가져오는건 되지만 셋은 안된다 ∵ 자손타입의 +a 멤버를 잃기 때문에(?)
	}

//	public static void outBox2(Box<? extends Robot> box) { // 이레이즈오브메소드 에러 발생. 이렇게 쓸수 없음
//		// public static void outBox2(Box<? extends Robot> box, Robot n) { //편법으로 ,
//		// Robot n 추가해주면 됨
//	}

	public static <T> void outBox3(Box<? extends T> box) {
		T t = box.get();
		System.out.println(t);
//		box.set(new Toy());
	}

	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);
//		Toy t = box.get(); // 컴파일 과정에서 논리적 에러 걸러지지 않음
	}

	public static void inBox2(Box<? super Toy> box, Toy n) {// <? super> 사용해서
		box.set(n);
//		Toy t = box.get(); // 논리적 에러 걸러지도록!
	}

	public static <T> void inBox3(Box<? super T> box, T n) {
		box.set(n);
//		Toy t = box.get();
	}

}
