package sec06;

public class BoxContentsMover {
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) { // 프롬에서 꺼내 투에 넣을수 있음
		to.set(from.get());

//		from.set(to.get()); //익스텐즈로 제한이 걸려있어서, 컴파일러가 안된다고 오류를 알려줌 

	}
}
